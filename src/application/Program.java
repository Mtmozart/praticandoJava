package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

import entities.Avaliation;
import entities.Student;

public class Program {

	public static void main(String[] args) throws ParseException {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		ArrayList<Student> list = new ArrayList<>();
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		
		System.out.println("Digite 1 se deseja lançar as notas dos aluno  e 0 para não?");
		int desejo = sc.nextInt();
		sc.nextLine();
		
		while(desejo != 0) {
			System.out.println("Dados do aluno: ");
			System.out.print("Nome: ");
			String name = sc.nextLine();
			System.out.print("Classe: ");
			String classe = sc.nextLine();
			System.out.print("Número da chamada");
			Integer numberListStudents = sc.nextInt();
			
			Student student = new Student(name, classe, numberListStudents);
			sc.nextLine();
			System.out.println("Dados da avaliação 1: ");
			System.out.print("Nota");
			Double note = sc.nextDouble();
			sc.nextLine();
			System.out.print("Dia dd/mm/aaaa");
			String dateString = sc.nextLine();
			Date date = sdf.parse(dateString);
			Avaliation av1 = new Avaliation(student.getName(), student.getNumberList(), date, note);
			
			System.out.println("Dados avaliação 2");
			System.out.print("Nota");
			Double note2 = sc.nextDouble();
			sc.nextLine();
			System.out.print("Dia dd/mm/aaaa");
			String dateString2 = sc.nextLine();
			Date date2 = sdf.parse(dateString);
			Avaliation av2 = new Avaliation(student.getName(), student.getNumberList(), date2, note2);
			student.addNotes(av1, av2);
			student.stutendMean();
			
			System.out.println("*************************");
			System.out.println("Digite 1 se deseja lançar as notas dos aluno  e 0 para não?");
			desejo = sc.nextInt();
			
			sc.nextLine();
			list.add(student);
					
		}
		
		for (Student student : list ) {
			System.out.println(student.toString());
		}
		System.out.println("Obrigado por colaborar");
		

	}

}
