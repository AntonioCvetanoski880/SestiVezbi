package treti;

import java.util.ArrayList;
import java.util.List;

public class treta {

	public static void main(String[] args) {
		List<String> footballClubs = new ArrayList<>();
        footballClubs.add("Manchester City");
        footballClubs.add("Manchester United");
        footballClubs.add("Arsenal");
        footballClubs.remove(0);
        System.out.println("Listata sodrzi "+footballClubs.size());
        for (int i=0; i < footballClubs.size(); i++) {
			System.out.println(footballClubs.get(i));

        
        
	}

}
}