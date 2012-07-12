package org.jbpt.test.tree;

import java.util.ArrayList;
import java.util.Collection;

import junit.framework.TestCase;

import org.jbpt.algo.tree.rpst.RPST;
import org.jbpt.algo.tree.rpst.RPSTNode;
import org.jbpt.graph.DirectedEdge;
import org.jbpt.graph.MultiDirectedGraph;
import org.jbpt.hypergraph.abs.Vertex;
import org.jbpt.utils.IOUtils;

public class RPSTTest extends TestCase {
	
	/**
	 * This test is taken from: 
	 * Artem Polyvyanyy, Jussi Vanhatalo, Hagen V�lzer: Simplified Computation and Generalization of the Refined Process Structure Tree. WS-FM 2010: 25-41. 
	 * See Figures 8 & 9.
	 */
	/*public void testWSFM10_Figures8and9() {
		MultiDirectedGraph g = new MultiDirectedGraph();
		
		Vertex s = new Vertex("s");
		Vertex y = new Vertex("y");
		Vertex z = new Vertex("z");
		Vertex t = new Vertex("t");
		
		g.addEdge(s,y);
		g.addEdge(y,z);
		g.addEdge(y,z);
		g.addEdge(z,y);
		g.addEdge(z,t);
		
		RPST<DirectedEdge,Vertex> rpst = new RPST<DirectedEdge,Vertex>(g);
		IOUtils.toFile("rpst.dot", rpst.toDOT());
		rpst.test();
		
		performBasicChecks(g,rpst);
		
		for (RPSTNode<DirectedEdge,Vertex> node : rpst.getRPSTNodes()) {
			System.out.println(node);
		}
	}*/
	
	/**
	 * This test is taken from: 
	 * Artem Polyvyanyy, Jussi Vanhatalo, Hagen V�lzer: Simplified Computation and Generalization of the Refined Process Structure Tree. WS-FM 2010: 25-41. 
	 * See Figure 6.
	 */
	/*public void testWSFM10_Figure6() {
		MultiDirectedGraph g = new MultiDirectedGraph();
		
		Vertex s = new Vertex("s");
		Vertex u = new Vertex("u");
		Vertex v = new Vertex("v");
		Vertex w = new Vertex("w");
		Vertex x = new Vertex("x");
		Vertex t = new Vertex("t");
		
		g.addEdge(s,u);
		g.addEdge(u,v);
		g.addEdge(v,x);
		g.addEdge(u,w);
		g.addEdge(w,x);
		g.addEdge(v,w);
		g.addEdge(x,t);
		
		RPST<DirectedEdge,Vertex> rpst = new RPST<DirectedEdge,Vertex>(g);
		IOUtils.toFile("rpst.dot", rpst.toDOT());
		rpst.test();
		
		performBasicChecks(g,rpst);
		
		for (RPSTNode<DirectedEdge,Vertex> node : rpst.getRPSTNodes()) {
			System.out.println(node);
		}
	}*/
	
	/**
	 * This test is taken from: 
	 * Jussi Vanhatalo, Hagen V�lzer, Jana Koehler: The Refined Process Structure Tree. BPM 2008: 100-115.  
	 * See Figure 11.
	 */
	/*public void testBPM08_Figure6() {
		MultiDirectedGraph g = new MultiDirectedGraph();
		
		Vertex s = new Vertex("s");
		Vertex t = new Vertex("t");
		Vertex v1 = new Vertex("v1");
		Vertex v2 = new Vertex("v2");
		Vertex v3 = new Vertex("v3");
		Vertex v4 = new Vertex("v4");
		Vertex v5 = new Vertex("v5");
		Vertex v6 = new Vertex("v6");
		Vertex v7 = new Vertex("v7");
		
		g.addVertex(s);
		g.addVertex(t);
		g.addVertex(v1);
		g.addVertex(v2);
		g.addVertex(v3);
		g.addVertex(v4);
		g.addVertex(v5);
		g.addVertex(v6);
		g.addVertex(v7);
		
		g.addEdge(s,v1);
		g.addEdge(s,v2);
		g.addEdge(v1,v3);
		g.addEdge(v1,v5);
		g.addEdge(v2,v5);
		g.addEdge(v3,v2);
		g.addEdge(v3,v4);
		g.addEdge(v4,v1);
		g.addEdge(v4,v2);
		g.addEdge(v5,v6);
		g.addEdge(v5,v7);
		g.addEdge(v6,v5);
		g.addEdge(v6,v7);
		g.addEdge(v7,v5);
		g.addEdge(v7,t);
		
		RPST<DirectedEdge,Vertex> rpst = new RPST<DirectedEdge,Vertex>(g);
		IOUtils.toFile("rpst.dot", rpst.toDOT());
		rpst.test();
		
		performBasicChecks(g,rpst);
		
		for (RPSTNode<DirectedEdge,Vertex> node : rpst.getRPSTNodes()) {
			System.out.println(node);
		}
	}*/
	
