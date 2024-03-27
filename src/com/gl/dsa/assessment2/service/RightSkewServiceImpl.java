package com.gl.dsa.assessment2.service;

import java.util.List;

import com.gl.dsa.assessment2.domain.BinarySearchTree;
import com.gl.dsa.assessment2.domain.Node;
import com.gl.dsa.assessment2.domain.SkewTree;

public class RightSkewServiceImpl implements RightSkewService {

	@Override
	public Node BSTdataPopulator(List<Integer> values, BinarySearchTree binarySearchTree) {

		Node root = null;
		Node result = null;

		for (int i = 0; i < values.size(); i++) {
			int data = values.get(i);

			if (root == null)
				root = binarySearchTree.insertValue(root, data);
			else {
				result = binarySearchTree.insertValue(root, data);
				if (result.getData() == data)
					i -= 1;
			}
		}

		return root;

	}

	@Override
	public void inOrder(Node root, SkewTree skewTree) {

		if (root != null) {
			inOrder(root.getLeft(), skewTree);
			skewTree.getDataList().add(root.getData());
			inOrder(root.getRight(), skewTree);
		}
	}

	@Override
	public Node convertToRightSkewed(SkewTree skewTree) {

		Node root = null;
		Node tempNode = null;
		for (int i = 0; i < skewTree.getDataList().size(); i++) {
			int data = skewTree.getDataList().get(i);
			Node newNode = new Node(data);
			if (root == null) {
				root = newNode;
				tempNode = newNode;
			} else if (tempNode.getRight() == null) {
				tempNode.setRight(newNode);
				tempNode = newNode;
			}
		}
		return root;
	}

}
