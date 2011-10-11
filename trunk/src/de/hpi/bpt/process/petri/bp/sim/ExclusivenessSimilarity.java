package de.hpi.bpt.process.petri.bp.sim;

import de.hpi.bpt.process.petri.bp.RelSetAlignment;
import de.hpi.bpt.process.petri.bp.RelSetType;

/**
 * Scores two models by only assessing the overlap of their
 * exclusiveness relation.
 * 
 * @author matthias.weidlich
 *
 */
public class ExclusivenessSimilarity extends AbstractRelSetSimilarity {

	public double score(RelSetAlignment alignment) {
		double in1 = super.getSizeOfRelation(alignment.getFirstRelationSet(), RelSetType.Exclusive);
		double in2 = super.getSizeOfRelation(alignment.getSecondRelationSet(), RelSetType.Exclusive);
		
		double intersection = super.getSizeOfIntersectionOfRelation(alignment, RelSetType.Exclusive);
		
		return (intersection > 0) ? (intersection / (in1 + in2 - intersection)) : 0;
	}
}