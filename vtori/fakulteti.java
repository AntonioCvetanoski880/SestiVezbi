package vtori;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class fakulteti {

	public static void main(String[] args) {
		List<String> fakulteti = new ArrayList<>();
		fakulteti.add("Fikt");
		fakulteti.add("Biotehnicki");
		fakulteti.add("Tehnicki");
		Collections.sort(fakulteti);
		for (int i=0; i < fakulteti.size(); i++) {
			System.out.println(fakulteti.get(i));

	}
	}
}
