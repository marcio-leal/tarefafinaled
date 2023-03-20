package main;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Scanner;
import java.util.TreeSet;
import java.util.regex.Pattern;
import java.time.Duration;
import com.google.common.base.*;

public class TarefaFinalEDSet {

	public static void main(String[] args) throws FileNotFoundException, IOException {
		
		File arquivo = new File("/Users/claud/Downloads/leipzig100k.txt"); //adapta pro caminho do arquivo no seu computador
		Path path = Paths.get("/Users/claud/Downloads/leipzig100k.txt");
		String[] Palavras = new String[]{"Lisbon", "NASA", "Kyunghee", "Konkuk", "Sogang", "momentarily", "rubella", "vaccinations", "government", "Authorities"};
		List<String> texto = Files.readAllLines(path);
		ArrayList<String> textoP = new ArrayList<String>();

		String[] ArrayString = new String[100];
		for(String x : texto) {
			ArrayString = x.split("\\s");
			for(String y : ArrayString) {
				System.out.println(textoP.size());
				textoP.add(y);
			}
		}
		
 
		HashSet HashSetST = new HashSet();
		Stopwatch relogio1 = Stopwatch.createStarted();
		for(String x : textoP) {
			HashSetST.add(x);
		}
		relogio1.stop();
		Duration duration1 = relogio1.elapsed();
		
		LinkedHashSet LinkedHashSetST = new LinkedHashSet();
		Stopwatch relogio2 = Stopwatch.createStarted();
		for(String x : textoP) {
			LinkedHashSetST.add(x);
		}
		relogio2.stop();
		Duration duration2 = relogio2.elapsed();
		
		TreeSet TreeSetST = new TreeSet();
		Stopwatch relogio3 = Stopwatch.createStarted();
		for(String x : textoP) {
			TreeSetST.add(x);
		}
		relogio3.stop();
		Duration duration3 = relogio3.elapsed();
		
	System.out.println(duration1.getNano() + "ns demorados pra depositar as palavras na classe HashSet");
        Stopwatch relogio4 = Stopwatch.createStarted();
        for(String x : Palavras){
            boolean bla = HashSetST.contains(x);
        }
        relogio4.stop();
        System.out.println("Demorou " + (relogio4.elapsed()).getNano() + "ns para achar as 10 palavras no HashSet");
        
        System.out.println(duration2.getNano() + "ns demorados pra depositar as palavras na classe LinkedHashSet");
        Stopwatch relogio5 = Stopwatch.createStarted();
        for(String x : Palavras){
            boolean bla = LinkedHashSetST.contains(x);
        }
        relogio5.stop();
        System.out.println("Demorou " + (relogio5.elapsed()).getNano() + "ns para achar as 10 palavras no LinkedHashSet");

        System.out.println(duration3.getNano() + "ns demorados pra depositar as palavras na classe TreeSet");
        Stopwatch relogio6 = Stopwatch.createStarted();
        for(String x : Palavras){
            boolean bla = TreeSetST.contains(x);
        }
        relogio6.stop();
        System.out.println("Demorou " + (relogio6.elapsed()).getNano() + "ns para achar as 10 palavras no TreeSet");
	}

}
