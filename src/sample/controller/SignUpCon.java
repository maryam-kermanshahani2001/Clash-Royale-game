package sample.controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Hyperlink;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import sample.model.User;

import java.io.IOException;
import java.util.function.IntFunction;

public class SignUpCon {

    @FXML
    private Label signUpLabel;

    @FXML
    private CheckBox rememberBox;

    @FXML
    private Button signUpBtn;

    @FXML
    private TextField userField;

    @FXML
    private TextField passField;

    @FXML
    private Hyperlink loginLink;

    @FXML
    void actionHandler(ActionEvent event) throws IOException {
        if (event.getSource() == signUpBtn) {
            User user = makeNewUser();
            if (user != null) {

            }
            // new stage that is user panel
        } else if (event.getSource() == loginLink) {
            Stage stage;
            Parent root;

            stage = (Stage) loginLink.getScene().getWindow();
            root = FXMLLoader.load(getClass().getResource("../view/Login.fxml"));

            Scene scene = new Scene(root);
            stage.setScene(scene);
            stage.show();

        } else if (event.getSource() == rememberBox) {
            // ?

        } else {
            System.out.println("-------------------");
        }


    }

    public User makeNewUser() {
        User user = new User(userField.getText(), passField.getText());
        return user;
    }

}
