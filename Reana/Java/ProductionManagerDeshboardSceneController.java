package com.example.summit_power_company_.ReanaManagingDirector;

import javafx.event.ActionEvent;

import java.io.IOException;

public class ProductionManagerDeshboardSceneController
{
    @javafx.fxml.FXML
    public void initialize() {
    }

    @javafx.fxml.FXML
    public void backButtonOnClicked(ActionEvent actionEvent)throws IOException {
        SceneSwitcher.switchTo("/com/example/summit_power_company_/Login.fxml", actionEvent);
    }

    @javafx.fxml.FXML
    public void CheckQualityOnClick(ActionEvent actionEvent)throws IOException {
        SceneSwitcher.switchTo("/com/example/summit_power_company_/ReanaManagingDirector/CheckQualityOfProductionPM.fxml", actionEvent);
    }

    @javafx.fxml.FXML
    public void ManageStockOnClick(ActionEvent actionEvent)throws IOException {
        SceneSwitcher.switchTo("/com/example/summit_power_company_/ReanaManagingDirector/ManageStockPM.fxml", actionEvent);
    }

    @javafx.fxml.FXML
    public void productionToDistributorProcessOnClick(ActionEvent actionEvent)throws IOException {
        SceneSwitcher.switchTo("/com/example/summit_power_company_/ReanaManagingDirector/ProductiontoDistributionProcessPM.fxml", actionEvent);
    }

    @javafx.fxml.FXML
    public void ManufacturingPlansOnClick(ActionEvent actionEvent)throws IOException {
        SceneSwitcher.switchTo("/com/example/summit_power_company_/ReanaManagingDirector/CreatingManufacturingPlansPM.fxml", actionEvent);
    }

    @javafx.fxml.FXML
    public void RecordsProductionOnClick(ActionEvent actionEvent)throws IOException {
        SceneSwitcher.switchTo("/com/example/summit_power_company_/ReanaManagingDirector/RecordsOfEachProductionBatchPM.fxml", actionEvent);
    }

    @javafx.fxml.FXML
    public void ProductionEquipmentOnClick(ActionEvent actionEvent)throws IOException {
        SceneSwitcher.switchTo("/com/example/summit_power_company_/ReanaManagingDirector/EquipmentInformationForProductionPM.fxml", actionEvent);
    }

    @javafx.fxml.FXML
    public void ProductionInfoOnClick(ActionEvent actionEvent)throws IOException {
        SceneSwitcher.switchTo("/com/example/summit_power_company_/ReanaManagingDirector/ProductionInformationDistributorPM.fxml", actionEvent);
    }

    @javafx.fxml.FXML
    public void ComunicationStackholdersOnClick(ActionEvent actionEvent)throws IOException {
        SceneSwitcher.switchTo("/com/example/summit_power_company_/ReanaManagingDirector/CommunicationwithStackHoldersPM.fxml", actionEvent);
    }
}