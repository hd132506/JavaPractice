package thread;

import java.util.Random;

public class Runner2 implements Runnable{
	private String name;
	public Runner2() {	
	}
	/**
	 * @param name
	 */
	public Runner2(String name) {
		super();
		this.name = name;
	}
	
	public void run() {
		System.out.println(name + " 출발");
		for(int i = 100; i >=0; i-=10) {
			int term = new Random().nextInt(000);
			try {
				Thread.sleep(term);
			} catch (InterruptedException e) {
				// TODO 자동 생성된 catch 블록
				e.printStackTrace();
			}
			System.out.println(name + " " + i + " 미터");
		}
		System.out.println(name + " 골인");
		
	}
}
