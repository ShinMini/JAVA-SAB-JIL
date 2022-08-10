package model.domain;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;


@Getter
@Setter

@Builder
public class Student {
	private String name;
	private int grade; // 1, 2, 3등의 학년.


}
