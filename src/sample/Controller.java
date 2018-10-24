package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TextField;


public class Controller {

    @FXML private TextField firstName;


    public void doIt(ActionEvent actionEvent) {
        System.out.printf("Hallo %s wie geht es dir??%n", firstName.getText());
    }
}
