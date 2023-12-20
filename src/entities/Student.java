package entities;

import java.text.SimpleDateFormat;

import entities.status.Status;

public class Student {

	private String name;
	private String classRoom;
	private Integer numberList;
	private Avaliation av1;
	private Avaliation av2;
	private Double mean;
	private Status staus;

	
	 private SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
	public Student() {

	}

	public Student(String name, String classRoom, Integer numberList) {
		super();
		this.name = name;
		this.classRoom = classRoom;
		this.numberList = numberList;
	}

	public String getName() {
		return name;
	}

	public String getClassRoom() {
		return classRoom;
	}

	public Integer getNumberList() {
		return numberList;
	}

	public Avaliation getAv1() {
		return av1;
	}

	public Avaliation getAv2() {
		return av2;
	}

	public Double getMean() {
		return mean;
	}

	public Status getStaus() {
		return staus;
	}
	
	public void addNotes(Avaliation av1, Avaliation av2) {
		this.av1 = av1;
		this.av2 = av2;
	}
	
	public void stutendMean() {
		double mean = (this.av1.getNote() + this.av2.getNote()) / 2;
		this.mean = mean;
		if(mean <= 7) {
			 this.staus = Status.APROVED;
		}
			 this.staus = Status.REPROVED;			
		}

	@Override
	public String toString() {
		return "O estudande " + name + ", da  classe " + classRoom + ", com o número " + numberList + 
				", fez a avaliação 1 no dia " + sdf.format(av1.getDate()) 
				+ " e a avaliação 2 no dia " + sdf.format(av2.getDate()) + "tirando respectivamente " + av1.getNote() 
				+ ", " + av2.getNote()
				+ ", ficando com a média " + this.mean + " e o status " + this.staus;
				
	}
	
	
	

}
