package com.government.gibbd;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.image.Image;
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
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("layout/authorization_scene.fxml"));
        fxmlLoader.setControllerFactory(applicationContext::getBean);
        Scene scene = new Scene(fxmlLoader.load());
        stage.setTitle("Госавтоинспекция и ГИББД");
        stage.setResizable(false);
        stage.setScene(scene);
        stage.getIcons().add(new Image(String.valueOf(HelloApplication.class.getResource("images/logo.png"))));
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}