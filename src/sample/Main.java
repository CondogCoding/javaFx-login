package sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{

        FXMLLoader first = new FXMLLoader(getClass().getResource("Login.fxml"));
        Parent firstPane = first.load();
        Scene scene1 = (new Scene(firstPane, 550, 315));

        FXMLLoader second = new FXMLLoader(getClass().getResource("CreateAnAccount.fxml"));
        Parent secondPane = second.load();
        Scene scene2 = (new Scene(secondPane, 550, 315));

        FXMLLoader home = new FXMLLoader(getClass().getResource("Home.fxml"));
        Parent homePane = home.load();
        Scene homeScene = (new Scene(homePane, 550, 315));

        LoginController firstPaneController = (LoginController) first.getController();
        firstPaneController.setSecondScene(scene2);

        primaryStage.setTitle("Login");
        primaryStage.setScene(scene1);
        primaryStage.show();

    }

    public static void main(String[] args) {
        launch(args);
    }
}
