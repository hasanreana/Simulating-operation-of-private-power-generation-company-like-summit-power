package com.example.summit_power_company_.ReanaManagingDirector;

import javafx.event.ActionEvent;
import javafx.scene.control.TextField;

import java.io.IOException;

public class EmployeeDetailsController
{
    @javafx.fxml.FXML
    private TextField salaryTextField;
    @javafx.fxml.FXML
    private TextField newDeTextField;
    @javafx.fxml.FXML
    private TextField oldDeTextField;
    @javafx.fxml.FXML
    private TextField yearsTextField;
    @javafx.fxml.FXML
    private TextField nameTextField;

    @javafx.fxml.FXML
    public void initialize() {
    }

    @javafx.fxml.FXML
    public void backButtonOnClicked(ActionEvent actionEvent)throws IOException {
        SceneSwitcher.switchTo("/com/example/summit_power_company_/ReanaManagingDirector/ManagingDirectorDeshboard.fxml", actionEvent);
    }

    @javafx.fxml.FXML
    public void addButton(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void pdfButton(ActionEvent actionEvent) {
    }
}