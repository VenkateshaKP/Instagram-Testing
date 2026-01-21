
public class code1 {

	public static void main(String[] args) {
		String n="venkat kp yadav";
		int i=7;
		char ch='K';
		System.out.println(n);
		StringBuilder sb=new StringBuilder(n);
		
		sb.setCharAt(i, ch);
		System.out.println(sb);
	StringBuffer sf=new StringBuffer(n);
	sf.setCharAt(i, ch);
	System.out.println(sb);
	
	}

}
