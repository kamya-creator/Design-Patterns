import java.util.concurrent.ThreadLocalRandom;

public class Board {

    Cell[][] cells;

    Board(int boardSize, int numberOfLadder, int numberOfSnake)
    {
        initializeCells(boardSize);
        addSnakeAndLadder(cells, numberOfSnake, numberOfLadder);
    }

    private void initializeCells(int boardSize)
    {
        cells = new Cell[boardSize][boardSize];


        for (int i = 0; i < boardSize; i++) {
            for (int j = 0; j < boardSize; j++) {
                cells[i][j] = new Cell(new Jump(0,0));
            }
        }
    }

    private void addSnakeAndLadder(Cell[][] cells, int numberOfSnake, int numberOfLadder) {

        int boardSize = cells.length;
        while(numberOfSnake > 0)
        {
            int start = ThreadLocalRandom.current().nextInt(1, boardSize*boardSize - 1);
            int end   = ThreadLocalRandom.current().nextInt(1, boardSize*boardSize - 1);

            if(start <= end)
                continue;

            /*
            start = 54, end 12
            54/10 = 5  54%10 = 4 (5,4)
            12/10 = 2  12%10 = 2 (2,2)
             */
            Jump snakeObj = new Jump(start, end);

            int row = start/boardSize;
            int col = start%boardSize;

            cells[row][col] = new Cell(snakeObj);
            numberOfSnake--;
        }

        while(numberOfLadder > 0)
        {
            int start = ThreadLocalRandom.current().nextInt(1, boardSize*boardSize - 1);
            int end   = ThreadLocalRandom.current().nextInt(1, boardSize*boardSize - 1);

            if(start >= end)
                continue;

            /*
            start = 54, end 12
            54/10 = 5  54%10 = 4 (5,4)
            12/10 = 2  12%10 = 2 (2,2)
             */
            Jump ladderObj = new Jump(start, end);

            int row = start/boardSize;
            int col = start%boardSize;

            cells[row][col] = new Cell(ladderObj);
            numberOfLadder--;
        }
    }

    public Cell getCell(int playerNewPosition) {

        int row = playerNewPosition/ cells.length;
        int col = playerNewPosition% cells.length;

        return cells[row][col];
    }
}
