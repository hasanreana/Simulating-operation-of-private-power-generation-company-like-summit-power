package com.example.summit_power_company_.ReanaManagingDirector;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class ManagingDirectorDeshboardController
{
    @javafx.fxml.FXML
    public void initialize() {
    }

    @javafx.fxml.FXML
    public void viewBudgetOnButtonClick(ActionEvent actionEvent)throws IOException {
        SceneSwitcher.switchTo("/com/example/summit_power_company_/ReanaManagingDirector/Budget1.fxml", actionEvent);
    }

    @javafx.fxml.FXML
    public void createOrEditPolicyOnButtonClick(ActionEvent actionEvent)throws IOException {
        SceneSwitcher.switchTo("/com/example/summit_power_company_/ReanaManagingDirector/CreateOrEditPolicy1.fxml", actionEvent);
    }

    @javafx.fxml.FXML
    public void logOutOnButtonClicked(ActionEvent actionEvent)throws IOException {
        SceneSwitcher.switchTo("/com/example/summit_power_company_/Login.fxml", actionEvent);
    }

    @javafx.fxml.FXML
    public void viewReportOnButtonClicked(ActionEvent actionEvent)throws IOException {
        SceneSwitcher.switchTo("/com/example/summit_power_company_/ReanaManagingDirector/ViewReport.fxml", actionEvent);
    }

    @javafx.fxml.FXML
    public void approveDecisionOnButtonClick(ActionEvent actionEvent)throws IOException {
        SceneSwitcher.switchTo("/com/example/summit_power_company_/ReanaManagingDirector/DecisionMaking.fxml", actionEvent);
    }

    @javafx.fxml.FXML
    public void assignTaskOnButtonClick(ActionEvent actionEvent)throws IOException {
        SceneSwitcher.switchTo("/com/example/summit_power_company_/ReanaManagingDirector/AssignTask.fxml", actionEvent);
    }

    @javafx.fxml.FXML
    public void scheduleMeetingOnButtonClick(ActionEvent actionEvent)throws IOException {
        SceneSwitcher.switchTo("/com/example/summit_power_company_/ReanaManagingDirector/scheduleMeeting.fxml", actionEvent);

    }

    @javafx.fxml.FXML
    public void employeeDetailsOnButtonClick(ActionEvent actionEvent)throws IOException {
        SceneSwitcher.switchTo("/com/example/summit_power_company_/ReanaManagingDirector/EmployeeDetails.fxml", actionEvent);
    }

    @javafx.fxml.FXML
    public void reviewEmailsOnButtonClick(ActionEvent actionEvent)throws IOException {
        SceneSwitcher.switchTo("/com/example/summit_power_company_/ReanaManagingDirector/ReviewEmails.fxml", actionEvent);
    }
}