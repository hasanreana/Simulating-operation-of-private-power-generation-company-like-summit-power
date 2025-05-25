package com.example.summit_power_company_.ReanaManagingDirector;

import javafx.event.ActionEvent;
import javafx.scene.control.Alert;
import javafx.scene.control.TextArea;

import java.io.IOException;


public class ReviewEmailsController
{
    @javafx.fxml.FXML
    private TextArea emailsTextArea;

    private final Alert unfill = new Alert(Alert.AlertType.WARNING);


    @javafx.fxml.FXML
    public void initialize() {
    }

    @javafx.fxml.FXML
    public void backButtonOnClicked(ActionEvent actionEvent)throws IOException {
        SceneSwitcher.switchTo("/com/example/summit_power_company_/ReanaManagingDirector/ManagingDirectorDeshboard.fxml", actionEvent);

    }
    public class User {
        public static boolean addFeedBack(String email) {
            // Store email somewhere or simulate success
            return true;
        }
    }



    @javafx.fxml.FXML
    public void emailsSentButtonOnClicked(ActionEvent actionEvent) {
        String email = emailsTextArea.getText();

        if (email.isEmpty()) {
            unfill.show();
            return;
        }

        boolean addStatus = User.addFeedBack(email);

        if (addStatus) {
            Alert successAlert = new Alert(Alert.AlertType.INFORMATION);
            successAlert.setTitle("Success");
            successAlert.setHeaderText(null);
            successAlert.setContentText("New email added.");
            successAlert.showAndWait();
        } else {
            Alert failureAlert = new Alert(Alert.AlertType.ERROR);
            failureAlert.setTitle("Failed");
            failureAlert.setHeaderText(null);
            failureAlert.setContentText("Failed to add email.");
            failureAlert.showAndWait();
        }

        emailsTextArea.clear(); // Optional: clear input after submission
    }

}