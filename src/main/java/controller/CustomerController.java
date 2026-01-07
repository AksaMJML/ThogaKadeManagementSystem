package controller;

import javafx.collections.FXCollections;
import javafx.collections.ObservableArray;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import model.dto.CustomerInfoDTO;

import java.sql.*;

public class CustomerController {

    ObservableList<Object> customerInfoDto = FXCollections.observableArrayList();

    @FXML
    private Button btnAdd;

    @FXML
    private Button btnDelete;

    @FXML
    private Button btnReload;

    @FXML
    private Button btnUpdate;

    @FXML
    private TableColumn<?, ?> colAddress;

    @FXML
    private TableColumn<?, ?> colCity;

    @FXML
    private TableColumn<?, ?> colCusID;

    @FXML
    private TableColumn<?, ?> colCusName;

    @FXML
    private TableColumn<?, ?> colDOB;

    @FXML
    private TableColumn<?, ?> colPostalCode;

    @FXML
    private TableColumn<?, ?> colProvince;

    @FXML
    private TableColumn<?, ?> colSalary;

    @FXML
    private TableColumn<?, ?> colTitle;

    @FXML
    private DatePicker dpDOB;

    @FXML
    private TableView<?> tblCusView;

    @FXML
    private TextField txtAddress;

    @FXML
    private TextField txtCity;

    @FXML
    private TextField txtCusID;

    @FXML
    private TextField txtCusName;

    @FXML
    private TextField txtCusSalary;

    @FXML
    private TextField txtCusTitle;

    @FXML
    private TextField txtPostalCode;

    @FXML
    private TextField txtProvince;

    @FXML
    void btnAddOnClick(ActionEvent event) {

    }

    @FXML
    void btnDeleteOnClick(ActionEvent event) {

    }

    @FXML
    void btnReloadOnClick(ActionEvent event) {

        try{
            Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306//Thogakade","root","741897");
            PreparedStatement preparedStatement = connection.prepareStatement("SELECT * FROM Thogakade");
            ResultSet resultSet = preparedStatement.executeQuery();

            while (resultSet.next()){
                CustomerInfoDTO customerInfoDTO = new CustomerInfoDTO(
                        resultSet.getString("ID"),
                        resultSet.getString("Title"),
                        resultSet.getString("Name"),
                        resultSet.getDate("DOB"),
                        resultSet.getDouble("salary"),
                        resultSet.getString("address"),
                        resultSet.getString("city"),
                        resultSet.getString("province"),
                        resultSet.getString("postalCode")
                );

                customerInfoDTO.add(customerInfoDTO);
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    @FXML
    void btnUpdateOnClick(ActionEvent event) {

    }

}
