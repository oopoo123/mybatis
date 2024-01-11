package com.jbedu.mybatis.dao;

import java.util.ArrayList;

import com.jbedu.mybatis.dto.MybatisDto;

public interface MybatisDao { // 인터페이스는 추상메서드만 쓰는데 추상메서드는 이름만 있는 것
	
	public ArrayList<MybatisDto> listDao(); //게시판 모든 글 목록 가져오기

}
