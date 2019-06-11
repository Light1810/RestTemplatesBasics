package me.aakash.selection;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Useroptions {
	
	@Id
	private long mob_number;
	
	@Column(name="option1")
	private int o1;
	
	@Column(name="option2")
	private int o2;
	
	@Column(name="option3")
	private int o3;
	
	@Column(name="option4")
	private int o4;

	
	
	
	
	
	/**
	 * 
	 */
	public Useroptions() {
		super();
	}
	
	public Useroptions(long mob_number, int o1, int o2, int o3, int o4) {
		super();
		this.mob_number = mob_number;
		this.o1 = o1;
		this.o2 = o2;
		this.o3 = o3;
		this.o4 = o4;
	}



	public long getMob_number() {
		return mob_number;
	}

	public void setMob_number(long mob_number) {
		this.mob_number = mob_number;
	}

	public int getO1() {
		return o1;
	}

	public void setO1(int o1) {
		this.o1 = o1;
	}

	public int getO2() {
		return o2;
	}

	public void setO2(int o2) {
		this.o2 = o2;
	}

	public int getO3() {
		return o3;
	}

	public void setO3(int o3) {
		this.o3 = o3;
	}

	public int getO4() {
		return o4;
	}

	public void setO4(int o4) {
		this.o4 = o4;
	}
	
	

}
