package com.hades.example.designpatterns.proxy._4_smart_reference_proxy;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class UsageLogger {
    private static Map<String, List<String>> mockedDB_user_values;
    private static Map<String, List<String>> mockedDB_value_users;

    public static void log(String user, String value) {
        System.out.println(user + "," + value);
        addToUserRecordTable(user, value);
        addToValueRecordTable(user, value);
    }

    private static void addToUserRecordTable(String user, String value) {
        if (null == mockedDB_user_values) {
            mockedDB_user_values = new HashMap<>();
        }
        List<String> values = mockedDB_user_values.computeIfAbsent(value, k -> new ArrayList<>());
        values.add(value);
    }

    private static void addToValueRecordTable(String user, String value) {
        if (null == mockedDB_value_users) {
            mockedDB_value_users = new HashMap<>();
        }
        List<String> users = mockedDB_value_users.computeIfAbsent(value, k -> new ArrayList<>());
        users.add(user);
    }

    public static  int countSearchValue(String value) {
        if (null == mockedDB_value_users) {
            return 0;
        }
        List<String> users = mockedDB_value_users.get(value);
        return null == users ? 0 : users.size();
    }
}
