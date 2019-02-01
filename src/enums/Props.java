package enums;

public enum Props {
	ORA_DRIVER("oracle.jdbc.OracleDriver"), DB_USER("oracle"), DB_PASS("password"),DB_URL("jdbc:oracle:thin:@localhost:1521:xe");
	private String value;
	private Props(String value) {
		this.value = value;
	}
	public String getValue() {
		return value;
	}
}
