// Metoda Jacobiego

public class Jacobi {

	private static double A[][];
	private static double M[][];
	private static double N[];
	private static double b[];
	private static double x1[];
	private static double x2[];

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		   int num, iter;
		   int i, j, k;

		   // Get n
		   System.out.println("Metoda Jacobiego");
		   System.out.println("Rozwiazywanie ukladu n-rownan z n-niewiadomymi Ax=b");
		   System.out.println("Podaj n");
		   num = Console.readInt("");
		   if (num < 1) {
		      System.out.println("Nieprawidlowa warosc parametru n");
		      return;
		    }

		    A = new double[num][num];
		    M = new double[num][num];
		    N = new double[num];
		    b = new double[num];
		    x1 = new double[num];
		    x2 = new double[num];

		   // Get values of A
		   for (i=0; i<num; i++)
		      for (j=0; j<num; j++) {
		         System.out.println("A["+(i+1)+"]["+(j+1)+"] = ");
		         A[i][j] = Console.readDouble("");
		         if ((i == j) && (A[i][j] == 0)){
		           System.out.println("Wartosci na przekatnej musza byc rozne od 0");
		           return;
		         }
		      }

		   // Get values of b
		   for (i=0; i<num; i++) {
		      System.out.println("b["+(i+1)+"] = ");
		      b[i] = Console.readDouble("");
		   }

		   // Calculate N = D^-1
		   for (i=0; i<num; i++)
		      N[i] = 1/A[i][i];

		   // Calculate M = -D^-1 (L + U)
		   for (i=0; i<num; i++)
		      for (j=0; j<num; j++)
		         if (i == j)
		            M[i][j] = 0;
		         else
		            M[i][j] = - (A[i][j] * N[i]);

		   //Initialize x
		   for (i=0; i<num; i++)
		      x1[i] = 0;

		   System.out.println("Ile iteracji algorytmu wykonac?");
		   iter = Console.readInt("");

		   for (k=0; k<iter; k++) {
		      for (i=0; i<num; i++) {
		         x2[i] = N[i]*b[i];
		         for (j=0; j<num; j++)
		            x2[i] += M[i][j]*x1[j];
		      }
		      for (i=0; i<num; i++)
		         x1[i] = x2[i];
		   }

		   System.out.println("Wynik");
		   for (i=0; i<num; i++)
		      System.out.println("x["+(i+1)+"] = " + x1[i]);

		   return;
	}

}
