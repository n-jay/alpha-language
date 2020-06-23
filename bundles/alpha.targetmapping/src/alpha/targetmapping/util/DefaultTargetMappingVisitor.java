package alpha.targetmapping.util;

import alpha.targetmapping.BandExpression;
import alpha.targetmapping.ContextExpression;
import alpha.targetmapping.ExtensionExpression;
import alpha.targetmapping.FilterExpression;
import alpha.targetmapping.GuardExpression;
import alpha.targetmapping.MarkExpression;
import alpha.targetmapping.ScheduleTreeExpression;
import alpha.targetmapping.SequenceExpression;
import alpha.targetmapping.SetExpression;
import alpha.targetmapping.TargetMapping;
import alpha.targetmapping.TargetMappingVisitable;
import alpha.targetmapping.TargetMappingVisitor;

public interface DefaultTargetMappingVisitor extends TargetMappingVisitor {
	
	default void defaultIn(TargetMappingVisitable tmv) {}
	default void defaultOut(TargetMappingVisitable tmv) {}
	
	/*
	 * Helper to avoid repeating null check all over the place.
	 */
	default void accept(TargetMappingVisitable tmv) {
		if (tmv != null) tmv.accept(this);
	}

	@Override
	default void visitTargetMapping(TargetMapping tm) {
		inTargetMapping(tm);
		accept(tm.getScheduleTreeRoot());
		outTargetMapping(tm);
	}
	
	@Override
	default void visitScheduleTreeExpression(ScheduleTreeExpression ste) {
		throw new UnsupportedOperationException("visitScheduleTreeExpression should never be called.");
	}
	
	@Override
	default void visitContextExpression(ContextExpression ce) {
		inContextExpression(ce);
		accept(ce.getChild());
		outContextExpression(ce);
	}
	
	@Override
	default void visitSetExpression(SetExpression se) {
		inSetExpression(se);
		se.getChildren().forEach(c->c.accept(this));
		outSetExpression(se);
	}
	
	@Override
	default void visitSequenceExpression(SequenceExpression se) {
		inSequenceExpression(se);
		se.getChildren().forEach(c->c.accept(this));
		outSequenceExpression(se);
	}
	
	@Override
	default void visitFilterExpression(FilterExpression fe) {
		inFilterExpression(fe);
		fe.getChild().accept(this);
		outFilterExpression(fe);
	}
	
	@Override
	default void visitGuardExpression(GuardExpression ge) {
		inGuardExpression(ge);
		ge.getChild().accept(this);
		outGuardExpression(ge);
	}
	
	@Override
	default void visitMarkExpression(MarkExpression me) {
		inMarkExpression(me);
		me.getChild().accept(this);
		outMarkExpression(me);
	}
	
	@Override
	default void visitBandExpression(BandExpression be) {
		inBandExpression(be);
		accept(be.getChild());
		outBandExpression(be);
	}
	
	@Override
	default void visitExtensionExpression(ExtensionExpression ee) {
		inExtensionExpression(ee);
		ee.getChild().accept(this);
		outExtensionExpression(ee);
	}
	
	
	@Override
	default void inTargetMapping(TargetMapping tm) {
		defaultIn(tm);
	}
	
	@Override
	default void inScheduleTreeExpression(ScheduleTreeExpression ste) {
		defaultIn(ste);
	}
	
	@Override
	default void inContextExpression(ContextExpression ce) {
		inScheduleTreeExpression(ce);
	}
	
	@Override
	default void inSetExpression(SetExpression se) {
		inScheduleTreeExpression(se);
	}
	
	@Override
	default void inSequenceExpression(SequenceExpression se) {
		inScheduleTreeExpression(se);		
	}
	
	@Override
	default void inFilterExpression(FilterExpression fe) {
		inScheduleTreeExpression(fe);
	}
	
	@Override
	default void inGuardExpression(GuardExpression ge) {
		inScheduleTreeExpression(ge);
	}
	
	@Override
	default void inMarkExpression(MarkExpression me) {
		inScheduleTreeExpression(me);	
	}
	
	@Override
	default void inBandExpression(BandExpression be) {
		inScheduleTreeExpression(be);
	}
	
	@Override
	default void inExtensionExpression(ExtensionExpression ee) {
		inScheduleTreeExpression(ee);
	}
	

	
	
	@Override
	default void outTargetMapping(TargetMapping tm) {
		defaultOut(tm);
	}
	
	@Override
	default void outScheduleTreeExpression(ScheduleTreeExpression ste) {
		defaultOut(ste);
	}
	
	@Override
	default void outContextExpression(ContextExpression ce) {
		outScheduleTreeExpression(ce);
	}
	
	@Override
	default void outSetExpression(SetExpression se) {
		outScheduleTreeExpression(se);
	}
	
	@Override
	default void outSequenceExpression(SequenceExpression se) {
		outScheduleTreeExpression(se);		
	}
	
	@Override
	default void outFilterExpression(FilterExpression fe) {
		outScheduleTreeExpression(fe);
	}
	
	@Override
	default void outGuardExpression(GuardExpression ge) {
		outScheduleTreeExpression(ge);
	}
	
	@Override
	default void outMarkExpression(MarkExpression me) {
		outScheduleTreeExpression(me);	
	}
	
	@Override
	default void outBandExpression(BandExpression be) {
		outScheduleTreeExpression(be);
	}
	
	@Override
	default void outExtensionExpression(ExtensionExpression ee) {
		outScheduleTreeExpression(ee);
	}
}
