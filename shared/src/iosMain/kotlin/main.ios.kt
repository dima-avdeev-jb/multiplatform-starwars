import androidx.compose.ui.window.ComposeUIViewController

actual fun getPlatformName(): String = "iOS"
actual val fontSize:Int = 16

fun MainViewController() = ComposeUIViewController { App() }