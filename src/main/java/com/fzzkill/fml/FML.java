package com.fzzkill.fml;

import com.fzzkill.Function.SWING;

import com.fzzkill.other.Return;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.MenuBar;
import javafx.stage.Stage;

import java.io.IOException;

// Main Class
public class FML extends Application {

    public static MenuBar MB = new MenuBar();


    public void start(Stage stage) throws IOException {
        try {

            FXMLLoader fxml = new FXMLLoader();

        } catch (RuntimeException e) {

            SWING.DownloadLibs();
        }
        FXMLLoader fxmlLoader = new FXMLLoader(FML.class.getResource("hello-view.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 320, 240);

        stage.setTitle("Hello!");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
       launch();
    }

}