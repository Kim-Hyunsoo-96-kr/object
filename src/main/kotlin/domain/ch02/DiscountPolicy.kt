package org.example.domain.ch02

interface DiscountPolicy {
    fun calculateDiscountAmount(screening: Screening): Money
}