package com.oscar.opm.gef.editor.command;

import org.eclipse.gef.commands.Command;

import com.oscar.opm.model.OPMThing;

public class OPMThingRenameCommand extends Command {
	
	private String oldName;
	private String newName;
	private OPMThing model;
	
	@Override
	public void execute() {
		oldName = model.getName();
		model.setName(newName);
	}
	
	@Override
	public void undo() {
		model.setName(oldName);
	}
	
	public void setNewName(String newName) {
		this.newName = newName;
	}
	
	public void setModel(OPMThing model) {
		this.model = model;
		
	}
	
}
