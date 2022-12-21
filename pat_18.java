package Patterns;

public class Pat_18{
	public static void main(String[] args) {
		int n = 7;
		int row = 1;
		int total_sp = 3;
				int total_st=1;
		while (row <= n) {
			int cnt_sp = 0;
			while (cnt_sp < total_sp) {
				System.out.print("  ");
				cnt_sp++;
			}
//			*
			int cnt_st = 0;
			while (cnt_st < total_st) {
				System.out.print("* ");
				cnt_st++;
			}
      if(row< (n+1)/2){
			total_sp--;
        total_st++;
         total_st++;
      }
			else{
			total_sp++;
			total_st--;
			total_st--;;
			}
			
			System.out.println();
			row++;
		}

	}
}