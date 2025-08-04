package homework.homework01;

public class Run {
	public static void main(String[] args) {
		String str = "김철수,25,동작구,남\n홍길동,27,관악구,남\n이영희,29,강서구,여";

		String[] lines = str.split("\n");

		for (String line : lines) {
			String[] parts = line.split(",");
			String name = parts[0];
			int age = Integer.parseInt(parts[1]);
			String address = parts[2];
			char gender = parts[3].charAt(0);

			Person person = new Person(name, age, address, gender);
			System.out.println(person.toString());
		}
	}
}
