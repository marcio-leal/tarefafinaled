/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */
package org.openjfx.tarefafinaled;

import com.google.common.base.Stopwatch;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.time.Duration;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.TreeMap;
import java.util.Vector;

/**
 *
 * @author Usuario
 */
public class TarefaFinalEDLists {

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) throws IOException {
         //importa o arquivo
        File arquivo = new File("/Users/Usuario/Downloads/leipzig100k.txt"); //adapta pro caminho do arquivo no seu computador
        Path path = Paths.get("/Users/Usuario/Downloads/leipzig100k.txt");
		
        //cria três listas, uma para cada método
	List<String> texto = Files.readAllLines(path);
	ArrayList<String> textoP = new ArrayList<String>();
		
        //separa as listas, que estão em formato 1 string - 1 linha para formato 1 string - 1 palavra
	String[] ArrayString = new String[100];
            for(String x : texto) {
		ArrayString = x.split("\\s");
		for(String y : ArrayString) {
			System.out.println(textoP.size());
			textoP.add(y);
		}
	}
		
	Vector<String> VectorST = new Vector();
	Stopwatch relogio1 = Stopwatch.createStarted();
            for(String x : textoP) {
                    VectorST.add(x);
            }
	relogio1.stop();
	Duration duration1 = relogio1.elapsed();
		
	LinkedList<String> LinkedListST = new LinkedList();
	Stopwatch relogio2 = Stopwatch.createStarted();
        for(String x : textoP) {
            LinkedListST.add(x);
            }
	relogio2.stop();
	Duration duration2 = relogio2.elapsed();
		
	ArrayList<String> ArrayListST = new ArrayList();
	Stopwatch relogio3 = Stopwatch.createStarted();
	for(String x : textoP) {
		ArrayListST.add(0, x);
	}
	relogio3.stop();
	Duration duration3 = relogio3.elapsed();
		
	System.out.println("Tempo demorado " + duration1.getNano());
	System.out.println("Tempo demorado " + duration2.getNano());
	System.out.println("Tempo demorado " + duration3.getNano());
	}
    }
}
