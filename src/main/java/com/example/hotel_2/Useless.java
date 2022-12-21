package com.example.hotel_2;

import android.app.Application;

public class Useless extends Application {
    private String[][] log_porol = new String[4][6];

    public String[][] getSomeVariable() {
        return log_porol;
    }

    public void setSomeVariable(String[][] log_porol) {
        this.log_porol = log_porol;
    }
}
