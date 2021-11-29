package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.Node;
import javafx.scene.control.Hyperlink;
import javafx.scene.control.TextField;
import javafx.scene.control.Label;
import javafx.scene.control.Button;
import javafx.scene.control.Hyperlink;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;
import java.io.PrintWriter;

public class LoginController {
    private Scene secondScene;

    @FXML
    private TextField Nametxt;
    @FXML
    private TextField Passtxt;
    @FXML
    private Hyperlink Createlnk;


    @FXML
    private void loginBtnHandler(ActionEvent Event) throws IOException {

    }

    @FXML
    private void createAccountHandler(ActionEvent Event) {
        openSecondScene(Event);
    }

    public void setSecondScene(Scene scene) {
        secondScene = scene;
    }

    public void openSecondScene(ActionEvent actionEvent) {
        Stage primaryStage = (Stage)((Node)actionEvent.getSource()).getScene().getWindow();
        primaryStage.setScene(secondScene);
        primaryStage.setTitle("Create An Account");
    }


}
