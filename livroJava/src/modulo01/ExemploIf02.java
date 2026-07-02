package modulo01;
import java.io.IOException;

public class ExemploIf02 {
	public static void main(String [] args) throws IOException{
		System.out.println("Digite uma das letras da palavra Java: ");
		int numero = System.in.read();
		if(((char) numero == 'J') || ((char) numero == 'j')
				||((char) numero == 'A') || ((char) numero == 'a')
				||((char) numero == 'V') || ((char) numero == 'v')) {
				System.out.println("Letra digitada está correta.");
		}else if((char)numero == (char)13 || (char)numero == (char)10) {
			System.out.println("Foi digitado apenas um <enter>");
		}else{
			System.out.println("Letra digitada está incorreta");
		}
	}
}
