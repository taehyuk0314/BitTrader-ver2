package domain;
import lombok.Data;
public @Data class CustomerDTO {
	private String customerID,
	   customerName,
	   contactName,
	   address,
	   city,
	   postalCode,
	   country;
	
}
