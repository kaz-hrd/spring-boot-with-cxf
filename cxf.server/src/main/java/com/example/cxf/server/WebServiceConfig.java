package com.example.cxf.server;

import org.apache.cxf.Bus;
import org.apache.cxf.ext.logging.LoggingFeature;
import org.apache.cxf.jaxws.EndpointImpl;
import org.apache.cxf.metrics.MetricsFeature;
import org.apache.cxf.metrics.MetricsProvider;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.example.cxf.server.repository.CountryRepository;
import com.example.cxf.server.service.CountryEndpointImpl;
import com.example.cxf.server.service.HelloPortImpl;
import com.example.cxf.server.service.MultipartEndpointImpl;
import com.example.cxf.server.service.TodoWebServiceImpl;

import jakarta.xml.ws.Endpoint;
import jakarta.xml.ws.WebServiceFeature;
import jakarta.xml.ws.soap.SOAPBinding;

@Configuration
public class WebServiceConfig {

    @Value("${ap.soap.server.publishedEndpointBase:#{null}}")    
    private String publishedEndpointBase;


    @Autowired
    private Bus bus;

    @Autowired
    private MetricsProvider metricsProvider;

    @Bean
    public Endpoint endpoint() {
        EndpointImpl endpoint = new EndpointImpl(bus, new HelloPortImpl(), null, null, new WebServiceFeature[]{
            new MetricsFeature(metricsProvider), new LoggingFeature()
        });
        endpoint.publish("/example");
        return endpoint;
    }

    @Bean 
    public CountryRepository countryRepository() {
        return new CountryRepository();
    } 

    @Bean
    public Endpoint countryEndpoint(CountryRepository countryRepository) {
        EndpointImpl endpoint = new EndpointImpl(bus, new CountryEndpointImpl(countryRepository), null, null, new WebServiceFeature[]{
            new MetricsFeature(metricsProvider), new LoggingFeature()
        });
        if(this.publishedEndpointBase != null) {
            endpoint.setPublishedEndpointUrl(this.publishedEndpointBase + "/country"); // 順番重要：publishの前に設定すること
        }
        endpoint.publish("/country");
        return endpoint;
    }

    @Bean
    public Endpoint multiparStoreEndpoint() {
        EndpointImpl endpoint = new EndpointImpl(bus, new MultipartEndpointImpl(), null, null, new WebServiceFeature[]{
            new MetricsFeature(metricsProvider), new LoggingFeature()
        });
        if(this.publishedEndpointBase != null){
            endpoint.setPublishedEndpointUrl(this.publishedEndpointBase + "/multipart"); // 順番重要：publishの前に設定すること
        }
        SOAPBinding binding = (SOAPBinding)endpoint.getBinding();
        binding.setMTOMEnabled(true);
        endpoint.publish("/multipart");
        return endpoint;
    }

    @Bean
    public Endpoint todoEndpoint() {
        EndpointImpl endpoint = new EndpointImpl(bus, new TodoWebServiceImpl(), null, null, new WebServiceFeature[]{
            new MetricsFeature(metricsProvider), new LoggingFeature()
        });
        endpoint.publish("/todo");
        return endpoint;
    }

}
