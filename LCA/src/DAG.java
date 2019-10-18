// Java program to print DFS traversal from a given given graph 
import java.io.*; 
import java.util.*; 

// This class represents a directed graph using adjacency list 
// representation 
class DAG 
{ 
	int currentLCA = -1;
	boolean connected = false;
	private int V; // No. of vertices 

	// Array of lists for Adjacency List Representation 
	private LinkedList<Integer> adj[]; 

	// Constructor 
	DAG(int v) 
	{ 
		V = v; 
		adj = new LinkedList[v]; 
		for (int i=0; i < v; ++i) 
			adj[i] = new LinkedList(); 
	} 

	//Function to add an edge into the graph 
	void addEdge(int v, int w) 
	{ 
		adj[v].add(w); // Add w to v's list. 
	} 

	// A function used by DFS 
	boolean isConnected(int x, int n1, boolean visited[]) 
	{ 
		// Mark the current node as visited and print it 
		visited[x] = true; 
		if(n1 == x) {
			connected = true;
			return connected;
		}
		// Recur for all the vertices adjacent to this vertex 
		Iterator<Integer> i = adj[x].listIterator(); 
		while (i.hasNext()) 
		{ 
			int n = i.next(); 
			if (!visited[n]) 
				isConnected(n, n1, visited);
			if(connected)
				return connected;
		}
		return connected;
	} 

	int findLCAUtil(int x, int n1, int n2, boolean visited[]) {
		visited[x] = true;
		connected = false;
		boolean visited2[] = new boolean[visited.length];
		boolean visited3[] = new boolean[visited.length];
		if(isConnected(x, n1, visited2)) {
			connected = false;
			if(isConnected(x, n2, visited3)) {
				currentLCA = x;
			}
		}
		Iterator<Integer> i = adj[x].listIterator();
		while (i.hasNext()) {
			int n = i.next();
			if (!visited[n]) 
				findLCAUtil(n, n1, n2, visited);
		}
		return currentLCA;
	}

	// The function to do DFS traversal. It uses recursive DFSUtil() 
	int findLCA(int v, int n1, int n2) 
	{ 
		int lca = 0;
		// Mark all the vertices as not visited(set as 
		// false by default in java) 
		boolean visited[] = new boolean[V];
		lca = findLCAUtil(v, n1, n2, visited);
		if(lca == 0 | lca != 0) {
			System.out.println("\nThe LCA  for nodes "+ n1 +" and "+ n2 +" is : " + lca);
			return lca;
		}
		else {
			return lca;				// 0 will represent the null value in this case
		}
	} 

	public static void main(String args[]) 
	{ 
		DAG g = new DAG(7); 

		g.addEdge(0, 1); //G-0,	D-1, F-2, C-3, B-5, E-4, A-6
		g.addEdge(0, 2); 
		g.addEdge(1, 3);
		g.addEdge(2, 4);
		g.addEdge(4, 5);	
		g.addEdge(3, 5); 
		g.addEdge(5, 6); 
		boolean[] visited = new boolean[7];
		System.out.println(g.isConnected(0, 3, visited));
		g.findLCA(0, 5, 3);
	} 
} 
