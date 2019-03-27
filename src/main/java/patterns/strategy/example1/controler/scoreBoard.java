package patterns.strategy.example1.controler;

public class scoreBoard {
    public scoreAlgorithmBase algorithmBase;

    public void showScore(int taps, int multiplier) {
        System.out.println(algorithmBase.calculateScore(taps, multiplier));
    }
}
