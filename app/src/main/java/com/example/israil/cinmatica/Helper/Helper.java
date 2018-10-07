package com.example.israil.cinmatica.Helper;

public class Helper {
    public static String makeImageBetter(String url) {
        url = url.replace("sm_","");
        return url;
    }
}
