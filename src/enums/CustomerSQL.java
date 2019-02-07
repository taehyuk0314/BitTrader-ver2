package enums;

public enum CustomerSQL {
	SIGNUP,SIGNIN;
	@Override
	public String toString() {
		StringBuffer query = new StringBuffer();
		switch(this) {
		case SIGNUP:
			query.append("INSERT INTO customer(CUSTOMER_ID,CUSTOMER_NAME,PASSWORD,ADDRESS,CITY,POSTALCODE,SSN)\r\n" + 
					"			VALUES(?,?,?,?,?,?,?)") ;
			break;
		case SIGNIN:
			query.append("SELECT * FROM CUSTOMER WHERE CUSTOMER_ID LIKE ? AND PASSWORD LIKE ?");
			break;
		}
		return query.toString();
	}
}
