package com.example.cxf.server.service;

import com.example.cxf.server.service.dto.Todo;

import jakarta.jws.WebMethod;
import jakarta.jws.WebParam;
import jakarta.jws.WebResult;
import jakarta.jws.WebService;

@WebService(targetNamespace = "http://example.com/cxf")
public interface TodoWebService {
    @WebMethod // (2)
    @WebResult(name = "todo") // (3)
    Todo getTodo(@WebParam(name = "todoId") /* (4) */ String todoId);

}