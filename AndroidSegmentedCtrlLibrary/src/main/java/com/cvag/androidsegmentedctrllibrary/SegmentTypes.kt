package com.cvag.androidsegmentedctrllibrary

internal enum class SegmentType {
    first, center, last, only
}

internal enum class SegmentSpreadType(val value: Int) {
    evenly(0), wrap(1)
}