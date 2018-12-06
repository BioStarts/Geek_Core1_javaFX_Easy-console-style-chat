package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

public class Controller {
    @FXML
    TextField Read;

    @FXML
    TextArea Print;

    public void sending(ActionEvent actionEvent) {
        Print.appendText(Read.getText() + "\n");
        Read.clear();
    }

    public void clickEnter(ActionEvent actionEvent) {
        Print.appendText(Read.getText() + "\n");
        Read.clear();
    }
}
