package org.jbpt.petri2;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

import org.jbpt.graph.abs.AbstractDirectedGraph;
import org.jbpt.graph.algo.DirectedGraphAlgorithms;

/**
 * Petri net implementation
 *  
 * @author Artem Polyvyanyy, Andreas Meyer
 */
public class PetriNet extends AbstractDirectedGraph<Flow,Node> {
	// Directed graph algorithms 
	private DirectedGraphAlgorithms<Flow,Node> DGA = null;
	
	public PetriNet(){}
	
	/**
	 * Add flow to the net 
	 * @param from Source place
	 * @param to Target transition
	 * @return Flow added to the net; <code>null</code> if no flow was added 
	 */
	public Flow addFlow(Place from, Transition to) {
		if (from == null || to == null) return null;
		
		Collection<Node> ss = new ArrayList<Node>(); ss.add(from);
		Collection<Node> ts = new ArrayList<Node>(); ts.add(to);
		
		if (!this.checkEdge(ss,ts)) return null;
		
		return new Flow(this, from, to);
	}
	
	/**
	 * Add flow to the net 
	 * @param from Source transition
	 * @param to Target place
	 * @return Flow added to the net; <code>null</code> if no flow was added 
	 */
	public Flow addFlow(Transition from, Place to) {
		if (from == null || to == null) return null;
		
		Collection<Node> ss = new ArrayList<Node>(); ss.add(from);
		Collection<Node> ts = new ArrayList<Node>(); ts.add(to);
		
		if (!this.checkEdge(ss,ts)) return null;
		
		return new Flow(this, from, to);
	}
	
	/**************************************************************************
	* Add node/place/transition methods
	**************************************************************************/
	
	/**
	 * Add node to the net
	 * @param n Node to add
	 * @return Node that was added to the net; <code>null</code> otherwise
	 */
	public Node addNode(Node n) {
		return this.addVertex(n);
	}
	
	/**
	 * Add nodes to the net
	 * @param ns Nodes to add
	 * @return Nodes that were added to the net; <code>null</code> if no node was added
	 */
	public Collection<Node> addNodes(Collection<Node> ns) {
		return this.addVertices(ns);
	}
	
	/**
	 * Add place to the net
	 * @param n Place to add
	 * @return Place that was added to the net; <code>null</code> otherwise
	 */
	public Node addPlace(Place p) {
		return this.addNode(p);
	}
	
	/**
	 * Add places to the net
	 * @param ps Places to add
	 * @return Places that were added to the net; <code>null</code> if no place was added
	 */
	public Collection<Place> addPlaces(Collection<Place> ps) {
		if (ps == null) return null;
		Collection<Place> result = new ArrayList<Place>();
		
		for (Place p : ps)
			if (this.addVertex((Node)p) != null)
				result.add(p);
		
		return (result.isEmpty()) ? null : result;
	}
	
	/**
	 * Add transition to the net
	 * @param n Transition to add
	 * @return Transition that was added to the net; <code>null</code> otherwise
	 */
	public Node addTransition(Transition t) {
		return this.addNode(t);
	}
	
	/**
	 * Add transitions to the net
	 * @param ps Transitions to add
	 * @return Transitions that were added to the net; <code>null</code> if no transition was added
	 */
	public Collection<Transition> addTransitions(Collection<Transition> ts) {
		if (ts == null) return null;
		Collection<Transition> result = new ArrayList<Transition>();
		
		for (Transition t : ts)
			if (this.addVertex((Node)t) != null)
				result.add(t);
		
		return (result.isEmpty()) ? null : result;
	}
	
	/**************************************************************************
	* Remove node/place/transition/flow methods
	**************************************************************************/
	
	/**
	 * Remove node from the net
	 * @param n Node to remove
	 * @return Node that was removed from the net; <code>null</code> if node was not removed
	 */
	public Node removeNode(Node n) {
		return this.removeVertex(n);
	}
	
	/**
	 * Remove nodes from the net
	 * @param ns Nodes to remove
	 * @return Nodes that were removed from the net; <code>null</code> if no node was removed
	 */
	public Collection<Node> removeNodes(Collection<Node> ns) {
		return this.removeVertices(ns);
	}
	
	/**
	 * Remove place from the net
	 * @param p Place to remove
	 * @return Place that was removed from the net; <code>null</code> if place was not removed
	 */
	public Place removePlace(Place p) {
		return (this.removeVertex(p) == null) ? null : p;
	}
	
	/**
	 * Remove places from the net
	 * @param ps Places to remove
	 * @return Places that were removed from the net; <code>null</code> if no place was removed
	 */
	public Collection<Place> removePlaces(Collection<Place> ps) {
		if (ps == null) return null;
		Collection<Place> result = new ArrayList<Place>();
		
		Iterator<Place> i = ps.iterator();
		while (i.hasNext()) {
			Place p = i.next();
			if (this.removePlace(p) != null)
				result.add(p);
		}
		return (result.isEmpty()) ? null : result;
	}
	
