package modulo01;

public class PrincipalEstatico {

	public static void main(String[] args) {
		ContaCorrente objeto1 = new ContaCorrente();
		//acessando o atributo  estático por meio do nome da classe
		ContaCorrente.cpmf = 0.0038;
		objeto1.saldo = 200;
		ContaCorrente objeto2 = new ContaCorrente();
		objeto2.saldo = 400;
		System.out.println("Manipulando objetos em Java\u2122");
		System.out.println("\u00A9 Sun Microsystem, Inc.");
		//atributo estático sendo acessado por um objeto
		System.out.println("objeto1 atributo estático: " + objeto1.cpmf);
		System.out.println("objeto1 atributo não estático: " + objeto1.saldo);
		//acessando o atributo estático por meio de um objeto
		System.out.println("objeto2 atributo estático: " + objeto2.cpmf);
		System.out.println("objeto2 atributo não estático: " + objeto2.saldo);
		objeto2.cpmf = 0.0010;
		System.out.println("objeto1 atributo estático: " + objeto1.cpmf);
		System.out.println("objeto1 atributo não estático: " + objeto1.saldo);
		//acessando o atributo estático por meio do nome da classe
		System.out.println("objeto1 atributo estático. Acessado pelo nome da classe: " + ContaCorrente.cpmf);
		System.out.println("objeto1 atributo não estático: " + objeto1.saldo);
	}
}