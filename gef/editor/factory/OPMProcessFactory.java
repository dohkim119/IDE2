package com.oscar.opm.gef.editor.factory;

import org.eclipse.gef.requests.CreationFactory;

import opm.OpmFactory;
import opm.OPMProcess;

public class OPMProcessFactory implements CreationFactory {

	@Override
	public Object getNewObject() {
		return OpmFactory.eINSTANCE.createOPMProcess();
	}

	@Override
	public Object getObjectType() {
		return OPMProcess.class;
	}

}
