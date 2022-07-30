package main;

public class FamilyMember {
	
	private String name;
	private Gender gender;
	private String father;
	private String mother;
	private int generation;
	
	public FamilyMember(String name, Gender gender, String father, String mother, int generation) {
		this.name = name;
		this.gender = gender;
		this.father = father;
		this.mother = mother;
		this.generation = generation;
	}

	public String getName() {
		return name;
	}

	public Gender getGender() {
		return gender;
	}

	public String getFather() {
		return father;
	}

	public String getMother() {
		return mother;
	}

	public int getGeneration() {
		return generation;
	}

}
