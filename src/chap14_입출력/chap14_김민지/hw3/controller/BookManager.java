package chap14_입출력.chap14_김민지.hw3.controller;

import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Calendar;
import java.util.Scanner;

import chap14_입출력.chap14_김민지.hw3.model.vo.Book;

public class BookManager {
	
	Scanner sc = new Scanner(System.in);
	
	public BookManager() {
		// TODO Auto-generated constructor stub
	}
	
	public void fileSave() {
		
		Book[] bk = new Book[5];
		
		bk[0] = new Book("C언어", "김씨", 10000, setCalendar(2012,2,2), 0.1); // 날짜는 setCalendar 메소드를 통해 구할 것임
		bk[1] = new Book("자바", "이씨", 20000, setCalendar(2013,3,3), 0.2);
		bk[2] = new Book("C++", "박씨", 30000, setCalendar(2014,4,4), 0.3);
		bk[3] = new Book("넛지", "서씨", 40000, setCalendar(2015,5,5), 0.4);
		bk[4] = new Book("연금술사", "최씨", 50000, setCalendar(2016,6,6), 0.5);
		
		try(ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("books.dat"))){ // ObjectOutputStream 은 바로 file에 접근할 수 없으므로 FileOutputStream 이용하여 파일생성
			
			for(Book b : bk) {
				oos.writeObject(b);
				
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	
	public Calendar setCalendar(int year, int month, int date) {
		
		Calendar cal = Calendar.getInstance(); // Calender 객체를 이용하기 위해서 Calendar.getInstance() 를 사용. 현재시간정보가 나옴
		
		cal.set(year, month-1, date); // 원하는 날짜로 세팅		
		
		return cal;
		
	}
	
	public void fileRead() {
		
		Book[] readBook = new Book[10];
		
		try(ObjectInputStream ois = new ObjectInputStream(new FileInputStream("books.dat"))) { // try with resource 구문. 괄호안에 리소스를 담는다. InputStream 으로 데이터읽기
			while(true) {
				System.out.println((Book)ois.readObject()); // object 객체를 이용해서 정보 출력
			}
			
		} catch (FileNotFoundException e) { // 파일이 없을 때 발생
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) { // jar 파일이 없거나 class 파일이 없을 경우 발생
			// TODO Auto-generated catch block
			e.printStackTrace();				
		} catch (EOFException e) { // 무한반복문으로 돌려서 더 이상 불러올 객체가 없을 경우 readObject 메소드는 null을 불러오는 것이 아니라 EOFException 에러를 불러온다.
			
			System.out.println("books.dat 읽기 완료!");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
