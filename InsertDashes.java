package codeFight;

public class InsertDashes {

	public static void main(String[] args) {
		String result = insertDashes("aba caba");
		System.out.println(result);
	}
	public static String insertDashes(String inputString) {
		 /* String[] words = inputString.split("");
		  for (int i = 0; i < words.length; i++) {
		    words[i] = words[i].replace("", "-");
		    System.out.println(words[i]);
		    if (words[i].length() > 2) {
		      words[i] = words[i].substring(1, words[i].length());
		      System.out.println(words[i]+"xx");
		    }
		  }
		  String ans = "";
		  for (int i = 0; i < words.length - 1; i++) {
		    ans += words[i] + "";
		    System.out.println(words[i]);
		  }
		  return ans + words[words.length - 1];
		}*/
		return inputString.replaceAll("(\\w)(?=\\w)", "$1-");
}}
