package promedioEstudiante;

public class main {

	public static void main(String[] args) {
		
		Estudiante e1 = new Estudiante("Carlos", 200000);
		Estudiante e2 = new Estudiante("Sara", 170000);
		Estudiante e3 = new Estudiante("Luciana", 450000);
		Estudiante e4 = new Estudiante("Natalia", 80000);
		
		int capacidad = 10;
		int ocupacion = 4;
		
		Estudiante estudiantes [] = new Estudiante [capacidad];
		
		//llena array
		estudiantes[0] = e1;
		estudiantes[1] = e2;
		estudiantes[2] = e3;
		estudiantes[3] = e4;
		
		//Se llama al metodo de operaciones
		e1.diferencia(estudiantes, ocupacion);

	}

}
