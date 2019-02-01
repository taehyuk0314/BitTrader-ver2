package domain;

import lombok.Data;

public @Data class SupplierDTO {
	private String supplierID,
	   supplierName,
	   contactName,
	   address,
	   city,
	   postalCode,
	   country,
	   phone;

}