	/**
	 * Remove transition from the net
	 * @param t Transition to remove
	 * @return Transition that was removed from the net; <code>null</code> if transition was not removed
	 */
	public Transition removeTransition(Transition t) {
		return (this.removeVertex(t) == null) ? null : t;
	}
	
	/**
	 * Remove transitions from the net
	 * @param ts Transitions to remove
	 * @return Transitions that were removed from the net; <code>null</code> if no transition was removed
	 */
	public Collection<Transition> removeTransitions(Collection<Transition> ts) {
		if (ts == null) return null;
		Collection<Transition> result = new ArrayList<Transition>();
		
		Iterator<Transition> i = ts.iterator();
		while (i.hasNext()) {
			Transition t = i.next();
			if (this.removeTransition(t) != null)
				result.add(t);
		}
		
		return (result.isEmpty()) ? null : result;
	}
	
	/**
	 * Remove flow from the net
	 * @param f Flow to remove
	 * @return Flow that was removed from the net; <code>null</code> if no flow was removed
	 */
	public Flow removeFlow(Flow f) {
		return super.removeEdge(f);
	}
	
	/**
	 * Remove flow from the net
	 * @param fs Flow to remove
	 * @return Flow that was removed from the net; <code>null</code> if no flow was removed
	 */
	public Collection<Flow> removeFlow(Collection<Flow> fs) {
		return super.removeEdges(fs);
	}
	
	/**************************************************************************
	* Get methods
	**************************************************************************/
	
	/**
	 * Get Petri net nodes
	 * @return Petri net nodes
	 */
	public Collection<Node> getNodes() {
		return this.getVertices();
	}
	
	/**
	 * Get Petri net places
	 * @return Petri net places
	 */
	public Collection<Place> getPlaces() {
		Collection<Place> result = new ArrayList<Place>();
		
		for (Node n : this.getVertices()) {
			if (n instanceof Place)
				result.add((Place)n);
		}
		
		return result;
	}
	
	/**
	 * Get Petri net transitions
	 * @return Petri net transitions
	 */
	public Collection<Transition> getTransitions() {
		Collection<Transition> result = new ArrayList<Transition>();
		
		for (Node n : this.getVertices()) {
			if (n instanceof Transition)
				result.add((Transition)n);
		}
		
		return result;
	}
	
	/**
	 * Get Petri net flow relation
	 * @return Petri net flow relation
	 */
	public Collection<Flow> getFlowRelation() {
		return this.getEdges();
	}
	
	/**
	 * Get silent transitions
	 * @return Silent transitions of the net
	 */
	public Collection<Transition> getSilentTransitions() {
		Collection<Transition> result = new ArrayList<Transition>();
		
		for (Transition t : this.getTransitions()) 
			if (t.isSilent())
				result.add(t);
		
		return result;
	}

	/**
	 * Get observable transitions
	 * @return Observable transitions of the net
	 */
	public Collection<Transition> getObservableTransitions() {
		Collection<Transition> result = new ArrayList<Transition>();
		
		for (Transition t : this.getTransitions()) 
			if (t.isObservable())
				result.add(t);
		
		return result;
	}
	
	/**************************************************************************
	* Postset/preset methods
	**************************************************************************/
	
	
	public Collection<Place> getPostset(Transition t) {
		Collection<Place> result = new ArrayList<Place>();
		for (Node n : this.getDirectSuccessors(t)) {
			if (n instanceof Place)
				result.add((Place)n);
		}
		
		return result;
	}
	
	public Collection<Place> getPostsetPlaces(Collection<Transition> ts) {
		Set<Place> result = new HashSet<Place>();
		
		for (Transition t : ts)
			for (Node n : this.getDirectSuccessors(t))
				if (n instanceof Place)
					result.add((Place)n);
		
		return result;
	}
	
	public Collection<Transition> getPostset(Place p) {
		Collection<Transition> result = new ArrayList<Transition>();
		for (Node n : this.getDirectSuccessors(p)) {
			if (n instanceof Transition)
				result.add((Transition)n);
		}
		
		return result;
	}
	
	public Collection<Transition> getPostsetTransitions(Collection<Place> ps) {
		Set<Transition> result = new HashSet<Transition>();
		
		for (Place p : ps)
			for (Node n : this.getDirectSuccessors(p))
				if (n instanceof Transition)
					result.add((Transition)n);
		
		return result;
	}
	
	public Collection<Node> getPostset(Node n) {
		return this.getDirectSuccessors(n);
	}
	
	public Collection<Node> getPostset(Collection<Node> ns) {
		return this.getDirectSuccessors(ns);
	}
	
	public Collection<Place> getPreset(Transition t) {
		Collection<Place> result = new ArrayList<Place>();
		for (Node n : this.getDirectPredecessors(t)) {
			if (n instanceof Place)
				result.add((Place)n);
		}
		
		return result;
	}
	
