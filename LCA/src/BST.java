class Node 
{ 
	int data; 
	Node left, right; 

	public Node(int item) 
	{ 
		data = item; 
		left = right = null; 
	} 
} 

public class BST 
{  
	Node root; 
	static boolean v1 = false, v2 = false; 
	
	public void insert(int val){
		if (root == null) { 
			root = new Node(val);
			//System.out.println("Insertion of val: "+val+" complete");
			return;
		}
		root = insert(root, val);
		//System.out.println("Insertion of val: "+val+" complete");
	}
	
	private Node insert(Node x,int val) {
		if (x == null) return new Node(val);	
		if      (val < x.data) { x.left  = insert(x.left,val); /*System.out.println("went left");*/}  
		else if (val > x.data) { x.right = insert(x.right,val); /*System.out.println("went right");*/}
		//else     System.out.println("already in tree");
		return x;
	}
	
	public void preOrderTraversal() {
		preOrderTraversal(root);
	}
	
	private Node preOrderTraversal(Node x) {
		if(x == null) return null;
		System.out.print(x.data+" ");
		preOrderTraversal(x.left);
		preOrderTraversal(x.right);
		return x;
	}

	Node findLCAUtil(Node node, int n1, int n2) 
	{ 

		if (node == null) 
			return null; 
		
		
		Node temp=null; 

		if (node.data == n1) 
		{ 
			v1 = true; 
			temp = node; 
		} 
		if (node.data == n2) 
		{ 
			v2 = true; 
			temp = node; 
		} 
 
		Node left_lca = findLCAUtil(node.left, n1, n2); 
		Node right_lca = findLCAUtil(node.right, n1, n2); 

		if (temp != null) 
			return temp; 

		if (left_lca != null && right_lca != null) 
			return node; 

		return (left_lca != null) ? left_lca : right_lca; 
	} 

	
	Node findLCA(int n1, int n2) 
	{ 

		v1 = false; 
		v2 = false; 

		Node lca = findLCAUtil(root, n1, n2); 

		if (v1 && v2) 
			return lca; 

		return null; 
	} 
} 
