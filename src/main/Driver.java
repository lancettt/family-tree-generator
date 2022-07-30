package main;

import java.util.ArrayList;

public class Driver {

	public static void main(String[] args) {
	
			FamilyTreeGenerator generator = new FamilyTreeGenerator(createListOfCharacters(), 5);
			
			generator.createFamilyTree();

	}
	
	/**
	 * Creates an ArrayList of family members for the {@code FamilyTreeGenerator} to generate a family tree.
	 * 
	 * @return an  ArrayList of family members
	 */
	public static ArrayList<FamilyMember> createListOfCharacters() {
		
		// Here is an example of creating a list of family members from Greek mythology.
		int generation = 1;
		
		FamilyMember uranus = new FamilyMember("Uranus", Gender.MALE, "", "", generation);
		FamilyMember gaia = new FamilyMember("Gaia", Gender.FEMALE, "", "", generation);
		
		FamilyMember oceanus = new FamilyMember("Oceanus", Gender.MALE, "Uranus", "Gaia", generation + 1);
		FamilyMember tethys = new FamilyMember("Tethys", Gender.FEMALE, "Uranus", "Gaia", generation + 1);
		FamilyMember kronus = new FamilyMember("Kronus", Gender.MALE, "Uranus", "Gaia", generation + 1);
		FamilyMember rhea = new FamilyMember("Rhea", Gender.FEMALE, "Uranus", "Gaia", generation + 1);
		FamilyMember metis = new FamilyMember("Metis", Gender.FEMALE, "Uranus", "Gaia", generation + 1);
		FamilyMember themis = new FamilyMember("Themis", Gender.FEMALE, "Uranus", "Gaia", generation + 1);
		FamilyMember aphrodite = new FamilyMember("Aphrodite", Gender.FEMALE, "Uranus", "", generation + 1);
		
		FamilyMember eurynome = new FamilyMember("Eurynome", Gender.FEMALE, "Oceanus", "Tethys", generation + 2);
		FamilyMember demeter = new FamilyMember("Demeter", Gender.FEMALE, "Kronus", "Rhea", generation + 2);
		FamilyMember hera = new FamilyMember("Hera", Gender.FEMALE, "Kronus", "Rhea", generation + 2);
		FamilyMember zeus = new FamilyMember("Zeus", Gender.MALE, "Kronus", "Rhea", generation + 2);
		FamilyMember hades = new FamilyMember("Hades", Gender.MALE, "Kronus", "Rhea", generation + 2);
		FamilyMember poseidon = new FamilyMember("Poseidon", Gender.MALE, "Kronus", "Rhea", generation + 2);
		
		FamilyMember charites = new FamilyMember("Charites", Gender.FEMALE, "Zeus", "Eurynome", generation + 3);
		FamilyMember persephone = new FamilyMember("Persephone", Gender.FEMALE, "Zeus", "Demeter", generation + 3);
		FamilyMember ares = new FamilyMember("Ares", Gender.MALE, "Zeus", "Hera", generation + 3);
		FamilyMember athena = new FamilyMember("Athena", Gender.FEMALE, "Zeus", "Metis", generation + 3);
		FamilyMember horae = new FamilyMember("Horae", Gender.FEMALE, "Zeus", "Themis", generation + 3);
		FamilyMember moirai = new FamilyMember("Moirai", Gender.FEMALE, "Zeus", "Themis", generation + 3);
		
		FamilyMember deimos = new FamilyMember("Deimos", Gender.MALE, "Ares", "Aphrodite", generation + 4);
		FamilyMember phobos = new FamilyMember("Phobos", Gender.MALE, "Ares", "Aphrodite", generation + 4);
		FamilyMember harmonia = new FamilyMember("Harmonia", Gender.FEMALE, "Ares", "Aphrodite", generation + 4);
		
				
		ArrayList<FamilyMember> names = new ArrayList<>();
		names.add(uranus);
		names.add(gaia);
		
		names.add(oceanus);
		names.add(tethys);
		names.add(kronus);
		names.add(rhea);
		names.add(metis);
		names.add(themis);
		names.add(aphrodite);
		
		names.add(eurynome);
		names.add(demeter);
		names.add(hera);
		names.add(zeus);
		names.add(hades);
		names.add(poseidon);
		
		names.add(charites);
		names.add(persephone);
		names.add(ares);
		names.add(athena);
		names.add(horae);
		names.add(moirai);
		
		names.add(deimos);
		names.add(phobos);
		names.add(harmonia);
		
		return names;
	}

}
