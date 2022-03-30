public class AppPessoa {
	
	public static void main(String[] args) {

		Pessoa p1 = new Pessoa("Alex","alexzaneratto@gmail.com",2000);
		Pessoa p2 = new Pessoa("Naty",4000);



		p1.exibirDados();

		p1.aumentarSalario(15);

		p1.exibirDados();

		p2.exibirDados();


	}
	

}