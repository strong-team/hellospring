package com.wcj.entity;

public class Printer {
	private Paper paper;
	private InkBox inkBox;
	
	public void setPaper(Paper paper) {
		this.paper = paper;
	}
	public void setInkBox(InkBox inkBox) {
		this.inkBox = inkBox;
	}
	 public void print(){
		 System.out.println("在"+paper.showSize()+inkBox.showColor());
	 }
}
