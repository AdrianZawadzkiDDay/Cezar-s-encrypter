package com.example.cezar_code.models;

public class FormEncoder {

    private String rawPassword;
    private String encodedPassword;

    public FormEncoder() {
        this.encodedPassword= "";
    }

    public String getRawPassword() {
        return rawPassword;
    }

    public void setRawPassword(String rawPassword) {
        this.rawPassword = rawPassword;
    }

    public String getEncodedPassword() {
        return encodedPassword;
    }

    public void setEncodedPassword(String encodedPassword) {
        this.encodedPassword = encodedPassword;
    }

}
