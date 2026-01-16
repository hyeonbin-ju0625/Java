package com.board;

import com.data.*;
import com.ut.PP;

public class Update {

	static void run() {
		String cmd = PP.s("몇번글의 내용을 수정할까요?");
		
		for(Post t : Data.posts) {
			if(cmd.equals(t.instance+"")) {
				aa:
				while(true) {
					String choice = PP.s("어떤 것을 수정할 건가요? 1.글제목/2.글내용/3.글쓴이/4.나가기");
					switch (choice) {
					case "1":
						String tt = PP.s("변경할 글제목을 입력해주세요");
						if(tt.length() == 0) {
							PP.pl("변경할 글제목을 입력해주세요");
						} else {
							t.title = tt;
							PP.pl("글제목이 변경됐습니다!");
						}
						break aa;
					case "2":
						String tc = PP.s("변경할 글내용을 입력해주세요");
						if(tc.length() == 0) {
							PP.pl("변경할 글내용을 입력해주세요");
						} else {
							t.content = tc;
							PP.pl("글내용이 변경됐습니다!");
						}
						break aa;
					case "3":
						String tw = PP.s("변경할 글쓴이을 입력해주세요");
						if(tw.length() == 0) {
							PP.pl("변경할 글쓴이을 입력해주세요");
						} else {
							t.writer = tw;
							PP.pl("글쓴이를 변경했습니다!");
						}
						break aa;
					case "4":
						break aa;
					
					default :
						PP.pl("!!올바른 번호를 입력해주세요!!");
						break;
					}
				}
			}
		}
	}
}
