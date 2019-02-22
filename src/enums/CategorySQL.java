package enums;

public enum CategorySQL {
	LIST,COUNT;
	@Override
	public String toString() {
		StringBuffer query = new StringBuffer();
		switch(this) {
		case LIST:
			query.append("SELECT *\r\n" + 
					"FROM\r\n" + 
					"(SELECT T.*,ROWNUM R1\r\n" + 
					"    FROM(SELECT ROWNUM RNUM,C.* \r\n" + 
					"        FROM CATEGORIES C\r\n" + 
					"        ORDER BY RNUM DESC) T)\r\n" + 
					"WHERE R1 BETWEEN ? AND ?") ;
			break;
		case COUNT :
			query.append("SELECT COUNT(*) COUNT FROM CATEGORIES");
			break;
		default:
			break;
		}
		return query.toString();
	}
}
