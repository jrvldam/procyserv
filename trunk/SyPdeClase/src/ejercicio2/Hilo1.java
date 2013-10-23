package ejercicio2;

public class Hilo1 extends Thread {
	
	private int suma =0;

	public Hilo1(String name) {
		super(name);
	}

	public void run(){
		
		try {
        	Thread.sleep(10000);
    		} catch (InterruptedException e) {
    			// TODO Auto-generated catch block
    			e.printStackTrace();
    		}
		
		for (int i = 0; i <= 1000 ; i+=2){
			suma+=i;
		}
			
        System.out.println("El hilo " + getName() + " da como suma par total: "+suma);
        System.out.println("Termina el thread " + getName());	
	}

	//Getter
	public int getSuma() {
		return suma;
	}
	
}