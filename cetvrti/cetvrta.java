package cetvrti;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class cetvrta {

	public static void main(String[] args) {
		List<Integer> broj = new ArrayList<>();
		broj.add(5);
		broj.add(4);
		broj.add(3);
		broj.add(6);
		broj.add(8);
		Collections.sort(broj);
		for (int i=0; i < broj.size(); i++) {
			System.out.println(broj.get(i));

		}


	}

}
