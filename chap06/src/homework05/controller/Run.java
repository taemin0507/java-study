package homework05.controller;

import homework05.model.vo.Member;

public class Run {
	public static void main(String[] args) {
		
		Member men = new Member();
		
		men.changName("이태민");
		men.printName();
		
	}
}
