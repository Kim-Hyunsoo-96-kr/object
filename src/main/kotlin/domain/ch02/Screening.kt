package org.example.domain.ch02

import java.time.LocalDateTime

class Screening(
    private val movie: Movie,
    private val sequence: Int,
    val whenScreend: LocalDateTime
) {
    fun isSequence(sequence: Int) = this.sequence == sequence
    fun getMovieFee(): {
        return movie.fee
    }

    private fun calculateFee(audienceCount: Int): Money {
        movie.calculateMovieFee(this).times(audienceCount)
    }

    fun reserve(customer: Customer, audienceCount: Int): Reservation {
        return Reservation(customer, this, calculateFee(audienceCount), audienceCount)
    }
}