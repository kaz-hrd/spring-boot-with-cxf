package com.example.cxf.server.service;

import com.example.cxf.server.repository.CountryRepository;
import com.example.cxf.server.service.dto.GetCountryParam;
import com.example.cxf.server.service.dto.GetCountryResult;

import jakarta.jws.WebService;
import jakarta.xml.ws.BindingType;
import jakarta.xml.ws.soap.SOAPBinding;

@WebService(
        targetNamespace = "http://example.com/cxf",
        serviceName = "CountryService",
        portName = "CountryServicePort",
        endpointInterface = "com.example.cxf.server.service.CountryEndpoint")
@BindingType(SOAPBinding.SOAP12HTTP_BINDING) 
public class CountryEndpointImpl implements CountryEndpoint {
    private final CountryRepository countryRepository;

    public CountryEndpointImpl(CountryRepository countryRepository) {
        this.countryRepository = countryRepository;
    }

    @Override
    public GetCountryResult getCountry(GetCountryParam request) {
        var country = countryRepository.findCountry(request.getName());
        var response = new GetCountryResult();
        response.setCurrency(country.getCurrency());
        return response;
    }
    
}
