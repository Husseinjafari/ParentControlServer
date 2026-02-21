package com.example.parentcontrol.util;

public class StringUtil {

    public static boolean isNullOrEmpty(String text) {
        boolean result = false;
        if (text == null || text.isEmpty() || text.trim().isEmpty()) {
            result = true;
        }
        return result;
    }

    public static boolean isNotNullOrEmpty(String text) {
        return !isNullOrEmpty(text);
    }
}
