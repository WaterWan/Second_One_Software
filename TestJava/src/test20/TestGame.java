package test20;

import junit.framework.TestCase;

public class TestGame extends TestCase {

	public TestGame(String name) {
		super(name);
	}
	
	private Game g;
	
	public void setUp() {
		g = new Game();
	}
	
	public void testOneThrows() {
		g.add(5);
		assertEquals(5, g.getScore());
		assertEquals(1, g.getCurrentFrame());
	}
	
	public void testTwoThrowsNoMark() {
		g.add(5);
		g.add(4);
		assertEquals(9, g.getScore());
		assertEquals(1, g.getCurrentFrame());
	}
	
	public void testFourThrowsNoMark() {
		g.add(5);
		g.add(4);
		g.add(7);
		g.add(2);
		assertEquals(18, g.getScore());
		assertEquals(9, g.scoreForFrame(1));
		assertEquals(18, g.scoreForFrame(2));
		assertEquals(2, g.getCurrentFrame());
	}
	
	public void testSimpleSpare() {
		g.add(3);
		g.add(7);
		g.add(3);
		assertEquals(13, g.scoreForFrame(1));
	}
	
	public void testSimpleFrameAfterSpare() {
		g.add(3);
		g.add(7);
		g.add(3);
		g.add(2);
		assertEquals(13, g.scoreForFrame(1));
		assertEquals(18, g.scoreForFrame(2));
	}
}
