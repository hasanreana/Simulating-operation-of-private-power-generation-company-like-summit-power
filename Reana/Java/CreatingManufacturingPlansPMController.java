package com.example.summit_power_company_.ReanaManagingDirector;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.stage.Stage;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;
import java.util.List;

public class CreatingManufacturingPlansPMController {
    public static MaterialProducts material = null;
    static List<MaterialProducts> materialProduct = new ArrayList<>();

    static {
//
        try (ObjectInputStream inputStream = new ObjectInputStream(new FileInputStream("Information/materialproducts.bin"))) {
            materialProduct.clear();
            List<MaterialProducts> loadedList = (List<MaterialProducts>) inputStream.readObject();
            materialProduct.addAll(loadedList);

//            userList = (List<User>) inputStream.readObject();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @javafx.fxml.FXML
    private TextField budgetTextField;
    @javafx.fxml.FXML
    private TableColumn<MaterialProducts,Integer> manpowerTColumn;
    @javafx.fxml.FXML
    private TableColumn<MaterialProducts, String> nameColumn;
    @javafx.fxml.FXML
    private TextField materialQuantityTextField;
    @javafx.fxml.FXML
    private TextField materialNameTextField;
    @javafx.fxml.FXML
    private TableView<MaterialProducts> tableView;
    @javafx.fxml.FXML
    private TextField manpowerTextField;
    @javafx.fxml.FXML
    private TableColumn<MaterialProducts,Integer> quantityTColumn;
    @javafx.fxml.FXML
    private Label messageLabel;
    @javafx.fxml.FXML
    private Label msgLabel;
    @javafx.fxml.FXML
    private TableColumn<MaterialProducts,Integer> budgetTC;

    @javafx.fxml.FXML
    public void initialize() {
        nameColumn.setCellValueFactory(new PropertyValueFactory<>("materialName"));
        quantityTColumn.setCellValueFactory(new PropertyValueFactory<>("materialQuantity"));
        manpowerTColumn.setCellValueFactory(new PropertyValueFactory<>("manpower"));
        budgetTC.setCellValueFactory(new PropertyValueFactory<>(" budget"));

        tableView.getItems().addAll(materialProduct);
    }
    private void readFromFile(){
        try (ObjectInputStream inputStream = new ObjectInputStream(new FileInputStream("Information/materialproducts.bin"))) {
            MaterialProducts u = (MaterialProducts) inputStream.readObject();
            messageLabel.setText(u.toString());
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
            messageLabel.setText("Invalid file format!");
        } catch (IOException e) {
            e.printStackTrace();
            messageLabel.setText("Could not read from file");
        }


    }

    @javafx.fxml.FXML
    public void addProjectInfoButtonOnClicked(ActionEvent actionEvent) {
        String materialName = materialNameTextField.getText();
        String materialQuantityText = materialQuantityTextField.getText();
        String manpowerText = manpowerTextField.getText();
        String budgetText = budgetTextField.getText();



        if (materialName.isBlank()|| materialQuantityText.isBlank() || manpowerText.isBlank() || budgetText.isBlank()  ) {
            messageLabel.setText("Please provide all inputs");
            return;
        }

        int materialQuantity ;
        int manpower;
        int budget;
        try {
            materialQuantity = Integer.parseInt(materialQuantityText);
            manpower = Integer.parseInt(manpowerText);
            budget = Integer.parseInt(budgetText);
        } catch (NumberFormatException e) {
            messageLabel.setText("Please enter valid numbers for quantity, manpower, and budget.");
            return;
        }






    MaterialProducts user = new MaterialProducts(materialName, materialQuantity, manpower, budget);
        materialProduct .add(user);
        tableView.getItems().add(user);
        messageLabel.setText("User added successfully");
//



        materialNameTextField.clear();
        materialQuantityTextField.clear();
        manpowerTextField.clear();
        budgetTextField.clear();
    }

    @javafx.fxml.FXML
    public void goToActivitiesButtonOnclicked(ActionEvent actionEvent)throws IOException  {
        SceneSwitcher.switchTo("/com/example/summit_power_company_/ReanaManagingDirector/ProductionManagerDeshboardScene.fxml", actionEvent);
    }

    @javafx.fxml.FXML
    public void sendMsgButtonOnClicked(ActionEvent actionEvent) {
        Alert a= new Alert(Alert.AlertType.INFORMATION);
        a.setContentText("Request Sent Successfully!");
        a.showAndWait();
    }

    @javafx.fxml.FXML
    public void editProjectInfoButtonOnClicked(ActionEvent actionEvent)throws IOException  {
        MaterialProducts user = tableView.getSelectionModel().getSelectedItem();
        if (user != null) {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("/com/example/summit_power_company_/ReanaManagingDirector/EditProject.fxml"));
            Parent root = loader.load();

            EditProjectController controller = loader.getController();
            controller.setUser(user);

            Stage stage = (Stage) messageLabel.getScene().getWindow();
            stage.setScene(new Scene(root));
            stage.show();
        } else {
            messageLabel.setText("Please select a project to edit.");
        }

    }
    public void setMessage(String message) {
        messageLabel.setText(message);
    }
}