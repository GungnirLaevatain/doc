package mediator;

/**
 * The class Player.
 *
 * @author GungnirLaevatain
 * @version 2019 -07-09 00:26:42
 * @since JDK 11
 */
public class Player extends BasePlayer {
    /**
     * The Chip.
     * 玩家的筹码
     */
    private int chip;

    public Player(int chip) {
        super();
        this.chip = chip;
    }

    @Override
    public void win(int chip, BaseJudgmentMediator mediator) {
        this.chip += chip;
    }

    /**
     * Lose.
     * 输了指定数量的筹码
     *
     * @param chip the chip
     *             筹码数量
     * @author GungnirLaevatain
     */
    @Override
    public void lose(int chip) {
        this.chip -= chip;
    }
}
