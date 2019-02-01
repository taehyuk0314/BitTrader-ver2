package domain;
import lombok.Data;
public @Data class ProductDTO {
	private String productID,
				   productName,
				   supplierID,
				   categoryID,
				   unit,
				   price;
	
}
