import java.util.*;
public class Momo {
	public static void main(String[] args) {
		int i;
		Scanner x=new Scanner(System.in);
		String s=x.next();
		char q[]=s.toCharArray();
	    int l=q.length;
	    int k=x.nextInt();
	    int z=l-k;
		Arrays.sort(q);
		for(i=0;i<z;i++)
		{
		System.out.println(q[i]);
		}
	}
}
