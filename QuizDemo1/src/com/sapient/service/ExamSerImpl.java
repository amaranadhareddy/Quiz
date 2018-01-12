package com.sapient.service;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.Set;

import com.sapient.dao.ExamDaoImpl;
import com.sapient.dao.IDao;
import com.sapient.util.ExamUtil;
import com.sapient.vo.Answer;
import com.sapient.vo.Question;

public class ExamSerImpl implements IExamSer {
	
	private static IExamSer ser=new ExamSerImpl();
	private static Map<Integer, Question> qmap;
	
	static{
		IDao dao=ExamDaoImpl.getDaoInstance();
		qmap=dao.viewQuestion();
	}
	
	
	private ExamSerImpl(){
		
	}
	
	public static IExamSer getInstance()
	{
		return ser;
	}
	
	
	public List<Question> generateUniqueNos() {
		List<Question> lst=new ArrayList<Question>();
		Set<Integer> qids=ExamUtil.generateUniqueNos(5);
		Question ques;
		for(int qno:qids){
			ques = qmap.get(qno);
			lst.add(ques);
			
		}
	return lst;
	}

	@Override
	public int evaluate(List<Answer> anslist) {
		int score=0;
		Question ques=null;
		for(Answer answer:anslist){
			ques=qmap.get(answer.getQid());
			if(ques.getAnswer().equalsIgnoreCase(answer.getAnswer()));
			++score;
		}
		return score;
	}

	@Override
	public List<Question> generateQuestions() {
		// TODO Auto-generated method stub
		return null;
	}

	
}
	
	

