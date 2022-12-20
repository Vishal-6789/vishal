package Pattern_1;

public class Pat_1 {
	public static void main(String[] args) {
		int n = 10;
		int row = 1;
		int total_str= 1;
		while(row<=n) {
			int cnt_st =0;
			while(cnt_st<total_str) {
				System.out.print("* ");
				cnt_st++;
			}
			
			

			total_str++;
			row++;
			System.out.println();
		}

		total_str++;

	}
}