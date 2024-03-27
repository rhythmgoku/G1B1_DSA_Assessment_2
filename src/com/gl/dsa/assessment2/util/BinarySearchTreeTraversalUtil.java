package com.gl.dsa.assessment2.util;

import com.gl.dsa.assessment2.domain.Node;

public class BinarySearchTreeTraversalUtil {

	public static void inOrderTraversal(Node root) {

		if (root != null) {
			inOrderTraversal(root.getLeft());
			System.out.print(" " + root.getData());
			if (root.getRight() != null) {
				System.out.print(",");
			}
			inOrderTraversal(root.getRight());
		}
	}

}
