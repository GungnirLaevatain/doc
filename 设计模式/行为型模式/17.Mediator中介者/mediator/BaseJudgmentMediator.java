package mediator;

/**
 * The class Base judgment mediator.
 * 基础的裁决者中介类
 *
 * @author GungnirLaevatain
 * @version 2019 -07-08 23:48:44
 * @since JDK 11
 */
public abstract class BaseJudgmentMediator {

    /**
     * win.
     * 玩家赢了指定的筹码
     *
     * @param chip       the chip
     *                   赚取的筹码
     * @param basePlayer base player
     *                   赢得筹码的玩家
     * @author GungnirLaevatain
     */
    public abstract void win(int chip, BasePlayer basePlayer);
}
