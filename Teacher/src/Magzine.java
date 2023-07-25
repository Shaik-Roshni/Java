
public class Magzine {
		String title;
		String author;
		String publisher;
		int edition;
		long cost;
		int page;
		public Magzine(String title, String author, String publisher, int edition, long cost, int page) {
			super();
			this.title = title;
			this.author = author;
			this.publisher = publisher;
			this.edition = edition;
			this.page = page;
			this.cost = cost;
		}
		void open()
		{
			System.out.println(title+" "+"  titled book "+" "+ "is published by "+" "+publisher+" "+" which costs "+cost+" "+" is opened " );
		}
		void close()
		{ 
			System.out.println(author+" "+" who titles a book called "+ title+" "+" which is the edition type of "+edition+" "+" is closed ");
		}
		void turnPage()
		{
			System.out.println(" Turned the page to "+page);
		}
	}