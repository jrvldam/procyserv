package ejercicio5;

public class Hebra extends Thread{
	
	private String resultado;
	private int rand;
	String[] mano = {"Piedra", "Papel", "Tijera"};
	
	public Hebra(String name){
		super(name);
	}

	public void run(){
		int x = mano.length;
		rand = ((int)(Math.random()*x));
		resultado = mano[rand];
		//System.out.println(mano[rand]);
	}
	
	public String getResultado() {
		return resultado;
	}
	
	public int getRand(){
		return rand;
	}
	
}
