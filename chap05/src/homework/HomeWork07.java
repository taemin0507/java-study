wpackage homework;

public class HomeWork07 {

	public static void main(String[] args) {

		String[] report = { "Introduction", "Research", "Conclusion" };

		String[] copiedReport = new String[report.length];
		for (int i = 0; i < report.length; i++) {
			copiedReport[i] = report[i];
		}

		copiedReport[0] = "Team Feedback";

		System.out.print("원본 보고서: ");
		for (String x : report) {
			System.out.print(x + " ");
		}
		System.out.println();

		System.out.print("복사된 보고서: ");
		for (String x : copiedReport) {
			System.out.print(x + " ");
		}
	}
}
