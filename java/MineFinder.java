package java;

public class MineFinder {
	
	public static int[] findMine(int[][] field){
    int[] mine = new int[2];
    for (int i = 0; i < field[0].length; i++) {
      for (int j = 0; j < field[0].length; j++) {
        if (field[i][j] == 1) {mine[0] = i; mine[1] = j; break;}
      }
    }
    return mine;
	}

}