package me.aakash.selection;



public class CustomData {
	
	private String username;
	private String emailid;
	private int agegroup;
	private String selection1;
	private String selection2;
	private String selection3;
	private String selection4;
	/**
	 * @param username
	 * @param emailid
	 * @param agegroup
	 * @param selection1
	 * @param selection2
	 * @param selection3
	 * @param selection4
	 */
	
	public CustomData(String username, String emailid, int agegroup, String selection1, String selection2,
			String selection3, String selection4) {
		
		this.username = username;
		this.emailid = emailid;
		this.agegroup = agegroup;
		this.selection1 = selection1;
		this.selection2 = selection2;
		this.selection3 = selection3;
		this.selection4 = selection4;
	}
	/**
	 * 
	 */
	public CustomData() {
	
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getEmailid() {
		return emailid;
	}
	public void setEmailid(String emailid) {
		this.emailid = emailid;
	}
	public int getAgegroup() {
		return agegroup;
	}
	public void setAgegroup(int agegroup) {
		this.agegroup = agegroup;
	}
	public String getSelection1() {
		return selection1;
	}
	public void setSelection1(String selection1) {
		this.selection1 = selection1;
	}
	public String getSelection2() {
		return selection2;
	}
	public void setSelection2(String selection2) {
		this.selection2 = selection2;
	}
	public String getSelection3() {
		return selection3;
	}
	public void setSelection3(String selection3) {
		this.selection3 = selection3;
	}
	public String getSelection4() {
		return selection4;
	}
	public void setSelection4(String selection4) {
		this.selection4 = selection4;
	}

	

	
}
