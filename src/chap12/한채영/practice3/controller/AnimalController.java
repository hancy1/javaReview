package chap12.한채영.practice3.controller;

import chap12.한채영.practice3.model.vo.Animal;
import chap12.한채영.practice3.model.vo.Cat;
import chap12.한채영.practice3.model.vo.Dog;

public class AnimalController {

	public static void main(String[] args) {
		
		Animal[] a = new Animal[5];
		{
			a[0] = new Dog("라떼", "믹스", 6);
			a[1] = new Cat("삼색이", "삼색냥", "양어장", "삼색");
			a[2] = new Dog("진솔이", "진돗개", 10);
			a[3] = new Dog("절미", "믹스", 5);
			a[4] = new Cat("무", "고등어태비", "하하하네", "회색");
			
		}
		
		for(Animal ani : a) {
			ani.speak();
		}
	}

}
