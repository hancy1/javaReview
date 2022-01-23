package chap12.김민보.practice2.model.vo;

public class GalaxyNote9 extends SmartPhone {

	public GalaxyNote9() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public void charge() {
		System.out.println("고속 충전, 고속 무선 충전");
		
	}
	

	@Override
	public void takeaCall() {
		System.out.println("수신 버튼을 누름");
		
	}

	@Override
	public void picture() {
		System.out.println("1200만 듀얼 카메라");
		
	}

	@Override
	public void touch() {
		System.out.println("정전식, 와콤펜 지원");
		
	}

	@Override
	public void printMaker() {
		// TODO Auto-generated method stub
		System.out.println("갤럭시 노트 9는 삼성에서 만들어 졌다.");
	}

	@Override
	public void makeacall() {
		// TODO Auto-generated method stub
		System.out.println("번호를 누르고 통화버튼을 누름");
	}
	
	
	
}