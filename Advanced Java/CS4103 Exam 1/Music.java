public class Music extends Note {
    private String artist;
    private String title;
   

    public Music()
    {
        setNumNotes(7);
        artist = "???????";
        title = "???????";
        
    }
    public String getArtist()
    {
        return artist;
    }
    public String getTitle()
    {
        return title;
    }


    public void setArtist(String newArtist)
    {
        artist = newArtist;
    }
    public void settitle(String newTitle)
    {
        title = newTitle;
    }


    public String toString()
    {
        return super.toString() + "Title = [" + title + "] " + "Artist = [" + artist + "] " ;
    }

}
