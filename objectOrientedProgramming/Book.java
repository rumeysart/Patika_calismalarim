package objectOrientedProgramming;
//encapsulation --kapsülleme--

public class Book {
	private String name;
	private int pageNumber;
	
	public Book(String name, int pageNumber)
	{
		this.name = name;
		if (pageNumber < 0)
		{
			pageNumber = 0;
		}
		this.pageNumber = pageNumber;
	}
	public int showPageNumber() {//aslinda getter methodu uyguladik
		return this.pageNumber;
	}
	public void changePageNumber(int pageNumber)
	{
		if(pageNumber < 0)
			pageNumber = 0;
		this.pageNumber = pageNumber;
	}
	public String showName()
	{
		return this.name;
	}
	public void changeName(String name)//aslinda setter methodu uyguluyoruz burada
	{
		this.name = name;
	}
}
