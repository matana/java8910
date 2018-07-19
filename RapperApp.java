package com.rapper.delight;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class RapperApp {

	static List<Rapper> rappers;

	public static void main(String[] args) {

		// Since Java 9 .. . also Set.of and Map.of available

		rappers = List.of(

				new Rapper().type(HipHopType.CHEESY_RAP).name("Genz").isAlive(true).vocabularySize(1000).income(100)
						.marriedWithBeynoce(false).grill(false),

				new Rapper().type(HipHopType.CHEESY_RAP).name("Lil Miha").isAlive(true).vocabularySize(100).income(-100)
						.marriedWithBeynoce(false).grill(false),

				new Rapper().type(HipHopType.GANSTA_RAP).name("Jay-Z").isAlive(true).vocabularySize(3000)
						.income(100000000).marriedWithBeynoce(true).grill(false),

				new Rapper().type(HipHopType.GANSTA_RAP).name("Tupac").isAlive(false).vocabularySize(3200)
						.income(100000).marriedWithBeynoce(false).grill(false),

				new Rapper().type(HipHopType.OLD_SCHOOL_RAP).name("Slick Rick").isAlive(true).vocabularySize(3000)
						.income(10000).marriedWithBeynoce(false).grill(true));

		List<Rapper> filterByIncomeHigherThen = FilterRapper.filterByIncomeHigherThen(rappers, 10000);

		List<Rapper> filterByHipHopType = FilterRapper.filterByHipHopType(filterByIncomeHigherThen,
				HipHopType.GANSTA_RAP);

		List<String> filteredRapperNames = new ArrayList<>();

		for (Rapper rapper : filterByHipHopType) {

			filteredRapperNames.add(rapper.getName());
		}

		System.out.println(filteredRapperNames);

		
		
		
		Predicate<Rapper> p1 = r -> r.getType().equals(HipHopType.GANSTA_RAP);

		List<Rapper> filter = FilterRapper.filter(rappers, p1);

		System.out.println(filter);

		
		
		Predicate<Rapper> p2 = r -> r.getIncome() > 1000000;

		List<Rapper> filter2 = FilterRapper.filter(rappers, p2);

		System.out.println(filter2);

		
		
		List<Rapper> filter3 = FilterRapper.filter(rappers, p1.and(p2));

		System.out.println(filter3);

		
		
		
		List<Rapper> filter4 = FilterRapper.filter(rappers,
				(Rapper r) -> r.getIncome() > 1000000 && r.getType().equals(HipHopType.GANSTA_RAP));

		System.out.println(filter4);

		
		
		
		List<String> collect = rappers.stream()
				.filter(Rapper::isAlive)
				.sorted((r1, r2) -> Integer.compare(r1.getIncome(), r2.getIncome()))
				.limit(3).map(Rapper::getName)
				.collect(Collectors.toList());

		System.out.println(collect);
		
		
		boolean allAlive = rappers.stream().allMatch(Rapper::isAlive);

		System.out.println(allAlive);
		
		
		
		boolean noneEloquent = rappers.stream().noneMatch(r -> r.getVocabularySize() > 4000);

		System.out.println(noneEloquent);
		
		
		rappers.stream()
			.filter(r -> r.getIncome() > 10000 && !r.isAlive())
			.findAny().ifPresent(r -> System.out.println(r.getName()));

		Rapper rapper = rappers.stream()
			.filter(r -> r.isMarriedWithBeynoce() && r.getIncome() < 100)
			.findAny().orElse(new Rapper()
							.name("Lil Bow Wow")
							.income(10)
							.type(HipHopType.CHEESY_RAP)
							.marriedWithBeynoce(true));
		
		System.out.println(rapper.getName());
		
	}

}
