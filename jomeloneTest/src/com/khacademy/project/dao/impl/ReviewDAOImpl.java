package com.khacademy.project.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import com.khacademy.project.common.dbutil.JDBCTemplate;
import com.khacademy.project.dao.ReviewDAO;

public class ReviewDAOImpl implements ReviewDAO{

	Connection conn = JDBCTemplate.getConnection();
	PreparedStatement pstmt;
	
}
