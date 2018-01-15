package com.sapient.vo;

public class Question {
	
	private int qid;
	private String qdesc;
	private String opta;
	private String optb;
	private String optc;
	private String answer;
	
	public Question(int qid, String qdesc, String opta, String optb, String optc, String answer) {
		super();
		this.qid = qid;
		this.qdesc = qdesc;
		this.opta = opta;
		this.optb = optb;
		this.optc = optc;
		this.answer = answer;
	}
	
	public int getQid() {
		return qid;
	}
	public String getQdesc() {
		return qdesc;
	}
	public String getOpta() {
		return opta;
	}
	public String getOptb() {
		return optb;
	}
	public String getOptc() {
		return optc;
	}
	public String getAnswer() {
		return answer;
	}
	
	

}
