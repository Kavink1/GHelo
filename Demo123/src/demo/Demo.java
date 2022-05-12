package demo;

public class Demo {
	static int count=0;
	public static void main(String[] args) {
		int no=2;
		
		String[] s=new String[no];
		for(int i=0;i<s.length;i++)
		{
			s[0]="ab_ae_";
			s[1]="abc";
			System.out.println(count(s[i]));
		}
	}
	public static String count(String a)
	{
		a.replaceAll("_","2");
		return a;
	}
}
