package StrategyHomework01;

import StrategyHomework.Monster;
import StrategyHomework01.Attack;

public class RangedAttack implements Attack {
    Monster attacker;

    public RangedAttack(Monster attacker) {
        this.attacker = attacker;
    }

    @Override
    public Integer attack(Monster target) {
        String message = attacker + " uses a ranged attack on " + target;
        System.out.println(message);
        return null;
    }
}
