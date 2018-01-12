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
public void setQid(int qid) {
	this.qid = qid;
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
public void setQdesc(String qdesc) {
	this.qdesc = qdesc;
}
public void setOpta(String opta) {
	this.opta = opta;
}
public void setOptb(String optb) {
	this.optb = optb;
}
public void setOptc(String optc) {
	this.optc = optc;
}
public void setAnswer(String answer) {
	this.answer = answer;
}


}