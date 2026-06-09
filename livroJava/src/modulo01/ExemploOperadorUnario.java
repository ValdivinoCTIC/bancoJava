package modulo01;

public class ExemploOperadorUnario {

	public static void main(String[] args) {
		int var1 = 10;
		int var2 = 20;
		int res = 0;
		res = var1 + var2;
		System.out.println("res: " + res);
		res = var1++ + var2; // incremento após o final da operação
		System.out.println("res: " + res); //ainda na operação anterior
		res = var1 + var2;
		System.out.println("res: " + res);
		res = var1 + --var2; //decremento já na operação atual
		System.out.println("res: " + res);
	}

}
