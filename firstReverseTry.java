int[] firstReverseTry(int[] arr) {

    //int x[]  =new int[arr.length];
     /*for(int i=0;i<arr.length;i++)
     {
         x[arr.length-i-1]=arr[i];
     }*/
    if(arr.length>1)
    { int a=arr[0];
    arr[0]=arr[arr.length-1];
    arr[arr.length-1]=a;}
    return arr;
}
