package Quest2;
import java.util.List;
import java.util.ArrayList;
import java.util.Collections;

public class ListaCarro {
	
	public static void main(String[]args) {
		
		List<String> carro = new ArrayList<>();
		carro.add("Civic");
		carro.add("Prisma");
		carro.add("Sportage");
		carro.add("Jeep Renegade");
		carro.add("Jeep Compass");
		System.out.println(carro);
		Collections.sort(carro);
		System.out.println(carro);
	}

}
