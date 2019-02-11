package enums;

public enum EmployeeSQL {
	REGISTER,EXIST;
	@Override
	public String toString() {
		StringBuffer query = new StringBuffer();
		switch (this) {
		case REGISTER:
			query.append("INSERT INTO EMPLOYEES(EMPLOYEE_ID,NAME,MANAGER,BIRTH_DATE,PHOTO,NOTES) VALUES("
					+ "EMPLOYEE_ID.NEXTVAL,?,?,?,?,?)");
			break;
		case EXIST:
			query.append("SELECT * FROM EMPLOYEES WHERE EMPLOYEE_ID LIKE ? AND NAME LIKE ?");
			break;
		default:
			break;
		}
		return query.toString();
	}
	
}
//String employeeID,
//manager,
//Name,
//birthDate,
//photo,
//notes;