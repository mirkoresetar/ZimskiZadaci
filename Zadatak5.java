import javax.swing.JOptionPane;

public class Zadatak5 {
	
	public static void main(String[] args) {
		
		int a = Integer.parseInt(JOptionPane.showInputDialog("Unesite dimenziju matrice broj kolona"));
		int b = Integer.parseInt(JOptionPane.showInputDialog("Unesite dimenziju matrice broj stupaca"));
		
		
		int[][] matrica = new int[a][b];
        
        int vrijednost = 1;
         
        int minKol = 0;
         
        int maxKol = a-1;
         
        int minStu = 0;
         
        int maxStu = b-1;
         
        while (vrijednost <= a*b)
        {
        	for (int i = minKol; i <= maxKol; i++)
            {
                matrica[minStu][i] = vrijednost;
                     
                vrijednost++;
            }
             
            for (int i = minStu+1; i <= maxStu; i++) 
            { 
                matrica[i][maxKol] = vrijednost; 
                 
                vrijednost++; 
            } 
             
            for (int i = maxKol-1; i >= minKol; i--)
            {
                matrica[maxStu][i] = vrijednost;
                             
                vrijednost++;
            }
             
            for (int i = maxStu-1; i >= minStu+1; i--) 
            {
                matrica[i][minKol] = vrijednost;
                 
                vrijednost++;
            } 
             
            minKol++;
             
            minStu++;
             
            maxKol--;
             
            maxStu--;
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
	
	
	

