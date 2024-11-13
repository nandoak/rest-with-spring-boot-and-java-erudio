package br.com.erudio;

public class Greeting {

	public Greeting() {
		// TODO Auto-generated constructor stub
	}
	private final long id;
	private final String content;
	public Greeting(long id, String content) {
		this.id = id;
		this.content = content;
	}
	public long getId() {
		return id;
	}
	public String getContent() {
		return content;
	}

}
