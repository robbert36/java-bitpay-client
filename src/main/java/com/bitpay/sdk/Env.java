package com.bitpay.sdk;

public class Env {
    public static final String Test = "Test";
    public static final String Prod = "Prod";
    public static final String BitpayApiFrame = "custom";
    public static final String BitpayApiFrameVersion = "1.0.0";

    private String testUrl = "https://test.bitpay.com/";
    private String prodUrl = "https://bitpay.com/";
    private String bitpayApiVersion = "2.0.0";
    private String bitpayPluginInfo = "BitPay_Java_Client_v4.7.2004";

    public Env() {
    }

    public Env(String testUrl, String prodUrl) {
        this.testUrl = testUrl;
        this.prodUrl = prodUrl;
    }

    public Env(String testUrl, String prodUrl, String bitpayApiVersion) {
        this(testUrl, prodUrl);
        this.bitpayApiVersion = bitpayApiVersion;
    }

    public String getTestUrl() {
        return testUrl;
    }

    public String getProdUrl() {
        return prodUrl;
    }

    public String getBitpayApiVersion() {
        return bitpayApiVersion;
    }

    public String getBitpayPluginInfo() {
        return bitpayPluginInfo;
    }

    public static class Tokens {
        public String pos;
        public String merchant;
        public String payroll;
    }
}