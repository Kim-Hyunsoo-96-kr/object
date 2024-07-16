package org.example.domain.ch02

abstract class DefaultDiscountPolicy(
    private val conditions: List<DiscountCondition> = listOf()
):DiscountPolicy {
    constructor(vararg conditions: DiscountCondition) : this(conditions.toList())

    override fun calculateDiscountAmount(screening: Screening):Money{
        for(condition in conditions){
            if(condition.isSatisfiedBy(screening)){
                return getDiscountAmount(screening)
            }
        }
        return Money.ZERO
    }

    abstract protected fun getDiscountAmount(screening: Screening): Money
}