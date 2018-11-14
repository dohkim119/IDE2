package com.oscar.opm.gef.editor.part;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.draw2d.ConnectionAnchor;
import org.eclipse.draw2d.IFigure;
import org.eclipse.draw2d.Label;
import org.eclipse.gef.CompoundSnapToHelper;
import org.eclipse.gef.ConnectionEditPart;
import org.eclipse.gef.EditPolicy;
import org.eclipse.gef.GraphicalEditPart;
import org.eclipse.gef.NodeEditPart;
import org.eclipse.gef.Request;
import org.eclipse.gef.RequestConstants;
import org.eclipse.gef.SnapToGeometry;
import org.eclipse.gef.SnapToGrid;
import org.eclipse.gef.SnapToHelper;
import org.eclipse.gef.editpolicies.SnapFeedbackPolicy;
import org.eclipse.jface.viewers.TextCellEditor;

import com.oscar.opm.gef.editor.figure.OPMThingFigure;
import com.oscar.opm.gef.editor.policy.OPMThingDirectEditPolicy;
import com.oscar.opm.model.OPMThing;

public abstract class OPMThingEditPart extends OPMNodeEditPart implements NodeEditPart{
	
	
	public OPMThingEditPart() {
		super();
	}
	
	@Override 
	protected void createEditPolicies() {
		super.createEditPolicies();
		installEditPolicy(EditPolicy.DIRECT_EDIT_ROLE,new OPMThingDirectEditPolicy());
		installEditPolicy("Snap Feedback",new SnapFeedbackPolicy());
		}
	
	@Override 
	public void performRequest(Request req) {
		if(req.getType() == RequestConstants.REQ_DIRECT_EDIT) {
			performDirectEditing();
		}	
	}
	
	private void performDirectEditing() {
		Label label = ((OPMThingFigure)getFigure()).getNameLabel();
		OPMThingDirectEditManager manager = new OPMThingDirectEditManager(this, TextCellEditor.class, new OPMThingCellEditorLocator(label), label);
		manager.show();
	}
	
	
	@Override
	protected void refreshVisuals()
	{
		OPMThingFigure figure = (OPMThingFigure)getFigure();
		OPMThing model = (OPMThing)getModel();
		GraphicalEditPart parent = (GraphicalEditPart) getParent();
		
		figure.getNameLabel().setText(model.getName());
		parent.setLayoutConstraint(this, figure, model.getConstraints());
		
		figure.setTooltipText(model.getDescription());
	}
	
	
	@Override
	public IFigure getContentPane() {
		return ((OPMThingFigure)getFigure()).getContentPane();
	}
	
	
	@Override public Object getAdapter(Class key) {
		if(key == SnapToHelper.class) {
			List<SnapToHelper> helpers = new ArrayList<SnapToHelper>();
			if (Boolean.TRUE.equals(getViewer().getProperty(SnapToGeometry.PROPERTY_SNAP_ENABLED))) {
				helpers.add(new SnapToGeometry(this));
			}
			if (Boolean.TRUE.equals(getViewer().getProperty(SnapToGrid.PROPERTY_GRID_ENABLED))) {
				helpers.add(new SnapToGrid(this));
			}
			if(helpers.size()==0) return null;
			else return new CompoundSnapToHelper(helpers.toArray(new SnapToHelper[0]));
		}
		return super.getAdapter(key);
	}
	
	
}
	

