package com.sapient.dao;

import java.util.Map;

import com.sapient.vo.Question;

public interface IDao {
	
	Map<Integer, Question> viewQuestion();

}
