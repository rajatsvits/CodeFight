int countInversionsNaive(int[] in) {

     int c=0;
   for(int i=0;i<in.length;i++)
			for(int j=0;j<in.length;j++) 
         {
            if(in[i]>in[j]&&i<j)
               c++;
         }
    return c;
}
