package step01;


import java.util.Optional;
import org.junit.Test;

public class StreamAPI3Optional {

	@Test
	public void step06(){
		String v = null;
		Optional<String> opt = Optional.ofNullable(v);
		
		System.out.println(opt.isPresent());

		// 문법 오류나는 이유: Exception은 try catch로 감싸주는 것이 필수여서
		// opt.orElseThrow(() -> new Exception("ohlcv result set null"));
		opt.orElseThrow(() -> new IllegalArgumentException("ohlcv result set null"));
		System.out.println(opt.orElseThrow(IllegalArgumentException::new));
	}
		/*
	@Test
	public void step05(){
		String v = null;
		Optional<String> opt = Optional.ofNullable(v);
		
		System.out.println(opt.isPresent());

		// 문법 오류나는 이유: Exception은 try catch로 감싸주는 것이 필수여서
		// opt.orElseThrow(() -> new Exception("ohlcv result set null"));
		opt.orElseThrow(() -> new IllegalArgumentException("ohlcv result set null"));
		System.out.println(opt.orElseThrow(IllegalArgumentException::new));
	}
	*/

}
	/*
	@Test
	public void step04(){
		String v = null;
		Optional<String> opt = Optional.ofNullable(v);
		
		System.out.println(opt.isPresent());
		System.out.println(opt.orElse("null 인 경우만 반환"));
	}
	/*
	// Optional API 활용	| 코드 작성 안정성이 매우 높아짐
	@Test
	public void step02(){
		// String v = null;
		String v = "playdata";

		// Optional API를 활용해 null 값 체크

		// optional<String> opt 객체 생성 => String null값을 확인할 수 있는 객체
		Optional<String> opt = Optional.ofNullable(v);	// null of String 이 parameter
		// System.out.println(opt);	// Optional.empty
		// 데이터 여부 확인 boolean 값 반환
		// System.out.println(opt.isPresent());	// false

		opt.ifPresent(v2 -> {
			System.out.println(1);
			System.out.println(v2.length());
			System.out.println(1);
		});
	}

*/
	
	
	/*
	public static void step01(){
		String v = null;
		System.out.println(v.length());
	}
	*/

