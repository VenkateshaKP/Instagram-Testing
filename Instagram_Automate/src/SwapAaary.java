
public class SwapAaary {
	public static String SwapArray(String n)
	{
		if(n==null||n.isEmpty())
			return n;
		char ch[]=n.toCharArray();
		for(int i=0;i<ch.length-1;i+=3)
		{
		char temp=ch[i];
			ch[i]=ch[i+1];
			ch[i+1]=temp;
		}
		return new String(ch);
		
		
	}

	public static void main(String[] args) {
	String i="venakata";
	System.out.println(i);
	System.out.println(SwapArray(i));
		

	}

}
