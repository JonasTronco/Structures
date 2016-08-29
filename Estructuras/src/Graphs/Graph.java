package graphs;

/**
 * 
 * @author Wilson Soto
 * @since 20.06.16
 *
 */
public interface Graph {

	/**
	 * 
	 * @param n number maximum of vertices
	 */
	public void insertVertex(int n);
	
	/**
	 * 
	 * @param v index vertex
	 */
	public void deleteVertex(int v);
	
	/**
	 * 
	 * @param i source vertex
	 * @param j target vertex
	 */
	public void insertEdge(int i, int j);
	
	/**
	 * 
	 * @param i source vertex
	 * @param j target vertex
	 */
	public void deleteEdge(int i, int j);
	
	/**
	 * There are or there are not edges
	 */
	public boolean isEmpty();
	
	/**
	 * 
	 * @param i source vertex
	 * @param j target vertex
	 */
	public boolean existEdge(int i, int j);

	/**
	 * 
	 * @param i index vertex
	 */
	public int degreeIn(int i);

	/**
	 * 
	 * @param i index vertex
	 */
	public int degreeOut(int i);

	/**
	 * 
	 * @param i index vertex
	 */
	public int incidence (int i);

	/**
	 * Number of edges
	 */
	public int size();
		
}
