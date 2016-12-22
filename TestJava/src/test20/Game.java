package test20;

public class Game {
	public int getScore() {
		return itsScore;
	}

	public void add(int pins) {
		itsThrows[itsCurrentThrow++] = pins;
		itsScore += pins;
		adjustCurrentFrame();
	}
	
	private void adjustCurrentFrame() {
		if(firstThrow == true) {
			firstThrow = false;
			itsCurrentFrame++;
		} else {
			firstThrow = true;
		}
	}
	
	public int getCurrentFrame() {
		return itsCurrentFrame;
	}

	/**
	 * frame 至少为 1
	 * 
	 * @param frame
	 * @return
	 */
	public int scoreForFrame(int theFrame) {
		int ball = 0;
		int score = 0;

		for (int currentFrame = 0; currentFrame < theFrame; currentFrame++) {
			int firstThrow = itsThrows[ball++];
			int secondThrow = itsThrows[ball++];
			int frameScore = firstThrow + secondThrow;
			if (frameScore == 10) {
				score += frameScore + itsThrows[ball];
			} else {
				score += frameScore;
			}
		}

		// for(int ball = 0;
		// frame > 0 && (ball < itsCurrentThrow);
		// ball += 2, frame--) {
		// score += itsThrows[ball] + itsThrows[ball + 1];
		// }

		// /**
		// * 这是我自己的写法
		// * frame: 1 2 3
		// * throw: 0、1 2、3 4、5
		// */
		// for(int i = frame; i > 0; i--) {
		// score += itsThrows[2*i-2] + itsThrows[2*i-1];
		// }
		return score;
	}

	private int itsScore = 0;

	/**
	 * 从0开始计数
	 */
	private int[] itsThrows = new int[21];
	private int itsCurrentThrow = 0;
	private int itsCurrentFrame = 0;
	private boolean firstThrow = true;
}
