package com.github.session.jwt.auth0;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;

@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class Permission {
    private String app;
    private String role;
    private String company;
    private String organisation;
}
