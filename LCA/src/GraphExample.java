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
		Vertex d = new Vertex('D');
		Vertex g = new Vertex('G');   
		Vertex a = new Vertex('A');
		Vertex b = new Vertex('B'); 
		Vertex f = new Vertex('F');
		Vertex c = new Vertex('C');
		Vertex e = new Vertex('E');	
		e.connectedTo.add(b);  
		g.connectedTo.add(d);  
		g.connectedTo.add(f);  
		c.connectedTo.add(b);  
		b.connectedTo.add(a);  
		d.connectedTo.add(c);  
		f.connectedTo.add(e);
		List<Vertex> vertices = new LinkedList<>();
		vertices.add(g);
		vertices.add(f);
		vertices.add(e);
		vertices.add(d);
		vertices.add(c);
		vertices.add(b);
		vertices.add(a);		
		Vertex temp = new Vertex('j');
		System.out.println(temp.key+" -> ");
		for(int i = 0; i < vertices.size(); i++) {
			temp = vertices.get(i);
			for(int j = 0; j < temp.connectedTo.size(); j++) {
				System.out.println(temp.key+" -> "+temp.connectedTo.get(j).key);
			}
		}
	}
}
