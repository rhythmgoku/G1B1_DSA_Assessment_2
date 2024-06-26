package com.gl.dsa.assessment2.domain;

public class Node {

	private Node left;
	private int data;
	private Node right;

	public Node(int data) {
		this.data = data;
		this.left = this.right = null;
	}

	public Node getLeft() {
		return left;
	}

	public void setLeft(Node left) {
		this.left = left;
	}

	public int getData() {
		return data;
	}

	public void setData(int data) {
		this.data = data;
	}

	public Node getRight() {
		return right;
	}

	public void setRight(Node right) {
		this.right = right;
	}

}
