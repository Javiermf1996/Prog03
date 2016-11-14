import java.util.Scanner;
public class Ejercicio7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			Scanner teclado = new Scanner (System.in);
			int N, mayor, menor, total = 0, contador = 0, media;
			
			System.out.print("Introduce numero: ");
			N = teclado.nextInt();
			mayor = N;
			menor = N;
			 while (N != 0) {
				 if (N  >mayor)  {
					 mayor = N;
				 	}else
				 		
					 menor = N;
			 
			 
				 contador++;
				 total= N + total;
				 System.out.print("Introduce numero: ");
				 N = teclado.nextInt();
			}
			media=total/contador;
			System.out.println("Media aritmetica:"+ media);
			System.out.println("Numero mayor:"+ mayor);
			System.out.println("Numero menor:"+ menor);
	}
 
}
