package ejercicio4;

public class Hilo2 extends Thread{
	
	public Hilo2(String name){
		super(name);
	}
	
	public void run(){
		int i=100;
		try{
			while(i>0){
				System.out.println(i);
				Thread.sleep(10);
				i--;
			}
		}catch(InterruptedException e){
			e.printStackTrace();
		}
	}
}
