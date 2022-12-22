package Patterns;

public class Pat_26{
	public static void main(String[] args) {
		int n = 5;
		int row = 1;
		int total_st =1;
		int total_sp =n-1;
		
		while (row <= n) {
			int cnt_sp = 0;
			while(cnt_sp< total_sp) {
				System.out.print("  ");
				cnt_sp++;
			}
			int cnt_st = 0;
			 int p=1;
			while(cnt_st< total_st) {
			;
				System.out.print(p +" ");
				cnt_st++;
				p++;
			}			
			row++;
			total_sp--;
			total_st++;
			total_st++;
			System.out.println();
		}
	}
}