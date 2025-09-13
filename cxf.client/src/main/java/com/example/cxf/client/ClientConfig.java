package com.example.cxf.client;

import java.net.URI;
import java.util.HashMap;
import java.util.Map;

import javax.xml.namespace.QName;

import org.apache.cxf.ext.logging.LoggingFeature;
import org.apache.cxf.jaxws.JaxWsProxyFactoryBean;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.example.cxf.CountryEndpoint;
import com.example.cxf.MultipartEndpoint;

import jakarta.xml.ws.BindingProvider;
import jakarta.xml.ws.Service;
import jakarta.xml.ws.soap.SOAPBinding;

@Configuration
public class ClientConfig {

    private String wsdlDocumentResource = "http://localhost:8080/ws/country?wsdl";
    private String wsdlDocumentResource2 = "http://localhost:8080/ws/multipart?wsdl";

    @Value("${ap.soap.client.address}")
    private String endpointAddress;

    @Value("${ap.soap.client.username}")
    private String userName;

    @Value("${ap.soap.client.password}")
    private String password;

    /* 
    @Bean
    public CountryEndpoint countryService() throws Exception {
        QName serviceName = new QName("http://example.com/cxf", "CountryService");
        QName portName = new QName("http://example.com/cxf", "CountryServicePort");

        Service service = Service.create(new URI(wsdlDocumentResource).toURL(), serviceName);
        CountryEndpoint countryService = service.getPort(portName, CountryEndpoint.class);

        BindingProvider bindingProvider = (BindingProvider) countryService;
        Map<String, Object> requestContext = bindingProvider.getRequestContext();
        // (1)
        //requestContext.put(BindingProvider.USERNAME_PROPERTY, userName);
        //requestContext.put(BindingProvider.PASSWORD_PROPERTY, password);
        requestContext.put(BindingProvider.ENDPOINT_ADDRESS_PROPERTY, "http://localhost:8080/ws/country");

        return countryService;
    }
    */

    /* 
    @Bean
    public MultipartEndpoint multipartEndpoint() throws Exception {
        QName serviceName = new QName("http://example.com/cxf", "MultipartStoreService");
        QName portName = new QName("http://example.com/cxf", "MultipartStoreServicePort");

        Service service = Service.create(new URI(wsdlDocumentResource2).toURL(), serviceName);
        MultipartEndpoint countryService = service.getPort(portName, MultipartEndpoint.class);

        BindingProvider bindingProvider = (BindingProvider) countryService;
        SOAPBinding binding = (SOAPBinding)bindingProvider.getBinding();
        binding.setMTOMEnabled(true);
        Map<String, Object> requestContext = bindingProvider.getRequestContext();
        // (1)
        //requestContext.put(BindingProvider.USERNAME_PROPERTY, userName);
        //requestContext.put(BindingProvider.PASSWORD_PROPERTY, password);
        requestContext.put(BindingProvider.ENDPOINT_ADDRESS_PROPERTY, "http://localhost:8080/ws/multipart");

        return countryService;
    }
    */

    @Bean
    public CountryEndpoint countryEndpoint() throws Exception {
        JaxWsProxyFactoryBean proxyFactory = new JaxWsProxyFactoryBean();
        proxyFactory.setServiceClass(CountryEndpoint.class);
        //proxyFactory.setAddress("http://localhost:8080/ws/country");
        proxyFactory.setAddress(this.endpointAddress + "/country");
        proxyFactory.getFeatures().add(new LoggingFeature());
        if(this.userName != null && this.password != null) {
            proxyFactory.setPassword(this.password);
            proxyFactory.setUsername(this.userName);
        }
        return (CountryEndpoint) proxyFactory.create();
    }

    @Bean
    public MultipartEndpoint multipartEndpoint() throws Exception {
        JaxWsProxyFactoryBean proxyFactory = new JaxWsProxyFactoryBean();
        proxyFactory.setServiceClass(MultipartEndpoint.class);
        //proxyFactory.setAddress("http://localhost:8080/ws/multipart");
        proxyFactory.setAddress(this.endpointAddress + "/multipart");
        proxyFactory.getFeatures().add(new LoggingFeature());
        if(this.userName != null && this.password != null) {
            proxyFactory.setPassword(this.password);
            proxyFactory.setUsername(this.userName);
        }
        Map<String,Object> props = new HashMap<String, Object>();
        props.put("mtom-enabled", Boolean.TRUE);
        proxyFactory.setProperties(props); 
        return (MultipartEndpoint) proxyFactory.create();
    }


}
