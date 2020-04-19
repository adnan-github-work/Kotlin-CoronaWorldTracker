package com.ingenious.coronaworldtracker

import com.google.firebase.database.IgnoreExtraProperties

@IgnoreExtraProperties
data class Corona(
    var seriousCases: Int? = 0,
    var totalCases: Int? = 0,
    var totalDeath: Int? = 0,
    var totalRecovered: Int? = 0
)