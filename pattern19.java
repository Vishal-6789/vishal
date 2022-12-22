package Patterns;

public class Pat_19{
	public static void main(String[] args) {
		int n = 7;
		int row = 1;
		int total_st1=(n+1)/2;
		int total_sp = -1;
		int total_st2 = (n-1)/2;
		while (row <= n) {
		  int cnt_st1=0;
		  while(cnt_st1<total_st1){
		    System.out.print("* ");
		    cnt_st1++;
		  }
			int cnt_sp = 0;
			while (cnt_sp < total_sp) {
				System.out.print("  ");
				cnt_sp++;
			}
//			*
			int cnt_st2 = 0;
			while (cnt_st2 < total_st2) {
				System.out.print("* ");
				cnt_st2++;
			}
			if (row ==1){
			 total_st1--;
			  total_sp++;
			  total_sp++;
			  total_st2=total_st2;
			}
			else if(row==n-1){
			  total_st1++;
			  total_sp--;
			  total_sp--;
			  total_st2=total_st2;
			}
			
      else if(row < (n+1)/2){
			total_st1--;
			total_sp = total_sp + 2;
        
            total_st2--;
      }
			else{
			  total_st1++;
			total_sp--;
			total_sp--;
			
			total_st2++;
			}
			row++;
			System.out.println();
		}
}
	
}