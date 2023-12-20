package entities;


import java.util.Date;

public class Avaliation {

	private String name;
	private Integer numberList;
	private Date date;
	private Double note;
	

	public Avaliation() {
		
	}


	public Avaliation(String name, Integer numberList, Date date, Double note) {
		this.name = name;
		this.numberList = numberList;
		this.date = date;
		this.note = note;
	}


	public String getName() {
		return name;
	}


	public Integer getNumberList() {
		return numberList;
	}


	public Date getDate() {
		return date;
	}


	public Double getNote() {
		return note;
	}




	    
	
}
