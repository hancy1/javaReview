package chap14_입출력.chap14_김민지.hw1.model.vo;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class FileDao {
	
	Scanner sc = new Scanner(System.in);
	
	public FileDao() {
		// TODO Auto-generated constructor stub
	}
	
	public void fileSave() {
		
		StringBuilder sb = new StringBuilder();
		
		System.out.println("파일에 저장할 내용을 반복해서 입력하시오(\"exit\"을 입력하면 내용 입력 끝) : ");
		String memo = null; // 메모 내용 담을 곳
		
		while(true) {
			memo = sc.nextLine();
			
			if(memo.equalsIgnoreCase("exit")) {
				break;
			}else {
				sb.append(memo); // 내용을 계속 저장
				sb.append("\n"); // 줄바꿈 개행이 없으면 다 붙어서 나옴
			}
		}
		
		System.out.println("저장하시겠습니까? (y/n)");
		if(sc.nextLine().equalsIgnoreCase("Y")) {
			System.out.println("저장할 파일명 입력 : ");
			String memoName = sc.nextLine();
			
			BufferedWriter bw = null; // 보조스트림 BufferedWriter 는 꼭 먼저 선언해줘야 한다.
			
			try {
				bw = new BufferedWriter(new FileWriter(memoName+".txt"));
				bw.write(sb.toString()); // write에 메모 내용 넣기
				System.out.println(memoName+".txt 파일에 성공적으로 저장하였습니다.");
			}catch(IOException e) {
				e.printStackTrace();
			}finally {
				try {
					bw.close(); // 열었던 BufferedWriter 닫아주기
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
			}
			
		}
		else {
			System.out.println("다시 메뉴로 돌아갑니다.");
			return;
		}
	}

	public void fileOpen() {
		System.out.println("열기 할 파일명 : ");
		String fileName = sc.nextLine();
		BufferedReader br = null; // 보조스트림 BufferedReader 는 꼭 먼저 선언해줘야 한다.
		String memo = null;
		
		
			try {
				br = new BufferedReader(new FileReader(fileName+".txt"));
				while((memo = br.readLine()) != null) { // readLine 메소드는 한줄씩 읽어서 출력. null 이 될때까지 반복
					System.out.println(memo);				
					}
			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}finally {
				try {
					br.close(); // 사용한 BufferedReader 닫아주기
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		
		
	}
	
	public void fileEdit() {
		System.out.println("수정 할 파일명 : ");
		String memoName = sc.nextLine();
		
		BufferedReader br = null; // 선언!
		BufferedWriter bw = null;
		String memo = null;		
		StringBuilder sb = new StringBuilder();
		
		try {
			br = new BufferedReader(new FileReader(memoName+".txt")); // 파일읽기
			bw = new BufferedWriter(new FileWriter(memoName+".txt", true)); // 파일에 쓰기, true를 명시하지 않으면 원래 있던 내용이 지워지고 새로 쓰여짐.
			
			while((memo = br.readLine()) != null) { // null이 될때까지 한줄씩 출력
				System.out.println(memo);
			}
			
			System.out.println("파일에 추가할 내용을 입력하시오 : ");
			while(true) {
				memo = sc.nextLine();
				
				if(memo.equalsIgnoreCase("exit")) {					
					break;
				}else {
					sb.append(memo);
					sb.append("\n");
				}
			}
			System.out.println("변경된 내용을 파일에 추가하시겠습니까? (y/n)");
			String answer = sc.nextLine();
			if(answer.equalsIgnoreCase("y")) {
				bw.write(sb.toString()); // BufferedWriter에 sb에 내용을 담은 내용을 쓴다
				System.out.println(memoName + ".txt 파일의 내용이 변경되었습니다.");
			}else {
				System.out.println("메뉴로 돌아갑니다.");
			}
			
			
		}catch(FileNotFoundException e) {
			e.printStackTrace();
		}catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			
			try {
				br.close();
				bw.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

}
