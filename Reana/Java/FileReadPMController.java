package com.example.summit_power_company_.ReanaManagingDirector;

import javafx.event.ActionEvent;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class FileReadPMController
{
    @javafx.fxml.FXML
    private TextArea textArea;
    @javafx.fxml.FXML
    private Label label;

    @javafx.fxml.FXML
    public void initialize() {
    }

    @javafx.fxml.FXML
    public void goBack(ActionEvent actionEvent)throws IOException  {
        SceneSwitcher.switchTo("/com/example/summit_power_company_/ReanaManagingDirector/ProductionManagerDeshboardScene.fxml", actionEvent);
    }

    @javafx.fxml.FXML
    public void readFromFile(ActionEvent actionEvent) {
        try (BufferedReader reader = new BufferedReader(new FileReader("Information.txt"))) {
            char[] buf = new char[10];
            while(true) {
                String line = reader.readLine();
                if (line == null) break;
                textArea.appendText(line + "\n");
            }
        }
        catch (IOException e) {
            label.setText("Could not read from file!");
        }
    }

    @javafx.fxml.FXML
    public void logOut(ActionEvent actionEvent)throws IOException  {
        SceneSwitcher.switchTo("/com/example/summit_power_company_/Login.fxml", actionEvent);
    }
}