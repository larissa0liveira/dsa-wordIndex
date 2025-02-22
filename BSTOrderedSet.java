import java.util.Iterator;
import java.util.StringJoiner;

/**
 * Um conjunto ordernado implementado com uma árvore de pesquisa binária
 * 
 * @author Larissa Oliveira FC59830
 *
 * @param <Key> As chaves deste conjunto ordenado
 */
public class BSTOrderedSet<Key extends Comparable<Key>> implements OrderedSet<Key> {
	
	private BST<Key, String> set; //a string passada como valor é sempre ignorada
	
	public BSTOrderedSet() {
		this.set = new BST<Key, String>();
	}

	@Override
	public Iterator<Key> iterator() {
		return set.iterator();
	}

	/**
	 * Complexidade temporal: O(1)
	 * Justificação: mesma complexidade temporal (no pior caso) do método 
	 * {@code size()} da classe {@code BST}
	 */
	@Override
	public int size() {
		return set.size();
	}

	/**
	 * Complexidade temporal: O(n)
	 * Justificação: mesma complexidade temporal (no pior caso) do método 
	 * {@code contains()} da classe {@code BST}
	 */
	@Override
	public boolean contains(Key key) {
		return set.contains(key);
	}

	/**
	 * Complexidade temporal: O(n)
	 * Justificação: mesma complexidade temporal (no pior caso) do método 
	 * {@code put()} da classe {@code BST} 
	 */
	@Override
	public void put(Key key) {
		set.put(key, "a");
	}

	/**
	 * Complexidade temporal: O(n)
	 * Justificação: mesma complexidade temporal (no pior caso) do método 
	 * {@code delete()} da classe {@code BST}
	 */
	@Override
	public void delete(Key key) {
		set.delete(key);
	}

	/**
	 * Complexidade temporal: O(n)
	 * Justificação: mesma complexidade temporal (no pior caso) do método 
	 * {@code min()} da classe {@code BST}
	 */
	@Override
	public Key min() {
		return set.min();
	}
	
	/**
	 * Complexidade temporal: O(n)
	 * Justificação: o método itera sobre cada elemento nesse conjunto, pelo 
	 * que corre em O(n)
	 */
	public String toString() {
		StringJoiner sj = new StringJoiner(", ", "{", "}");
		for(Key key : set) {
			sj.add(key.toString());
		}
		return sj.toString();
	}
}
