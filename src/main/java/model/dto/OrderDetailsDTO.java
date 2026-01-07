package model.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class OrderDetailsDTO {

    private String orderID;
    private String  itemCode;
    private int orderQty;
    private int discount;

}
