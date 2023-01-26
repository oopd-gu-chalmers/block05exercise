package GamePlatform.BetterSolution;

public class GameMaster implements IsUser {
    private final User parent;  // Composition

    public GameMaster(User user) {
        parent = user;
    }
    @Override
    public void userMethod() {
        parent.userMethod();    // Delegation
    }

    public void gameMasterMethod() {}
}
