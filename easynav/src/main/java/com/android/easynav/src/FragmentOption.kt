package com.android.easynav.src

import androidx.fragment.app.Fragment

/**
 * Created by Kemal Tunç on 2020-09-30
 */


class FragmentOption(
    val fragment: Fragment,
    val label: String,
    val clearHistory: Boolean,
    val history: Boolean,
    val popupFragment: Fragment?,
    var tabMenuFragment: Boolean,
    var groupId: Int,
    var firstTabFragment: Boolean
) {

    private constructor(builder: Builder) : this(
        builder.fragment, builder.label,
        builder.clearHistory,
        builder.history,
        builder.popupFragment,
        builder.tabMenuFragment,
        builder.groupId,
        builder.firstTabFragment
    )

    companion object {
        inline fun build(
            fragment: Fragment,
            block: Builder.() -> Unit
        ) = Builder(fragment).apply(block).build()
    }

    class Builder(val fragment: Fragment) {

        var label: String = ""
        var clearHistory: Boolean = false
        var history: Boolean = true
        var popupFragment: Fragment? = null
        var tabMenuFragment: Boolean = false
        var groupId: Int = 0
        var firstTabFragment: Boolean = false

        fun build() = FragmentOption(this)
    }
}