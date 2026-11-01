
public class TestDisk {
	//finds the max length over 5 minutes
	public static void maxLengthOver5(Disk disks[]) {
		for (int i = 0; i < disks.length; i++) {
			double max = 0;
			Song[] songs = disks[i].getSongs();
			for (int j = 0; j < songs.length; j++) {
			if (songs[j] != null && songs[j].getLength() > max) {
				max = songs[i].getLength();
			}
			if(max > 5) {
				System.out.println(disks[i].getName());
			}
			}
		}
	}
	//using all the functions I made
	public static void main(String[] args) {
		Disk d = new Disk("teranova");
		d.getName();
		d.getSongs();
		Date firstDate = new Date(8, 8, 2008);
		Song gangsterRap = new Song("gangster rap", firstDate);
		d.addSong(gangsterRap);
		d.maxLength();
		d.most_month();
		d.toString();
	}
}
