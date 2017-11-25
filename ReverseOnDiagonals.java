int[][] reverseOnDiagonals(int[][] matrix) {

    

	    int s = matrix.length;
	    int s_m1 = s-1 ;
	    for(int i = 0; i < s/2; ++i) {
            
	        int temp= matrix[i][i];
	         matrix[i][i]= matrix[s_m1-i][s_m1 - i];
	         matrix[s_m1-i][s_m1 - i]=temp;
	        
	    }
    for(int i = 0; i < s/2; ++i) {
            
	        int temp= matrix[i][s_m1-i];
	         matrix[i][s_m1-i]= matrix[s_m1-i][i];
	         matrix[s_m1-i][i]=temp;
	        
	    }
	    return matrix;
}