	/**
	 * This test is taken from: 
	 * Artem Polyvyanyy, Jussi Vanhatalo, Hagen V�lzer: Simplified Computation and Generalization of the Refined Process Structure Tree. WS-FM 2010: 25-41. 
	 * See Figure 11.
	 */
	/*public void testWSFM10_Figure11() {
		MultiDirectedGraph g = new MultiDirectedGraph();
		
		Vertex s = new Vertex("s");
		Vertex t = new Vertex("t");
		Vertex u = new Vertex("u");
		Vertex v = new Vertex("v");
		Vertex a1 = new Vertex("a1");
		Vertex a2 = new Vertex("a2");
		
		g.addEdge(s,u);
		g.addEdge(u,a1);
		g.addEdge(a1,u);
		g.addEdge(u,a2);
		g.addEdge(a2,v);
		g.addEdge(v,u);
		g.addEdge(v,t);
		
		RPST<DirectedEdge,Vertex> rpst = new RPST<DirectedEdge,Vertex>(g);
		IOUtils.toFile("rpst.dot", rpst.toDOT());
		rpst.test();
		
		performBasicChecks(g,rpst);
		
		for (RPSTNode<DirectedEdge,Vertex> node : rpst.getRPSTNodes()) {
			System.out.println(node);
		}
	}*/
	
	/**
	 * This test is taken from: 
	 * Artem Polyvyanyy, Jussi Vanhatalo, Hagen V�lzer: Simplified Computation and Generalization of the Refined Process Structure Tree. WS-FM 2010: 25-41. 
	 * See Figure 12(a).
	 */
	/*public void testWSFM10_Figure12a() {
		MultiDirectedGraph g = new MultiDirectedGraph();
		
		Vertex s = new Vertex("s");
		Vertex t = new Vertex("t");
		Vertex u = new Vertex("u");
		Vertex v = new Vertex("v");
		
		g.addEdge(s,u);
		g.addEdge(u,v);
		g.addEdge(v,u);
		g.addEdge(u,t);
		
		RPST<DirectedEdge,Vertex> rpst = new RPST<DirectedEdge,Vertex>(g);
		IOUtils.toFile("rpst.dot", rpst.toDOT());
		rpst.test();
		
		performBasicChecks(g,rpst);
		
		for (RPSTNode<DirectedEdge,Vertex> node : rpst.getRPSTNodes()) {
			System.out.println(node);
		}
	}*/
	
	/**
	 * This test is taken from: 
	 * Artem Polyvyanyy, Jussi Vanhatalo, Hagen V�lzer: Simplified Computation and Generalization of the Refined Process Structure Tree. WS-FM 2010: 25-41. 
	 * See Figure 12(b).
	 */
	/*public void testWSFM10_Figure12b() {
		MultiDirectedGraph g = new MultiDirectedGraph();
		
		Vertex s = new Vertex("s");
		Vertex t = new Vertex("t");
		Vertex u = new Vertex("u");
		Vertex v = new Vertex("v");
		Vertex w = new Vertex("w");
		
		g.addEdge(s,u);
		g.addEdge(u,v);
		g.addEdge(v,u);
		g.addEdge(u,t);
		g.addEdge(u,w);
		g.addEdge(w,u);
		
		RPST<DirectedEdge,Vertex> rpst = new RPST<DirectedEdge,Vertex>(g);
		IOUtils.toFile("rpst.dot", rpst.toDOT());
		rpst.test();
		
		performBasicChecks(g,rpst);
		
		for (RPSTNode<DirectedEdge,Vertex> node : rpst.getRPSTNodes()) {
			System.out.println(node);
		}
	}*/
	
