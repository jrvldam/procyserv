package ejercicio2;

public class MainHilos {

	public static void main(String[] args) {
		Thread h1 = new Hilo1("Hilo1 SumarPar");
		Thread h2 = new Hilo2("Hilo2 SumarImpar");
		Thread h3 = new Hilo3("Hilo3 SumarTerm2o3");

		h1.start();
		h2.start();
		h3.start();
		while (h1.isAlive() ||h2.isAlive() ||h3.isAlive()) Thread.yield(); //mientras condición, dejar libre.
		System.out.println("Fin del programa");
	}

}
