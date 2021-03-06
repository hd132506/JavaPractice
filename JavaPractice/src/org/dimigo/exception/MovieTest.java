package org.dimigo.exception;

public class MovieTest {

	public static void main(String[] args) {
		try {
			Movie[] movies = {
					new Movie("앤트맨",12), new Movie("사도",12),
					new Movie("베레탕",15)
			};
		int age = 13;
		for(Movie movie : movies) {
			buyTicket(movie, age);
		}
		} catch(Exception e) {
			System.out.println(e.getMessage());
		}
		}
	
	private static void buyTicket(Movie movie, int age) throws Exception{
		if(age<movie.getLimitAge())
			throw new AgeCheckException(movie);
			//throw new Exception(movie.getTitle()+"은/는 15세 이상 관람가입니다.");
		else
			System.out.println(movie.getTitle()+"즐감하세용~");
	}

}
