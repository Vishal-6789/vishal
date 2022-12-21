package Patterns;

public class Pat_14 {
	public static void main(String[] args) {
		int n = 5;
		int row = 1;
		int total_st =1;
		int total_sp =n-1;
		
		while (row <= 2*n-1) {
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
			
			if(row<n){
			total_sp--;
			total_st++;}
			else{total_sp++;
			total_st--;}
			System.out.println();
			row++;
		}
	}
}