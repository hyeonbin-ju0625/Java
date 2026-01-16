package com.board;

import com.data.Data;
import com.data.Post;
import com.ut.PP;

public class write {

	static void run() {
		
		String title = PP.s("글제목");
		
		while(true) {
			if(title.length() > 0) {
				break;
			} else {
				PP.pl("글제목을 입력해 주세요!");
			}
		}
		
		String content = PP.s("글내용");
		
		while(true) {
			
			if(content.length() > 0) {
				break;
			} else {
				PP.pl("글내용을 입력해 주세요!");
			}
		}
		
		String writer = PP.s("글쓴이");
		
		while(true) {
				
				if(writer.length() > 0) {
					break;
				} else {
					PP.pl("글쓴이를 입력해 주세요!");
				}
		}	
		
		Post t = new Post(title, content, writer, 0);
		Data.posts.add(t);
		PP.pl("글 작성 완료!");
	}
}

