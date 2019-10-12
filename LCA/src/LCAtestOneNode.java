import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class LCAtestOneNode {

/*Tree: 
 *                  5
 * 	               / \
 */
	
	@Test
	void testOneNode() {
		BST bst = new BST();
		bst.insert(5);
		Node lca = bst.findLCA(5, 4);
		assertNull(lca, "Should be null.");
	}

}
