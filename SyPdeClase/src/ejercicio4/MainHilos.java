package ejercicio4;

public class MainHilos {
	public static void main(String[] arg){
		Thread h1 = new Hilo1("Hilo1");
		Thread h2 = new Hilo2("Hilo2");
		
		h1.start();
		h2.start();
	}
}
