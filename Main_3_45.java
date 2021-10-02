public class Main{

	public static void main(String[] args){

		MovablePoint p = new MovablePoint(1,2,3,4);
		p.toString();
		p.moveUp();
		p.moveDown();
		p.moveRight();
		p.moveLeft();

		MovableCircle c = new MovableCircle(5,6,7,8);
		c.toString();
		c.moveUp();
		c.moveDown();
		c.moveRight();
		c.moveLeft();

		MovableCircle r = new MovableCircle(9,9,9,9,7,8);
		r.toString();
		r.moveUp();
		r.moveDown();
		r.moveRight();
		r.moveLeft();
	}
}
