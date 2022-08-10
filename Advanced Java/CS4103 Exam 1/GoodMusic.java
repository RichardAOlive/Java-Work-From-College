public class GoodMusic extends Music {
    String genre;
    private int year;
    public GoodMusic()
    {
        genre = "????";
        year = 0000;
    }

    public String getGenre()
    {
        return genre;
    }
    public int getYear()
    {
        return year;
    }
    public void setGenre(String newGenre)
    {
        genre = newGenre;
    }
    public void setyear(int newYear)
    {
        year = newYear;
    }

    public String toString()
    {
        return super.toString() + " Genre = [" + genre + "]" + " Year = [" + year + "]";
    }

}
