package org.example.domain.ch02

class NoneDiscountPolicy(vararg conditions: DiscountCondition) : DiscountPolicy {
    override fun calculateDiscountAmount(screening: Screening): Money {
        return Money.ZERO
    }
}