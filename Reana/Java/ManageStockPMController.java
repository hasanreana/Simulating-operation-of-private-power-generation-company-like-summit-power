package com.example.summit_power_company_.ReanaManagingDirector;

import javafx.event.ActionEvent;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

import java.io.IOException;
import java.util.ArrayList;

public class ManageStockPMController
{
    @javafx.fxml.FXML
    private TextField stockOutRawName;
    @javafx.fxml.FXML
    private TextField currentRawMeterialQuantityTextField;
    @javafx.fxml.FXML
    private TextField newlyEntryRawQuantity;
    @javafx.fxml.FXML
    private TextField stockOutRawQuantity;
    @javafx.fxml.FXML
    private TextField currentRawMeterialNameTextField;
    @javafx.fxml.FXML
    private TextArea recordTextArea;
    @javafx.fxml.FXML
    private TextField newlyEntryRawName;

    private ArrayList<RawMaterials> rawmaterials;



    @javafx.fxml.FXML
    public void initialize() {
        rawmaterials=new ArrayList();
    }

    @javafx.fxml.FXML
    public void addRecordButtonOnClicked(ActionEvent actionEvent) {
        RawMaterials rawmaterials;
        rawmaterials= new RawMaterials(
                currentRawMeterialNameTextField.getText(),

                Integer.parseInt(currentRawMeterialQuantityTextField.getText())

        );






        recordTextArea.appendText(rawmaterials.toString());
    }

    @javafx.fxml.FXML
    public void goToActivitiesPageButtonOnClicked(ActionEvent actionEvent)throws IOException {
        SceneSwitcher.switchTo("/com/example/summit_power_company_/ReanaManagingDirector/ProductionManagerDeshboardScene.fxml", actionEvent);
    }
}