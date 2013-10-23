package ejercicio2;

public class Hilo2 extends Thread {
	public int getSuma() {
		return suma;
	}

	private int suma=0;
	
	public Hilo2(String name) {
		super(name);
	}

	public void run (){
        int cont = 1;
        while (cont<4){
        	try {
        		System.out.println("El Hilo2 duerme..."+cont);
    			Thread.sleep(10000);
    			if (cont == 2){
    				for (int i = 1; i <= 1000 ; i+=2){
    				suma+=i;
    				}
    				System.out.println("El hilo " + getName() + " da como suma Impar total:"+suma);
    			}
    			cont++;
    		}catch (InterruptedException e) {
    			e.printStackTrace();
    		}
        }
        System.out.println("Termina el thread " + getName());
	}
}
