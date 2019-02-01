package domain;
import lombok.Data;
public @Data class EmployeeDTO {
	private String employeeID,
	   manager,
	   Name,
	   birthDate,
	   photo,
	   notes;
	
}
