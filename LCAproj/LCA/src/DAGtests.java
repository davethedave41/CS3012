import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
/* A root is identified as a node that only has outgoing edges... */
class DAGtests {

	/* DAG:             ---0---
	 *                  |     | 
	 *                  v     v
	 *                  2     1
	 *                  |     |
	 *                  v     v
	 *                  4     3
	 *                  |     |
	 *                  ---|---
	 *                     v
	 *                     5
	 *                     |
	 *                     v
	 *                     6
	 */

	@Test
	void testNE() {	//test for non-existent node 
		DAG g = new DAG(7);
		g.addEdge(0, 1); //G-0,	D-1, F-2, C-3, B-5, E-4, A-6
		g.addEdge(0, 2); 
		g.addEdge(1, 3);
		g.addEdge(2, 4);
		g.addEdge(4, 5);	
		g.addEdge(3, 5); 
		g.addEdge(5, 6); 
		int lca = g.findLCA(0, 5, 100);
		assertEquals(-1, lca, "'-1' is the value I use to represent a LCA that doesn't exist.");
	}

	@Test
	void testItself() {	//test one node for LCA 
		DAG g = new DAG(7);
		g.addEdge(0, 1); //G-0,	D-1, F-2, C-3, B-5, E-4, A-6
		g.addEdge(0, 2); 
		g.addEdge(1, 3);
		g.addEdge(2, 4);
		g.addEdge(4, 5);	
		g.addEdge(3, 5); 
		g.addEdge(5, 6); 
		int lca = g.findLCA(0, 6, 6);
		assertEquals(6, lca, "Testing the same node for LCA.");
	}

	@Test
	void testDAG1() { //test typical DAG 
		DAG g = new DAG(7);
		g.addEdge(0, 1); //G-0,	D-1, F-2, C-3, B-5, E-4, A-6
		g.addEdge(0, 2); 
		g.addEdge(1, 3);
		g.addEdge(2, 4);
		g.addEdge(4, 5);	
		g.addEdge(3, 5); 
		g.addEdge(5, 6); 
		int lca = g.findLCA(0, 3, 5);
		assertEquals(3, lca, "Should be 3.");
	}

	@Test
	void testDAG2() { //test typical DAG 
		DAG g = new DAG(7);
		g.addEdge(0, 1); //G-0,	D-1, F-2, C-3, B-5, E-4, A-6
		g.addEdge(0, 2); 
		g.addEdge(1, 3);
		g.addEdge(2, 4);
		g.addEdge(4, 5);	
		g.addEdge(3, 5); 
		g.addEdge(5, 6); 
		int lca = g.findLCA(0, 4, 3);
		assertEquals(0, lca, "Should be 0.");
	}

	@Test
	void testDAG3() { //test typical DAG 
		DAG g = new DAG(7);
		g.addEdge(0, 1); //G-0,	D-1, F-2, C-3, B-5, E-4, A-6
		g.addEdge(0, 2); 
		g.addEdge(1, 3);
		g.addEdge(2, 4);
		g.addEdge(4, 5);	
		g.addEdge(3, 5); 
		g.addEdge(5, 6); 
		int lca = g.findLCA(0, 5, 6);
		assertEquals(5, lca, "Should be 5.");
	}
	/* DAG:      0<----->1------>2     where 0 -> 4 and 4 -> 2
	 *           | \     |     / |
	 *           |   \   |   /   |
	 *           v     \ v /     v
	 *           3------>4------>5
	 */

	@Test
	void testDAG4() {
		DAG g = new DAG(6);
		g.addEdge(0, 1);
		g.addEdge(0, 3); 
		g.addEdge(0, 4);
		g.addEdge(3, 4);
		g.addEdge(1, 0);	
		g.addEdge(1, 4); 
		g.addEdge(1, 2);
		g.addEdge(4, 2);
		g.addEdge(4, 5);
		int lca = g.findLCA(0, 3, 2);
		assertEquals(3, lca, "Should be 1 (There is more than one LCA here but the"
		+ " most recently traversed node with the same depth will end up being the LCA.");
	}
	
	@Test
	void testDAG5() {
		DAG g = new DAG(6);
		g.addEdge(0, 1);
		g.addEdge(0, 3); 
		g.addEdge(0, 4);
		g.addEdge(3, 4);
		g.addEdge(1, 0);	
		g.addEdge(1, 4); 
		g.addEdge(1, 2);
		g.addEdge(4, 2);
		g.addEdge(4, 5);
		int lca = g.findLCA(0, 2, 5);
		assertEquals(4, lca,"Should be 4");
	}

	@Test
	void testDAG6() {
		DAG g = new DAG(6);
		g.addEdge(0, 1);
		g.addEdge(0, 3); 
		g.addEdge(0, 4);
		g.addEdge(3, 4);
		g.addEdge(1, 0);	
		g.addEdge(1, 4); 
		g.addEdge(1, 2);
		g.addEdge(4, 2);
		g.addEdge(4, 5);
		int lca = g.findLCA(0, 4, 3);
		assertEquals(3, lca,"Should be 3");
	}
	
	/*DAG:              <--0-->
	 */                

	@Test
	void testOneNode() {
		DAG g = new DAG(1); 
		int lca = g.findLCA(0, 0, 0);
		assertEquals(0, lca, "LCA is itself.");
	}

}
