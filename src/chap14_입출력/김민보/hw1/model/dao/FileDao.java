package chap14_입출력.김민보.hw1.model.dao;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class FileDao {

	Scanner sc = new Scanner(System.in);
	
	
	public void fileSave() {
		
		// TODO Auto-generated method stub
		StringBuilder sb = new StringBuilder();
		/*API chap2에 스트링버퍼에관한 공부내용 있음 */
		
		
		// “파일에 저장할 내용을 반복해서 입력하시오("exit"을 입력하면 내용 입력 끝) :”
		// 값을 Scanner로 입력 받고 해당 입력 값이 “exit”일 경우 반복문 빠져나감
		
		
		System.out.println("파일에 저장할 내용을 입력하시오(\"exit\"을 입력하면 내용 입력 끝) ");
		String memo = " ";
		
		while(true) {
			memo = sc.nextLine();
			if(memo.equalsIgnoreCase("exit")) {
				break;
			}else { // 아닐 경우 sb에 추가
				sb.append(memo);
				sb.append("\n");
			}
			
		}		
		
		// “저장하시겠습니까? (y/n)”
		// 입력 받은 값이 대문자이든 소문자이든 상관없이 “y”이면,
		
		
		System.out.println("저장 하시겠습니까?(y/n)");
		String yesno = sc.nextLine();
		
		if(yesno.equalsIgnoreCase("y")){
			System.out.println("저장할 파일명 : "); // 저장할 파일명을 입력 받음
			String subject = sc.nextLine();
			
			BufferedWriter bw = null;
			
			
			// BufferedWriter와 FileWriter 스트림 사용
			// “입력받은 파일명.txt” 파일에 해당 sb 데이터출력
			// “입력받은 파일명.txt 파일에 성공적으로 저장하였습니다.” 콘솔창 출력
			
			try {
			
				bw = new BufferedWriter(new FileWriter(subject + ".txt"));
				bw.write(sb.toString());
				System.out.println(subject + "파일(txt)을 성공적으로 저장하였습니다.");
				
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}finally{
				
				try {
					bw.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}			
			
		}else{
			
		 System.out.println("저장하지 않습니다. 메뉴로 돌아갑니다.");
		
		}
		
	}

	public void fileOpen() {
		// TODO Auto-generated method stub
		
		System.out.println("열기 할 파일명 : ");
		String open=sc.nextLine();
		
		// 파일명을 Scanner로 입력 받아, BufferedReader와 FileReader 스트림 사용
		BufferedReader br = null;
		String str = null;
		
		try {
			br = new BufferedReader(new FileReader(open+".txt"));
			
			// try구문 안에서 readLine()메소드를 통해 한줄씩 콘솔로 입력받은 값 출력
			while((str = br.readLine()) != null) {
				System.out.println(str);
			}			
			
			
			// 존재하지 않은 파일 명 입력했을 때 해당 예외처리구문이 실행됨
			// “존재하는 파일이 없습니다.”

		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block				
			
			System.out.println("존재하는 파일이 없습니다.");
	
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			// 열었던 스트림 close
			try {				
				br.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}

	public void fileEdit() {
		// TODO Auto-generated method stub
		
		BufferedReader br = null;
		BufferedWriter bw = null;
		StringBuilder sb = null;
		String str = null;
		
		
		System.out.println("수정할 파일명 : ");
		String modify = sc.nextLine();
		
		sb = new StringBuilder();
		
		try {
			br = new BufferedReader(new FileReader(modify+".txt"));
			bw = new BufferedWriter(new FileWriter(modify+".txt", true));
			
			// 반복문을 통해 해당 파일의 내용을 readLine()메소드를 통해 콘솔에 출력
			
			while((str = br.readLine()) != null) {
				System.out.println(str);
			}	
			
			// “파일에 추가할 내용을 입력하시오 : “
			// 사용자가 “exit”을 입력하기 전까지 내용을 StringBuilder에 담기

			System.out.println("파일에 추가할 내용을 입력하시오(\"exit\"을 입력하면 내용 입력 끝) ");
			
			
			while(true) {
				str = sc.nextLine();
				if(str.equalsIgnoreCase("exit")) {
					break;
				}else {
					sb.append(str);
					sb.append("\n");
				}
				
			}


			// “변경된 내용을 파일에 추가하시겠습니까? (y/n)”
			// 입력 받은 값이 대문자이든 소문자이든 상관없이 “y”이면,
			// “입력받은 파일명.txt 파일의의 내용이 변경되었습니다.”
			
			
			System.out.print("변경된 내용을 파일에 추가하시겠습니까? (y/n)");
			String yesNo = sc.nextLine();
			
			if(yesNo.equalsIgnoreCase("y")) {
				
				bw.write(sb.toString());
				System.out.println(modify + ".txt 파일의 내용이 변경되었습니다.");
				
			}else {
				
				System.out.println("다시 메뉴로 돌아갑니다.");
				
			}
			
			
			
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			
			// 열었던 스트림 close			
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