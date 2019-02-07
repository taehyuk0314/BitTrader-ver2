package domain;
import lombok.Data;
public @Data class CustomerDTO {
	private String customerID,
	   customerName,
	   password,
	   address,
	   city,
	   postalCode,
	   ssn;
	
}
