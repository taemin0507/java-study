package homework01.model.vo;

public class Employee {
	public String name;
	public String team;
	
	String postion;
	int salary;
	
	private int bonus;

	public Employee(String name, String team) {
		this.name = name;
		this.team = team;
	}
	
	public int getBonus() {
		return bonus;
	}

	public void setBouse(int bouse) {
		this.bonus = bouse;
	}
	
	
	public void getInfo() {
		System.out.println("이름: " + name + ", 팀: " + team);
	}
	
	
	
	
}
