package org.example.domain.ch02

class AmountDiscountPolicy(private val discountAmount: Money, vararg conditions: DiscountCondition) :
    DefaultDiscountPolicy(*conditions) {

    override protected fun getDiscountAmount(screening: Screening): Money {
        return discountAmount
    }
}