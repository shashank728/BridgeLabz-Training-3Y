package strings;

import java.util.Scanner;

public class ReverseEachWord {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
		
		String str = sc.nextLine();
		
		StringBuilder ans = new StringBuilder("");
		
		int s = 0;
		int e = 0;
		
		for(int i=0;i<str.length();i++)
		{
			char c = str.charAt(i);
			
			if(c == ' ') {
				e = i;
				
				for (int j = e -1 ; j>=s;j--)
				{
					ans.append(str.charAt(j));
				}
				ans.append(" ");
				s = i +1;
			}
		}
		
		for (int j = str.length() - 1; j >= s; j--) {
            ans.append(str.charAt(j));
        }
		
		System.out.println(ans);
		
		sc.close();
    }
}
