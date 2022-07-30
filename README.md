# Family Tree Generator

## What Is This Program About?
This Java program can help generate family tree using API provided by [GraphStream](https://graphstream-project.org/).

## What Does This Program Contain?
The program contains 4 Java classe and their functions are as follows.

### Gender.java
This enum defines gender property of FamilyMember objects.

### FamilyMember.java
This class defines basic elements in a family tree -- family members. The constructor of FamilyMember takes in 5 parameters:

1. Name
2. Gender
3. Father's name
4. Mother's name
5. Generation

Here is a valid construction of a FamilyMember object:

    FamilyMember Zeus = new FamilyMember("Zeus", Gender.MALE, "Kronus", "Rhea", 2);

### FamilyTreeGenerator.java
This class basically serves as a factory that produces family tree with user's input. The input is an ArrayList of FamilyMember objects. The constructor of FamilyTreeGenerator takes in 2 parameters:

1. An ArrayList of FamilyMember objects
2. Total generations of the family tree

For example, one can generate a family tree by simply calling:

    FamilyTreeGenerator generator = new FamilyTreeGenerator(listOfMembers, 5);
    generator.createFamilyTree();

### Driver.java
This class is used to run the program.
