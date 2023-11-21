public class Book {
	public String title,author;
	public int pagecount;
	
	public void insertRecord(String title,String author, int pagecount) {
		this.title = title;
		this.author = author;
		this.pagecount = pagecount;
	}
	public void displayInfo() {
		System.out.format("title[%s] author[%s] pagecount[%d]\n",title,author,pagecount);
	}
}
