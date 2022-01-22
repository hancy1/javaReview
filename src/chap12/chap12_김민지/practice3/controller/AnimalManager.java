package chap12.chap12_김민지.practice3.controller;

import chap12.chap12_김민지.practice3.model.vo.Animal;
import chap12.chap12_김민지.practice3.model.vo.Cat;
import chap12.chap12_김민지.practice3.model.vo.Dog;

public class AnimalManager {

	public static void main(String[] args) {
		
		Animal [] ani = new Animal[5];
		
		ani[0] = new Dog("바둑이", "진돗개", 20);
		ani[1] = new Cat("치즈", "랙돌", "미국", "브라운");
		ani[2] = new Cat("공주", "페르시안고양이", "페르시안", "화이트");
		ani[3] = new Dog("왕자", "푸들", 10);
		ani[4] = new Dog("살구", "포메라니안", 10);
		
		for(Animal a : ani) {
			a.speak();
		}

	}

}
