/*
5
54
543
5432
54321
 */
public class PyramidBackwards2{
	public static void main(String[] args) {
		for(int i=5;i>=1;i--) {
			System.out.println("");
			for(int j=5;j>=i;j--) {
			System.out.print(j);
		}
		}
	}
}
