package com.sapient.test;

import java.util.Map;
import java.util.Set;

import com.sapient.dao.ExamDaoImpl;
import com.sapient.dao.IDao;
import com.sapient.vo.Question;

public class TestDao {

	public static void main(String[] args) {
		IDao dao=ExamDaoImpl.getDaoInstance();
		Map<Integer, Question> map=dao.viewQuestion();
		System.out.println(map.size());
		
		Set<Integer> set=map.keySet();
		for(int qid:set){
			Question ques=map.get(qid);
			System.out.println(ques.getQdesc());
			System.out.println(ques.getOpta());
			System.out.println(ques.getOptb());
			System.out.println(ques.getOptc());
			System.out.println(ques.getAnswer());
			
		}
		

	}

}
