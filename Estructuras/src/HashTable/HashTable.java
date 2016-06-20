package HashTable;

 public class HashTable {

    // data members of HashTable
    protected int divisor; // hash function divisor
    protected HashEntry[] table; // hash table array
    protected int size; // number of elements in table

    // constructors
    private HashTable(int theDivisor) {
         divisor = theDivisor;
         // allocate hash table array
         table = new HashEntry[divisor];
    }

    protected static class HashEntry {
        // data members
        protected Object key;
        protected Object element;
            
        private HashEntry(Object theKey, Object theElement) {
            key = theKey;
            element = theElement;
        }
    }

    public boolean isEmpty() {
        return size == 0;
    }

    /**
     * search an open addressed hash table for an element with key theKey
     *
     * @return location of matching element if found, otherwise return location
     * where an element with key theKey may be inserted provided the hash table
     * is not full
     */
    private int search(Object theKey, int op) {
        int i = Math.abs(theKey.hashCode()) % divisor;
        int j = i; // start at home bucket
        do {
            if (op==1 && table[j]==null) { //find bucket null insertion
                return j;
            }
            if (op==2 && table[j]!=null) { //find key get and remove
                if (table[j].key.equals(theKey)) {
                    return j;   
                }
            }
            j = (j + 1) % divisor; // next bucket
        } while (j != i);
        // returned to home bucket?
        return j; // table full
    }

    public Object remove(Object theKey) {
        int b = search(theKey,2);
        if (table[b]!=null) {
            Object Element = table[b].element;
            // see if a match was found at table[b]
            if (table[b].key.equals(theKey)) {
                table[b] = null;
                size--;
                return Element;
            }            
        }
        return null;
    }

    /**
     * @return element with specified key
     * @return null if no matching element
     */
    public Object get(Object theKey) {
    // search the table
        int b = search(theKey,2);
    // see if a match was found at table[b]
        if (table[b] == null || !table[b].key.equals(theKey)) {
            return null;
        }
    // no match
        return table[b].element; // matching element
    }

    /**
     * insert an element with the specified key overwrite old element if there
     * is already an element with the given key
     *
     * @throws IllegalArgumentException when full
     * @return old element (if any) with key theKey
     */
    public Object put(Object theKey, Object theElement) {
    // search the table for a matching element
        int b = search(theKey,1);
    // check if matching element found
        if (table[b] == null) {
            table[b] = new HashEntry(theKey, theElement);
            size++;
            return null;
        } else { // check if duplicate or table full
            if (table[b].key.equals(theKey)) { // duplicate, change table[b].element
                Object elementToReturn = table[b].element;
                table[b].element = theElement;
                return elementToReturn;
            } else // table is full
            {
                throw new IllegalArgumentException("full table");
            }
        }
    }

     /**
      * output the hash table
      */
     public String toString() {
         StringBuffer s=new StringBuffer("");
         for (int i = 0; i < divisor; i++) {
             if (table[i] == null) {
                 s.append("null\n");
             } else {
                 s.append(Math.abs(table[i].key.hashCode())+" "+table[i].element+"\n");
             }
         }
         return new String(s);
     }
     
    /**
     * test method
     */
    public static void main(String[] args) {
        
        HashTable x = new HashTable(8);
        x.put(41, 'b');
        x.put(65, 'c');        
        x.put(73, 'd');
        x.put(88, 'e');
        x.put(49, 'f');
        x.put(9,  'g');
        x.put(25, 'h');
        x.put(49, 'a');
        System.out.println(x);
        x.remove(41);
        x.remove(65);
        x.remove(73);
        x.put(75, 'a');
        
        System.out.println(new Integer('w')+" "+new Integer('i'));
        System.out.println(((22*88+44)%23)%8);
        
        System.out.println(x);
        
    }
}