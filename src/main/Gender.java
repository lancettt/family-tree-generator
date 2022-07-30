package main;

public enum Gender {
	MALE("m"), FEMALE("f");
	
	private String code;
	
	private Gender(String code) {
		this.code = code;
	}
	
	public String getCode() {
		return code;
	}
}
