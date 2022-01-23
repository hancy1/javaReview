package chap12.김민보.practice3.controller;

import chap12.김민보.practice3.model.vo.Animal;
import chap12.김민보.practice3.model.vo.Cat;
import chap12.김민보.practice3.model.vo.Dog;

public class AnimalManager {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Animal[] animals = new Animal[5];
		
		animals[0] = new Cat("꿍이", "코리안숏헤어", "한국", "검정" );
		animals[1] = new Cat("채채", "페르시안", "한국", "하양");
		animals[2] = new Dog("뽀삐", "말티즈", 7);
		animals[3] = new Cat("김민주", "코리안숏헤어", "한국", "치즈냥이");
		animals[4] = new Dog("러블리욜키", "요크셔테리어", 8);
		
		for(int i = 0; i < animals.length; i++) {
			animals[i].speak();
		}
		
	}

}