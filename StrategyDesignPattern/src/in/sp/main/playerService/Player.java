package in.sp.main.playerService;

import in.sp.main.TypeStrategy.PlayerTypeStrategy;
import in.sp.main.attackStrategy.AttackStrategy;
import in.sp.main.flyStrategy.FLyStrategy;

public class Player {

    private AttackStrategy attackStrategy;
    private PlayerTypeStrategy playerTypeStrategy;
    private FLyStrategy fLyStrategy;

    public Player(AttackStrategy attackStrategy, PlayerTypeStrategy playerTypeStrategy, FLyStrategy fLyStrategy) {
        this.attackStrategy = attackStrategy;
        this.playerTypeStrategy = playerTypeStrategy;
        this.fLyStrategy = fLyStrategy;
    }

    public void play() {
        attackStrategy.attack();
        playerTypeStrategy.getType();
        fLyStrategy.fly();
    }

    public void play(AttackStrategy attackStrategy, PlayerTypeStrategy playerTypeStrategy, FLyStrategy fLyStrategy) {
        attackStrategy.attack();
        playerTypeStrategy.getType();
        fLyStrategy.fly();
    }

    public void setAttackStrategy(AttackStrategy attackStrategy) {
        this.attackStrategy = attackStrategy;
    }

    public void setPlayerTypeStrategy(PlayerTypeStrategy playerTypeStrategy) {
        this.playerTypeStrategy = playerTypeStrategy;
    }

    public void setFLyStrategy(FLyStrategy fLyStrategy) {
        this.fLyStrategy = fLyStrategy;
    }

    public AttackStrategy getAttackStrategy() {
        return attackStrategy;
    }

    public PlayerTypeStrategy getPlayerTypeStrategy() {
        return playerTypeStrategy;
    }

    public FLyStrategy getFLyStrategy() {
        return fLyStrategy;
    }
}
