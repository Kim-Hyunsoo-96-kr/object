package org.example.domain

class TicketOffice(
    private var amount: Long,
    private val tickets: MutableList<Ticket>
) {
    constructor(amount: Long, vararg tickets: Ticket) : this(amount, tickets.toMutableList())

    fun getTicket(): Ticket {
        return tickets.removeFirst()
    }

    fun minusAmount(amount: Long) {
        this.amount -= amount
    }

    fun plusAmount(amount: Long) {
        this.amount += amount
    }

    fun sellTicketTo(audience:Audience) {
        plusAmount(audience.buy(getTicket()))
    }
}