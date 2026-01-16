package com.board;

import com.data.*;
import com.ut.PP;

public class Menu {
	static void run () {
		loop:
			while(true) {
				PP.MainMenu();
				String cmd = PP.s("번호를 선택하세요");
				switch(cmd) {
				case "1":
					List.run();
					break;
				case "2":
					Read.run();
					break;
				case "3":
					write.run();
					break;
				case "4":
					del.run();
					break;
				case "5":
					Update.run();
					break;
				case "e":
					PP.p("프로그램을 종료합니다.");
					break loop;
				default:
					PP.pl("!!올바른 번호를 입력해주세요!!");
				}
			}
	}
}
