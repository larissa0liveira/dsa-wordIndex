import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 * Classe executável para testar as classes {@code BST} e {@code STOrderedSet}
 * 
 * @author Larissa Oliveira FC59830
 *
 */
public class RunBST {
	
	public static void main ( String [] args ) throws FileNotFoundException {
		Scanner sc = new Scanner (new File("tabacaria.txt"));
		BST<String, OrderedSet<Integer>> st = construirIndice(sc, 4);
		System.out.println(st.maiores("taba"));
		sc.close();
	}

	public static BST<String,OrderedSet<Integer>> construirIndice(Scanner sc, int minLetras) {
		
		BST<String,OrderedSet<Integer>> indice = new BST<String,OrderedSet<Integer>>();
		Integer line = 0;
		
		while(sc.hasNextLine()) {
			line++;
			
			String thisLine = sc.nextLine();
			Scanner scan = new Scanner(thisLine);
			scan.useDelimiter("\\s|\\.|,|;|:|-|\\?|\\!|\\(|\\)");
			
			while(scan.hasNext()) {
				String word = scan.next();
				
				if(word.length() >= minLetras)
					if(!indice.contains(word)) {
						OrderedSet<Integer> nrLines = new BSTOrderedSet<Integer>();
						nrLines.put(line);
						indice.put(word, nrLines);
					}else 
						indice.get(word).put(line);
			}
			scan.close();
		}
		return indice;
	}
}
