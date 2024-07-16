package org.example.domain.ch02

interface DiscountCondition {
    fun isSatisfiedBy(screening: Screening): Boolean
}