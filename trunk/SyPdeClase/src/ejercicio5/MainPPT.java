package ejercicio5;

public class MainPPT {

	public static void main(String[] args) {
		int cont1 = 0, cont2 = 0;
		
		while(cont1 < 3 && cont2 < 3){
			Thread j1 = new Hebra("Jugador 1");
			Thread j2 = new Hebra("Jugador 2");
			j1.start();
			j2.start();
			
			while(j1.isAlive() || j2.isAlive())Thread.yield();
			
			System.out.println(j1.getName()+": "+((Hebra)j1).getResultado());
			System.out.println(j2.getName()+": "+((Hebra)j2).getResultado());
			System.out.println(" ");
			
			if((((Hebra) j1).getRand()) != ((Hebra) j2).getRand()){
				if((((Hebra) j1).getRand()) == 0 && (((Hebra) j2).getRand()) == 2 || (((Hebra) j1).getRand()) == 1 && (((Hebra) j2).getRand()) == 0 || (((Hebra) j1).getRand()) == 2 && (((Hebra) j2).getRand()) == 1){
					cont1++;
				}else{
					cont2++;
				}
			}
		}
		
		if(cont1 > cont2){
			System.out.println("El Jugador 1 gana!");
		}else{
			System.out.println("El Jugador 2 gana!");
		}
	}

}
