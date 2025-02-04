/*
 * Copyright 2022 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.google.android.horologist.composables

import androidx.compose.foundation.layout.width
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import com.google.android.horologist.compose.tools.WearPreview
import kotlin.time.Duration.Companion.seconds

@WearPreview
@Composable
fun MarqueeTextTypicalPreview() {
    MarqueeText(
        text = "A very long text strings",
        modifier = Modifier
            .width(100.dp),
        textAlign = TextAlign.Center
    )
}

@WearPreview
@Composable
fun MarqueeTextShortTextPreview() {
    MarqueeText(
        text = "A",
        modifier = Modifier
            .width(100.dp),
        textAlign = TextAlign.Center
    )
}

@WearPreview
@Composable
fun MarqueeTextConstantScrollingPreview() {
    MarqueeText(
        text = "A very long text strings",
        modifier = Modifier
            .width(100.dp),
        textAlign = TextAlign.Center,
        pauseTime = 0.seconds
    )
}
