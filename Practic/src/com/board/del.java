package com.board;

import com.data.Data;
import com.data.Post;
import com.ut.PP;

public class del {
	
	static void run() {
		
		String cmd = PP.s("삭제할 글번호");
		int idx = -1;
		if (Data.posts.size() == 0) {
			PP.pl("게시물이 없습니다.");
			return;
		}
		for(int i = 0; i < Data.posts.size(); i++) {
			if (cmd.equals(Data.posts.get(i).instance+"")) {
				idx = i;
				break;
			}
		}
		if(idx == -1) {
			PP.pl("입력하신 글번호는 존재하지 않습니다.");
		} else {
		Data.posts.remove(idx);
		PP.pl("삭제가 완료 되었습니다.");
		}
	}
}
