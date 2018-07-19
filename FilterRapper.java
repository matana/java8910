package com.rapper.delight;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class FilterRapper {

	public static List<Rapper> filterByIncomeHigherThen(List<Rapper> list, int income) {
		List<Rapper> toReturn = new ArrayList<>();
		for (Rapper rapper : list) {
			if (rapper.getIncome() > income) {
				toReturn.add(rapper);
			}
		}

		return toReturn;
	}

	public static List<Rapper> filterByIncomeLowerThen(List<Rapper> list, int income) {
		List<Rapper> toReturn = new ArrayList<>();
		for (Rapper rapper : list) {
			if (rapper.getIncome() < income) {
				toReturn.add(rapper);
			}
		}

		return toReturn;
	}

	public static List<Rapper> filterByIsAlive(List<Rapper> list) {
		List<Rapper> toReturn = new ArrayList<>();
		for (Rapper rapper : list) {
			if (rapper.isAlive()) {
				toReturn.add(rapper);
			}
		}

		return toReturn;
	}

	public static List<Rapper> filterByIsMarriedToBeyonce(List<Rapper> list) {
		List<Rapper> toReturn = new ArrayList<>();
		for (Rapper rapper : list) {
			if (rapper.isMarriedWithBeynoce()) {
				toReturn.add(rapper);
			}
		}

		return toReturn;
	}

	public static List<Rapper> filterByIsMarriedToBeyonceAndAlive(List<Rapper> list) {
		List<Rapper> toReturn = new ArrayList<>();
		for (Rapper rapper : list) {
			if (rapper.isMarriedWithBeynoce() && rapper.isAlive()) {
				toReturn.add(rapper);
			}
		}

		return toReturn;
	}

	public static List<Rapper> filterByHipHopType(List<Rapper> list, HipHopType type) {
		List<Rapper> toReturn = new ArrayList<>();
		for (Rapper rapper : list) {
			if (rapper.getType().equals(type)) {
				toReturn.add(rapper);
			}
		}

		return toReturn;
	}

	// THE SOLUTION: LAMBDAS
	public static <T> List<T> filter(List<T> list, Predicate<T> p) {
		return list.stream().filter(p).collect(Collectors.toList());
	}

}
