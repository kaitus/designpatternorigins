package patterns.strategy.example1.model;

import patterns.strategy.example1.controler.scoreAlgorithmBase;

public class squareBalloon extends scoreAlgorithmBase {
    @Override
    public int calculateScore(int taps, int multiplier) {
        return (taps * multiplier) + 40;
    }
}
