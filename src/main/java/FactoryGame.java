public class FactoryGame {

    public static Game createGame (GameType gameType){
        switch (gameType){
            case LOTEK:
                return new Lotek();
            default:
                throw new IllegalArgumentException("We don't have that game in our store");
        }
    }

}
