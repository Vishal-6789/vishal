package Patterns;

public class Pat_05 {
	public static void main(String[] args) {
		int n = 5;
		int row = 1;
		int total_st =5;
		int total_sp =0;
		
		while (row <= n) {
//			print space
			int cnt_sp = 0;
			while(cnt_sp< total_sp) {
				System.out.print("  ");
				cnt_sp++;
			}
//			print star
			int cnt_st = 0;
			while(cnt_st< total_st) {
				System.out.print("* ");
				cnt_st++;
			}			
			row++;
			total_sp++;
			total_st--;
			System.out.println();
		}
	}
}