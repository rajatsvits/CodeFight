int magicalWell(int a, int b, int n) {

    int c=0;
    while(n>0)
    {
        c+=a*b;
        a++;
        b++;
        n--;
    }
    return c;
}
