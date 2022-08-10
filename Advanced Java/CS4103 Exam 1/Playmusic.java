public class Playmusic {
        public static void main(String[] args) {
        Note n = new Note();
        n.setNumBeats(1);
        n.setNumNotes(7);
        System.out.println(n);

        Music newMusic = new Music();
        newMusic.setNumBeats(105);
        newMusic.setNumNotes(7);
        newMusic.setArtist("Cash");
        newMusic.settitle("Ring of Fire");
        System.out.println(newMusic);

        GoodMusic gMusic = new GoodMusic();
        gMusic.setNumBeats(177);
        gMusic.setNumNotes(21);
        gMusic.setArtist("Foreigner");
        gMusic.settitle("Juke Box Hero");
        gMusic.setyear(1980);
        gMusic.setGenre("Rock");
        System.out.println(gMusic);
    }
}