package mediator;

/**
 * The class Base player.
 * 玩家基本类
 *
 * @author GungnirLaevatain
 * @version 2019 -07-08 23:54:22
 * @since JDK 11
 */
public abstract class BasePlayer {

    /**
     * Win.
     *
     * @param chip     the chip
     * @param mediator the mediator
     * @author GungnirLaevatain
     */
    public abstract void win(int chip, BaseJudgmentMediator mediator);

    /**
     * Lose.
     * 输了指定数量的筹码
     *
     * @param chip the chip
     *             筹码数量
     * @author GungnirLaevatain
     */
    public abstract void lose(int chip);
}
