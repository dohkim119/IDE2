package com.oscar.opm.gef.editor.part;

import opm.OPMLink;
import opm.OPMProceduralLink;
import opm.OPMObject;
import opm.OPMProcess;
import opm.OPMObjectProcessDiagram;
import org.eclipse.gef.EditPart;
import org.eclipse.gef.EditPartFactory;

public class OPMEditPartFactory implements EditPartFactory
{
	@Override
	public EditPart createEditPart(EditPart context, Object model)
	{
		EditPart part = null;
		
		/*part = model instanceof OPMObjectProcessDiagram ? new OPMObjectProcessDiagramEditPart() :
			         		 model instanceof OPMObject ? new OPMObjectEditPart() :
					    	model instanceof OPMProcess ? new OPMProcessEditPart() :
							   model instanceof OPMLink ? new OPMLinkEditPart() : null; // Alex's choice  */
		
		
		if (model instanceof OPMObjectProcessDiagram) part = new OPMObjectProcessDiagramEditPart();
		else if (model instanceof OPMObject) part = new OPMObjectEditPart();/*{
			if(model instanceof OscarCode) part = new OscarCodeEditPart();
			else part = new OPMObjectEditPart();
		}*/
		else if (model instanceof OPMProcess) part = new OPMProcessEditPart();
		else if (model instanceof OPMProceduralLink) part = new OPMProceduralLinkEditPart();
		else if (model instanceof OPMLink) part = new OPMLinkEditPart();
		//else if (model instanceof OPMStructuralLinkAggregator) part = new OPMStructuralLinkAggregatorEditPart();
		else throw new IllegalArgumentException("Model class " +model.getClass()+ " not supported yet.");
		
		if (part != null) part.setModel(model);
		
		
		return part;
	}
}
