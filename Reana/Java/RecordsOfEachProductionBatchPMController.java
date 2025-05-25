package com.example.summit_power_company_.ReanaManagingDirector;

import javafx.event.ActionEvent;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

import java.io.IOException;
import java.util.ArrayList;

public class RecordsOfEachProductionBatchPMController
{
    @javafx.fxml.FXML
    private TextField batchItemTextField;
    @javafx.fxml.FXML
    private TextField batchNameTextField;
    @javafx.fxml.FXML
    private TextField productNameTextField;
    @javafx.fxml.FXML
    private TextField productQuantityTextField;
    @javafx.fxml.FXML
    private TextArea itemTextArea;
    @javafx.fxml.FXML
    private TextArea productTextArea;

    private ArrayList<Production> production;

    @javafx.fxml.FXML
    public void initialize() {
        production = new ArrayList();
    }

    @javafx.fxml.FXML
    public void showProductButtonOnclicked(ActionEvent actionEvent) {
        Production production;
        production= new Production(
                productNameTextField.getText(),
                Integer.parseInt(productQuantityTextField.getText()));






        productTextArea.appendText(production.toString());
    }

    @javafx.fxml.FXML
    public void addItemButtonOnClicked(ActionEvent actionEvent) {
        Production production;
        production= new Production(
                batchNameTextField.getText(),
                Integer.parseInt(batchItemTextField.getText()));






        itemTextArea.appendText(production.toString());
    }

    @javafx.fxml.FXML
    public void goToActivitiesPageButtonOnClicked(ActionEvent actionEvent)throws IOException {
        SceneSwitcher.switchTo("/com/example/summit_power_company_/ReanaManagingDirector/ProductionManagerDeshboardScene.fxml", actionEvent);
    }
}