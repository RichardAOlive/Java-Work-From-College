public class Book {
    private String author;
    private String title;
    private String publisher;
    private int pages;
    private int year;

    public Book()
    {
        author = "unknown";
        title = "unknown";
        publisher = "unknown";
        pages = 0;
        year = 0;
    }

    public void setAuthor(String newAuthor)
    {
        author = newAuthor;
    }
    public void setTitle(String newTitle)
    {
        title = newTitle;
    }
    public void setPublisher(String newPublisher)
    {
        publisher = newPublisher;
    }
    public void setPages(int newPages)
    {
        pages = newPages;
    }
    public void setYear(int newYear)
    {
        year = newYear;
    }

    public String getAuthor()
    {
        return author;
    }
    public String getTitle()
    {
        return title;
    }
    public String getPublisher()
    {
        return publisher;
    }
    public int getPages()
    {
        return pages;
    }
    public int getYear()
    {
        return year;
    }
    public String toString()
    {
        return getClass().getName() + " Author = [" + author + "] " + "title = [" + title + "] " + "publisher = [" + publisher + "] " + "pages = [" + pages + "] " + "Year = [" + year + "] ";
    }

}
