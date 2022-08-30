package step01;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.Test;

public class StreamAPI4FlatMap {

	@Test
	public void step01(){

		List<String> teamKorea = Arrays.asList("손홍민", "홍명보", "안정환");
		List<String> teamAustralia = Arrays.asList("Warner", "Watson", "Smith");
		List<String> teamEngland = Arrays.asList("Alex", "Bell", "Broad");
		List<String> teamNewZeland = Arrays.asList("Kane", "Nathan", "Vettori");
		List<String> teamSouthAfrica = Arrays.asList("AB", "Amla", "Faf");
		List<String> teamWestIndies = Arrays.asList("Sammy", "Gayle", "Narine");
		List<String> teamSriLanka = Arrays.asList("Mahela", "Sanga", "Dilshan");
		List<String> teamPakistan = Arrays.asList("Misbah", "Afridi", "Shehzad");

		//List 타입 내부에 String객체들을 보유한 List가 element로 저장 가능
		List<List<String>> playersInWorldCup2022 = new ArrayList<>();

		playersInWorldCup2022.add(teamKorea);
		playersInWorldCup2022.add(teamAustralia);
		playersInWorldCup2022.add(teamEngland);
		playersInWorldCup2022.add(teamNewZeland);
		playersInWorldCup2022.add(teamSouthAfrica);
		playersInWorldCup2022.add(teamWestIndies);
		playersInWorldCup2022.add(teamSriLanka);
		playersInWorldCup2022.add(teamPakistan);

		// for(List<String> v : playersInWorldCup2022) { v.stream().forEach(System.out::println); }
		// playersInWorldCup2022.stream().forEach(System.out::println); }
		// System.out.println(playersInWorldCup2022);

		// System.out.println(playersInWorldCup2022.stream().flatMap(i -> i.stream()).collect(Collectors.toList()));
		
		// List<String> list = playersInWorldCup2022.stream().flatMap(i -> i.stream()).collect(Collectors.toList());
		// System.out.println(list);

	}
}