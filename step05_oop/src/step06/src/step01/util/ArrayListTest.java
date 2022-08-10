/* List 학습 
1. 객체들만 저장가능
2. 동적 메모리 구조
3.  촉촉
   데이터 store
   public boolean add(Object o){
      ArrayList 객체에 데이터 저장
   }
   데이터 반환
   pulbic int get(int index){
      index값으로 해당 index에 저장된 객체 반환

   }

*/

package step06.src.step01.util;

import java.util.ArrayList;

class A {

   public String toString() {
      return "A";
   }
}

public class ArrayListTest {
   public static void main(String[] args) {
      // String 타입만 저장 간으한 ArrayList로 전환// generic을 적용했다 -> <String> .
      ArrayList<String> a1 = new ArrayList<>(); // [], list(), ... in python

      a1.add("a"); // 0번째 저장
      a1.add("b"); // 1번째 저장
      a1.add("c"); // 2번째 저장
      a1.add("d"); // 3번째 저장

      System.out.println(a1.size()); // 데이터 개수 5
      System.out.println(a1.get(2)); // b

      a1.remove(2);

      System.out.println(a1.size()); // 데이터 개수 5
      System.out.println(a1.get(2)); // b
   }

   public static void main2(String[] args) { // 절대 호출 안함
      ArrayList a1 = new ArrayList(); // [], list(), ... in python

      a1.add("string a");
      a1.add(new Integer(3));
      a1.add("string b");
      a1.add(new A());

      System.out.println(a1); // a1.toString()
   }

}
