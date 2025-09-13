package com.example.cxf.server.service.dto;

import java.io.Serializable;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class GetCountryParam implements Serializable {
    protected String name;
}
