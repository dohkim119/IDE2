package com.oscar.opm.gef.editor.command;

import org.eclipse.gef.commands.Command;

import opm.OPMLink;
import opm.OPMObjectProcessDiagram;
import opm.OPMNode;


public class OPMLinkCreateCommand extends Command {
	
	private OPMNode source;
	private OPMNode target;
	private OPMLink link;
	private OPMObjectProcessDiagram opd;
	
	@Override
	public boolean canExecute() {
		return (source != null) && (target != null) && (link != null) && (opd!=null); 
	}
	
	@Override
	public void execute() {
		link.setSource(source);
		link.setTarget(target);
		link.setOpd(opd);
	}
	
	@Override
	public void undo() {
		link.getSource().getOutgoingLinks().remove(link);
		link.setSource(null);
		link.getTarget().getIncomingLinks().remove(link);
		link.setTarget(null);
		link.setOpd(null);
	}
	
	public void setTarget(OPMNode target) {
		this.target = target;
	}
	
	public void setSource(OPMNode source) {
		this.source = source;
	}
	
	public void setLink(OPMLink link) {
		this.link = link;
	}
	
	public void setOPD(OPMObjectProcessDiagram opd) {
		this.opd = opd;
	}
	
}
