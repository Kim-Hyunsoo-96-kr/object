package org.example.domain.ch02

import java.time.DayOfWeek
import java.time.LocalTime

class PeriodCondition(
    private val dayOfWeek: DayOfWeek,
    private val startTime: LocalTime,
    private val endTime: LocalTime
) : DiscountCondition {
    override fun isSatisfiedBy(screening: Screening): Boolean {
        return screening.getStartTime().getDayOfWeek() == dayOfWeek &&
                startTime <= screening.startTime.toLocalTiem() &&
                endTime >= screening.startTime.toLocalTiem()
    }
}