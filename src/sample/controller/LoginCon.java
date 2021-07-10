package sample.controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Hyperlink;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class LoginCon {

    @FXML
    private Label loginLabel;

    @FXML
    private CheckBox rememberBox;

    @FXML
    private Hyperlink forgotLink;

    @FXML
    private Button loginBtn;

    @FXML
    private TextField userField;

    @FXML
    private TextField passField;

    @FXML
    void actionHandler(ActionEvent event) {
        if (event.getSource() == loginBtn) {

        } else if (event.getSource() == rememberBox) {

        } else if (event.getSource() == forgotLink) {

        }
        else {
            System.out.println("------------------");
        }
    }
}
