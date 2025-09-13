package com.example.cxf.server.service;

import com.example.cxf.server.service.dto.GetCountryParam;
import com.example.cxf.server.service.dto.GetCountryResult;

import jakarta.jws.WebMethod;
import jakarta.jws.WebParam;
import jakarta.jws.WebResult;
import jakarta.jws.WebService;

@WebService(targetNamespace = "http://example.com/cxf")
public interface CountryEndpoint {
    @WebResult(name = "CountryServiceResult")
    @WebMethod
    GetCountryResult getCountry(@WebParam(name = "CountryServiceParam") GetCountryParam request);
}
