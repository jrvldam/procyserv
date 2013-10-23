package ejercicio2;

public class Hilo3 extends Thread {
	public int getSuma() {
		return suma;
	}

	private int suma=0;
	
	public Hilo3(String name) {
		super(name);
	}

	public void run (){
		for (int i = 1; i <= 1000 ; i++){
			if(i%10==2 || i%10==3){
				suma+=i;
			}
		}		
        System.out.println("El hilo " + getName() + " da como suma de los terminado en 2 y 3 un total: "+suma);

        try {
        	Thread.sleep(20000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
        System.out.println("Termina el thread " + getName());
	}
}