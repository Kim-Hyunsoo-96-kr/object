package org.example.domain

class Bag(
    private var amount: Long,
    private val invitation: Invitation?,
    private var ticket: Ticket? = null
) {
    private val hasInvitation: Boolean
        get() = invitation != null

    val hasTicket: Boolean
        get() = ticket != null

    private fun setTicket(ticket: Ticket) {
        this.ticket = ticket
    }

    private fun minusAmount(amount: Long) {
        this.amount -= amount
    }

    fun plusAmount(amount: Long) {
        this.amount += amount
    }

    fun hold(ticket: Ticket):Long {
        if(hasInvitation){
            setTicket(ticket)
            return 0L
        } else{
            setTicket(ticket)
            minusAmount(ticket.fee)
            return ticket.fee
        }
    }

    constructor(amount: Long) : this(amount, null)
}