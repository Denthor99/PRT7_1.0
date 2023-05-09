package org.ieslosremedios.daw1.prog.ut7.practica7;

import org.ieslosremedios.daw1.prog.ut7.practica7.clasesParaImportar.Estudiante;
import org.ieslosremedios.daw1.prog.ut7.practica7.clasesParaImportar.OperacionesAplicacion;
import org.xml.sax.SAXException;

import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.TransformerException;
import java.io.Console;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;


public class Practica7Main extends OperacionesAplicacion {
    public static void main(String[] args) throws IOException, ParserConfigurationException, TransformerException, SAXException, ClassNotFoundException {

        //Creamos todos los alumnos de la clase
        Estudiante Pablo = new Estudiante("Pablo Mateos Palas", 5);
        Estudiante JuanMaria = new Estudiante("Juan María Mateos Ponce", 0);
        Estudiante Victor = new Estudiante("Victor Chacón Calle", 0);
        Estudiante Jorge = new Estudiante("Jorge Coronil Villalba", 9);
        Estudiante Ricardo = new Estudiante("Ricardo Gabriel Moreno Cantea", 4);
        Estudiante Adrian = new Estudiante("Adrián Merino Gamaza", 4);
        Estudiante JuanManuelH = new Estudiante("Juan Manuel Herrera Ramírez", 4);
        Estudiante DanielAlfonso = new Estudiante("Daniel Alfonso Rodríguez Santos", 5);
        Estudiante Diego = new Estudiante("Diego González Romero", 2);
        Estudiante Jonathan = new Estudiante("Jonathan León Canto", 5);
        Estudiante JuanManuelS = new Estudiante("Juan Manuel Saborido Baena", -1);
        Estudiante Julian = new Estudiante("Julian García Velázquez", 1);
        Estudiante JoseAntonio = new Estudiante("Jose Antonio Jaén Gómez", 0);
        Estudiante AntonioJesus = new Estudiante("Antonio Jesús Téllez Perdigones", 2);

        List<Estudiante> listaEstudiantes = new ArrayList<>();
        listaEstudiantes.add(Pablo);
        listaEstudiantes.add(JuanMaria);
        listaEstudiantes.add(Victor);
        listaEstudiantes.add(Jorge);
        listaEstudiantes.add(Ricardo);
        listaEstudiantes.add(Adrian);
        listaEstudiantes.add(JuanManuelH);
        listaEstudiantes.add(DanielAlfonso);
        listaEstudiantes.add(Diego);
        listaEstudiantes.add(Jonathan);
        listaEstudiantes.add(JuanManuelS);
        listaEstudiantes.add(Julian);
        listaEstudiantes.add(JoseAntonio);
        listaEstudiantes.add(AntonioJesus);

        Console consola = System.console();
        boolean exit = false;
        if (consola == null) {
            System.out.println("Esta aplicación no es compatible con un IDE, consulte con el soporte\ntécnico de Remedy SoftWorks, mucha");
        }else {
            while (!exit) {
                System.out.println("\nMENU:\n");
                System.out.println("1. Importar archivo XML");
                System.out.println("2. Exportar archivo XML");
                System.out.println("3. Seleccionar alumno menos participativo");
                System.out.println("4. Resetear participaciones");
                System.out.println("5. Salir");

                String opcion = consola.readLine("Introduce una opcion (1-5): ");

                switch (opcion) {
                    case "1":
                        String rutaImportar = consola.readLine("Introduce la ruta del archivo XML a importar: ");
                        importarXML(listaEstudiantes,rutaImportar);
                        break;
                    case "2":
                        String rutaLectura = consola.readLine("Introduce la ruta del archivo XML a exportar: ");
                        String rutaEscritura = consola.readLine("Introduce la ruta donde quieres guardar el archivo exportado: ");
                        exportarXML(rutaLectura, rutaEscritura);
                        break;
                    case "3":
                        String rutaAlumnos = consola.readLine("Introduce la ruta del archivo XML de alumnos: ");
                        System.out.println(seleccionarAlumnoMenosParticipativo(rutaAlumnos));
                        break;
                    case "4":
                        String rutaReset = consola.readLine("Introduce la ruta del archivo XML a resetear: ");
                        resetearParticipaciones(rutaReset);
                        break;
                    case "5":
                        exit = true;
                        System.out.println("Gracias por confiar en Remedy Softworks");
                        break;
                    default:
                        System.out.println("Opcion no valida");
                }
            }
        }

        //importarXML(listaEstudiantes,"src/org/ieslosremedios/daw/ud7/practica/pruebas/paraentregar/alumnos.xml");
        //exportarXML("src/org/ieslosremedios/daw/ud7/practica/pruebas/paraentregar/alumnos.xml", "src/org/ieslosremedios/daw/ud7/practica/pruebas/paraentregar/ficheroExportado.xml");
        //System.out.println(seleccionarAlumnoMenosParticipativo("src/org/ieslosremedios/daw/ud7/practica/pruebas/paraentregar/alumnos.xml"));
        //resetearParticipaciones("src/org/ieslosremedios/daw/ud7/practica/pruebas/paraentregar/alumnos.xml");

    }



}