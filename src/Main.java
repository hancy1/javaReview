import java.util.Scanner;

public class Main {
	
	public static int[] stack; 
	public static int size = 0;

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		StringBuilder sb = new StringBuilder();
		
		
		// TODO Auto-generated method stub

		/*push X: 정수 X를 스택에 넣는 연산이다.
		pop: 스택에서 가장 위에 있는 정수를 빼고, 그 수를 출력한다. 만약 스택에 들어있는 정수가 없는 경우에는 -1을 출력한다.
		size: 스택에 들어있는 정수의 개수를 출력한다.
		empty: 스택이 비어있으면 1, 아니면 0을 출력한다.
		top: 스택의 가장 위에 있는 정수를 출력한다. 만약 스택에 들어있는 정수가 없는 경우에는 -1을 출력한다.*/
		
		int N = sc.nextInt();
		
		stack = new int [N];
								   //첫째 줄에 주어지는 명령의 수 N (1 ≤ N ≤ 10,000)이 주어진다. 
								   //둘째 줄부터 N개의 줄에는 명령이 하나씩 주어진다. 주어지는 정수는 1보다 크거나 같고, 100,000보다 작거나 같다. 문제에 나와있지 않은 명령이 주어지는 경우는 없다.
		for(int i = 0; i < N; i++) {
			
			String str = sc.next();
			
			switch(str) {
			case "push" : push(sc.nextInt());
			break;
			case "pop" : sb.append(pop()).append('\n');
			break;
			case "size" : sb.append(size()).append('\n');
			break;
			case "empry" : sb.append(empty()).append('\n');
			break;
			case "top" : sb.append(top()).append('\n');
			break;
			}
		}
		
		System.out.println(sb);
		
	}
	
		public static void push(int item) { //push X: 정수 X를 스택에 넣는 연산이다.
			stack [size] = item; // size 칸에 item을 넣고 size를 1 증가
			size++;
		}
		
		public static int pop() { //스택에서 가장 위에 있는 정수를 빼고, 그 수를 출력한다. 만약 스택에 들어있는 정수가 없는 경우에는 -1을 출력한다.
			if(size == 0) {
				return -1;
			}
			// 인덱스는 0부터 시작하므로 최상단에 있는 요소는 항상 size-1 index에 위치한다.
			else {
				int res = stack[size - 1];
				stack[size - 1] = 0; // 0으로 초기화 해준다.
				size--;
				return res;
			}
		}
		
		public static int size () { //스택에 들어있는 정수의 개수를 출력한다.
			return size; // 요소 개수를 반환
		}
		
		public static int empty() { //스택이 비어있으면 1, 아니면 0을 출력한다.
			if(size == 0) {
				return 1;
			}else {
				return 0;
			}
		}
		
		public static int top() { //스택의 가장 위에 있는 정수를 출력한다. 만약 스택에 들어있는 정수가 없는 경우에는 -1을 출력한다.
			if(size == 0) {
				return -1;
			}
			// 인텍스는 0부터 시작하므로 최상단에 있는 요소는 항상 size-1 index에 위치한다.
			else {
				return stack[size - 1];
			}
		}
	}


