package day18.ramda.anomymous.basic;

public class MainClass {
	
	public static void main(String[] args) {
		
		Car car = new Tico(); // 오버라이딩 된 메서드 실행
		car.run();
		
		
		// 매번 Car를 구현한 클래스가 달라져야 한다면?
		// 익명객체 문법으로
		
		Car car2 = new Car() {
			@Override
			public void run() {
				System.out.println("마이 뉴 카~");
			}
		};
		
		car2.run();
	
		 Car car3 = new Car() {
			@Override
			public void run() {
				// TODO Auto-generated method stub
			}
	
		 };
		 
		 
		 System.out.println("---------------------------------");
		 
		 // Tv에 있는 리모컨 사용하기
		 Tv tv = new Tv();
		 
		 tv.remote.turnOn();
		 tv.remote.volumUp();
		 tv.remote.volumeDown();
		 tv.remote.turnOff();
		 
		 
	}
}