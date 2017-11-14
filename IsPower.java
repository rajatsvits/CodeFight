boolean isPower(int n) {

   
        int x=(int )Math.sqrt(n),i=0;
        for(i=2;i<=x;i++)
        {
            int y=n;
            while(y%i==0)
            {
                y/=i;
            }
            if(y==1)
                return true;
            System.out.println(y+" "+i);
        }
    return false;
}


bool isPower(int n) {
    if(n == 1)
        return 1;
    for(int i=2;i<n;++i)
    {
        int tmp = i;
        while(tmp < n)
        {
            tmp *= i;
        }
        if(tmp == n)
            return 1;
    }
    return 0;
}
