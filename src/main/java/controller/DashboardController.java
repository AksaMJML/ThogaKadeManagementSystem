package controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

import java.io.IOException;

public class DashboardController {
Stage stage=new Stage();
    @FXML
    private Button btnCustomer;

    @FXML
    private Button btnItem;

    @FXML
    private Button btnOrder;

    @FXML
    private Button btnOrderDetails;

    @FXML
    void btnCustomerOnClick(ActionEvent event) throws IOException {
        stage.setScene(new Scene(FXMLLoader.load(getClass().getResource("/view/customer_info.fxml"))));
        stage.show();
        stage.setTitle("CustomerView");
    }

    @FXML
    void btnItemOnClick(ActionEvent event) {
        try {
            stage.setScene(new Scene(FXMLLoader.load(getClass().getResource("/view/item_info.fxml"))));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        stage.show();
        stage.setTitle("ItemView");
    }

    @FXML
    void btnOrderDetailsOnClick(ActionEvent event) {
        try {
            stage.setScene(new Scene(FXMLLoader.load(getClass().getResource("/view/order_details_info.fxml"))));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        stage.show();
        stage.setTitle("orderDetailsView");
    }

    @FXML
    void btnOrderOnClick(ActionEvent event) {
        try {
            stage.setScene(new Scene(FXMLLoader.load(getClass().getResource("/view/order_info.fxml"))));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        stage.show();
        stage.setTitle("orderView");
    }

}

