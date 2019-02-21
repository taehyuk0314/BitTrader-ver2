package enums;

public enum CustomerSQL {
	SIGNUP,SIGNIN,LIST,ROW_COUNT,PHONE,RETRIEVE,UPDATE;
	@Override
	public String toString() {
		StringBuffer query = new StringBuffer();
		switch(this) {
		case SIGNUP:
			query.append("INSERT INTO customers(CUSTOMER_ID,CUSTOMER_NAME,PASSWORD,SSN,PHONE,POSTALCODE,CITY,PHOTO,ADDRESS)\n" + 
					"			VALUES(?,?,?,?,?,?,?,'63',?)") ;
			break;
		case SIGNIN:
			query.append("SELECT * FROM CUSTOMERS WHERE CUSTOMER_ID LIKE ? AND PASSWORD LIKE ?");
			break;
		case LIST:
			query.append("SELECT *\n" + 
					"FROM\n" + 
					"(SELECT T.*,ROWNUM R1\n" + 
					"    FROM(SELECT ROWNUM RNUM,C.* \n" + 
					"        FROM CUSTOMERS C\n" + 
					"        ORDER BY RNUM DESC) T)\n" + 
					"WHERE R1 BETWEEN ? AND ?\n" );
			break;
		case ROW_COUNT :
			query.append("SELECT COUNT(*) COUNT FROM CUSTOMERS");
			break;
		case PHONE :
			query.append("SELECT CUSTOMER_ID,CUSTOMER_NAME,PHONE FROM CUSTOMERS");
			break;
		case RETRIEVE :
			query.append("select * from customers where customer_id like ?");
			break;
		case UPDATE :
			query.append("UPDATE customers SET phone  = ? , postalcode = ? ,city =?, address=?, password = ? WHERE customer_id =?");
			break;
		}
		return query.toString();
	}
}
