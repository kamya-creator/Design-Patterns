import java.util.Deque;
import java.util.LinkedList;

public class Game {

    Board board;
    Dice dice;
    Deque<Player> players = new LinkedList<>();
    Player winner;

    Game()
    {
        initializeGame();
    }

    private void initializeGame() {

        board = new Board(10, 5, 4);
        dice = new Dice(1, 1, 6);
        addPlayers();
        winner  = null;
    }

    private void addPlayers() {

        Player p1 = new Player("p1", 0);
        Player p2 = new Player("p2", 0);
        players.add(p1);
        players.add(p2);
    }

    public void startGame()
    {
        while(winner == null)
        {
            Player playerTurn = findPlayerTurn(players);
            System.out.println("Palyer turn is : " + playerTurn.getId() + " current position is "
                    + playerTurn.getCurrentPosition());
            
            int diceNumber = dice.rollDice();
            System.out.println("Dice rolled" + diceNumber);
            int playerNewPosition = playerTurn.getCurrentPosition() + diceNumber;
            playerNewPosition = jumpCheck(playerNewPosition);

            playerTurn.setCurrentPosition(playerNewPosition);
            System.out.println("player turn is:" + playerTurn.id + " new Position is: " + playerNewPosition);

            if(playerNewPosition >= board.cells.length * board.cells.length - 1)
            {
                winner = playerTurn;
            }

        }
        System.out.println("Game Won by :" + winner.getId());

    }

    private int jumpCheck(int playerNewPosition) {

        if(playerNewPosition > board.cells.length * board.cells.length - 1)
            return playerNewPosition;

        Cell cell = board.getCell(playerNewPosition);
        if(cell.jump().startPosition() != 0 && cell.jump().endPosition()  != 0)
        {
            String jumpBy = (cell.jump().startPosition() > cell.jump().endPosition()) ?
                    "Ladder ": "Snake ";
            System.out.println("Jump Done by : " + jumpBy);
            return cell.jump().endPosition();
        }

        return playerNewPosition;
    }

    private Player findPlayerTurn(Deque<Player> players) {

        Player playerTurn = players.removeFirst();
        players.addLast(playerTurn);
        return playerTurn;
    }
}
