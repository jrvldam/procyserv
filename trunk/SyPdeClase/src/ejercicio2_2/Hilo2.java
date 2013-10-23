package ejercicio2_2;

public class Hilo2 extends Thread{
	private long numero;
	
	public long getNumero(){
		return numero;
	}
	
	public void setNumero(long numero){
		this.numero=numero;
	}
	
	public Hilo2(String name){
		super(name);
	}
	
	public void run(){
		//long cont = 0;
		System.out.print("los divisores de "+numero+" son: ");
		for (int i = 1 ; i <= numero ; i++){
            if (numero % i == 0){
                System.out.print(i+" ");
            }
            
		}    
	}

}
