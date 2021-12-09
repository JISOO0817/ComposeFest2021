package com.codelab.theming.ui.start.theme

import androidx.compose.foundation.shape.CutCornerShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Shapes
import androidx.compose.ui.unit.dp

val myShape = Shapes(
    small = CutCornerShape(topStart = 4.dp),
    medium = CutCornerShape(topStart = 16.dp),
    large = RoundedCornerShape(4.dp)
)