package nl.hva.dmci.ict.se.datastructures;

/**
 * Created by Gregor on 22/10/2017.
 */
public class Main {
	
	public static void main(String[] args) {
		// write your code here
	
		
		Student[] students = new Student[10000];
		ArrayST<Double, Integer> st = new ArrayST<Double, Integer>();
		for(int i=1; i<10000; i++){
			int studentnummer = 50080001;
			students[i] = new Student(studentnummer);
			if (st.contains(students[i].getCijfer())) st.put(students[i].getCijfer(), st.get(students[i].getCijfer())+1);
			else st.put(students[i].getCijfer(), 1);
			studentnummer = (studentnummer +1);
		}
		for (double n : st) StdOut.println(n + ", "+st.get(n));
			
		}

		}

		
