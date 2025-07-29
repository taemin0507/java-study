wpackage homework;

public class HomeWork08 {

	public static void main(String[] args) {
		String[] menu = { "Burger", "Pizza", "Pasta" };
		String[] add = { "Salad", "Soup" };

		String[] newmenu = new String[menu.length + add.length];

		for (int i = 0; i < menu.length; i++) {
			newmenu[i] = menu[i];
		}

		for (int i = 0; i < add.length; i++) {
			newmenu[menu.length + i] = add[i];
		}

		System.out.print("어제 메뉴판: ");
		for (String x : menu) {
			System.out.print(x + " ");
		}
		System.out.print("\n오늘 메뉴판: ");
		for (String x : newmenu) {
			System.out.print(x + " ");
		}

	}

}
