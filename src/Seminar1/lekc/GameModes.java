package Seminar1.lekc;

public class GameModes {
    static Map map;
    public static final int HUMAN_VS_AI = 0;
    public static final int HUMAN_VS_HUMAN = 1;
    static void startNewGame(int mode, int fieldSizeX, int fieldSizeY, int winLength) {
        map.startNewGame(mode, fieldSizeX, fieldSizeY, winLength);
    }
}
