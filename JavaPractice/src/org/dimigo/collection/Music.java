package org.dimigo.collecfkon;

public class Music {
	private String title;
	private String singer;
	
	public Music(String title, String singer){
		this.title = title;
		this.singer = singer;
	}

	/**
	 * @return the title
	 */
	public String getTitle() {
		return title;
	}

	/**
	 * @param title the title to set
	 */
	public void setTitle(String title) {
		this.title = title;
	}

	/**
	 * @return the song
	 */
	public String getSong() {
		return singer;
	}

	/**
	 * @param song the song to set
	 */
	public void setSong(String song) {
		this.singer = song;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return title + " (" + singer + ") ";
	}
	
	
	
	
}