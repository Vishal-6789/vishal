
package Patterns;

public class Pat_30 {
	public static void main(String[] args) {
		int n = 5;
//		Step 1
		int row = 1;
		int total_st = n;
		
		while (row <= n) {
//			Step 2 : *
			int cnt_st = 0;
		  int p=5;
			while (cnt_st < total_st) {
				System.out.print(p+" ");
				cnt_st++;
				p--;
			}

			row++;
			System.out.println();
		}
	}
}