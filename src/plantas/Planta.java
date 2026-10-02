package plantas;

public class Planta {

	private String nombre;
	private int nivelAgua;
	private int altura;
	private int salud;

	public Planta(String nombrePlanta) {
		System.out.println("Se crea a " + nombrePlanta);
		nombre = nombrePlanta;
		nivelAgua = 40;
		altura = 10;
		salud = 100;
	}

	public void regar(int litrosAgua) {
		nivelAgua = nivelAgua + 10 * litrosAgua;
		System.out.println(nombre + "Tiene " + litrosAgua + "nivel agua");
	}

	public void tomarSol(int horasSol) {
		nivelAgua = nivelAgua - 5 * horasSol;
		altura = altura + 2 * horasSol;
		salud = salud + 1 * horasSol;
		System.out.println(nombre + "");
	}

	public void fertilizarse() {
		altura = altura * 3;
		nivelAgua = nivelAgua - 5;
	}

	public void mostrarEstado() {
		System.out.println(nombre);
		System.out.println(nivelAgua);
		System.out.println(altura);
		System.out.println(salud);
	}

}
