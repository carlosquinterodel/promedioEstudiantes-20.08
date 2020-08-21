package promedioEstudiante;

public class Estudiante {
	String nombre;
	float valor;
	
	
	
	public Estudiante(String nombre, float valor) {
		this.nombre = nombre;
		this.valor = valor;
	}



	public void diferencia(Estudiante estudiante[], int ocupacion) {
		float acum = 0;
		float promedio = 0;
		float diferencia = 0;
		Estudiante mayor = estudiante [0];
		for (int i = 0; i < ocupacion; i++) {
			acum = acum + estudiante[i].valor;
			if (estudiante[i].valor > mayor.valor) {
				mayor = estudiante[i];
			}
			System.out.println ("Nombre: "+estudiante[i].nombre+"   "+"Valor: "+estudiante[i].valor);
			
		}
		promedio = acum / ocupacion;
		System.out.println (promedio);
		
		diferencia = mayor.valor - promedio;
		System.out.println ("La diferencia entre el mayor valor y el promedio es "+diferencia);
		
	}

}
