package com.example.summit_power_company_.ReanaManagingDirector;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.stage.Stage;

import java.io.IOException;
import java.time.LocalDate;

public class ScheduleMeetingController {
    @javafx.fxml.FXML
    private TableColumn<Meeting, LocalDate> meetingDateTableColumn;
    @javafx.fxml.FXML
    private DatePicker meetingdateDatePicker;
    @javafx.fxml.FXML
    private ComboBox<String> userComboBox;
    @javafx.fxml.FXML
    private TableView<Meeting> meetingDetailsTableView;
    @javafx.fxml.FXML
    private TableColumn<Meeting, String> meetingWithTableColumn;
    @javafx.fxml.FXML
    private TableColumn<Meeting, String> meetingTimeTableColumn;
    @javafx.fxml.FXML
    private TextField meetingTimeTextField;


    private ObservableList<Meeting> meetinglist = FXCollections.observableArrayList();

    @javafx.fxml.FXML
    public void initialize() {
        userComboBox.getItems().addAll("HR Manager", "IT Manager", "Sales and Marketing Manager", "Finance Manager", "Production Manager");

        meetingWithTableColumn.setCellValueFactory(new PropertyValueFactory<Meeting, String>("meetingWith"));
        meetingDateTableColumn.setCellValueFactory(new PropertyValueFactory<Meeting, LocalDate>("meetingDate"));
        meetingTimeTableColumn.setCellValueFactory(new PropertyValueFactory<Meeting, String>("meetingTime"));
        meetingDetailsTableView.setItems(meetinglist);

    }

    @javafx.fxml.FXML
    public void goBackToDashboardOnBUttonClick(ActionEvent actionEvent) throws IOException {
        SceneSwitcher.switchTo("/com/example/summit_power_company_/ReanaManagingDirector/ManagingDirectorDeshboard.fxml", actionEvent);
    }

    @javafx.fxml.FXML
    public void addMeetingToTableOnButtonClick(ActionEvent actionEvent) {
        String meetingWith = userComboBox.getValue();
        LocalDate meetingDate = meetingdateDatePicker.getValue();
        String meetingTime = meetingTimeTextField.getText();

        if (meetingWith == null || meetingDate == null || meetingTime.isEmpty()) {
            Alert alert = new Alert(Alert.AlertType.WARNING);
            alert.setTitle("Warning");
            alert.setHeaderText(null);
            alert.setContentText("Please fill in all the required fields.");
            alert.showAndWait();
            return;
        }

        if (meetingDate.isBefore(LocalDate.now())) {
            Alert alert = new Alert(Alert.AlertType.WARNING);
            alert.setTitle("Warning");
            alert.setHeaderText(null);
            alert.setContentText("Please select a future date for the meeting .");
            alert.showAndWait();
            return;
        }
        Meeting meetingInfo = new Meeting(meetingWith, meetingDate, meetingTime);
        meetinglist.add(meetingInfo);


        userComboBox.setValue(null);
        meetingdateDatePicker.setValue(null);
        meetingTimeTextField.clear();
    }

}



