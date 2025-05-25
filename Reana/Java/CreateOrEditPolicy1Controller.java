package com.example.summit_power_company_.ReanaManagingDirector;

import javafx.event.ActionEvent;

import java.io.IOException;

public class CreateOrEditPolicy1Controller
{
    @javafx.fxml.FXML
    public void initialize() {
    }

    @javafx.fxml.FXML
    public void goBackToDashboardButtonOnClick(ActionEvent actionEvent)throws IOException {
        SceneSwitcher.switchTo("/com/example/summit_power_company_/ReanaManagingDirector/ManagingDirectorDeshboard.fxml", actionEvent);
    }

    @javafx.fxml.FXML
    public void createPolicyButtonOnClicked(ActionEvent actionEvent)throws IOException  {
        SceneSwitcher.switchTo("/com/example/summit_power_company_/ReanaManagingDirector/CreatePolicy.fxml", actionEvent);
    }

    @javafx.fxml.FXML
    public void editPolicyButtonOnClicked(ActionEvent actionEvent)throws IOException  {
        SceneSwitcher.switchTo("/com/example/summit_power_company_/ReanaManagingDirector/EditPolicy.fxml", actionEvent);
    }
}