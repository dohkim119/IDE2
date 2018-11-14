package com.oscar.opm.gef.editor.factory;

import org.eclipse.gef.requests.CreationFactory;

import opm.OpmFactory;
import opm.OPMObject;


public class OPMObjectFactory implements CreationFactory {

	@Override
	public Object getNewObject() {
		return OpmFactory.eINSTANCE.createOPMObject();
	}

	@Override
	public Object getObjectType() {
		return OPMObject.class;
	}

}
