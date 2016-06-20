package graphs;

public interface Graph {

	public void insertVertex(int n);
	
	public void deleteVertex(int v);
	
	public void insertEdge(int i, int j);
	
	public void deleteEdge(int i, int j);
	
	public boolean isEmpty();
	
	public boolean existEdge(int i, int j);
	
	public int degreeIn(int i);
	
	public int degreeOut(int i);
	
	public int incidence (int i);
	
	public int size();
		
}
