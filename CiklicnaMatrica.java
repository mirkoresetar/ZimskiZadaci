package edunova;

import javax.swing.JOptionPane;

public class CiklicnaMatrica {

	public static void main(String[] args) {
		// Kreirati program koji ispisuje cikličnu matricu - ulaz su dva cijela broja
		
		int a = Integer.parseInt(JOptionPane.showInputDialog("Unesite prvi broj"));
		int b = Integer.parseInt(JOptionPane.showInputDialog("Unesite drugi broj"));

		
		int[][] matrica = new int [a][b];
		
		int broj = 1;
	    
	    int minj = 0;
	     
	    int maxj = b-1;
	     
	    int mini = 0;
	     
	    int maxi = a-1;
	     
	    while (broj <= a*b)
	    {
	        for (int i = maxi; i >= mini; i--)
	        {
	            matrica[maxi][i] = broj;
	                 
	            broj++;
	        }
	         
	        for (int i = maxi-1; i >= mini; i--) 
	        { 
	            matrica[i][minj] = broj; 
	             
	            broj++; 
	        } 
	         
	        for (int i = minj+1; i <= maxj; i++)
	        {
	            matrica[mini][i] = broj;
	                         
	            broj++;
	        }
	         
	        for (int i = mini+1; i <= maxi-1; i++) 
	        {
	            matrica[i][maxj] = broj;
	             
	            broj++;
	        }
	         
	        minj++;
	    
	        mini++;
	         
	        maxj--;
	         
	        maxi--;
	    }
	     
	    for (int i = 0; i < matrica.length; i++)
	    {
	        for (int j = 0; j < matrica.length; j++)
	        {
	            System.out.print(matrica[i][j]+ "\t");
	        }
	         
	        System.out.println();
	    }
	}
}
