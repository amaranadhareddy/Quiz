package com.sapient.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.Map;

import com.sapient.util.ExamUtil;
import com.sapient.vo.Question;

public class ExamDaoImpl implements IDao {
	
	private static IDao dao=new ExamDaoImpl();
	private ExamDaoImpl(){
		
	}
	
	public static IDao getDaoInstance(){
		return dao;
	}
	
	
	static
	{
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
		} catch (ClassNotFoundException e) {
			
			e.printStackTrace();
		}
	}

	@Override
	public Map<Integer, Question> viewQuestion() {
		 Map<Integer, Question> map=new HashMap<>();
		Question ques=null;
		String url="jdbc:oracle:thin:@localhost:1521:xe";
		
		
		try (Connection conn = DriverManager.getConnection(url,ExamUtil.UNAME,ExamUtil.PWD)) {
			String sql = "select * from questions";
			PreparedStatement st = conn.prepareStatement(sql);
			ResultSet rs = st.executeQuery();
			while(rs.next()){
				
				ques = new Question(rs.getInt("qid"),rs.getString("qdesc"),rs.getString("optiona"),rs.getString("optionb"),rs.getString("optionc"),rs.getString("answer"));
			map.put(rs.getInt("qid"),ques );
			}
			
		} catch (SQLException e) {
			System.out.println(e.getMessage());
		}
		return map; 
	}

	
	
	
	
}
