package com.example.cxf.server.service.dto;

import jakarta.activation.DataHandler;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlMimeType;
import lombok.Getter;
import lombok.Setter;

@XmlAccessorType(XmlAccessType.FIELD)
@Getter
@Setter
public class MultipartContent {
    private String  contentName;
    @XmlMimeType("application/octet-stream")
    private DataHandler  dataBytes;
}
