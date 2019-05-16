package patterns.template.example1;

public abstract class Game {


    public abstract void initialize();
    public abstract void startPlay();
    public abstract void endPlay();

    //Template method
    public final void play() {
        loadAssets();
        initialize();
        startPlay();
        if (addNewGameCharacter()) {
            addNewGameCharacterToTheGame();
        }
        endPlay();
    }

    //hooked on template method
    protected abstract void addNewGameCharacterToTheGame();

    public void loadAssets(){
        System.out.println("Loading game assets!");
    }

    boolean addNewGameCharacter() {
        return true;
    }

}
