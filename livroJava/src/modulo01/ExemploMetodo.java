package modulo01;
import java.util.Date;

public class ExemploMetodo {
	private int meuAtributo = 0;
	public static void main(String [] args){
		Date today = new Date();
		System.out.println(today);
		imprimir();
	}
	
	public static void imprimir(){
		int minhaVariavel = 0;
		System.out.println("método imprimir");
	}
}
