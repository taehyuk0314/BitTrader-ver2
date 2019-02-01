package domain;
import lombok.Data;
public @Data class OrderDetailDTO {
	private String orderDetailID,
				   orderID,
				   productID,
				   quantity;
	
}
