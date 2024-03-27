package com.gl.dsa.assessment1.util;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * this Util class is used to handle Scanner related task for making Driver
 * class look cleaner.
 */

public class FloorBuilderUtil {

	private Scanner scanner;

	public FloorBuilderUtil(Scanner scanner) {
		super();
		this.scanner = scanner;
	}

	public int getinputFromuser() throws InputMismatchException {
		try {
			return scanner.nextInt();

		} catch (InputMismatchException e) {
			throw new InputMismatchException();
		}
	}

	public void clearBuffer() {
		scanner.nextLine();
	}

}
