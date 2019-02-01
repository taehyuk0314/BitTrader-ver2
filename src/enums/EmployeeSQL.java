package enums;

public enum EmployeeSQL {
	REGISTER;
	@Override
	public String toString() {
		String query = "";
		switch (this) {
		case REGISTER:
			query ="INSERT INTO EMPLOYEES(EMPLOYEE_ID,NAME,MANAGER,BIRTH_DATE,PHOTO,NOTES) VALUES("
					+ "EMP_SEQ.NEXTVAL,?,?,?,?,?)";
			break;

		default:
			break;
		}
		return query;
	}
	
}
//String employeeID,
//manager,
//Name,
//birthDate,
//photo,
//notes;