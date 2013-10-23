package ejercicio2_2;

public class Hilo1 extends Thread{
	private long numero;
	
	public long getNumero() {
		return numero;
	}

	public void setNumero(long numero) {
		this.numero = numero;
	}
/*
	public Hilo1(long numero){
		this.numero=numero;
	}
*/	
	public Hilo1(String name){
		super(name);
	}
	
	public void run(){
		int cont = 2;
		boolean bandera = false;
		while((!bandera) && (cont < numero)){
			if((numero%cont) == 0){
				bandera = true;
			}else{
				cont++;
			}
		}
		if (bandera){
			System.out.println(numero+" no es primo.");
		}else{
			System.out.println(numero+" es primo.");
		}
	}
}
