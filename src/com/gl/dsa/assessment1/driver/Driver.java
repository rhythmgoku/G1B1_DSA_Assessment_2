package com.gl.dsa.assessment1.driver;

import java.util.ArrayList;
import java.util.Scanner;

import com.gl.dsa.assessment1.domain.FloorBuilder;
import com.gl.dsa.assessment1.service.FloorBuilderService;
import com.gl.dsa.assessment1.service.FloorBuilderServiceImpl;
import com.gl.dsa.assessment1.util.FloorBuilderUtil;

public class Driver {

	public static void main(String[] args) {

		try (Scanner scanner = new Scanner(System.in)) {

			FloorBuilder builder = new FloorBuilder();
			builder.setFloorList(new ArrayList<>());

			FloorBuilderUtil builderUtil = new FloorBuilderUtil(scanner);

			FloorBuilderService builderService = new FloorBuilderServiceImpl(builderUtil);

//			set the total number of floors
			builderService.setTotalFloor(builder);

//			set all the floor sizes
			builderService.addVariousFloorSizes(builder);

//			Generate and Display the Order of Floor Construction

			System.out.println("The order of construction is as follows");
			builderService.generateAndDisplayOrderOfConstruction(builder);

		} catch (Exception e) {
			System.out.println(
					"Error Occured while processing the floor building process  --  " + e.getLocalizedMessage());
		}

	}

}
