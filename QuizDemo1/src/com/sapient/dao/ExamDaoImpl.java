package com.sapient.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.Map;
import static com.sapient.util.ExamUtil.*;

import com.sapient.util.ExamUtil;
import com.sapient.vo.Question;

public class ExamDaoImpl implements Idao{
	
	private static Idao dao =new ExamDaoImpl();
	
	private ExamDaoImpl(){
		
	}
	
	public static Idao getDaoInstance(){
		return dao;
	}
	
	static{
		try {
			Class.forName(DRIVER);
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}

	@Override
	public Map<Integer, Question> viewQuestions() {
		Map<Integer,Question> map = new HashMap<>();
		Question ques = null;
		String url = URL;
		try(Connection conn = DriverManager.getConnection(url,UNAME,PWD)){
			String sql = "select * from questions";
			PreparedStatement st = conn.prepareStatement(sql);
			ResultSet rs = st.executeQuery();
			
			while(rs.next()){
				ques =  new Question(rs.getInt("qid"), rs.getString("qdesc"), rs.getString("optionA"), rs.getString("optionB"), rs.getString("optionC"),rs.getString("answer"));
				map.put(ques.getQid(), ques);

			}
			
			
		}catch(SQLException e){
			System.out.println(e.getMessage());
		}
		return map;
	}

}
