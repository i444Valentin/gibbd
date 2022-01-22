package com.government.gibbd.gibbd;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;


import java.io.IOException;
@SpringBootApplication
public class HelloApplication extends Application {

    @Override
    public void start(Stage stage) throws IOException {
        ConfigurableApplicationContext applicationContext = SpringApplication.run(HelloApplication.class);
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("authorization_scene.fxml"));
        fxmlLoader.setControllerFactory(applicationContext::getBean);
        Scene scene = new Scene(fxmlLoader.load(), 320, 240);
        stage.setTitle("Hello!");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}