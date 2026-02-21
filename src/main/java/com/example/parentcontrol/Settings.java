package com.example.parentcontrol;

import com.example.parentcontrol.util.StringUtil;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Settings {

    public static long GET_LAST_MINI_COIN_DURATION = 5 * 60 * 1000;
    public static int SCHEDULE_AWARD_MINI_COIN_COUNT = 5;
    public static int ADD_MINI_COIN_EXECUTOR_POOL_SIZE = 1;
    public static int ADD_MINI_COIN_EXECUTOR_DELAY = 1 * 60 * 1000;

    public static String ROLES = "admin, manager, normal";

    public static List<String> USER_ROLES = new ArrayList<>();

    static {

        if (StringUtil.isNotNullOrEmpty(ROLES)) {
            USER_ROLES = Stream.of(ROLES.split(",")).map(String::trim).collect(Collectors.toList());
        }

    }

}
