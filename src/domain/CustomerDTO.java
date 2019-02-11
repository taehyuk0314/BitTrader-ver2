package domain;
import lombok.Data;
public @Data class CustomerDTO {
	private String customerID,
	   customerName,
	   password,
	   ssn,
	   photo,
	   phone,
	   city,
	   address,
	   postalCode;
	
}
