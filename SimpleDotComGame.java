class SimpleDotComGame {
	int[] inputNums = new int[7];
		int numOfHit = 0;

	public void setGrid (int[] inputNums){
		for ( int num : inputNums) this.inputNums[num] = num ;
	}

	public String checkGuessNum(int GuessNum) {
		String result = "FAILED";
		for (int cell : inputNums) {
			if (cell == GuessNum) {
		//System.out.print(GuessNum);
		//System.out.println("  " + cell);
				result = "HIT";
				numOfHit++;
				break;
			}
		}	
		if (numOfHit == 3) {
				result = "BINGO";
			}
		
		return result;
		}
	}
