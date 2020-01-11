import java.util.Arrays;

import javax.swing.JOptionPane;

public class Zadatak4 {

	public static void main(String[] args) {
		
		
	
		
		int[][] matrica1 = new int[4][4];
		int[][] matrica2 = new int[4][4];
		int[][] rezultat = new int[4][4];
		
		
		for(int i=0;i<4;i++) {
			for(int j=0;j<4;j++) {
				matrica1[i][j] = Integer.parseInt(
						JOptionPane.showInputDialog(
								"Unesi broj na mjesto matrica1: " + (i+1) + "," + (j+1)));
				}
			
		}
		
		
		
		for (int i = 0; i < 4 ; i++) {
			for(int j=0;j < 4 ; j++) {
			System.out.print(matrica1[i][j] + " ");
		}
	
		System.out.println();
		}
		System.out.println();
		
			for(int k=0;k<4;k++) {
				for(int l=0;l<4;l++) {
					matrica2[k][l] = Integer.parseInt(
							JOptionPane.showInputDialog(
									"Unesi broj na mjesto matrica2: " + (k+1) + "," + (l+1)));
					}
			 }
		
			
			
			for (int k = 0; k < 4 ; k++) {
				for(int l=0;l < 4 ; l++) {
				System.out.print(matrica2[k][l] + " ");
			}
		
		System.out.println();
			}
			
			System.out.println();
			
			for(int i=0; i < 4;i++){  
				  for(int j=0; j < 4;j++){  
				    rezultat[i][j]=matrica1[i][j]+matrica2[i][j];  
				    System.out.print(rezultat[i][j]+" ");  
				  }  
				  System.out.println();	
			}
	}
}
