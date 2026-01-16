package com.data;

import java.time.LocalDate;

import com.ut.*;

public class Post {
	static public int num = 0;
	public int instance = 0;
	public String title;
	public String content;
	public String writer;
	public int hit;
	public String date;
	
	public Post (String title, String content, String writer, int hit) {
		num = num + 1;
		instance = num;
		this.title = title;
		this.content = content;
		this.writer = writer;
		this.hit = hit;
		LocalDate now = LocalDate.now();
		date = now.toString();
	}
	
	public void infoRead() {
		PP.p("글제목:"+title);
		PP.p(" 작성자:"+writer);
		PP.pl(" 글내용:"+content);
		hit++;
	}
	
	public void infoList() {
		PP.pl(instance+"번글");
		PP.p("글제목:"+title);
		PP.p(" 작성자:"+writer);
		PP.p(" 조회수:"+hit);
		PP.pl(" 작성일:"+date);
	}
}
