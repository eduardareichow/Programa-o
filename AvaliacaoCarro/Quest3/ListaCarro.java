package Quest3;
import java.util.List;
import java.util.ArrayList;
import java.util.Collections;

public class ListaCarro {

	public static void main(String[]args) {
		
		List<Carro> carro  = new ArrayList<Carro>();
		ComparaCarro comparar = new ComparaCarro();
		
		Carro carro1 = new Carro("Civic", "Honda", "Sedan");
		Carro carro2 = new Carro("Prisma","Chevrolet","LT");
		Carro carro3 = new Carro("Sportage", "Kia", "LX");
		Carro carro4 = new Carro("Jeep Renegade", "Jeep", "SUV");
		Carro carro5 = new Carro("Jeep Compass", "Jeep", "Sport 2.0 Flex");
		
		carro.add(carro1);
		carro.add(carro2);
		carro.add(carro3);
		carro.add(carro4);
		carro.add(carro5);
		
		System.out.println(carro.toString());
		Collections.sort(carro, comparar);
		System.out.println(carro);
	}

}
