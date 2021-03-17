package books;

public class BookShop {

    private final String name;

    /**
     * Constructor of the class Book shop
     * @param name name of the book shop
     */
    public BookShop(String name){
        this.name = name;
    }

    /**
     * method to compute the cost of a basket
     * @param books array corresponding to the number of each harry potter book the client desire to buy (books.length should return 5)
     * @return the cost in euro with the discount
     */
    public double cost(int[] books){
        double total;
        int number_of_different_books = 0;
        int total_number_of_books = 0;
        
        for (int i = 0; i < 5; i++) { //done on purpose so that there is an exception if book.length < 5
        	int numberofbooks = books[i];
        	if (numberofbooks > 0) {
        		number_of_different_books +=1;
        	}
        	total_number_of_books += numberofbooks;
        }
        
        double price_of_discounted_books = 0;
        
        switch (number_of_different_books) {
        case 2:
        	price_of_discounted_books = 2*8*0.93;
        	break;
        case 3:
        	price_of_discounted_books =3*8*0.86;
        	break;
        case 4:
        	price_of_discounted_books = 4*8*0.72;
        	break;
        case 5:
        	price_of_discounted_books = 5*8*0.65;
        	break;
        }
        if (number_of_different_books > 1) {
	        int books_without_discount = total_number_of_books - number_of_different_books;
	        total = books_without_discount*8 + price_of_discounted_books;
        } else {
        	total = total_number_of_books*8;
        }
        total = Math.round(total*100.00)/100.00;
        return total;
    }
}
