package com.example.mengh.mhwheel.index.item

import com.chad.library.adapter.base.entity.MultiItemEntity
import com.example.mengh.mhwheel.index.bean.IndexBean

/**
 * Author by HDM, Email menghedianmo@163.com, Date on 2018/4/11.
 * PS: Not easy to write code, please indicate.
 */
class IndexItem (itemType: Int, data: IndexBean?): MultiItemEntity{
    companion object {
        val IMG = 1
        val  LAYOUT= 2
    }
    private val data: IndexBean? = data
    private val itemType: Int = itemType


    override fun getItemType(): Int {
        return itemType
    }
    open fun getData(): IndexBean? {
        return data
    }
}