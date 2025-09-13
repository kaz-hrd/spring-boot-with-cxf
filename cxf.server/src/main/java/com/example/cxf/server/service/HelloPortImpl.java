package com.example.cxf.server.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import jakarta.jws.WebService;

@WebService(serviceName = "HelloService", portName = "HelloPort",
                    targetNamespace = "http://service.ws.sample/",
                    endpointInterface = "com.example.cxf.server.service.Hello")
public class HelloPortImpl implements Hello {

    private static final Logger LOG = LoggerFactory.getLogger(HelloPortImpl.class);

    public String sayHello(String myname) {
        LOG.info("Executing operation sayHello" + myname);
        try {
            return "Hello, Welcome to CXF Spring boot " + myname + "!!!";

        } catch (Exception ex) {
            ex.printStackTrace();
            throw new RuntimeException(ex);
        }
    }

}
