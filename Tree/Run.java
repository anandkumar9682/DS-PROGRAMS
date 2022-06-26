public class Run{

	public static void main(String[] args) {

		Tree root=new Tree(10);

		root=add(root, 20);

		root=add(root, 30);

		root=add(root, 40);

	}


	public static void inorder(Tree tree){
		if(tree!=null){
			while( tree!=null ){
				System.out.println(tree.data);
				inorder(tree.left);
				inorder(tree.right);

			}
		}
	}

	public static Tree add(Tree root , int data){

		while ( root.left != null || root.right != null )
			

		Tree temp=root;

		if( left==null)
			left=new Tree(data);

		else if( right==null ){

			right=new Tree(d);
			temp=right;

		}else{

			if( root.left.left==null)
			left=new Tree(d);

		    else if( root.right.right==null ){

			right=new Tree(d);
			temp=right;

		}




		}


		return temp;

	}



}




class Tree{

	int data;
	Tree left;
	Tree right;

	public Tree(int data , Tree left, Tree right){

		this.data=data;
		this.left=left;
		this.right=right;

	}

}