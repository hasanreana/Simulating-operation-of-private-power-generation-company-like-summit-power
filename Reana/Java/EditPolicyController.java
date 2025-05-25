package com.example.summit_power_company_.ReanaManagingDirector;

import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;

import java.io.IOException;
import java.time.LocalDate;
import java.util.ArrayList;

public class EditPolicyController {
    @javafx.fxml.FXML
    private TableColumn<Policy, LocalDate> effectiveDateTableColumn;
    @javafx.fxml.FXML
    private TableColumn<Policy, String> policyNameTableColumn;
    @javafx.fxml.FXML
    private TableView<Policy> policyInfoTableView;
    @javafx.fxml.FXML
    private TableColumn<Policy, String> policyDetailsTableColumn;
    @javafx.fxml.FXML
    private TextArea policyInfoLabel;
    @javafx.fxml.FXML
    private TextField nameTextField;
    @javafx.fxml.FXML
    private TextField detailsTextField1;
    @javafx.fxml.FXML
    private DatePicker dateDatepicker;

    @javafx.fxml.FXML
    public void initialize() {
        policyNameTableColumn.setCellValueFactory(new PropertyValueFactory<>("policytitle"));
        policyDetailsTableColumn.setCellValueFactory(new PropertyValueFactory<>("policyDetails"));
        effectiveDateTableColumn.setCellValueFactory(new PropertyValueFactory<>("policyEffectiveDate"));


    }

    ArrayList<Policy> policy = new ArrayList<>();

    @javafx.fxml.FXML
    public void editAndSaveButtonOnClick(ActionEvent actionEvent) {
        Alert a= new Alert(Alert.AlertType.INFORMATION);
        a.setContentText("Edit and Save!");
        a.showAndWait();
    }

    @javafx.fxml.FXML
    public void goBackToDashboardButtonOnClick(ActionEvent actionEvent)throws IOException {
        SceneSwitcher.switchTo("/com/example/summit_power_company_/ReanaManagingDirector/ManagingDirectorDeshboard.fxml", actionEvent);
    }

    @javafx.fxml.FXML
    public void selectAndViewDetailsButtonOnClick(ActionEvent actionEvent) {


        if (nameTextField.getText().trim().isEmpty()){
            policyInfoLabel.setText("Please enter proposal Id!");
            return;
        }

        if (detailsTextField1.getText().trim().isEmpty()){
            policyInfoLabel.setText("Please enter amount!");
            return;
        }
        if (dateDatepicker.getValue() == null){
            policyInfoLabel.setText("Please select an end date!");
            return;
        }




        Policy newPolicy = new Policy(

                nameTextField.getText(),

                detailsTextField1.getText(),
                dateDatepicker.getValue()








        );

        policy.add(newPolicy);

        System.out.println(newPolicy.toString());
        policyInfoLabel.setText("Edit Policy!");

        policyInfoTableView.getItems().clear();
        policyInfoTableView.getItems().addAll(policy);
    }
}