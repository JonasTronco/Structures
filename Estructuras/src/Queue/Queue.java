package Queue;

/**
 *
 * <img src="./images/Queue1.jpg" width="100%" height="100%">
 *   
 * @author wilson soto
 * 
 */

public interface Queue
{
    /**
     * 
     * @return Object
     */
    public boolean isEmpty();
    
    /**
     * 
     * @return Object
     */
    public Object getFrontElement();
    
    /**
     * 
     * @return Object
     */
    public Object getRearElement();
    
    /**
     * 
     * @param theObject Object 
     */
    public void put(Object theObject);
    
    /**
     * 
     * @return Object
     */
    public Object remove();
}