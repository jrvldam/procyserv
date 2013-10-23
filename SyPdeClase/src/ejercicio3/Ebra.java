package ejercicio3;

public class Ebra extends Thread{
	
	private int rand;
	int[] numeros = {1,2,3,4,5,6};
	
	public Ebra(String name){
		super(name);
	}
	
	public void run(){
		int lista = numeros.length;
		rand = ((int)(Math.random()*lista))+1;
		//System.out.println((rand+1));
	}
	
	public void ganador(Thread h1, Thread h2){
		if(((Ebra)h1).rand>((Ebra)h2).rand){
			System.out.println("Gana el "+((Ebra)h1).getName()+"!");
		}else if(((Ebra)h1).rand == ((Ebra)h2).rand){
			System.out.println("Empate!");
		}else{
			System.out.println("Gana el "+((Ebra)h2).getName()+"!");
		}
	}

	public int getRand() {
		return rand;
	}

	public void setRand(int rand) {
		this.rand = rand;
	}
	
}
