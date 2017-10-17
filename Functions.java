package examen;

import javax.swing.JOptionPane;

public class Functions {
	//This is the functions class
		//This asks for an integer
		
		public static int askinteger(String message, String title) {
			String string = "";
			int asdasdas = 0;
			boolean a = false;

			do {
				try {
					string = JOptionPane.showInputDialog(null, message, title, JOptionPane.QUESTION_MESSAGE);
					if (string == null)
						string = "b";
					asdasdas = Integer.parseInt(string);
					a = true;
				} catch (Exception e) {
					JOptionPane.showMessageDialog(null, "You haven't introduced a number", "Error",
							JOptionPane.ERROR_MESSAGE);
					a = false;
				}
			} while (a == false);

			return asdasdas;
		}

		// This is the menu
		public static int menubuttons(String[] options, String message, String title) {
			int option = 0;

			option = JOptionPane.showOptionDialog(null, message, title, JOptionPane.YES_NO_OPTION,
					JOptionPane.QUESTION_MESSAGE, null, options, options[0]);

			return option;

		}

		// Function show string
		public static void print(String message, String title) {
			JOptionPane.showMessageDialog(null, message, title, JOptionPane.INFORMATION_MESSAGE);
		}



		// This shows the dividers of a number and the sum of his pair digits
		public static String dividers(int a) {
			String chain = "";
			chain = "The divider" + ((a == 1) ? "" : "s") + " of " + a + ((a == 1) ? " is: " : " are: ") + "\n" + chain;
			int sum = 0;
			int i = 1;
			while (a >= i) {
				if (a % i == 0) {
					chain = chain + i + "\n";
					if (i % 2 == 0)
						sum = sum + i;
				}
				if (a % 2 == 0)
					i++;
				else// if "a" can't be divided by 2 it won't be able to be divided
					// by his multiplies so there is no point on try the pair
					// numbers
					i = i + 2;
			}
			chain = chain + "The sum of the his pair dividers are: " + sum;
			return chain;
		}

		// Does the sum of the pair dividers
		public static int dividersSum(int a) {
			int i = 1;
			String chain = "";
			int sum = 0;
			while (a >= i) {
				if (a % i == 0) {
					chain = chain + i + "\n";
					if (i % 2 == 0)
						sum = sum + i;
				}
				if (a % 2 == 0)
					i++;
				else// if "a" can't be divided by 2 it won't be able to be divided
					// by his multiplies so there is no point on trying the pair
					// numbers
					i = i + 2;
			}
			return sum;
		}
}
