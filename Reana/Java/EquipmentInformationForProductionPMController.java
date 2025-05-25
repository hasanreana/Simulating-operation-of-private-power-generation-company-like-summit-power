package com.example.summit_power_company_.ReanaManagingDirector;

import javafx.event.ActionEvent;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

import java.io.IOException;

public class EquipmentInformationForProductionPMController
{
    @javafx.fxml.FXML
    private TextField damageEquipQuantityTextField;
    @javafx.fxml.FXML
    private Label viewLabel;
    @javafx.fxml.FXML
    private TextField availableEquipQuantityTextField;
    @javafx.fxml.FXML
    private TextField availableEquipNameTextField;
    @javafx.fxml.FXML
    private TextField damageEquipNameTextField;
    @javafx.fxml.FXML
    private TextField newEquipQuantityTextField;
    @javafx.fxml.FXML
    private TextField newEquipNameTextField;

    @javafx.fxml.FXML
    public void initialize() {
    }

    @javafx.fxml.FXML
    public void activeEquipQuantityButtonOnClicked(ActionEvent actionEvent) {
        String xStr = availableEquipQuantityTextField.getText();
        String yStr =damageEquipQuantityTextField.getText();
        String zStr =newEquipQuantityTextField.getText();

        int xVal = Integer.parseInt(xStr);
        int yVal = Integer.parseInt(yStr);
        int zVal = Integer.parseInt(zStr);




        int result=(xVal+yVal+zVal)-yVal;

        String resultStr = Integer.toString(result);
        viewLabel.setText("Available Equipment" + resultStr);
    }

    @javafx.fxml.FXML
    public void goToActivitiesPage(ActionEvent actionEvent)throws IOException {
        SceneSwitcher.switchTo("/com/example/summit_power_company_/ReanaManagingDirector/ManagingDirectorDeshboard.fxml", actionEvent);
    }

    @javafx.fxml.FXML
    public void totalEquipQuantityButtonOnClicked(ActionEvent actionEvent) {
        String xStr = availableEquipQuantityTextField.getText();
        String yStr =damageEquipQuantityTextField.getText();
        String zStr =newEquipQuantityTextField.getText();

        int xVal = Integer.parseInt(xStr);
        int yVal = Integer.parseInt(yStr);
        int zVal = Integer.parseInt(zStr);



        int sum = xVal+yVal+zVal;

        String resultStr = Integer.toString(sum);
        viewLabel.setText("Total Equipment" + resultStr);
    }
}