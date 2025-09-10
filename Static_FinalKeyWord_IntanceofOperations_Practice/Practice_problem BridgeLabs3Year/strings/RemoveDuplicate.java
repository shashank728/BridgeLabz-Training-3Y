package strings;

import java.util.Scanner;

public class RemoveDuplicate {
    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String s = sc.nextLine();
		StringBuffer newStr = new StringBuffer("");
		
		boolean[] seen = new boolean[256];
		
		for(int i=0;i<s.length();i++)
		{
			char ch = s.charAt(i);
			
			if(!seen[ch])
			{
				newStr.append(ch);
				seen[ch] = true;
			}
			
			
		}
		
		System.out.println(newStr);

        sc.close();
	}
}
