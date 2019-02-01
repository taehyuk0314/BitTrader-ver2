package domain;
import lombok.Data;
public @Data class OrderDTO {
	private String orderID,
				   customerID,
				   employeeID,
				   orderDate,
				   shipperID;
	
}
