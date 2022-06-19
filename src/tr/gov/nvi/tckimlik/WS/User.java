package tr.gov.nvi.tckimlik.WS;

public class User {
	private int id;
	private String tcNO;
	private String name;
	private String surName;
	int birthday;
	
	
	public User() {
		super();
	}

	public User(int id, String tcNO, String name, String surName, int birthday) {
		super();
		this.id = id;
		this.tcNO = tcNO;
		this.name = name;
		this.surName = surName;
		this.birthday = birthday;
	}

	
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTcNO() {
		return tcNO;
	}

	public void setTcNO(String tcNO) {
		this.tcNO = tcNO;
	}

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSurName() {
		return surName;
	}
	public void setSurName(String surName) {
		this.surName = surName;
	}



	public int getBirthday() {
		return birthday;
	}



	public void setBirthday(int birthday) {
		this.birthday = birthday;
	}

	
	
}
