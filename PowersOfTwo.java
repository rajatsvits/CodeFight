int[] powersOfTwo(int n) {

    int a[]  = new int [10000];
    int size=0;
    while(n>0)
    {
        int x = 0,z=n;
        while(z>1)
        {
            z/=2;
            x++;
        }
        System.out.println(x);
        int y  = (int)Math.pow(2,x);
        a[size]=y;
        n-=y;
        size++;
    }
    int b[] = new int[size];
    for(int i=0;i<size;i++)
    {
        b[size-i-1]=a[i];
    }
    return b;
    
}
