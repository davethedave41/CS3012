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
	public void testSimpleLineForm() {				
		BST bst = new BST();		
		bst.insert(1);					
		bst.insert(2);
		bst.insert(8);
		bst.insert(10);
		bst.insert(11);
		bst.insert(12); 
		Node lca = bst.findLCA(11, 12);
		assertEquals(10, lca.data, "Expected LCA is 11");
	}
}
