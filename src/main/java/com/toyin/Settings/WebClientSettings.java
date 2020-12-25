package com.toyin.Settings;

import com.gargoylesoftware.htmlunit.WebClient;

public class WebClientSettings {

    public static WebClient configuration() {

        WebClient client = new WebClient();
        client.getOptions().setJavaScriptEnabled(false);
        client.getOptions(). setCssEnabled(false);
        client.getOptions().setUseInsecureSSL(true);

        return client;
    }
}
