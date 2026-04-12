package exam_p;

interface buildcc{

	 void cc(String com1);
	 void gather(int num1, int num2);
}


interface buildsp{
	 
	 void sp(String com2);
	 void gather(int num1, int num2);
}


interface buildfact{
	 
	 void fact(String com3);
	 void gather(int num1, int num2);
}


class normalscv implements buildcc, buildsp,buildfact  {

	
	
	@Override
	public void cc(String com1) {
		// TODO Auto-generated method stub
		
		if (com1 =="커맨드센터") {
			System.out.println(com1 +"\t" + "건설");
		}else {
			System.out.println("커맨드센터 건설만 가능합니다");
		}
		
	}

	@Override
	public void sp(String com2) {
		// TODO Auto-generated method stub
		
		if (com2 =="스타포트") {
			System.out.println(com2 +"\t" + "건설");
		}else {
			System.out.println("스타포트 건설만 가능합니다");
		}
		
	}
	
	@Override
	public void fact(String com3) {
		// TODO Auto-generated method stub
		
		if (com3 =="팩토리") {
			System.out.println(com3 +"\t" + "건설");
		}else {
			System.out.println("팩토리 건설만 가능합니다");
		}
		
	}
	
	
	
	
	public void gather(int num1, int num2) {
		System.out.println("미네랄 : " + num1 + "\t" + "가 스 : " + num2);
	}
	
	
}



	

public class report04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		buildcc scv1 = new normalscv();
		buildsp scv2 = new normalscv();
		buildfact scv3 = new normalscv();
		
		scv1.gather(8, 8);
		scv1.cc("커맨드센터");
		
		scv2.gather(8, 8);
		scv2.sp("스타포트");
		
		scv3.gather(8, 8);
		scv3.fact("팩토리");
		
	}

	


}
