package enums;

public enum CustomerSQL {
	SIGNUP,SIGNIN,LIST;
	@Override
	public String toString() {
		StringBuffer query = new StringBuffer();
		switch(this) {
		case SIGNUP:
			query.append("INSERT INTO customers(CUSTOMER_ID,CUSTOMER_NAME,PASSWORD,SSN,PHONE,POSTALCODE,ADDRESS,CITY)\n" + 
					"			VALUES(?,?,?,?,?,?,?,?)") ;
			break;
		case SIGNIN:
			query.append("SELECT * FROM CUSTOMERS WHERE CUSTOMER_ID LIKE ? AND PASSWORD LIKE ?");
			break;
		case LIST:
			query.append("SELECT * FROM CUSTOMERS");
			break;
		}
		return query.toString();
	}
}
