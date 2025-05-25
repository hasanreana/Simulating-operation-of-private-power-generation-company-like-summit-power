package com.example.summit_power_company_.ReanaManagingDirector;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class ViewReportController
{
    @javafx.fxml.FXML
    public void initialize() {
    }

    @javafx.fxml.FXML
    public void backButtonOnAction(ActionEvent actionEvent)throws IOException {
        SceneSwitcher.switchTo("/com/example/summit_power_company_/ReanaManagingDirector/ManagingDirectorDeshboard.fxml", actionEvent);
    }
}