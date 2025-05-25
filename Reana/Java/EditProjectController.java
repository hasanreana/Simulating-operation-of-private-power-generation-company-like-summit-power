package com.example.summit_power_company_.ReanaManagingDirector;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.IOException;

public class EditProjectController
{
    @javafx.fxml.FXML
    private TextField budgetTextField;
    @javafx.fxml.FXML
    private TextField materialQuantityTextField;
    @javafx.fxml.FXML
    private TextField materialNameTextField;
    @javafx.fxml.FXML
    private TextField manpowerTextField;

    public static boolean updateSuccess = false;
    private MaterialProducts user;

    @javafx.fxml.FXML
    public void initialize() {
    }



    public MaterialProducts getUser() {
        return user;
    }

    @javafx.fxml.FXML
    public void goBack(ActionEvent actionEvent)throws IOException  {
        SceneSwitcher.switchTo("/com/example/summit_power_company_/ReanaManagingDirector/ProductionManagerDeshboardScene.fxml", actionEvent);
    }

    @javafx.fxml.FXML
    public void update(ActionEvent actionEvent)throws IOException {
        try {
            String name = materialNameTextField.getText();
            int quantity = Integer.parseInt(materialQuantityTextField.getText());
            int manpower = Integer.parseInt(manpowerTextField.getText());
            int budget = Integer.parseInt(budgetTextField.getText());

            user.setMaterialName(name);
            user.setMaterialQuantity(quantity);
            user.setManpower(manpower);
            user.setBudget(budget);

            updateSuccess = true;

            FXMLLoader loader = new FXMLLoader(getClass().getResource("CreatingManufacturingPlansPM.fxml"));
            Parent root = loader.load();

            CreatingManufacturingPlansPMController controller = loader.getController();
            controller.setMessage("User updated successfully!");

            Stage stage = (Stage) materialNameTextField.getScene().getWindow();
            stage.setScene(new Scene(root));
            stage.show();

        } catch (NumberFormatException e) {
            System.out.println("Error: Please enter valid numbers for quantity, manpower, and budget.");
        } catch (IOException e) {
            System.out.println("Error: Failed to load the next page.");
            e.printStackTrace();
        }
    }


    @javafx.fxml.FXML
    public void logOut(ActionEvent actionEvent)throws IOException  {
        SceneSwitcher.switchTo("/com/example/summit_power_company_/Login.fxml", actionEvent);

    }
    public void setUser(MaterialProducts user) {
        this.user = user;

        materialNameTextField.setText(user.getMaterialName());
        materialQuantityTextField.setText(String.valueOf(user.getMaterialQuantity()));
        manpowerTextField.setText(String.valueOf(user.getManpower()));
        budgetTextField.setText(String.valueOf(user.getBudget()));
    }

    public MaterialProducts getMaterialProducts() {
        return user;
    }

}