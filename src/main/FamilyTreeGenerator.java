package main;

import java.util.ArrayList;

import org.graphstream.graph.Graph;
import org.graphstream.graph.Node;
import org.graphstream.graph.implementations.SingleGraph;
import org.graphstream.ui.view.Viewer;

public class FamilyTreeGenerator {
	
	private ArrayList<FamilyMember> familyMembers;
	private int totalGenerations;
	
	public FamilyTreeGenerator(ArrayList<FamilyMember> familyMembers, int totalGenerations) {
		this.familyMembers = familyMembers;
		this.totalGenerations = totalGenerations;
	}
	
	/**
	 * Adds nodes and edges to a graph passed by the parameter.
	 */
	public void createFamilyTree() {
		
		// create a blank graph
		Graph graph = new SingleGraph("Greek Myth Family Tree");
		
		// create nodes
		int[] coordCounter = new int[totalGenerations]; // record the number of columns of each row (generation), index is the row number
		
		for (FamilyMember member : familyMembers) {
			
			Node n = graph.addNode(member.getName());
			
			int y = totalGenerations - member.getGeneration(); // y coordinate of the node
			int x = coordCounter[y];                           // x coordinate of the node
			
			coordCounter[y]++;
			n.setAttribute("xy", x, y);
			n.setAttribute("gender", member.getGender().getCode());
		}
		
		// create edges
		for (FamilyMember member : familyMembers) {
			
			String curr = member.getName();
			String currFather = member.getFather();
			String currMother = member.getMother();
			
			if (currFather != "") {
				// use the index of the member as the ID of this edge.
				graph.addEdge(((Integer)(familyMembers.indexOf(member))).toString(), curr, currFather);  
			}
			
			if (currMother != "") {
				// use 9999 - the index of the member as the ID of this edge.
				graph.addEdge(((Integer)(9999 - familyMembers.indexOf(member))).toString(), curr, currMother);
			}
			
		}
		
		// display each node's name
		for (Node node : graph) {
	        node.setAttribute("ui.label", node.getId());
	    }
		
		// set graph ui style
		String stylesheet = "node {size: 20px; "
								+ "text-background-mode: rounded-box; "
								+ "text-alignment: at-left; "
								+ "text-background-color: grey; "
								+ "text-padding: 5px; "
								+ "text-offset: -8px; "
								+ "text-size: 15px;} "
						  + "edge {size: 2px; shape: cubic-curve;}";
		
		for (Node node : graph) {
	        if (node.getAttribute("gender") == "m") {
	        	stylesheet += "node#" + node.getId() + " {fill-color: lightblue; }";
	        } else {
	        	stylesheet += "node#" + node.getId() + " {fill-color: pink; }";
	        }
	    }
		
		graph.setAttribute("ui.stylesheet", stylesheet);
		
		// initiate a graph instance
		System.setProperty("org.graphstream.ui", "swing");
		
		// show graph
		Viewer viewer = graph.display();
		viewer.disableAutoLayout();
		
	}
	
}
