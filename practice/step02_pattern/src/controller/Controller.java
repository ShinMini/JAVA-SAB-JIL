/* 브라우저 화면단계에서
 * 1 로 요청시 - 고객 한명 검색이라 가정
 * 2 로 요청시 - 고객 정보(등급) 수정
 * 
 */
package controller;

import model.Model;
import model.domain.Customer;
import view.SuccessView;
import view.FailView;

public class Controller {

	public void reqRes(int reqNo){
		if(reqNo == 1) { // 고객 한명 검색이라 가정
			// 정상 출력. 
			Model m = new Model();
			Customer c = m.select("id01");
			SuccessView.print(c);
			
		}else if(reqNo == 2) {	// 고객 정보(등급)이라 가정. 
			// 정상 출력. 
			
		}else {
			// 비정상 출력. 
			FailView.print("너 누구야?");
		}

	}
}
