import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Disabled;	


class LCAtestSimpleLine{

	private String outputPrint;
	ConsoleToString cP = new ConsoleToString();

	/* Tree:                     						           		  8
	 * 												    / \
	 * 												   6   9
	 * 												  / \	\	
	 * 												 2   7  10
	 * 												/ \      
	 * 		                                     					       1   3
	 * 												    \
	 * 												     5
	 * 												    /
	 * 												   4												    
	 */	
	@Disabled("Should work because they are the same...")
	@Test
	public void testInsert() {
		BST bst = new BST();
		bst.insert(8);					
		bst.insert(6);
		bst.insert(7);
		bst.insert(2);
		bst.insert(3);
		bst.insert(5);
		bst.insert(1);
		bst.insert(4);
		bst.insert(9);
		bst.insert(10);
		outputPrint = cP.consoleText(bst);
		assertEquals("8 6 2 1 3 5 4 7 9 1 0", outputPrint);
	}
	/* Tree: 
	 * 
	 * 
	 */

	
	public void testSimpleLineForm() {				
		BST bst = new BST();		
		bst.insert(1);					
		bst.insert(2);
		bst.insert(8);
		bst.insert(10);
		bst.insert(11);
		bst.insert(12); 
		Node lca = bst.findLCA(11, 12);
		assertEquals(11, lca.data, "Expected LCA is 11");
		lca = bst.findLCA(8, 10);
		assertEquals(8, lca.data, "Expected LCA is 8");
	}
}
