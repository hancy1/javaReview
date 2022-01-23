package chap12.한채영.hw4.controller;

import java.util.Scanner;

import chap12.한채영.hw4.model.vo.Employee;

public class EmpTest {

	private Employee[] empArr;

	public EmpTest() {
		// TODO Auto-generated constructor stub
	}

	public void setEmp() {
		
		Scanner sc = new Scanner(System.in);
		empArr = new Employee[6];

		{
			empArr[0] = new Employee("문말똥", 24, 1500000, 1.245);
			empArr[1] = new Employee("장소똥", 40, 2500000, 1.4);
			empArr[2] = new Employee("금개똥", 22, 1780000, 1.3);
			empArr[3] = new Employee("봉쥐똥", 31, 1950000, 1.365);
			empArr[4] = new Employee("홍닭똥", 34, 1650000, 1.212);
		}
		
		System.out.println("이름을 입력하세요: ");
		String name = sc.nextLine();

		System.out.println("나이를 입력하세요: ");
		int age = sc.nextInt();

		System.out.println("급여를 입력하세요: ");
		int salary = sc.nextInt();

		System.out.println("세율을 입력하세요: ");
		double taxRate = sc.nextDouble();
		
		int sal = (int) (salary-(salary*taxRate)/100);

		empArr[5] = new Employee(name, age, sal, taxRate);
	}

	public void printEmp() {

		for (int i = 0; i < empArr.length; i++) {
				System.out.println(empArr[i].toString());
		}

	}

	public void namesortPrint() {//가이드 참고

		Employee empTemp = new Employee(); // Employee 객체를 잠시 받아줄 임시 객체

		for (int i = 0; i < empArr.length; i++) {
			for (int j = i + 1; j < empArr.length; j++) {
				if (empArr[i].getName().compareTo(empArr[j].getName())>0) {
					empTemp = empArr[i];
					empArr[i] = empArr[j];
					empArr[j] = empTemp;
				}
			}
		}
	}
}
