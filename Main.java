import java.util.ArrayList;

public class Main {
	public static void main(String[] args) {
		
		ArrayList<Student> students = new ArrayList<>();
		
		students.add(new Student(12, "Carly", "Denver"));
		students.add(new Student(3, "Camila", "Colorado Springs"));
		students.add(new Student(8, "Chloe", "Aurora"));
		students.add(new Student(1, "Caden", "Fort Collins"));
		students.add(new Student(15, "Claire", "Lakewood"));
		students.add(new Student(6, "Cassandra", "Thornton"));
		students.add(new Student(2, "Cody", "Arvada"));
		students.add(new Student(9, "Carmen", "Pueblo"));
		students.add(new Student(4, "Colton", "Greeley"));
		students.add(new Student(11, "Cecilia", "Loveland"));
		
		System.out.println("Original List:");
		students.forEach(System.out::println);
		
		SelectionSort.selectionSort(students, new SortByName());
		System.out.println("\nSorted by Name:");
		students.forEach(System.out::println);
		
		SelectionSort.selectionSort(students, new SortbyRollno());
		System.out.println("\nSorted by Roll Number:");
		students.forEach(System.out::println);
	}
}