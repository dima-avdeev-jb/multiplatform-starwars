import androidx.compose.desktop.ui.tooling.preview.Preview
import androidx.compose.runtime.Composable

actual fun getPlatformName(): String = "Desktop"
actual val fontSize:Int = 30

@Composable fun MainView() = App()

@Preview
@Composable
fun AppPreview() {
    App()
}