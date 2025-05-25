package com.example.summit_power_company_.ReanaManagingDirector;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.ComboBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TextArea;
import javafx.stage.Stage;

import java.io.IOException;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.EventObject;

public class AssignTaskController
{
    @javafx.fxml.FXML
    private DatePicker duedateDatePicker;
    @javafx.fxml.FXML
    private ComboBox<String> userComboBox;
    @javafx.fxml.FXML
    private TextArea taskDetailssTextArea;
    @javafx.fxml.FXML
    private TextArea taskTextArea;

    private ArrayList<Task> task;

    @javafx.fxml.FXML
    public void initialize() {
        task = new ArrayList();
        userComboBox.getItems().addAll("HR Manager","IT Manager","Sales and Marketing Manager","Finance Manager","Production Manager");

}

    @javafx.fxml.FXML
    public void goBackToDashboardButtonOnClick(ActionEvent actionEvent)throws IOException {
        SceneSwitcher.switchTo("/com/example/summit_power_company_/ReanaManagingDirector/ManagingDirectorDeshboard.fxml", actionEvent);
    }

    @javafx.fxml.FXML
    public void assignTaskButtonOnClick(ActionEvent actionEvent) {
        String assignedTo = userComboBox.getValue();
        LocalDate dueDate = duedateDatePicker.getValue();
        String taskDetails = taskDetailssTextArea.getText();

        // Validate input (optional but recommended)
        if (assignedTo == null || dueDate == null || taskDetails.isEmpty()) {
            Alert alert = new Alert(Alert.AlertType.WARNING);
            alert.setTitle("Missing Fields");
            alert.setHeaderText(null);
            alert.setContentText("Please fill in all the fields before assigning the task.");
            alert.showAndWait();
            return;
        }

        // Create a task object
        Task task = new Task(assignedTo, dueDate, taskDetails); // Make sure Task class has this constructor

        // Format task info
        String formattedTask = "Assigned To: " + assignedTo +
                "\nDue Date: " + dueDate +
                "\nTask: " + taskDetails +
                "\n-----------------------------\n";

        // Show the info in the TextArea (append mode)
        taskTextArea.appendText(formattedTask);

        // Clear inputs (not the TextArea that shows task history)
        userComboBox.setValue(null);
        duedateDatePicker.setValue(null);
        // taskDetailssTextArea.clear();
    }
}