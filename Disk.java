
public class Disk {
	private String name;
	private Song songs[];
	//constructor
	public Disk(String name) {
		this.name = name;
		this.songs = new Song[20];
	}
	//returns the name of the disk
	public String getName() {
		return name;
	}
	//gets the songs
	public Song[] getSongs() {
		return songs;
	}
	//adds a song returns true if it's possible and false if not.
	public boolean addSong(Song song) {
		for (int i = 0; i < songs.length; i++) {
			if (songs[i] == null) {
				songs[i] = new Song(song);
				return true;
			}
		}
		return false;
	}
	//finds the song with the longest length
	public double maxLength() {
		double max = 0;
		for (int i = 0; i < songs.length; i++) {
			if(songs[i] != null && max < songs[i].getLength()) {
				max = songs[i].getLength();
			}
		}
		return max;
	}
	//finds the month with the most songs released on it
	public void most_month() {
		int[] months = new int[12];
		int max = 0;
		for (int i = 0; i <songs.length; i++) {
			if(songs[i] != null) {
				months[songs[i].getFirstDate().getMonth() - 1]++;
			}
		}
		for (int i = 0; i < months.length; i++) {
			if(months[i] > max)
				max = months[i];
		}
		for (int i = 0; i < months.length; i++) {
			if (months[i] == max) {
				System.out.println("The month with the most songs released is: "+(i+1));
			}
		}
		if (max == 0) {
			return;
		}
	}
	//prints out the information
	public String toString() {
		return "The disk's name is: "+this.name+" The songs in it are: "+this.songs;
	}
}
