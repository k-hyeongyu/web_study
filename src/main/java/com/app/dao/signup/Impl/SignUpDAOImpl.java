package com.app.dao.signup.Impl;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;

import com.app.dao.signup.SignUpDAO;

public class SignUpDAOImpl implements SignUpDAO {

	@Autowired
	SqlSessionTemplate sqlSessionTemplate;

	
}
