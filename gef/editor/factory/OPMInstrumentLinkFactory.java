package com.oscar.opm.gef.editor.factory;

import org.eclipse.gef.requests.CreationFactory;

import opm.OpmFactory;
import opm.OPMProceduralLink;
import opm.OPMProceduralLinkKind;

public class OPMInstrumentLinkFactory implements CreationFactory {

	@Override
	public Object getNewObject() {
		OPMProceduralLink link = OpmFactory.eINSTANCE.createOPMProceduralLink();
		link.setKind(OPMProceduralLinkKind.INSTRUMENT);
		return link;
	}

	@Override
	public Object getObjectType() {
		return OPMProceduralLink.class;
	}
}
