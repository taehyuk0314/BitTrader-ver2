package enums;

public enum ProductSQL {
	LIST,RETRIEVE,COUNT;
	@Override
	public String toString() {
		StringBuffer query = new StringBuffer();
		switch (this) {
		case LIST:
			query.append("SELECT *" + 
					"FROM "+ 
					"(SELECT T.*,ROWNUM R1"+
					"    FROM(SELECT ROWNUM RNUM,C.* "+
					"        FROM PRODUCTS C"+
					"        ORDER BY RNUM DESC) T)"+
					"WHERE R1 BETWEEN ? AND ?");
			break;
		case COUNT:
			query.append("SELECT COUNT(*) CO FROM PRODUCTS");
			break;
		default:
			break;
		}
		
		return query.toString();
	}
}
