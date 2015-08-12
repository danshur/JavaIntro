public class Move2Beetles {
	public static void main(String[] args) {
	
		double move = 100;
		double turn = 45;
		
		Beetle bailey = new Beetle("green");
			for (int count=1; count <=8; count=count+1) {
				bailey.move(move);
				bailey.getPosition();
				bailey.turn(turn);
			}
		Beetle ed = new Beetle("red");
		ed.getPosition();
		ed.turn(180);
			for (int count=1; count <=8; count=count+1) {
				ed.move(move);
				ed.getPosition();
				ed.turn(turn);
			}	
	}
}