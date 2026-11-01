
public class Song {
	private String name;
	private Date firstDate;
	private double length;
	//constructor
	public Song (String name, Date firstDate) {
		this.name = name;
		this.firstDate = firstDate;
	}
	//copy constructor
	public Song (Song song) {
		this.name = song.name;
		this.firstDate = song.firstDate;
	}
	//returns the song name
	public String getName() {
		return name;
	}
	//returns the song's length
	public double getLength() {
		return length;
	}
	//returns the first date
	public Date getFirstDate() {
		return firstDate;
	}
	//sets the first date
	public void setFirstDate(Date firstDate) {
		this.firstDate = firstDate;
	}
	//sets a length
	public void setLength(double length) {
		this.length = length;
	}
	//describes the songs properties
	public String toString() {
		return "The song's name is: "+this.name+" The song's length is"+this.length+" The song's fist date is: "+this.firstDate;
	}
}
