package ch23;

import java.util.ArrayList;
import ch21.Book;

public class ArrayListTest {

	public static void main(String[] args) {
		
		ArrayList<Book> library = new ArrayList<>(); // 배열의 default size는 10이다.
		
		library.add(new Book("태백산맥1", "조형래"));
		library.add(new Book("태백산맥2", "조형래"));
		library.add(new Book("태백산맥3", "조형래"));
		library.add(new Book("태백산맥4", "조형래"));
		library.add(new Book("태백산맥5", "조형래"));
		
		for (int i = 0; i < library.size(); i++) {
			library.get(i).showInfo();
		}
		
	}
	
}
