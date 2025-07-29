package homework01.controller;

import homework01.model.vo.Employee;

public class Run {
	public static void main(String[] args) {
		Employee myE1 = new Employee("김철수","교육운영팀");
		Employee myE2 = new Employee("이영희","경영지원팀");
		
		
		myE1.getInfo();
		myE2.getInfo();
		
	}
}
