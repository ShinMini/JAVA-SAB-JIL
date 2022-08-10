package model.domain;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class Customer {
   private String id;
   private int pw;

   // toString() 재정의
   // equals() 재정의
   /*
    * 같은 Customer 타입의 객체들 간에 내용 비교(데이터값)
    * 동일한 true / 다르면 flase
    * 1. if(Customer 타입)
    * 1. 맞다 - id/pw ㅣ비교
    * 2. 다르다 - flase
    * 2. 다르다 - flase
   */
}
