package com.ut;

import java.util.Scanner;

public class PP {
	
	static final String DOT = "凸";
	static final int DOT_length = 27;
	
	static Scanner sc = new Scanner(System.in);
	
	public static String s(String a) {
		p(a+":");
		return sc.next();
		
	}
	public static void pl() {
		System.out.println();
	}
	public static void pl(String a) {
		System.out.println(a);
	}
	
	
	public static void p(String a) {
		System.out.print(a);
	}
	
	public void pw(String a) {
		System.out.println(a +":");
	}
	
	public static void Line(){
		for(int i = 0; i < DOT_length; i++) {
			p(DOT);
		}
		pl();
		p("                주현빈 게시판");
		pl();
		for(int i = 0; i < DOT_length; i++) {
			p(DOT);
		}
		pl();
	}
	public static void MainMenu() {
		for(int i = 0; i < 40; i++) {
			p("-");
		}
		pl();
		pl("1.글리스트/2.글읽기/3.글쓰기/4.글삭제/5.글수정/e.종료");
		for(int i = 0; i < 40; i++) {
			p("-");
		}
		pl();
	}
}
