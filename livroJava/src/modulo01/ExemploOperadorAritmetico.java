package modulo01;

public class ExemploOperadorAritmetico {

	public static void main(String[] args) {
		int var1 = 5;
		int var2 = 2;
		System.out.println("var1 = " + var1);	
		System.out.println("var2 = " + var2);
		System.out.println("-var2 = " + (-var2));
		System.out.println("var1 + var2 = " + (var1 + var2));
		System.out.println("var1 - var2 = " + (var1 - var2));
		System.out.println("var1 * var2 = " + (var1 * var2));
		System.out.println("var1 / var2 = " + (var1 / var2)); //operação devolve o maior tipo
		System.out.println("(float)var1 / var2 = " + ((float)var1 / var2)); //float maior tipo
		System.out.println("var1 % var2 = " + (var1 % var2));
		System.out.println("var2 = " + var2);
		}
}
