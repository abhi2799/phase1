package array;

public class multi {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int twoD [] [] = new int [5] [6];
		int i,j,k=0;
		for (i=0;i<5; i++)
			for (j=0; j<6; j++) {
				twoD[i][j]=k;
				k++;
			}
		for (i=0;i<5;i++) {
			for (j=0;j<6;j++)
				System.out.print(twoD [i] [j] + " ");
			    System.out.println();
				
			}

	}

}
