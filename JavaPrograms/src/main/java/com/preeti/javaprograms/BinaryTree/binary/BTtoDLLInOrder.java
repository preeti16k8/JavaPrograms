package com.preeti.javaprograms.BinaryTree.binary;

	// A Java program for in-place conversion of Binary Tree to DLL
	  
	// A binary tree node has data, left pointers and right pointers
	class NodeBTDll 
	{
	    int data;
	    NodeBTDll left, right;
	  
	    public NodeBTDll(int data) 
	    {
	        this.data = data;
	        left = right = null;
	    }
	}
	  
	class BTtoDLLInOrder 
	{
		NodeBTDll root;
	      
	    // head --> Pointer to head node of created doubly linked list
		NodeBTDll head;
	      
	    // Initialize previously visited node as NULL. This is
	    // static so that the same value is accessible in all recursive
	    // calls
	    static NodeBTDll prev = null;
	  
	    // A simple recursive function to convert a given Binary tree 
	    // to Doubly Linked List
	    // root --> Root of Binary Tree
	    void BinaryTree2DoubleLinkedList(NodeBTDll root) 
	    {
	        // Base case
	        if (root == null)
	            return;
	  
	        // Recursively convert left subtree
	        BinaryTree2DoubleLinkedList(root.left);
	  
	        // Now convert this node
	        if (prev == null) 
	            head = root;
	        else
	        {
	            root.left = prev;
	            prev.right = root;
	        }
	        prev = root;
	  
	        // Finally convert right subtree
	        BinaryTree2DoubleLinkedList(root.right);
	    }
	  
	    /* Function to print nodes in a given doubly linked list */
	    void printList(NodeBTDll node)
	    {
	        while (node != null) 
	        {
	            System.out.print(node.data + " ");
	            node = node.right;
	        }
	    }
	  
	    // Driver program to test above functions
	    public static void main(String[] args) 
	    {
	        // Let us create the tree as shown in above diagram
	    	BTtoDLLInOrder tree = new BTtoDLLInOrder();
	        tree.root = new NodeBTDll(10);
	        tree.root.left = new NodeBTDll(12);
	        tree.root.right = new NodeBTDll(15);
	        tree.root.left.left = new NodeBTDll(25);
	        tree.root.left.right = new NodeBTDll(30);
	        tree.root.right.left = new NodeBTDll(36);
	  
	        // convert to DLL
	        tree.BinaryTree2DoubleLinkedList(tree.root);
	          
	        // Print the converted List
	        tree.printList(tree.head);
	  
	    }
	}
	