	public Collection<Place> getPresetPlaces(Collection<Transition> ts) {
		Set<Place> result = new HashSet<Place>();
		
		for (Transition t : ts)
			for (Node n : this.getDirectPredecessors(t))
				if (n instanceof Place)
					result.add((Place)n);
		
		return result;
	}
	
	public Collection<Transition> getPreset(Place p) {
		Collection<Transition> result = new ArrayList<Transition>();
		for (Node n : this.getDirectPredecessors(p)) {
			if (n instanceof Transition)
				result.add((Transition)n);
		}
		
		return result;
	}
	
	public Collection<Transition> getPresetTransitions(Collection<Place> ps) {
		Set<Transition> result = new HashSet<Transition>();
		
		for (Place p : ps)
			for (Node n : this.getDirectPredecessors(p))
				if (n instanceof Transition)
					result.add((Transition)n);
		
		return result;
	}
	
	public Collection<Node> getPreset(Node n) {
		return this.getDirectPredecessors(n);
	}
	
	public Collection<Node> getPreset(Collection<Node> ns) {
		return this.getDirectPredecessors(ns);
	}
	
	/**************************************************************************
	* Source/sink methods
	**************************************************************************/
	
	public Collection<Node> getSourceNodes() {
		if (this.DGA == null) this.DGA = new DirectedGraphAlgorithms<Flow, Node>();
		return this.DGA.getInputVertices(this);
	}
	
	public Collection<Place> getSourcePlaces() {
		Collection<Place> result = new ArrayList<Place>();
		for (Node n : this.getSourceNodes())
			if (n instanceof Place)
				result.add((Place)n);
		
		return result;
	}
	
	public Collection<Transition> getSourceTransitions() {
		Collection<Transition> result = new ArrayList<Transition>();
		for (Node n : this.getSourceNodes())
			if (n instanceof Transition)
				result.add((Transition)n);
		
		return result;
	}
	
	public Collection<Node> getSinkNodes() {
		if (this.DGA == null) this.DGA = new DirectedGraphAlgorithms<Flow, Node>();
		return this.DGA.getOutputVertices(this);
	}
	
	public Collection<Place> getSinkPlaces() {
		Collection<Place> result = new ArrayList<Place>();
		for (Node n : this.getSinkNodes())
			if (n instanceof Place)
				result.add((Place)n);
		
		return result;
	}
	
	public Collection<Transition> getSinkTransitions() {
		Collection<Transition> result = new ArrayList<Transition>();
		for (Node n : this.getSinkNodes())
			if (n instanceof Transition)
				result.add((Transition)n);
		
		return result;
	}
	
	/**************************************************************************
	* Clone
	**************************************************************************/
	
	/**
	 * Creates a deep copy of the whole Petri net. 
	 * @return the clone of the Petri net
	 */
	@Override
	public PetriNet clone() {
		PetriNet clone = (PetriNet) super.clone();
		
		// workaround since abstract graph notifier is not cloned
		clone.removeVertices(clone.getVertices());
		clone.removeEdges(clone.getEdges());
		
		Map<Node,Node> nodeCopies = new HashMap<Node, Node>();
		
		for (Node n : this.getNodes()) {
			Node c = (Node)n.clone();
			clone.addNode(c);
			nodeCopies.put(n,c);
		}
		
		//TODO
		/*for (Flow f : this.getFlowRelation()) {
			Node from = nodeCopies.get(f.getSource());
			Node to = nodeCopies.get(f.getTarget());
			clone.addFlow(from, to);
		}*/
		
		return clone;
	}
	
	/**************************************************************************
	* toDOT method
	**************************************************************************/
	
	/*@Override
	public String toDOT() {
		String result = "digraph G {\n";
		result += "graph [fontname=\"Helvetica\" fontsize=10 nodesep=0.35 ranksep=\"0.25 equally\"];\n";
		result += "node [fontname=\"Helvetica\" fontsize=10 fixedsize style=filled fillcolor=white penwidth=\"2\"];\n";
		result += "edge [fontname=\"Helvetica\" fontsize=10 arrowhead=normal color=black];\n";
		result += "\n";
		result += "node [shape=circle];\n";
		
		for (Place n : this.getPlaces()) {
			String label = ""; 
			result += String.format("\tn%s[label=\"%s\" width=\".3\" height=\".3\"];\n", n.getId().replace("-", ""), label);
		}
		
		result += "\n";
		result += "node [shape=box];\n";
		
		for (Transition t : this.getTransitions()) {
			if (t.getName()=="") result += String.format("\tn%s[label=\"%s\" width=\".3\" height=\".1\"];\n", t.getId().replace("-", ""), t.getName());
			else result += String.format("\tn%s[label=\"%s\" width=\".3\" height=\".3\"];\n", t.getId().replace("-", ""), t.getName());
		}
		
		result += "\n";
		for (Flow f: this.getFlowRelation()) {
			result += String.format("\tn%s->n%s;\n", f.getSource().getId().replace("-", ""), f.getTarget().getId().replace("-", ""));
		}
		result += "}\n";
		
		return result;
	}*/
}