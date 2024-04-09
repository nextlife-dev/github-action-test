package view;

import step03_MVC_intro.controller.Controller;

public class View {

    public static void main(String[] args) {
        // input -> controller -> model -> controller -> print

        String result = Controller.getTodayWeather("서울 중구");
        System.out.println(result);
    }
}
