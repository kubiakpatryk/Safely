package com.kubiakdev.safely.ui.main.adapter.item

import com.kubiakdev.safely.base.adapter.ListItem
import com.kubiakdev.safely.data.model.DetailModel
import java.util.*

data class PasswordItem(
        var title: String,
        var detailList: List<DetailModel>,
        var created: Date,
        var modified: Date,
        var isFavourite: Boolean,
        var cardColor: String,
        var category: String
) : ListItem {

    var id: Long = 0

    constructor(
            id: Long,
            title: String,
            detailList: List<DetailModel>,
            created: Date,
            modified: Date,
            isFavourite: Boolean,
            cardColor: String,
            category: String
    ) : this(
            title,
            detailList,
            created,
            modified,
            isFavourite,
            cardColor,
            category
    ) {
        this.id = id
        this.title = title
        this.detailList = detailList
        this.created = created
        this.modified = modified
        this.isFavourite = isFavourite
        this.cardColor = cardColor
        this.category = category
    }

}