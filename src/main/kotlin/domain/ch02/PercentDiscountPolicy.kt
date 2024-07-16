package org.example.domain.ch02

class PercentDiscountPolicy(private val percent: Double, vararg condition: DiscountCondition) :
    DefaultDiscountPolicy(*condition) {

    override protected fun getDiscountAmount(screening: Screening): Money {
        return screening.getMovieFee().times(percent)
    }
}