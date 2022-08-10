public class Note {
    private int notes;
    private int BPM;

    public int getNumNotes()
    {
        return notes;
    }

    public void setNumNotes(int newValue)
    {
        notes = newValue;
    }
    public int getNumBeats()
    {
        return BPM;
    }

    public void setNumBeats(int newValue)
    {
        BPM = newValue;
    }

    public String toString()
    {
        return getClass().getName() + " Number of notes = [" + notes + "] " + "Beats per minute = [" + BPM + "] ";
    }
}
