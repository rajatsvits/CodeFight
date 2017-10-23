int divisorsSubset(int[] s, int n) {

     if(s.length==1)
          return n;
     int lcm=0;
     for(int i=0;i<s.length-1;i++)
     {
          lcm = lcm(s[i],s[i+1]);
     }
     System.out.println(lcm);
     int c=0,y=lcm;
     while(lcm<=n)
     {
          lcm+=y;
          c++;
          
     }
     return c;
     
     
}

static int lcm(int a,int b)
     {
          int x = Math.min(a,b);
          while(x%a!=0||x%b!=0)
          {
               x++;
          }
          return x;
     }
