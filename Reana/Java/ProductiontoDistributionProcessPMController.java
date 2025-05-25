package com.example.summit_power_company_.ReanaManagingDirector;

import javafx.event.ActionEvent;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;

import java.io.IOException;
import java.util.ArrayList;

public class ProductiontoDistributionProcessPMController
{
    @javafx.fxml.FXML
    private TextField productionNameTextField;
    @javafx.fxml.FXML
    private DatePicker startTimeDatePicker;
    @javafx.fxml.FXML
    private DatePicker endTimeDatePicker;
    @javafx.fxml.FXML
    private TableColumn<Production, String> nameTC;
    @javafx.fxml.FXML
    private TextField productionQuantityTextField;
    @javafx.fxml.FXML
    private TextArea dateTextArea;
    @javafx.fxml.FXML
    private TableView<Production> tableview;
    @javafx.fxml.FXML
    private TableColumn<Production, Integer> quantityTC;
    @javafx.fxml.FXML
    private Label msgLabel;
    @javafx.fxml.FXML
    private Label outputLable;

    @javafx.fxml.FXML
    public void initialize() {
        nameTC.setCellValueFactory(new PropertyValueFactory<>("batchName"));
        quantityTC.setCellValueFactory(new PropertyValueFactory<>("batchItem"));
    }
    ArrayList<Production> productions = new ArrayList<>();

    @javafx.fxml.FXML
    public void msgSendButtonOnClicked(ActionEvent actionEvent) {
        Alert a= new Alert(Alert.AlertType.INFORMATION);
        a.setContentText("Message Send!");
        a.showAndWait();
    }

    @javafx.fxml.FXML
    public void addRecordButtonOnClicked(ActionEvent actionEvent) {
        if (nameTC.getText().trim().isEmpty()){
            outputLable.setText("Please enter proposal Id!");
            return;
        }

        if (quantityTC.getText().trim().isEmpty()){
            outputLable.setText("Please enter amount!");
            return;
        }



        int batchItem = Integer.parseInt(productionQuantityTextField.getText());

        Production newProduction = new Production(

                productionNameTextField.getText(),
                batchItem








        );

        productions.add(newProduction);

        System.out.println(newProduction.toString());
        outputLable.setText("New Production added!");

        tableview.getItems().clear();
        tableview.getItems().addAll(productions);
    }

    @javafx.fxml.FXML
    public void goToActivitiesButtonOnClicked(ActionEvent actionEvent)throws IOException {
        SceneSwitcher.switchTo("/com/example/summit_power_company_/ReanaManagingDirector/ProductionManagerDeshboardScene.fxml", actionEvent);
    }

    @javafx.fxml.FXML
    public void addDateButtonOnClicked(ActionEvent actionEvent) {
    }
}