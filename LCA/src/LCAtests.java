import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class LCAtests {

	@Test
	void testEmpty() {
		BST bst = new BST();
		Node lca = bst.findLCA(5, 6);		//these values don't exist in the empty tree
		assertNull(lca, "Should be null because the tree is empty");
	}

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

	/* Tree:                                             8
	 * 												    / \
	 * 												   6   9
	 * 												  / \	\	
	 * 												 2   7  10
	 * 												/ \      
	 *                                             1   3
	 * 												    \
	 * 												     5
	 * 												    /
	 * 												   4												    
	 */	

	@Test
	void testTypicalBST1() {
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
		Node lca = bst.findLCA(10, 5);
		assertEquals(8, lca.data, "Should be 8");
	}

	@Test
	void testTypicalBST2() {
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
		Node lca = bst.findLCA(1, 4);
		assertEquals(2, lca.data, "Should be 2");
	}

	@Test
	void testTypicalBST3() {
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
		Node lca = bst.findLCA(7, 3);
		assertEquals(6, lca.data, "Should be 6");
	}
	
	@Test
	void testTypicalBSTNE() { /*test to find LCA against a tree that has one key that doesn't exist in the tree*/ 
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
		Node lca = bst.findLCA(99, 3);
		assertNull(lca, "Should be null because this key is not in the tree");
	}
	
	/* Tree:                                             8
	 * 												    / \
	 * 												   8   9
	 * 												  / \	\	
	 * 												 7   N   10
	 * 												/       
	 *                                             1   
	 *                                            / \    
	 * 											 N	 3    
	 * 												/ \
	 *                                             3   4  
	 * 												   												    
	 */	

	/*  Two of the same node in the tree, I decided to make keys
		already present in the tree be placed in the left subtree of the identical key */ 
	@Test
	void testSameKeys1() { 
		BST bst = new BST();
		bst.insert(8);					
		bst.insert(8);
		bst.insert(9);
		bst.insert(10);
		bst.insert(7);
		bst.insert(1);
		bst.insert(3);
		bst.insert(4);
		bst.insert(3);
		Node lca = bst.findLCA(1, 8);
		assertEquals(8, lca.data, "Should be 8");
	}
	
	@Test
	void testSameKeys2() { 
		BST bst = new BST();
		bst.insert(8);					
		bst.insert(8);
		bst.insert(9);
		bst.insert(10);
		bst.insert(7);
		bst.insert(1);
		bst.insert(3);
		bst.insert(4);
		bst.insert(3);
		Node lca = bst.findLCA(3, 4);
		assertEquals(3, lca.data, "Should be 3");
	}
	
	@Test
	void testSameKeys3() { 
		BST bst = new BST();
		bst.insert(8);					
		bst.insert(8);
		bst.insert(9);
		bst.insert(10);
		bst.insert(7);
		bst.insert(1);
		bst.insert(3);
		bst.insert(4);
		bst.insert(3);
		Node lca = bst.findLCA(3, 10);
		assertEquals(8, lca.data, "Should be 8");
	}
	
}
