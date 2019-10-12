import java.util.*;
/*
class Vertex 
{ 
	char key; 
	List<Vertex> connectedTo;

	Vertex(char key) 
	{ 
		this.key = key;
		connectedTo = new LinkedList<>();
	}
	
	public String toString() {
		return "Vertex key: " + key ;
	}
}*/
/*
class Edge
{
	Vertex start;
	Vertex end;
	Edge(Vertex start,Vertex end){
		this.start = start;
		this.end = end;
	}
}
*/

public class DAG 
{
	private Vertex vertices[];

	DAG(Vertex vertices[])
	{ 
		this.vertices = vertices; 
	}

	/* Insert edges into DAG */
	public void addEdge(Vertex fromV , Vertex toV) 
	{
		
	}

	public char findLCA(char startVertex, char key1, char key2)
	{
		if(vertices == null) return ' ';
		return 'a';
	}
}
