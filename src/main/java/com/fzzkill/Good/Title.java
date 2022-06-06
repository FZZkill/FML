package com.fzzkill.Good;

import com.google.gson.JsonObject;
import org.apache.commons.io.FileUtils;
import org.json.JSONObject;

import java.io.File;
import java.io.IOException;
import java.util.Random;

public class Title {

    public class Title_Thread extends Thread {

        Random rand = new Random();

        String good = FileUtils.readFileToString(new File("com/fzzkill/Title/Title.json"), "UTF-8");
        JSONObject JO = new JSONObject(good);

        @Override
        public void run() {
            int i = rand.nextInt(0) % JO.getInt("Lines");

        }

        private Title_Thread() throws IOException { }
    }

}
