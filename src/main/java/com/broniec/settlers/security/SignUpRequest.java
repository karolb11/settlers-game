package com.broniec.settlers.security;

import lombok.Data;

@Data
public class SignUpRequest {
    private String username;
    private String password;
}
