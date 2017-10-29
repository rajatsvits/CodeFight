int appleBoxes(int k) {

    int y=0,r=0;
    for(int i=1;i<=k;i+=2)
    {
       y+=i*i; 
    }
    for(int i=2;i<=k;i+=2)
    {
       r+=i*i; 
    }
   return r-y;
}
