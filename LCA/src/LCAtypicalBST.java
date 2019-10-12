import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class LCAtypicalBST {
	
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
}
