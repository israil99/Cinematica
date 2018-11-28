package com.example.israil.cinmatica.Helper;

public class Helper {
    public static String makeBestImage(String url) {
        url = url.replace("sm_","");
        return url;
    }
    public static String makeImageBetter(String url) {
        StringBuilder stringBuilder = new StringBuilder(url);
        for (int i = stringBuilder.length() - 1; i > 0; i--) {
            if (stringBuilder.charAt(i) == '/') {
                stringBuilder.deleteCharAt(i + 1);
                return stringBuilder.toString();
            }
        }
        return stringBuilder.toString();
    }

}
