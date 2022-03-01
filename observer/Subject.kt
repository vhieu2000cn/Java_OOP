package observer

import java.util.*

interface Subject {
    fun attach(observer: Observer)
    fun detach(observer: Observer)
    fun notificationAllObserver()
}