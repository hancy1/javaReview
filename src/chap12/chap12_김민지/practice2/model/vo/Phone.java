package chap12.chap12_김민지.practice2.model.vo;

public interface Phone {

	public abstract void makeaCall(); // 각 전화 유형에 대해 전화걸기 방식을 출력하기 위한 추상메소드
	
	public abstract void takeaCall(); // 각 전화 유형에 대해 전화 받는 방식을 출력하기 위한 추상메소드
}
