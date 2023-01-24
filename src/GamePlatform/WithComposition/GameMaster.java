package GamePlatform.WithComposition;

public class GameMaster implements IsUser {
    private final User parent = new User();  // Composition

    @Override
    public void userMethod() {
        parent.userMethod();    // Delegation
    }

    public void gameMasterMethod() {}
}
