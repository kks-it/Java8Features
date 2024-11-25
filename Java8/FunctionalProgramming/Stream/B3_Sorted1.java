package  Java8.FunctionalProgramming.Stream;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;


// The sorted() method is an intermediate operation that returns a stream 
// with elements sorted according to natural order or by a specified comparator.
// when to prefer over Collection.sort method? when dealing with streams and have to perform 
// other stream operations


// Question: sort fruits list in reverse alphabetical order
public class B3_Sorted1{
	public static void main(String[] args) {
		List<String> fruits = Arrays.asList("apple", "orange", "banana", "grape");
		
		List<String> sortedFruits = fruits.stream()
											.sorted(Comparator.reverseOrder())
											.collect(Collectors.toList());
		
		sortedFruits.forEach(System.out::println);
		
	}
}


class Book implements Comparable<Book> {
    private String title;
    private int year;

    public Book(String title, int year) {
        this.title = title;
        this.year = year;
    }
    
    

    @Override
    public int compareTo(Book other) {
        // Implement natural ordering by year
    	return this.year - other.year;
    }

    @Override
    public String toString() {
        return title + " (" + year + ")";
    }



	public String getTitle() {
		return title;
	}



	public int getYear() {
		return year;
	}
}



class BookTitleComparator implements Comparator<Book> {
    @Override
    public int compare(Book b1, Book b2) {
    	return b1.getTitle().compareTo(b2.getTitle());
    }
}

class BookYearComparator implements Comparator<Book>{
	@Override
	public int compare(Book b1, Book b2) {
		return b1.getYear() - b2.getYear();
	}
}

