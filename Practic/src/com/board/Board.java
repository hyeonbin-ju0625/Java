package com.board;

import com.data.Data;
import com.ut.PP;

public class Board {
	public static void run() {
		PP.Line();
		Data.loadData();
		Menu.run();
	}

}
