package com.gl.dsa.assessment1.service;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Stack;

import com.gl.dsa.assessment1.domain.FloorBuilder;
import com.gl.dsa.assessment1.util.FloorBuilderUtil;

public class FloorBuilderServiceImpl implements FloorBuilderService {

	FloorBuilderUtil builderUtil;

	public FloorBuilderServiceImpl() {
		super();
	}

	public FloorBuilderServiceImpl(FloorBuilderUtil builderUtil) {
		super();
		this.builderUtil = builderUtil;
	}

	@Override
	public void setTotalFloor(FloorBuilder floorBuilder) {

		boolean validInput = false;
		int totalFloors;

		// Exception handling for input
		while (!validInput) {
			try {
				System.out.println("Enter the total number of floors in the building:");
				totalFloors = builderUtil.getinputFromuser();
				if (totalFloors <= 0) {
					throw new IllegalArgumentException("Number of floors must be positive.");
				}

				floorBuilder.setTotalFloors(totalFloors);
				validInput = true;
			} catch (InputMismatchException e) {
				System.out.println("Invalid input. Please enter a numerical value.");
				builderUtil.clearBuffer(); // Clear the buffer
			} catch (IllegalArgumentException e) {
				System.out.println(e.getMessage());
			}
		}
	}

	@Override
	public void addVariousFloorSizes(FloorBuilder floorBuilder) {

		boolean validInput = false;
		List<Integer> floorList = new ArrayList<>();
		int maxFloorSize = floorBuilder.getTotalFloors();

		for (int i = 0; i < maxFloorSize; i++) {
			while (!validInput) {
				try {
					System.out.println("Enter the floor size given on day : " + (i + 1));

					int floorSize = builderUtil.getinputFromuser();

					if (floorSize <= 0 || floorSize > maxFloorSize) {
						throw new IllegalArgumentException(
								"Floor size must be positive and less than or equal to total number of floors.");
					}

					if (floorList.contains(floorSize)) {
						throw new IllegalArgumentException(
								"Please Input a different floor, this Floor is already considered");
					}

					floorList.add(floorSize);
					validInput = true;
				} catch (InputMismatchException e) {
					System.out.println("Invalid input. Please enter a numerical value.");
					builderUtil.clearBuffer(); // Clear the buffer
				} catch (IllegalArgumentException e) {
					System.out.println(e.getMessage());
				}
			}
			validInput = false;
		}

		floorBuilder.getFloorList().addAll(floorList);

	}

	@Override
	public void generateAndDisplayOrderOfConstruction(FloorBuilder floorBuilder) {
		Stack<Integer> stack = new Stack<>();

//		starts with max floor size
		int variableFloorSize = floorBuilder.getTotalFloors();

//      Move to the next line
		System.out.println();
		for (int i = 0; i < floorBuilder.getTotalFloors(); i++) {
			System.out.println("Day: " + (i + 1));
			stack.push(floorBuilder.getFloorList().get(i));
			while (!stack.isEmpty() && stack.peek() == variableFloorSize) {
				System.out.print(stack.pop() + " ");
				variableFloorSize--;
			}

//          Move to the next line
			System.out.println();
		}

	}

}
