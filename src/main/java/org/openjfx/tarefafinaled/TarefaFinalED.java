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

public class TarefaFinalED {

	public static void main(String[] args) throws FileNotFoundException, IOException {
		
		File arquivo = new File("/Users/claud/Downloads/leipzig100k.txt"); //adapta pro caminho do arquivo no seu computador
		Path path = Paths.get("/Users/claud/Downloads/leipzig100k.txt");
		
		List<String> texto = Files.readAllLines(path);
		ArrayList<String> textoP = new ArrayList<String>();
		List<String> texto2 = Files.readAllLines(path);
		ArrayList<String> texto2P = new ArrayList<String>();
		List<String> texto3 = Files.readAllLines(path);
		ArrayList<String> texto3P = new ArrayList<String>();
		
		String[] ArrayString = new String[100];
		for(String x : texto) {
			ArrayString = x.split("\\s");
			for(String y : ArrayString) {
				System.out.println(textoP.size());
				textoP.add(y);
			}
		}
		
		String[] ArrayString2 = new String[100];
		for(String x : texto2) {
			ArrayString2 = x.split("\\s");
			for(String y : ArrayString2) {
				System.out.println(texto2P.size());
				texto2P.add(y);
			}
		}
		
		String[] ArrayString3 = new String[100];
		for(String x : texto3) {
			ArrayString3 = x.split("\\s");
			for(String y : ArrayString3) {
				System.out.println(texto3P.size());
				texto3P.add(y);
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
		for(String x : texto2P) {
			LinkedHashSetST.add(x);
		}
		relogio2.stop();
		Duration duration2 = relogio2.elapsed();
		
		TreeSet TreeSetST = new TreeSet();
		Stopwatch relogio3 = Stopwatch.createStarted();
		for(String x : texto3P) {
			TreeSetST.add(x);
		}
		relogio3.stop();
		Duration duration3 = relogio3.elapsed();
		
		System.out.println("Tempo demorado " + duration1.getNano());
		System.out.println("Tempo demorado " + duration2.getNano());
		System.out.println("Tempo demorado " + duration3.getNano());
	}

}
