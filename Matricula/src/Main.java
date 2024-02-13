import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Main {
	public static void main(String[] args) {
		
		String fileName1 = "alumnos.txt";
		String fileName2 = "modulos.txt";
		String fileName3 = "modulo_alumno.txt";
		
		
		
		fileName1 = "alumnos.txt";
		System.out.println("La informacion de los alumnos: ");

        try(BufferedReader reader = new BufferedReader(new FileReader(fileName1))){
            String line;
            while ((line = reader.readLine()) != null) {
                String[] fields = line.split("&");
                Alumno alumno = new Alumno(fields[0], fields[1], fields[2], fields[3], fields[4], fields[5], fields[6]);
                alumno.mostrar();
              
                System.out.println();
            }
        }catch (IOException e){
            e.printStackTrace();
        } 
        
        fileName2 = "modulos.txt";
        System.out.println("Los diferentes modulos:");

        try(BufferedReader reader = new BufferedReader(new FileReader(fileName2))){
            String line;
            while ((line = reader.readLine()) != null) {
                String[] fields = line.split("&");
                Modulo modulo = new Modulo(fields[0], fields[1], fields[2], fields[3], fields[4]);
                System.out.println();
            }
        }catch (IOException e){
            e.printStackTrace();
        } 
        
        fileName3 = "modulo_alumno.txt";
        System.out.print("La relación de módulos con alumnos: ");

        try(BufferedReader reader = new BufferedReader(new FileReader(fileName3))){
            String line;
            while ((line = reader.readLine()) != null) {
                String[] fields = line.split(",");
                System.out.println("Modulo: " + fields[0] + " Alumno: " + fields[1]);
            }
        }catch (IOException e){
            e.printStackTrace();
        } 
	}
}
