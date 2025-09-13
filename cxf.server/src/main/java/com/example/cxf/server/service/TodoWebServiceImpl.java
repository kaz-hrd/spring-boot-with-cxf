package com.example.cxf.server.service;

import com.example.cxf.server.service.dto.Todo;

import jakarta.jws.WebService;
import jakarta.xml.ws.BindingType;
import jakarta.xml.ws.soap.SOAPBinding;

@WebService(
        targetNamespace = "http://example.com/cxf",
        serviceName = "TodoWebService",
        portName = "TodoWebPort",
        endpointInterface = "com.example.cxf.server.service.TodoWebService") // (1)
@BindingType(SOAPBinding.SOAP12HTTP_BINDING) // (2)
public class TodoWebServiceImpl implements TodoWebService { // (3)

    @Override // (5)
    public Todo getTodo(String todoId)  {
        Todo todo = new Todo();
        todo.setDescription("This is a description of the Todo with id " + todoId);
        return todo;
    }

}