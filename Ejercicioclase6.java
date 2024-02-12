import java.util.Scanner;
public class Ejercicioclase6{

	public static void main(String[] args){
		
		Scanner in = new Scanner(System.in);
		
		String saborhelado; // declararlo
		
		System.out.println("Cual es tu sabor de helado favorito? ");
		
		saborhelado = in.nextLine();
		
		System.out.println(" tu sabor de helado favorito es :" + saborhelado );
		
		double porcentajeComision;
		
		System.out.println("cual es el porcentahje de comision en la venta? ");
		
		porcentajeComision =in.nextDouble();
		
		System.out.println(" el porcentaje de comision de venta es:" + porcentajeComision );
		
		
		
	}
}	