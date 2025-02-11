package lab01;


public class Puzzle {
    public static final int PUZZLE_SIZE = 15;
    private char[][] puzzleArray;
    private int tamanho;

    public Puzzle(char[][] puzzleArray, int tamanho) {
        this.puzzleArray = puzzleArray;
        this.tamanho = tamanho;
    }

    public char[][] getPuzzleArray() {
        return puzzleArray;
    }

    public int getTamanho() {
        return tamanho;
    }

    public void printPuzzle() {
        for (int i = 0; i < tamanho; i++) {
            for (int j = 0; j < tamanho; j++) {
                System.out.print(this.puzzleArray[i][j] + " ");
            }
            System.out.println();
        }
    }

    public boolean isValidPuzzle() {
        return isSquare() && containsOnlyLowercase() && noEmptyLines();
    }

    private boolean isSquare() {
        return this.tamanho == PUZZLE_SIZE;
    }

    private boolean containsOnlyLowercase() {
        for (char[] row : this.puzzleArray) {
            for (char c : row) {
                if (!Character.isLowerCase(c)) 
                return false;
            }
        }
        return true;
    }

    private boolean noEmptyLines() {
        for (char[] row : this.puzzleArray) {
            if (row.length == 0) 
            return false;
        }
        return true;
    }
}
