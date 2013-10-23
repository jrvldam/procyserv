package ejercicio3;

public class MainDados extends Ebra{
	public MainDados(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] arg){
		//int numr;
		//int numn;
		
		Thread dr = new Ebra("Dado rojo");
		Thread dn = new Ebra("Dado negro");
		Thread e= new Ebra("Padre");
		
		dr.start();
		dn.start();
		
		while(dr.isAlive()||dn.isAlive())Thread.yield();
		
		System.out.println(dr.getName()+" "+((Ebra)dr).getRand());
		System.out.println(dn.getName()+" "+((Ebra)dn).getRand());
		((Ebra) e).ganador(dr, dn);
	}
}
