import java.util.Arrays;

public class SortArrary {
	
	public static String Sort(String n)
	{
		char temp[]=n.toCharArray();
	Arrays.sort(temp);
	return new String(temp);
	}

	public static void main(String[] args) {
		String n="venkatesh";
		String r=Sort(n);
		System.out.println(r);

	}

}
