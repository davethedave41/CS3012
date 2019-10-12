import java.util.*;

class Vertex
{
	char key;
	List<Vertex> connectedTo = new LinkedList<>();
	Vertex(char key){
		this.key = key;
	}
}

public class GraphExample {
	public static void main(String [] args) {
		int vertices = 7;
		List<Vertex> l = new LinkedList<>();
		Vertex d = new Vertex('D');
		Vertex g = new Vertex('G');	 g.connectedTo.add(d);               //G
		                              //D
		                              //C
		                               //B
		                             //F
		                               //E, A has no outgoing edges but its edges are tracked in l[6]
		//for(int i = 0; i < vertices; i++)
			System.out.println(g.key+" -> "+g.connectedTo.get(0).key);
	}
}
