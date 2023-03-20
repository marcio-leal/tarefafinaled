/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.openjfx.tarefafinaled;

import com.google.common.base.Stopwatch;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.time.Duration;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.TreeMap;

/**
 *
 * @author Usuario
 */
public class TarefaFinalEDMaps {
    public static void main(String[] args) throws FileNotFoundException, IOException {
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
		
	HashMap<Integer, String> HashMapST = new HashMap();
	Stopwatch relogio1 = Stopwatch.createStarted();
            for(String x : textoP) {
                    HashMapST.put(0, x);
            }
	relogio1.stop();
	Duration duration1 = relogio1.elapsed();
		
	LinkedHashMap<Integer, String> LinkedHashMapST = new LinkedHashMap();
	Stopwatch relogio2 = Stopwatch.createStarted();
        for(String x : textoP) {
            LinkedHashMapST.put(0, x);
            }
	relogio2.stop();
	Duration duration2 = relogio2.elapsed();
		
	TreeMap<Integer, String> TreeMapST = new TreeMap();
	Stopwatch relogio3 = Stopwatch.createStarted();
	for(String x : textoP) {
		TreeMapST.put(0, x);
	}
	relogio3.stop();
	Duration duration3 = relogio3.elapsed();
		
	System.out.println("Tempo demorado " + duration1.getNano());
	System.out.println("Tempo demorado " + duration2.getNano());
	System.out.println("Tempo demorado " + duration3.getNano());
	}
}
