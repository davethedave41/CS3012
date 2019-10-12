import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class LCAtestEmpty {

	@Test
	void testEmpty() {
		BST bst = new BST();
		Node lca = bst.findLCA(5, 6);		//these values don't exist in the empty tree
		assertNull(lca, "Should be null because the tree is empty");
	}

}
