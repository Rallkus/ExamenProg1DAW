package examen;

public class Examen {
	public static void Exer1() {
		String cad = "";
		int num = 0;
		int iterations = 0;
		int divisors = 0;
		int sum = 0;
		iterations = Functions.askinteger("Introdueix el nombre de voltes que vols que es repeteixca el programa",
				"Nombre de voltes");
		for (int i = 0; i < iterations; i++) {
			num = Functions.askinteger("Introdueix un nombre", "Nombre");
			for (int j = 1; j <= num; j++) {
				divisors = num % j;
				if ((divisors == 0) && (j % 2 == 0)) {
					sum += j;
				}
			}
			cad += "La suma dels divisors pars de " + num + " �s " + sum + "\n";
			sum = 0;
		}
		Functions.print(cad, "Resultat");

	}

	public static void Exer2() {
		int num = 0;
		int highest_digit = 0;
		int lowest_digit = 9;
		int aux = 0;
		String cad = "";
		do {
			num = Functions.askinteger("Introdueix un nombre, si vols acabar introdueix -5", "Nombre");
			aux = num;

			if (aux == -5)
				continue;
			if (aux == 0)
				Functions.print("El 0 no t� d�gits", "0");
			cad += "El d�git major de " + num;
			lowest_digit = 9;
			highest_digit = 0;
			while (num != 0) {
				aux = num % 10;
				num = num / 10;
				if (aux > highest_digit)
					highest_digit = aux;
				if (aux < lowest_digit)
					lowest_digit = aux;
			}
			cad += " �s " + highest_digit + " i el d�git menor �s " + lowest_digit + "\n";
		} while (aux != -5);
		Functions.print(cad, "Resultat");
	}

	public static void Exer3() {
		String cad = "";
		int num = 0;
		int cont = 0;
		int pos = 0;
		int digit = 0;
		do {
			num = Functions.askinteger("Introdueix un nombre", "Nombre");
			pos = Functions.askinteger("Introdueix quina posici�n de " + num + " vols saber", "Posici�");
			if (num % 10 == 1)
				cont++;
			digit = (int) (num / (Math.pow(10, pos - 1))) % 10;
			cad += "El d�git que ocupa la posici� " + pos + " del nombre " + num + " �s " + digit
					+ ((num % 10 == 1) ? ", el primer d�git es un 1 \n" : ", el primer d�git no �s un 1 \n");
		} while (cont != 3);
		Functions.print(cad, "Resultat");
	}
}
