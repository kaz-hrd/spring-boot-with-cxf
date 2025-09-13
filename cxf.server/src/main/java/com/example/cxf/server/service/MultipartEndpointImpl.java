package com.example.cxf.server.service;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.example.cxf.server.service.dto.MultipartContent;

import jakarta.jws.WebService;
import jakarta.xml.ws.BindingType;
import jakarta.xml.ws.soap.SOAPBinding;

@WebService(
        targetNamespace = "http://example.com/cxf",
        serviceName = "MultipartStoreService",
        portName = "MultipartStoreServicePort",
        endpointInterface = "com.example.cxf.server.service.MultipartEndpoint")
@BindingType(SOAPBinding.SOAP12HTTP_BINDING) 
public class MultipartEndpointImpl implements MultipartEndpoint {
    private static final Logger LOG = LoggerFactory.getLogger(MultipartEndpointImpl.class);
    @Override
    public void store(String actionId, MultipartContent content) {
        var dataHandler = content.getDataBytes();
        try (var inputStream = dataHandler.getInputStream()) {
            var allBytes = inputStream.readAllBytes();
            LOG.info("Action: " + actionId);
            LOG.info("Content Name: " + content.getContentName());
            LOG.info("Received bytes: " + allBytes.length);
            LOG.info("Received data: " + new String(allBytes, "UTF-8"));
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
