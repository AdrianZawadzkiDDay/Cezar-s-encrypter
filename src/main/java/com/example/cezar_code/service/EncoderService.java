package com.example.cezar_code.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

@Service
public class EncoderService {

    private PasswordEncoder passwordEncoder;

    @Autowired
    public EncoderService(PasswordEncoder passwordEncoder) {
        this.passwordEncoder = passwordEncoder;
    }

    public String encodeText(String text){
        return passwordEncoder.encode(text);
    }

}
