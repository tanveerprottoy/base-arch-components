package com.tanveershafeeprottoy.basearchcomponents.interfaces

interface BaseListViewModel<T> {

    fun getAll()

    fun onLoad(obj: T)
}