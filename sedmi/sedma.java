package sedmi;

import java.util.ArrayList;
import java.util.List;

public class sedma {

	public static void main(String[] args) {
		List<String> meil = new ArrayList<>();
		for (int i=0; i < 20; i++) {
			meil.add("meil"+(int)(i+1)+"@yahoo.com");
			System.out.println(meil.get(i));

	}

}
}
