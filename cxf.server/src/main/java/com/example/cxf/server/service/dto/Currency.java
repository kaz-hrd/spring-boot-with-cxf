package com.example.cxf.server.service.dto;

import jakarta.xml.bind.annotation.XmlEnum;

@XmlEnum
public enum Currency {
    GBP,
    EUR,
    PLN;
    public String value() {
        return name();
    }
    public static Currency fromValue(String v) {
        return valueOf(v);
    }
}