	/**
	 * This test is taken from: 
	 * Artem Polyvyanyy, Jussi Vanhatalo, Hagen V�lzer: Simplified Computation and Generalization of the Refined Process Structure Tree. WS-FM 2010: 25-41. 
	 * See Figure 12(c).
	 */
	/*public void testWSFM10_Figure12c() {
		MultiDirectedGraph g = new MultiDirectedGraph();
		
		Vertex s = new Vertex("s");
		Vertex t = new Vertex("t");
		Vertex u = new Vertex("u");
		Vertex v = new Vertex("v");
		Vertex w = new Vertex("w");
		
		g.addEdge(s,u);
		g.addEdge(u,t);
		g.addEdge(u,v);
		g.addEdge(v,u);
		g.addEdge(v,w);
		g.addEdge(w,v);
		
		RPST<DirectedEdge,Vertex> rpst = new RPST<DirectedEdge,Vertex>(g);
		IOUtils.toFile("rpst.dot", rpst.toDOT());
		rpst.test();
		
		performBasicChecks(g,rpst);
		
		for (RPSTNode<DirectedEdge,Vertex> node : rpst.getRPSTNodes()) {
			System.out.println(node);
		}
	}*/
	
	/**
	 * This test is taken from: 
	 * Artem Polyvyanyy, Jussi Vanhatalo, Hagen V�lzer: Simplified Computation and Generalization of the Refined Process Structure Tree. WS-FM 2010: 25-41. 
	 * See Figure 13.
	 * 
	 * TODO: an edge is a trivial fragment!
	 */
	/*public void testWSFM10_Figure13() {
		MultiDirectedGraph g = new MultiDirectedGraph();
		
		Vertex u = new Vertex("u");
		Vertex v = new Vertex("v");
		Vertex w = new Vertex("w");
		Vertex x = new Vertex("x");
		Vertex y = new Vertex("y");
		Vertex z = new Vertex("z");
		Vertex q = new Vertex("q");
		
		g.addEdge(u,w);
		g.addEdge(v,w);
		g.addEdge(w,x);
		g.addEdge(x,y);
		g.addEdge(x,z);
		g.addEdge(w,q);
		
		RPST<DirectedEdge,Vertex> rpst = new RPST<DirectedEdge,Vertex>(g);
		IOUtils.toFile("rpst.dot", rpst.toDOT());
		rpst.test();
		
		performBasicChecks(g,rpst);
		
		for (RPSTNode<DirectedEdge,Vertex> node : rpst.getRPSTNodes()) {
			System.out.println(node);
		}
	}*/
	
	/**
	 * This test is taken from: 
	 * Artem Polyvyanyy, Jussi Vanhatalo, Hagen V�lzer: Simplified Computation and Generalization of the Refined Process Structure Tree. WS-FM 2010: 25-41. 
	 * See Figure 14.
	 * TODO
	 */
	public void testWSFM10_Figure14() {
		MultiDirectedGraph g = new MultiDirectedGraph();
		
		Vertex u = new Vertex("u");
		Vertex v = new Vertex("v");
		Vertex w = new Vertex("w");
		Vertex x = new Vertex("x");
		Vertex y = new Vertex("y");
		Vertex z = new Vertex("z");
		Vertex q = new Vertex("q");
		
		g.addEdge(u,v);
		g.addEdge(v,w);
		g.addEdge(v,x);
		g.addEdge(y,z);
		g.addEdge(z,q);
		
		RPST<DirectedEdge,Vertex> rpst = new RPST<DirectedEdge,Vertex>(g);
		IOUtils.toFile("rpst.dot", rpst.toDOT());
		rpst.debug();
		
		performBasicChecks(g,rpst);
		
		for (RPSTNode<DirectedEdge,Vertex> node : rpst.getRPSTNodes()) {
			System.out.println(node);
		}
	}
	
