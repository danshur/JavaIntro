public class Move1Beetle {
	public static void main(String[] args) {
	
		double move = 60;
		double turn = 45;
		
		Beetle bailey = new Beetle("green");
			for (int count=1; count <=8; count=count+1) {
				bailey.move(move);
				bailey.getPosition();
				bailey.turn(turn);
			}
		
	}
}