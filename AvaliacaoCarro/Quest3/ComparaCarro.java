package Quest3;
import java.util.Comparator;

public class ComparaCarro implements Comparator<Carro> {
	
	public int compare(Carro a, Carro b) {
		return a.getNome().compareTo(b.getNome());
	}
}