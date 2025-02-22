
/**
 * Interface para um conjunto ordernado de chaves comparáveis {@code Key}.
 * 
 * @author Larissa Oliveira FC59830
 *
 * @param <Key>  As chaves deste conjunto ordenado
 */
public interface OrderedSet<Key extends Comparable<Key>> extends Iterable<Key> {
	
	/**
	 * Retorna o número de chaves nesse conjunto
	 * 
	 * @return o número de chaves nesse conjunto
	 */
	public int size();
	
	/**
	 * Esse conjunto contém a chave especificada?
	 * 
	 * @param key a chave
	 * @return true se a chave estiver no conjunto e false caso contrário
	 * @requires {@code key != null}
	 */
	public boolean contains(Key key);
	
	/**
	 * Insere a chave especificada no conjunto
	 * 
	 * @param key a chave
	 * @requires {@code key != null}
	 */
	public void put(Key key);
	
	/**
	 * Deleta a chave especificada do conjunto.
	 * 
	 * @param key a chave
	 * @requires {@code key != null}
	 */
	public void delete(Key key);
	
	/**
	 * Retorna a menor chave contida no conjunto
	 * 
	 * @return a menor chave contida no conjunto
	 * @requires {@code !this.isEmpty()}
	 */
	public Key min();
	
	/**
	 * Este conjunto está vazio?
	 * 
	 * @return true se o conjunto estiver vazio e false caso contrário
	 */
	public default boolean isEmpty(){
		return size() == 0;
	}
	
}
