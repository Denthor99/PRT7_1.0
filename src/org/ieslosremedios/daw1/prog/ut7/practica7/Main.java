package org.ieslosremedios.daw1.prog.ut7.practica7;

import org.xml.sax.SAXException;

import javax.xml.bind.JAXBException;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.TransformerException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;


public class Main extends OperacionesAplicacion {
    public static void main(String[] args) throws IOException, ParserConfigurationException, TransformerException, SAXException, ClassNotFoundException, JAXBException {
        Estudiante JuanManuelH = new Estudiante("Juan Manuel Herrera Ramírez", 0),
                DanielAlfonso = new Estudiante("Daniel Alfonso Rodríguez Santos", 0),
                Jonathan = new Estudiante("Jonathan León Canto", 0);

        List<Estudiante> listaEstudiantes = new ArrayList<>();
        listaEstudiantes.add(DanielAlfonso);
        listaEstudiantes.add(JuanManuelH);
        listaEstudiantes.add(Jonathan);


        exportarXML(listaEstudiantes,"src/org/ieslosremedios/daw1/prog/ut7/practica7/estudiantes.xml");
        importarXML("src/org/ieslosremedios/daw1/prog/ut7/practica7/estudiantes.xml", "src/org/ieslosremedios/daw1/prog/ut7/practica7/estudiantes2.xml");
        //TODO Aquí lo que falla es que no lee cada vez que se ejecuta el archivo XML que ya existe, por lo que no se guarda la participación
        seleccionarAleatorio(listaEstudiantes, "src/org/ieslosremedios/daw1/prog/ut7/practica7/estudiantes.xml");


    }



}