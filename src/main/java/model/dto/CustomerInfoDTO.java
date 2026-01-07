package model.dto;

import javafx.collections.ObservableArray;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class CustomerInfoDTO {

    private String ID;
    private String Title;
    private String Name;
    private Date DOB;
    private double salary;
    private String address;
    private String city;
    private String province;
    private String postalCode;

}
