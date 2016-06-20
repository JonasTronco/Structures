package diagnose;

import static org.junit.Assert.*;
import org.junit.Test;

public class Test_Functions {

	Functions functions_Tail_Recursion = new Tail_Recursion();
	Functions functions_Simple_Recursion = new Simple_Recursion();
	
	
	@Test
	public void test1() {

		assertEquals(120, functions_Simple_Recursion.factorial(5));
		assertEquals(64.0, functions_Simple_Recursion.power(4, 3), 1.0);
		assertEquals(0.4794, functions_Simple_Recursion.sin_x(0.5), 0.001);
		assertEquals(0.8414, functions_Simple_Recursion.sin_x(1.0), 0.001);
		assertEquals(-0.9974, functions_Simple_Recursion.sin_x(-1.5), 0.001);
		
	}
	
	
	@Test
	public void test2() {

		assertEquals(120, functions_Tail_Recursion.factorial(5));
		assertEquals(64.0, functions_Tail_Recursion.power(4, 3), 0.0);
		assertEquals(0.4794, functions_Tail_Recursion.sin_x(0.5), 0.001);
		assertEquals(0.8414, functions_Tail_Recursion.sin_x(1.0), 0.001);
		assertEquals(-0.9974, functions_Tail_Recursion.sin_x(-1.5), 0.001);
		
	}

}
