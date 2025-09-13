package com.example.cxf.server.service;

import com.example.cxf.server.service.dto.MultipartContent;

import jakarta.jws.WebMethod;
import jakarta.jws.WebParam;
import jakarta.jws.WebService;

@WebService(targetNamespace = "http://example.com/cxf")
public interface MultipartEndpoint {
    @WebMethod
    void store(@WebParam(name = "ActionId")String actionId, @WebParam(name = "MultipartContent") MultipartContent content);
}
