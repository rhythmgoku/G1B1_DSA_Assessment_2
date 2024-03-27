package com.gl.dsa.assessment2.domain;

public class BinarySearchTree {

	private Node x;
	private Node y; // y maintains pointer to x

	public Node getX() {
		return x;
	}

	public void setX(Node x) {
		this.x = x;
	}

	public Node getY() {
		return y;
	}

	public void setY(Node y) {
		this.y = y;
	}

	public Node insertValue(Node root, int data) {

		this.x = root;
		this.y = null;

		while (this.x != null) {
			this.y = this.x;
			if (data < this.x.getData())
				this.x = this.x.getLeft();
			else if (data > this.x.getData())
				this.x = this.x.getRight();
			else {
				System.out.println("Value already exists!");
				return new Node(data);
			}
		}
		if (this.y == null)
			this.y = new Node(data);
		else if (data < this.y.getData())
			this.y.setLeft(new Node(data));
		else
			y.setRight(new Node(data));
		return y;

	}
}
