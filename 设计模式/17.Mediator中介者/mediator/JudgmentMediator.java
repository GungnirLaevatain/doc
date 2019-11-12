package mediator;

/**
 * The class Judgment mediator.
 * 具体的裁决者
 *
 * @author GungnirLaevatain
 * @version 2019 -07-09 00:03:48
 * @since JDK 11
 */
public class JudgmentMediator extends BaseJudgmentMediator {
    /**
     * The First.
     * 第一位玩家
     */
    private Player first;
    /**
     * The Second.
     * 第二位玩家
     */
    private Player second;

    public JudgmentMediator(Player first, Player second) {
        super();
        this.first = first;
        this.second = second;
    }

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
    @Override
    public void win(int chip, BasePlayer basePlayer) {
        if (basePlayer == first) {
            second.lose(chip);
        } else {
            first.lose(chip);
        }
    }

}
