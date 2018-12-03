
public class PyramidPattern3 {
	/*
	1
	123
	12345
	1234567
	***col 1 3 4 7
	***rows 4
	i=1 j=1
	i=2 j=1,2,3
	i=3 j=1,2,3,4,5
	i=4 j=1,2,3,4,5,6,7
	*/
	public static void main(String[] args) {	
		int odd=1;
		for(int i=1;i<=4;i++) {
			for(int j=1;j<=odd;j++) {
				System.out.print(j);
			}
				System.out.println("");
				odd=odd+2;
		}
	}		
	}
