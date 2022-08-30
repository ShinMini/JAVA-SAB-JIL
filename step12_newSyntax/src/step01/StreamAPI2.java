package step01;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.Test;

import model.domain.Employee;

public class StreamAPI2 {
	
	// DTO 사용
	@Test
	public void step02(){
		List<Employee> peoples = new ArrayList<>();
		
		peoples.add(new Employee(101, "Victor", 23));
		peoples.add(new Employee(102, "Rick", 21));
		peoples.add(new Employee(103, "Sam", 25));
		peoples.add(new Employee(104, "John", 27));
		peoples.add(new Employee(105, "Grover", 23));
		peoples.add(new Employee(106, "Adam", 22));
		peoples.add(new Employee(107, "Samy", 224));  // age가 이상치
		peoples.add(new Employee(108, "Duke", 29));
		
		System.out.println("1. :: ");
		peoples.forEach(System.out::println);

		System.out.println("2. lambda식 ");
		peoples.forEach(v -> System.out.println(v));
		peoples.forEach(v -> System.out.println(v + "---"));

		System.out.println("3. 나이의 평균 ");
		System.out.println((peoples.stream().mapToInt(i -> i.getAge())).average().getAsDouble());


		System.out.println("4. 직원들의 평균 나이값 ");
		// peoples.stream().mapToInt(i -> i.getAge()).forEach(age -> System.out.println(age + "\t"));
		double averageEmployee = 0.0;
		averageEmployee = ((peoples.stream().mapToInt(i -> i.getAge()).filter(j -> j <= 120 &&  j > 0).average()).getAsDouble());
		
		System.out.println(String.format("%.2f", averageEmployee));
	}

	
	
	
	// 기초
	public static void step01(){
	// 1 ~ 5까지의 int값을 기반으로 List에는 객체만 저장
	// int => integer 객체로 변환된 list
	List<Integer> intDatas = Arrays.asList(1, 2, 3, 4, 5);
	System.out.println(intDatas);
		
	// % 2 == 0
	// System.out.println(intDatas.stream().filter(v -> v % 2 == 0)); //java.util.stream.ReferencePipeline$2@198e2867
	// System.out.println(intDatas.stream().filter(v -> v % 2 == 0).mapToInt(i -> i)); // java.util.stream.ReferencePipeline$4@567d299b


	System.out.println("1. 짝수만 받아서 합");
	System.out.println(intDatas.stream().filter(v -> v % 2 == 0).mapToInt(i -> i).sum());	// 6
	
	//? 홀수 값만으로 합 구하기
	System.out.println("\n2. 홀수만 받아서 합");
	System.out.println(intDatas.stream().filter(v -> v % 2 != 0).mapToInt(i -> i).sum());	// 6


	//? 홀수 개수 구하기
	System.out.println("\n3. 홀수 개수");
	System.out.println(intDatas.stream().filter(v -> v % 2 != 0).mapToInt(i -> i).count());	// 6

	//? 홀수 중 최댓값(max)
	System.out.println("\n2. 홀수 중 최댓값");
	System.out.println(intDatas.stream().filter(v -> v % 2 != 0).mapToInt(i -> i).max());	// 6
	
	//? 2만빼고 출력
	System.out.println("\n2. 홀수 중 최댓값");
	(intDatas.stream().filter(v -> v != 2).mapToInt(i -> i)).forEach(System.out::println);

	}

}
