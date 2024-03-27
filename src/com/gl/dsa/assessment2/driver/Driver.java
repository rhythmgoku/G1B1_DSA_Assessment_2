package com.gl.dsa.assessment2.driver;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

import com.gl.dsa.assessment2.domain.BinarySearchTree;
import com.gl.dsa.assessment2.domain.Node;
import com.gl.dsa.assessment2.domain.SkewTree;
import com.gl.dsa.assessment2.service.RightSkewService;
import com.gl.dsa.assessment2.service.RightSkewServiceImpl;
import com.gl.dsa.assessment2.util.BinarySearchTreePrinterUtil;

public class Driver {

	public static void main(String[] args) {

		try (Scanner scanner = new Scanner(System.in)) {

			RightSkewService bstSkewService = new RightSkewServiceImpl();

			// hard coding the data values to BST
			List<Integer> values = Arrays.asList(50, 30, 60, 10, 20, 55);

			BinarySearchTree binarySearchTree = new BinarySearchTree();

			// BST data population
			Node root = bstSkewService.BSTdataPopulator(values, binarySearchTree);

			// printing BST in 2D
			BinarySearchTreePrinterUtil.prettyPrintingBSTin2D(root);

			// Performing Skewing logic
			SkewTree skewTree = new SkewTree(new ArrayList<>());
			bstSkewService.inOrder(root, skewTree);
			Node skewedNode = bstSkewService.convertToRightSkewed(skewTree);

			// printing Original and Skewed BST in linear format
			BinarySearchTreePrinterUtil.prettyPrinterBSTAndSKewedBST();

			BinarySearchTreePrinterUtil.linearBSTprettyPrinter(root, "Inorder");

			BinarySearchTreePrinterUtil.linearBSTprettyPrinter(skewedNode, "Inorder Skewed");

		} catch (Exception e) {
			System.out.println("Error Occured in the Floor Factory Process -- " + e);
		}
	}

}
