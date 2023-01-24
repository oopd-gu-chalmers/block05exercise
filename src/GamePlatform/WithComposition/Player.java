package GamePlatform.WithComposition;

public class Player implements IsUser {
    private final User parent = new User();  // Composition

    @Override
    public void userMethod() {
        parent.userMethod();        // Delegation
    }

    public void playerMethod() {}
}
