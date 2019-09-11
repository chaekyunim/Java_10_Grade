package com.biz.list.model;

public class StudentVO {

	private int intNum;
	private String strName;
	
	private String strDept;
	private int intGrade;
	
	private String strTel;
	private String strAddr;
	
	// getter(), setter()
	// private 으로 선언된 맴버변수에 접근 할수 있도록
	// 외부에서 접근할 수 있도록
	// 통로 역활을 하게한다
	
	// 학번 맴버변수 값을 읽을 메서드
	
	public int getIntNum() {
		return intNum;
		
	}
	
	public String getStrName() {
		return strName;
	}

	public void setStrName(String strName) {
		this.strName = strName;
	}

	public String getStrDept() {
		return strDept;
	}

	public void setStrDept(String strDept) {
		this.strDept = strDept;
	}

	public int getIntGrade() {
		return intGrade;
	}

	public void setIntGrade(int intGrade) {
		this.intGrade = intGrade;
	}

	public String getStrTel() {
		return strTel;
	}

	public void setStrTel(String strTel) {
		this.strTel = strTel;
	}

	public String getStrAddr() {
		return strAddr;
	}

	public void setStrAddr(String strAddr) {
		this.strAddr = strAddr;
	}

	// 학번 맴버변수에 값을 저장할 method
	public void setIntNum(int intNum) {
		this.intNum = intNum;
	}
}
