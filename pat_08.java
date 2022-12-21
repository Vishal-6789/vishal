package Patterns;

public class Pat_08{
	public static void main(String[] args) {
		int n = 5;
//		Step 1
		int row = 1;
		while (row <= n) {
//			Step 2 : *
			int cnt_st = 0;
			while (cnt_st < n) {
			  if(cnt_st== row-1 || cnt_st== n-row )
				{System.out.print("* ");}
				else{
				  System.out.print("  ");
				}
				cnt_st++;
				
			}

			row++;
			System.out.println();
		}
	}
}