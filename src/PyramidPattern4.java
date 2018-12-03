public class PyramidPattern4 {
	/*
	 1234 
	1****
	2*  *
	3*  *
	4****
	when i=1,j=1,i=4,j=4 then print * else don't print anything*/
	public static void main(String[] args) {
		int i =1;
		int j =1;
		for(i=1;i<=4;i++) {
			for(j=1;j<=4;j++) {
				if (j==1||j==4||i==1||i==4) {
					System.out.print("*");
				}else {
					System.out.print(" ");
				}
			}
				System.out.println("");
		}
	}		
	}