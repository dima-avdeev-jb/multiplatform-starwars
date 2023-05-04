import androidx.compose.runtime.Composable

actual fun getPlatformName(): String = "Android"
actual val fontSize:Int = 16

@Composable fun MainView() = App()
