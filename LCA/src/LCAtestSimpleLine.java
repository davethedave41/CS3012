import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class LCAtestSimpleLine{
	
	/* Tree: 
	 *                    1
	 *                     \
	 *                      2
	 *                       \
	 *                        8
	 *                         \
	 *                          10
	 *                           \
	 *                            11
	 *                             \
	 *                              12
	 */

	@Test
	public void testRightLeaning() {				
		BST bst = new BST();		
		bst.insert(1);					
		bst.insert(2);
		bst.insert(8);
		bst.insert(10);
		bst.insert(11);
		bst.insert(12); 
		Node lca = bst.findLCA(11, 12);
		assertEquals(11, lca.data, "Expected LCA is 11");
	}
	/* Tree:  
	 *                                12  
	 *                                /
	 *                              11
	 *                              /
	 *                            10
	 *                            /
	 *                           8
	 *                          /
	 *                         2
	 *                        /
	 *                       1   
	 */

	@Test
	public void testLeftLeaning() {				
		BST bst = new BST();		
		bst.insert(12);					
		bst.insert(11);
		bst.insert(10);
		bst.insert(8);
		bst.insert(2);
		bst.insert(1); 
		Node lca = bst.findLCA(1, 8);
		assertEquals(8, lca.data, "Expected LCA is 8");
	}
}
