package org.dimigo.collection;

public class Music {
	private String title;
	private String singer;
	
	
	/**
	 * @param title
	 * @param singer
	 */
	public Music(String title, String singer) {
		super();
		this.title = title;
		this.singer = singer;
	}


	/**
	 * @return title
	 */
	public String getTitle() {
		return title;
	}


	/**
	 * @param title 설정할 title
	 */
	public void setTitle(String title) {
		this.title = title;
	}


	/**
	 * @return singer
	 */
	public String getSinger() {
		return singer;
	}


	/**
	 * @param singer 설정할 singer
	 */
	public void setSinger(String singer) {
		this.singer = singer;
	}


	@Override
	public String toString() {
		return "Music [title=" + title + ", singer=" + singer + "]";
	}
	
	
}
