package nl.hva.dmci.ict.se.datastructures;

import java.util.Random;

/**
 * Created by Gregor on 22/10/2017.
 */
public class Student
{
	private int studentNummer;
	private double cijfer;
	Random generator = new Random();
	int min = 1;
	int max = 10;
	
	public Student(int studentnummer)
	{
		studentNummer = studentnummer;
		cijfer = (generator.nextInt((int)((max-min)*10+1))+min*10) / 10.0;
	}
	
	public double getCijfer()
	{
		return cijfer;
	}
}
