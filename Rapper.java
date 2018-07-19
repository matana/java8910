package com.rapper.delight;

public class Rapper {

	private String name;
	private HipHopType type;
	private int income;
	private int vocabularySize;
	private boolean isMarriedWithBeynoce;
	private boolean hasGrill;
	private boolean isAlive;

	public HipHopType getType() {
		return type;
	}

	public void setType(HipHopType type) {
		this.type = type;
	}

	public Rapper type(HipHopType type) {
		this.setType(type);
		return this;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Rapper name(String name) {
		this.name = name;
		return this;
	}

	public int getIncome() {
		return income;
	}

	public void setIncome(int income) {
		this.income = income;
	}

	public Rapper income(int income) {
		this.income = income;
		return this;
	}

	public int getVocabularySize() {
		return vocabularySize;
	}

	public void setVocabularySize(int vocabularySize) {
		this.vocabularySize = vocabularySize;
	}

	public Rapper vocabularySize(int vocabularySize) {
		this.vocabularySize = vocabularySize;
		return this;
	}

	public boolean isMarriedWithBeynoce() {
		return isMarriedWithBeynoce;
	}

	public void setMarriedWithBeynoce(boolean isMarriedWithBeynoce) {
		this.isMarriedWithBeynoce = isMarriedWithBeynoce;
	}

	public Rapper marriedWithBeynoce(boolean isMarriedWithBeynoce) {
		this.isMarriedWithBeynoce = isMarriedWithBeynoce;
		return this;
	}

	public boolean hasGrill() {
		return hasGrill;
	}

	public void setHasGrill(boolean hasGrill) {
		this.hasGrill = hasGrill;
	}

	public Rapper grill(boolean hasGrill) {
		this.hasGrill = hasGrill;
		return this;
	}

	public Rapper isAlive(boolean isAlive) {
		this.isAlive = isAlive;
		return this;
	}

	public boolean isAlive() {
		return isAlive;
	}

	public void setAlive(boolean isAlive) {
		this.isAlive = isAlive;
	}

}
