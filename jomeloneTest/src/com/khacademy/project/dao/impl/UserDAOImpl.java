package com.khacademy.project.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.khacademy.project.common.dbutil.JDBCTemplate;
import com.khacademy.project.dao.UserDAO;
import com.khacademy.project.domain.UserVO;



public class UserDAOImpl implements UserDAO{

	//회원가입
	@Override
	public int userInsert(UserVO userVo) {
		
		Connection conn= JDBCTemplate.getConnection();
		PreparedStatement pstmt = null;
		int result = 0;
		
		try {
			String query = "INSERT INTO SEMI_USER VALUES(?,?,?,?,?,?,?,?)";
			pstmt = conn.prepareStatement(query);
			
			pstmt.setString(1, userVo.getUserId());
			pstmt.setString(2, userVo.getUserPw());
			pstmt.setString(3, userVo.getUserEmail());
			pstmt.setString(4, userVo.getUserName());
			pstmt.setString(5, userVo.getUserGender());
			pstmt.setInt(6, userVo.getUserPhone());
			pstmt.setString(7, userVo.getUserBirth());
			pstmt.setString(8, userVo.getUserPolicy());
			
			result = pstmt.executeUpdate();
			
			if(result>0) {
				JDBCTemplate.commit(conn);
			}else {
				JDBCTemplate.rollback(conn);
			}
			

		}catch(SQLException e) {
			e.printStackTrace();
		}finally {
			JDBCTemplate.close(conn);
			JDBCTemplate.close(pstmt);
		}
		return result;
	}

	@Override
	public int selectUserCntByIdPw(UserVO user) {
		Connection conn= JDBCTemplate.getConnection();
		PreparedStatement pstmt = null;
		ResultSet rset = null;
		
		int result = 0;
		
		try {
			String query="SELECT COUNT(*) FROM SEMI_USER WHERE USER_ID=? AND USER_PW=?";
			pstmt = conn.prepareStatement(query);
			pstmt.setString(1, user.getUserId());
			pstmt.setString(2, user.getUserPw());
			rset = pstmt.executeQuery();
			
			while(rset.next()) {
				result = rset.getInt(1);
			}
			
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			JDBCTemplate.close(conn);
			JDBCTemplate.close(pstmt);
			JDBCTemplate.close(rset);
		}
		return result;
	}

	@Override
	public UserVO selectUserByUserId(UserVO user) {
		Connection conn= JDBCTemplate.getConnection();
		PreparedStatement pstmt = null;
		ResultSet rset = null;
		
		try {
			String query = "SELECT * FROM SEMI_USER WHERE USER_ID=?";
			pstmt = conn.prepareStatement(query);
			pstmt.setString(1, user.getUserId());
			rset = pstmt.executeQuery();
			
			while(rset.next()) {
				user.setUserId(rset.getString(1));
				user.setUserPw(rset.getString(2));
				user.setUserEmail(rset.getString(3));
				user.setUserName(rset.getString(4));
				user.setUserGender(rset.getString(5));
				user.setUserPhone(rset.getInt(6));
				user.setUserBirth(rset.getString(7));
				user.setUserPolicy(rset.getString(8));
			}
			
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			JDBCTemplate.close(conn);
			JDBCTemplate.close(pstmt);
			JDBCTemplate.close(rset);
		}
		return user;
	}
	

	
}
