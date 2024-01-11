package com.jbedu.mybatis.controller;

import java.util.ArrayList;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.jbedu.mybatis.dao.MybatisDao;
import com.jbedu.mybatis.dto.MybatisDto;


@Controller
public class MybatisController {
	
	@Autowired //의존 자동 주입
	private SqlSession sqlSession;
	
	@RequestMapping(value = "/list")
	public String list(Model model) {
		
		//MybatisDao dao = new MybatisDao();
		MybatisDao dao = sqlSession.getMapper(MybatisDao.class); // dao 객체 분리 생성
		
		ArrayList<MybatisDto> dtos = dao.listDao();
		
		model.addAttribute("fboardDtos", dtos);		
		
		return "list";
	}

}
