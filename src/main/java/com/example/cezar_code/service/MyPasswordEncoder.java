package com.example.cezar_code.service;

import org.springframework.security.crypto.password.PasswordEncoder;

public class MyPasswordEncoder implements PasswordEncoder {

    @Override
    public String encode(CharSequence rawPassword) {
        String encodedPassword = "";
        for (int i = 0; i < rawPassword.length(); i++) {
            char c = rawPassword.charAt(i);
            if       (c >= 'a' && c <= 'w') c += 3;
            else if  (c >= 'A' && c <= 'W') c += 3;
            else if  (c > 'w' && c <= 'z') {
               if(c == 120) c = 97;
               else if(c == 121) c = 98;
               else if(c == 122) c = 99;
            }
            else if  (c > 'W' && c <= 'Z') {
                if(c == 88) c = 65;
                else if(c == 89) c = 66;
                else if(c == 90) c = 67;
            }
            encodedPassword += c;
        }
        return encodedPassword;
    }

    @Override
    public boolean matches(CharSequence rawPassword, String encodedPassword) {
        if(rawPassword!=null){
            String compareEncodedPassword = encode(rawPassword);
            if(compareEncodedPassword.equals(encodedPassword)){
                return true;
            }
        }
        return false;
    }
}
