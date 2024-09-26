package com.NovalinaPutri.tugas2.model

import com.NovalinaPutri.tugas2.R

data class ModelBuah (
    val  image: Int,
    val judul : String
)
//kita bikin array

object  MockList{
    fun getModel(): List<ModelBuah>{
        val item1 = ModelBuah(
            R.drawable.apple,
            "Apel"
        )
        val item2 = ModelBuah(
            R.drawable.pear,
            "Anggur"
        )
        val item3 = ModelBuah(
            R.drawable.strawberry,
            "Jeruk"
        )
        val item4 = ModelBuah(
            R.drawable.grapes,
            "per"
        )
        val item5 = ModelBuah(
            R.drawable.orange,
            "Strowberry"
        )
        val item6 = ModelBuah(
            R.drawable.apple,
            "Apel"
        )

        val itemList: ArrayList<ModelBuah> = ArrayList()
        itemList.add(item1)
        itemList.add(item2)
        itemList.add(item3)
        itemList.add(item4)
        itemList.add(item5)
        itemList.add(item6)
        return  itemList
    }
}
