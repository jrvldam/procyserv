package ejercicio4;

public class Hilo1 extends Thread{
	
	public Hilo1(String name){
		super(name);
	}
	
	public void run(){
		int i=1;
		try{
			while(i<101){
				System.out.println(i);
				Thread.sleep(10);
				i++;
			}
		}catch(InterruptedException e){
			e.printStackTrace();
		}
	}
}
