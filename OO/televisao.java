public class Televisao {
	
	String 	marca;
	boolean ligada;
	int 	volume;
	int 	canal;

	// metodos?
	void ligar() {

		ligada = true;
		System.out.println("A TV "+marca+" está ligada");

	}

	void aumentarVolume(){

		if (ligada) {

			volume ++;
			System.out.println("A TV "+marca+" esta com volume "+volume);
		}

		else {

			System.out.println("A TV "+marca+" está desligada ");
		}

    }

    void avancarCanal(){

    	if(ligada) {

    		canal++;
    		System.out.println("A TV da "+marca+" está no canal "+canal);

    	}

    	else {

    		System.out.println("A TV "+marca+" está desligada");
    	}
    }		
}	
