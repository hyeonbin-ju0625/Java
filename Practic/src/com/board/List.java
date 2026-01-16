package com.board;

import com.data.Data;
import com.data.Post;
import com.ut.PP;

public class List {
	
	static void run() {
		if (Data.posts.size() == 0) {
			PP.pl("현재 글이 존재하지 않습니다.");
			return;
		}
		
		for(Post t : Data.posts) {
			t.infoList();	
		}
	}
}
