package in.sp.main;

import in.sp.main.TypeStrategy.AssaianTypePlayer;
import in.sp.main.TypeStrategy.WorrierTypePlayer;
import in.sp.main.attackStrategy.BowAttackPlayer;
import in.sp.main.attackStrategy.SwordAttackPlayer;
import in.sp.main.flyStrategy.FlyNoWay;
import in.sp.main.flyStrategy.FlyWithWings;
import in.sp.main.playerService.Player;

public class Main {

    public static void main(String[] args) {

        Player player1 = new Player(new SwordAttackPlayer(), new WorrierTypePlayer(), new FlyWithWings());
        player1.play();


        Player player2 = new Player(new BowAttackPlayer(), new AssaianTypePlayer(), new FlyNoWay());
        player2.play();


        player1.setFLyStrategy(new FlyNoWay());
        player1.play();
    }
}
