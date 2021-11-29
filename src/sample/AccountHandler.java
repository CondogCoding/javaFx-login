package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TextField;

import java.io.*;


public class AccountHandler {
    @FXML
    private TextField Nametxt;
    @FXML
    private TextField Passtxt;

    @FXML
    public void createBtnHandler(ActionEvent Event) throws IOException {
        FileWriter fw = null;
        PrintWriter line = null;

        try {
            fw = new FileWriter("Users.txt", true);
            line = new PrintWriter(fw);

        } catch (FileNotFoundException e) {
            System.out.println("File not found");
        }

        line.printf("%-1s%20s\n", Nametxt.getText(), Passtxt.getText());
        line.close();
        fw.close();
        System.out.println("File writing complete");
    }

}
