package com.board;

import com.data.Data;
import com.data.Post;
import com.ut.PP;

public class Read {
	static void run() {
		
		if (Data.posts.size() == 0) {
			PP.pl("현재 글이 존재하지 않습니다.");
			return;
		}
		
		String cmd = PP.s("몇번 글을 읽으시겠습니까?");
		
		for(Post t : Data.posts) {
			if(cmd.equals(t.instance+"")) {
				t.infoRead();
				break;
			}
		}
	}
}
