package com.gl.dsa.assessment2.util;

import com.gl.dsa.assessment2.domain.Node;

public class BinarySearchTreePrinterUtil {

	private static final int COUNT = 8;

	public static void print2DUtil(Node root, int space) {
		if (root == null)
			return;

		space += COUNT;
		print2DUtil(root.getRight(), space);
		System.out.print("\n");
		for (int i = COUNT; i < space; i++)
			System.out.print(" ");
		System.out.print(root.getData() + "\n");
		print2DUtil(root.getLeft(), space);
	}

	public static void print2D(Node root) {
		print2DUtil(root, 0);

	}

	public static void prettyPrintingBSTin2D(Node root) {

		System.out.println(" \n\n                      Printing BST in 2D                       \n ");
		System.out.println(" ---------------------------------------------------------           \n\n");
		print2DUtil(root, 0);
		System.out.println(" \n\n --------------------------------------------------------- \n\n");

	}

	public static void prettyPrinterBSTAndSKewedBST() {

		System.out.println(" \n    Printing BST and Skewed BST (printStyle=Linear)                     \n\n ");
		System.out.println(" --------------------------------------------------------- \n\n");
	}

	public static void linearBSTprettyPrinter(Node node, String type) {
		System.out.print("\n    " + type + " :");
		BinarySearchTreeTraversalUtil.inOrderTraversal(node);
	}

}
