import java.util.Scanner;

public class URI2297 {

	public static void main(String args[]) {

		Scanner teclado = new Scanner(System.in);
		int aldo, beto; //contador aldo e beto
		int a , b; //numero de figuras que conseguiram virar
		int r;      // numero de rodadas
		int teste = 0;
		
		do {
			teste ++;
			aldo = 0;
			beto = 0;
			r = teclado.nextInt();
			
			if (r != 0){

				for (int i=0; i<r ;i++){

					a = teclado.nextInt();
					b = teclado.nextInt();
					
					aldo = a + aldo; 
					beto = b + beto;

				}

				if( aldo > beto ){
					System.out.println("Teste "+teste);
					System.out.println("Aldo");
					System.out.println("");

				}

				else {

					System.out.println("Teste "+teste);
					System.out.println("Beto");
					System.out.println("");
				}
				
			}


		} while ( r != 0);

	}
}
