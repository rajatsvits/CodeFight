int chessKnight(String cell) {

     int x = cell.charAt(0) % 97,//Getting Value of column {97 is ASCII value of a}
	    y = +cell.charAt(1) - '0' - 1;// Getting value of row {keeping range 0-7 instead of 1-8 therefore -1}
	    System.out.println(x+" "+y);
	    int c = 0;//Initialising counter for moves possible
	    //max displacement possible is of 2
	    for (int dx = -2; dx <= 2; dx++)//dx = displacement in x
	        for (int dy = -2; dy <= 2; dy++) {//dy = displacement in y
	            if (Math.abs(dx * dy) == 2)//Product of displacement is always 2 or -2
	                if (isValid(x + dx, y + dy))//Checking whether the displacement is range of board
	                    c++;
	        }
	    return c;
	}
	private static boolean isValid(int x, int y) {
	    return x >= 0 && x <= 7 && y >= 0 && y <= 7;
	}

