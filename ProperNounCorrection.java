String properNounCorrection(String noun) {
    
    String s="";
    String b="";
    b+= noun.charAt(0);
    if(noun.charAt(0)>='a'&&noun.charAt(0)<='z')
        s+=b.toUpperCase();
    else
        s+=noun.charAt(0);
    String a = noun.substring(1,noun.length());
    a=a.toLowerCase();
    s+=a;
    
		  return s;
		
}
