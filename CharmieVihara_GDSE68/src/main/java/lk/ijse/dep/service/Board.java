package lk.ijse.dep.service;

public interface Board {
    final int NUM_OF_ROWS = 5;
    final int NUM_OF_COLS = 6;

    public BoardUI getBoardUI();
    public int findNextAvailableSpot(int col);

    public boolean isLegelMove(int col);

    public boolean existLegelMoves();

    public void updateMove(int col, Piece move);
    public void updateMove(int col, int row, Piece move);

    public Winner findWinner();

    void makeMove(int selectedMove);
}
