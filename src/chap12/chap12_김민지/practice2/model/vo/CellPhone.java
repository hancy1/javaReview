package chap12.chap12_김민지.practice2.model.vo;

public interface CellPhone extends Phone, Camera{
	
	public abstract void charge(); // 휴대폰 유형에 따라 충전 방식을 출력하기 위한 추상 메소드

}
