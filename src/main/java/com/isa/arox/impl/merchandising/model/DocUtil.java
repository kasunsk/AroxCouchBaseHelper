package com.isa.arox.impl.merchandising.model;

/**
 * Created by kasun on 2/17/16.
 */
public class DocUtil {

    public static String toKey(String prefix, String code) {

        if (code == null || code.startsWith(prefix)) {
            return code;

        } else {
            return prefix + code;
        }

    }


    public static String toCode(String prefix, String key) {

        if (key == null || prefix == null) {
            return key;

        } else {
            return key.replaceFirst(prefix, "");
        }
    }
}
