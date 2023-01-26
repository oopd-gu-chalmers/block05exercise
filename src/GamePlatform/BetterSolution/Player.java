package GamePlatform.BetterSolution;

public class Player implements IsUser {
    private final User parent;  // Composition

    public Player(User user) {
        parent = user;
    }

    @Override
    public void userMethod() {
        parent.userMethod();        // Delegation
    }

    public void playerMethod() {}
}
