package com.example.summit_power_company_.ReanaManagingDirector;

import javafx.event.ActionEvent;
import javafx.scene.control.Alert;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

import java.io.IOException;
import java.util.ArrayList;

public class CheckQualityOfProductionPMController
{
    @javafx.fxml.FXML
    private TextField approveRawQuantityTextField;
    @javafx.fxml.FXML
    private TextArea recordTextArea;
    @javafx.fxml.FXML
    private TextField approveRawNameTextField;
    @javafx.fxml.FXML
    private Label msgLabel;

    private ArrayList<RawMaterials> rawmaterials;

    @javafx.fxml.FXML
    public void initialize() {
        rawmaterials=new ArrayList();
    }

    @javafx.fxml.FXML
    public void standardsProductQualityButtonOnClicked(ActionEvent actionEvent) {
        RawMaterials rawmaterials;
        rawmaterials= new RawMaterials(
                approveRawNameTextField.getText(),
                Integer.parseInt(approveRawQuantityTextField.getText()));






        recordTextArea.appendText(rawmaterials.toString());



    }

    @javafx.fxml.FXML
    public void addRecordButtonOnClicked(ActionEvent actionEvent) {
        RawMaterials rawmaterials;
        rawmaterials= new RawMaterials(
                approveRawNameTextField.getText(),
                Integer.parseInt(approveRawQuantityTextField.getText()));






        recordTextArea.appendText(rawmaterials.toString());



    }

    @javafx.fxml.FXML
    public void sendButtonOnClicked(ActionEvent actionEvent) {
        Alert a= new Alert(Alert.AlertType.INFORMATION);
        a.setContentText("Request Sent Successfully!");
        a.showAndWait();
    }

    @javafx.fxml.FXML
    public void goToactivitiesPageButtonOnClicked(ActionEvent actionEvent)throws IOException {
        SceneSwitcher.switchTo("/com/example/summit_power_company_/ReanaManagingDirector/ProductionManagerDeshboardScene.fxml", actionEvent);
    }
}