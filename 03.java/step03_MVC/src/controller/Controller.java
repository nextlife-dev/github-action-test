package controller;

import step03_MVC_intro.model.Model;

public class Controller {
    // 오늘의 날씨 검색

    public static String getTodayWeather(String loc) {
        String result = Model.getTodayWeather(loc);
        return result;
    }
}
