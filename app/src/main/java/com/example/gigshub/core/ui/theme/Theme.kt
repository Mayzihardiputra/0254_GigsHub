
package com.example.gigshub.core.ui.theme

import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.lightColorScheme
import androidx.compose.runtime.Composable

private val GigsHubColorScheme = lightColorScheme(
    primary = CoffeeBrown,
    onPrimary = Ivory,

    secondary = WarmMocha,
    onSecondary = Espresso,

    tertiary = Latte,
    onTertiary = Espresso,

    background = Background,
    onBackground = TextPrimary,

    surface = Surface,
    onSurface = TextPrimary,

    surfaceVariant = SurfaceVariant,
    onSurfaceVariant = TextSecondary,

    error = Error,
    onError = Ivory
)

@Composable
fun GigsHubTheme(
    content: @Composable () -> Unit
) {
    MaterialTheme(
        colorScheme = GigsHubColorScheme,
        typography = GigsHubTypography,
        content = content
    )
}