	/*public void testTrivialGraph2() {
		System.out.println("========================================================");
		System.out.println("Trivial Graph");
		System.out.println("========================================================");
		
		DirectedGraph g = new DirectedGraph();
		
		Vertex v1 = new Vertex("1");
		Vertex v2 = new Vertex("2");
		
		g.addEdge(v1, v2);
		
		RPST<DirectedEdge,Vertex> rpst = new RPST<DirectedEdge,Vertex>(g);
		
		System.out.println(rpst);
		
		for (RPSTNode<DirectedEdge,Vertex> node : rpst.getVertices()) {
			System.out.println(node.getName() + " : " + node.getFragment());
		}
		
		for (IDirectedEdge<Vertex> edge: rpst.getRoot().getFragmentEdges())
			System.out.println(edge);
	}
		
	public void testTrivialGraph() {
		System.out.println("========================================================");
		System.out.println("Trivial Graph");
		System.out.println("========================================================");
		
		DirectedGraph g = new DirectedGraph();
		
		Vertex v1 = new Vertex("1");
		Vertex v2 = new Vertex("2");
		
		g.addEdge(v1, v2);
		
		RPST<DirectedEdge,Vertex> rpst = new RPST<DirectedEdge,Vertex>(g);
		
		System.out.println(rpst);
		
		for (RPSTNode<DirectedEdge,Vertex> node : rpst.getVertices()) {
			System.out.println(node.getName() + " : " + node.getFragment());
		}
	}*/
	
	private void performBasicChecks(MultiDirectedGraph g, RPST<DirectedEdge, Vertex> rpst) {
		for (RPSTNode<DirectedEdge,Vertex> node : rpst.getRPSTNodes()) {
			assertTrue(g.getEdges().containsAll(node.getFragment()));
			
			Collection<DirectedEdge> edges = new ArrayList<DirectedEdge>();
			for (RPSTNode<DirectedEdge,Vertex> child : rpst.getChildren(node)) {
				edges.addAll(child.getFragment());
			}
			
			assertTrue(node.getFragment().containsAll(edges));
		}
	}
	
	
	
	/*public void testSimpleGraph() {
		System.out.println("========================================================");
		System.out.println("Simple Graph");
		System.out.println("========================================================");
		
		DirectedGraph g = new DirectedGraph();
		
		Vertex s = new Vertex("s");
		Vertex t = new Vertex("t");
		Vertex y = new Vertex("y");
		Vertex z = new Vertex("z");
		
		g.addVertex(s);
		g.addVertex(t);
		g.addVertex(y);
		g.addVertex(z);
		
		g.addEdge(s,y);
		g.addEdge(y,z);
		g.addEdge(z,y);
		g.addEdge(z,t);
		
		System.out.println(g);
		
		RPST<DirectedEdge,Vertex> rpst = new RPST<DirectedEdge,Vertex>(g);
		
		System.out.println(rpst);
		
		for (RPSTNode<DirectedEdge,Vertex> node : rpst.getVertices()) {
			System.out.println(node.getName() + " : " + node.getFragment());
		}
	}
	
	
	public void testBondsTest() {
		
		System.out.println("========================================================");
		System.out.println("Bonds test");
		System.out.println("========================================================");
		
		//		  --- t3 --- t4 ---
		//		  |				  |
		// t1 -- s2 ------------ j5 -- t9
		//	.	  |				  |		.
		//	.	  |_ s6 ---- j7 __|		.
		// 	.		  |_ t8 _|			.
		//	............................. 
		
		ProcessModel p = new ProcessModel();
		
		Activity t1 = new Activity("1");
		Activity t3 = new Activity("3");
		Activity t4 = new Activity("4");
		Activity t8 = new Activity("8");
		Activity t9 = new Activity("9");
		
		Gateway s2 = new XorGateway("2");
		Gateway s6 = new XorGateway("6");
		Gateway j7 = new XorGateway("7");
		Gateway j5 = new XorGateway("5");
		
		p.addControlFlow(t1, s2);
		p.addControlFlow(s2, t3);
		p.addControlFlow(s2, s6);
		p.addControlFlow(s2, j5);
		p.addControlFlow(t3, t4);
		p.addControlFlow(t4, j5);
		p.addControlFlow(s6, j7);
		p.addControlFlow(s6, t8);
		p.addControlFlow(t8, j7);
		p.addControlFlow(j7, j5);
		p.addControlFlow(j5, t9);
		
		RPST<ControlFlow<FlowNode>,FlowNode> rpst = new RPST<ControlFlow<FlowNode>,FlowNode>(p);
		
		System.out.println(rpst);
		
		assertEquals(rpst.getVertices().size(), 17);
		assertEquals(rpst.getEdges().size(), 16);
		assertEquals(rpst.getVertices(TCType.B).size(), 2);
		assertEquals(rpst.getVertices(TCType.R).size(), 0);
		assertEquals(rpst.getVertices(TCType.P).size(), 4);
		assertEquals(rpst.getVertices(TCType.T).size(), 11);
	}*/
}