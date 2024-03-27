package com.gl.dsa.assessment2.service;

import java.util.List;

import com.gl.dsa.assessment2.domain.BinarySearchTree;
import com.gl.dsa.assessment2.domain.Node;
import com.gl.dsa.assessment2.domain.SkewTree;

public interface RightSkewService {

	Node BSTdataPopulator(List<Integer> values, BinarySearchTree binarySearchTree);

	void inOrder(Node root, SkewTree skewTree);

	Node convertToRightSkewed(SkewTree skewTree);

}
