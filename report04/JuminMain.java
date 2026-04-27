package lang_p;

import java.util.Arrays;

public class JuminMain {

	public static void main(String[] args) {
		String jumin = "970320-1234567";

		char genderCode = jumin.charAt(7); // 하이픈 있는 경우 7, 없는 경우 6
		
		String gender = "";
		String birthDate = "";
		int year = Integer.parseInt(jumin.substring(0, 2));
		int currentYear = 2026;
		int age = 0;

		if (genderCode == '1' || genderCode == '3') {
		    gender = "남성 내국인 ";
		} else if (genderCode == '2' || genderCode == '4') {
		    gender = "여성 내국인 ";
		} else if (genderCode == '5' || genderCode == '7') {
		    gender = "남성 외국인 ";
		} else if (genderCode == '6' || genderCode == '8')
			gender = "여성 외국인 ";
		
		if (genderCode == '1' || genderCode == '2' || genderCode == '5' || genderCode == '6') {
			birthDate = "19" + jumin.substring(0, 2)+"년" + jumin.substring(2, 4)+"월"+jumin.substring(4, 6)+"일 ";
		}else if (genderCode == '3' || genderCode == '4'|| genderCode == '7' || genderCode == '8') {
			birthDate = "20" + jumin.substring(0, 2)+"년" + jumin.substring(2, 4)+"월"+jumin.substring(4, 6)+"일 ";
		}
		
		if (genderCode == '1' || genderCode == '2' || genderCode == '5' || genderCode == '6') {
            year += 1900;
        } else if (genderCode == '3' || genderCode == '4' || genderCode == '7' || genderCode == '8') {
            year += 2000;
        }
		
		age = currentYear - year + 1;
		
		
		System.out.println(gender + birthDate + age + "세 " + (age-1)+ "세 "); 
		
	}

}
