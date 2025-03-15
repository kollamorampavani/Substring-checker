package strings;
import java.util.Scanner;
public class Substring1 {
	    public static String substring(String s1,String s2) {
	    	int size=s2.length();
	    	for(int i=0;i<=s1.length()-size;i++) {
				String t="";
				for(int j=i;j<i+size;j++) {
					t=t+s1.charAt(j);
				}
				if(t.equals(s2)) {
					return "yes";
				}
	    	}
	    	return "no";
	    	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
	     System.out.println("enter string and substring");
	     String s1=scan.nextLine();
	     String s2=scan.nextLine();
	     String res= substring(s1,s2);
	     System.out.println(res);
	}

}
