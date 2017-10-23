
int lineUp(std::string c) {
using namespace std;
    int x=0,y=0,c1=0,l1=0,r1=0;
    for(char i:c)
    {
        if(i=='L'&&l1==0)
        {
            x--;
            y++;
            l1++;
        }
        else if(i=='L'&&l1==1)
        {
            x++;
            y--;
            l1--;
        }
        else if(i=='R'&&r1==0)
        {
            x++;
            y--;
            r1++;
        }
        else if(i=='R'&&r1==1)
        {
            x--;
            y++;
            r1--;
        }
        else if(i=='A')
        {
         /*   if(x>0)
                x-=2;
            else if(x<0)
                 x+=2;
            
            if(y>0)
                y-=2;
            else if(y<0)
                y+=2;*/
        }
        if(x==y)
            c1++;
        
    }
    
    return c1;
}
