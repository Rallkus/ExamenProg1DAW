package examen;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] main_Menu = { "Exer1", "Exer2", "Exer3", "Eixir" };
		String[] secondary_Menu = { "", "Tornar", "Eixir" };
		int option = 0;
		int secondary_option = 0;
		do {
			option = Functions.menubuttons(main_Menu, "Elegeix què vols fer", "Menú");
			switch (option) {
			case 0:
				do {
					Examen.Exer1();
					secondary_Menu[0] = "Exer1";
					secondary_option = Functions.menubuttons(secondary_Menu, "Què vols fer?", "Dubte");
					if (secondary_option == 1) {
						break;
					} else if (secondary_option == 2 || secondary_option == -1) {
						Functions.print("Gràcies per utilitzar la meua aplicació", "Eixida");
						System.exit(0);
					}
				} while (true);
				break;
			case 1:
				do {
					Examen.Exer2();
					secondary_Menu[0] = "Exer2";
					secondary_option = Functions.menubuttons(secondary_Menu, "Què vols fer?", "Dubte");
					if (secondary_option == 1) {
						break;
					} else if (secondary_option == 2 || secondary_option == -1) {
						Functions.print("Gràcies per utilitzar la meua aplicació", "Eixida");
						System.exit(0);
					}
				} while (true);
				break;
			case 2:
				do {
					Examen.Exer3();
					secondary_Menu[0] = "Exer3";
					secondary_option = Functions.menubuttons(secondary_Menu, "Què vols fer?", "Dubte");
					if (secondary_option == 1) {
						break;
					} else if (secondary_option == 2 || secondary_option == -1) {
						Functions.print("Gràcies per utilitzar la meua aplicació", "Eixida");
						System.exit(0);
					}
				} while (true);
				break;
			default:
				Functions.print("Gràcies per utilitzar la meua aplicació", "Eixida");
				System.exit(0);
			}
		} while (true);

	}

}
