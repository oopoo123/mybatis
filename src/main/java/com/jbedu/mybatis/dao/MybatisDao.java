package com.jbedu.mybatis.dao;

import java.util.ArrayList;

import com.jbedu.mybatis.dto.MybatisDto;

public interface MybatisDao { // 인터페이스는 추상메서드만 쓰는데 추상메서드는 이름만 있는 것
	
	public ArrayList<MybatisDto> listDao(); //게시판 모든 글 목록 가져오기
	public void writeDao(String fbname, String fbtitle, String fbcontent); //게시판 글쓰기 메서드
	public MybatisDto contentDao(String fbnum); //게시판 글 내용 가져오기
	public void modifyDao(String fbtitle, String fbname, String fbcontent, String fbnum); //게시판 글 수정하기
	public ArrayList<MybatisDto> searchDao(String searchKey); // 제목 또는 내용에 특정단어 포함 결과 검색
	public void deleteDao(String fbnum); //게시판 글 삭제

}
