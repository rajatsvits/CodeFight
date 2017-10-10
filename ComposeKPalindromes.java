boolean composeKPalindromes(String s, int k) {
    if(k > s.length()) return false;
    
    int[] v = new int[26];
    
    for(int i=0; i<s.length(); i++){
        v[ s.charAt(i)-'a' ]++;
    }
    
    int odds = 0;
    for(int i=0; i<v.length; i++){
        if( v[i] % 2 == 1 ) odds++;
    }
    return odds <= k;
}
