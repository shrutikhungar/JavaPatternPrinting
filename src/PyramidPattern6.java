/*
 
1
22
333
4444
55555

i=1 j=1, i=2 j=2

 */
public class PyramidPattern6 {
	public static void main(String[] args) {
		for(int i=1;i<=5;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print(i );
		}
			System.out.println();
		}
	}
}