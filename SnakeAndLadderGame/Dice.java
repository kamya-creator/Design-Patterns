import java.util.Random;

public class Dice {

    int diceCount;
    int min;
    int max;

    Dice(int diceCount, int min, int max)
    {
        this.diceCount =diceCount;
        this.min = min;
        this.max = max;
    }

    public int rollDice()
    {
        int totalSum = 0;
        int diceUsed = 0;
        while (diceUsed < diceCount)
        {
            Random random = new Random();
            int diceOut = random.nextInt(min, max) + min;
            totalSum+=diceOut;
            diceUsed++;

        }
        return totalSum;
    }
}
