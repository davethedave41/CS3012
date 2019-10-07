import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class LCAtests {

	/* this tree looks like:                             8
	 * 												    / \
	 * 												   6   9
	 * 												  / \	\	
	 * 												 2   7  10
	 * 												/ \      
	 * 		                                       1   3
	 * 													\
	 * 													 5
	 * 													/
	 * 												   4												    
	 */															
	
	@Test
	void findLCATest() {				
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
		assertEquals(2, lca.data);
	}
}
