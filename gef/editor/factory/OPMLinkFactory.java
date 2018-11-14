package com.oscar.opm.gef.editor.factory;

import org.eclipse.gef.requests.CreationFactory;

import opm.OpmFactory;
import opm.OPMLink;

public class OPMLinkFactory implements CreationFactory {

	@Override
	public Object getNewObject() {
		return OpmFactory.eINSTANCE.createOPMLink();
	}

	@Override
	public Object getObjectType() {
		return OPMLink.class;
	}

}
