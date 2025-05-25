package com.example.summit_power_company_.ReanaManagingDirector;

import javafx.event.ActionEvent;
import javafx.scene.control.Alert;
import javafx.scene.control.DatePicker;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;

import java.io.IOException;

public class CommunicationwithStackHoldersPMController
{
    @javafx.fxml.FXML
    private DatePicker datePicker;
    @javafx.fxml.FXML
    private TextArea recordTextArea;
    @javafx.fxml.FXML
    private Label shareMsgLabel;
    @javafx.fxml.FXML
    private Label msgLabel;

    @javafx.fxml.FXML
    public void initialize() {
    }

    @javafx.fxml.FXML
    public void addRecordButtonOnClicked(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void shareMsgButtonOnClicked(ActionEvent actionEvent) {
        Alert a= new Alert(Alert.AlertType.INFORMATION);
        a.setContentText("Request Sent Successfully!");
        a.showAndWait();
    }

    @javafx.fxml.FXML
    public void sendMsgButtonOnClicked(ActionEvent actionEvent) {
        Alert a= new Alert(Alert.AlertType.INFORMATION);
        a.setContentText("Request Sent Successfully!");
        a.showAndWait();
    }

    @javafx.fxml.FXML
    public void goToActivitiesPageButtonOnClicked(ActionEvent actionEvent)throws IOException {
        SceneSwitcher.switchTo("/com/example/summit_power_company_/ReanaManagingDirector/ProductionManagerDeshboardScene.fxml", actionEvent);
    }
}