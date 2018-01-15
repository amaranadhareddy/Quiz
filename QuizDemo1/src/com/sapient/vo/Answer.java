package com.sapient.vo;

public class Answer {
	
	private int qid;
	private String answer;
	
	public Answer(){
		
	}
	
	
	public Answer(int qid, String answer) {
		super();
		this.qid = qid;
		this.answer = answer;
	}
	public int getQid() {
		return qid;
	}
	public void setQid(int qid) {
		this.qid = qid;
	}
	public String getAnswer() {
		return answer;
	}
	public void setAnswer(String answer) {
		this.answer = answer;
	}
	
	

}
