import java.util.Scanner;

public class URI1038 {

	public static void main (String args[]) {

		Scanner teclado = new Scanner(System.in);

		int codigo, qtd;
		codigo = teclado.nextInt();
		qtd = teclado.nextInt();
		float valor = 0.0f;

		switch(codigo){

			case 1:

				valor = qtd * 4.00f;
				break;

			case 2:

				valor = qtd * 4.50f;
				break;

			case 3:

				valor = qtd * 5.00f;
				break;

			case 4:

				valor = qtd * 2.00f;
				break;

			case 5:

				valor = qtd * 1.50f;
				break;


		}

	System.out.printf("Total: R$ %.2f\n",valor);
	}
}

