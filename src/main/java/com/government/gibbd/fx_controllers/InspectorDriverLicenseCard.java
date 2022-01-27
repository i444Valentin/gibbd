package com.government.gibbd.fx_controllers;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.image.ImageView;
import javafx.scene.shape.Circle;

public class InspectorDriverLicenseCard {

    @FXML
    private Circle indicatorCircle;

    @FXML
    private TableView<DriverTableView> driversTable;

    @FXML
    private TableColumn<DriverTableView, String> driverColumn;

    @FXML
    private TableColumn<DriverTableView, String> licenseNumberColumn;

    @FXML
    private Label year;

    @FXML
    private Label surnameOutput;

    @FXML
    private Label nameMiddleOutput;

    @FXML
    private Label cityEnOutput;

    @FXML
    private Label cityOutput;

    @FXML
    private Label year2Output;

    @FXML
    private Label gibbdNumOutput;

    @FXML
    private Label gibbdEnNumOutput;

    @FXML
    private Label num2Output;

    @FXML
    private Label city2EnOutput;

    @FXML
    private Label city2Output;

    @FXML
    private Label categoriesOutput;

    @FXML
    private ImageView driverImage;

}
