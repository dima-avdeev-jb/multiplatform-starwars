import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.gestures.scrollBy
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.Text
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.graphicsLayer
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import org.jetbrains.compose.resources.ExperimentalResourceApi
import org.jetbrains.compose.resources.painterResource

val text = """
    Episode X
    Compose Multiplatform
    
    In a galaxy far, far away, there was a group of rebels who sought to unite the various platforms of the universe. They had heard rumors of a powerful tool known as Compose Multiplatform, capable of creating user interfaces that could run on any system, no matter how obscure or ancient.

    At first, the rebels were skeptical. They had seen many tools come and go, each claiming to be the key to universal compatibility, but all falling short in the end. However, they decided to investigate further and soon discovered that Compose Multiplatform was different. It was a powerful force, capable of bringing harmony to the disparate systems of the galaxy.

    With Compose Multiplatform on their side, the rebels set out to create a new era of interoperability. They built user interfaces that could seamlessly run on everything from old Jedi holocrons to state-of-the-art starship consoles. No system was too ancient or too advanced for Compose Multiplatform to handle.

    As the rebels continued their mission, they encountered many challenges. They faced hostile systems that were resistant to change, and encountered others who feared the power of Compose Multiplatform. But through it all, they persevered, spreading the message of universal compatibility and the power of Compose Multiplatform.

    In time, their efforts paid off. More and more systems began to embrace Compose Multiplatform, and the rebels' vision of a united galaxy became a reality. With Compose Multiplatform as their guide, they had created a world where no system was left behind, and every user interface was accessible to all.

    And so, the story of Compose Multiplatform became legend throughout the galaxy. It was a tool of great power, capable of bringing harmony to even the most disparate systems. And for the rebels who had championed its cause, it was a symbol of hope, a force that had brought about a new era of interoperability and unity.
""".trimIndent()

@OptIn(ExperimentalResourceApi::class)
@Composable
fun App() {
    Box(
        Modifier.fillMaxSize()
            .background(Color.Black)
    ) {
        val scrollState = rememberScrollState()
        LaunchedEffect(Unit) {
            while (true) {
                withFrameMillis { }
                scrollState.scrollBy(0.85f)
            }
        }
        Column(
            Modifier.fillMaxSize()
                .align(Alignment.Center)
                .graphicsLayer {
                    this.rotationX = 55f
                }.verticalScroll(scrollState),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Image(painterResource("compose-multiplatform.xml"), null)
            Text(
                text,
                Modifier.fillMaxWidth(0.5f),
                fontSize = fontSize.sp,
                color = Color.Yellow,
                textAlign = TextAlign.Center
            )
            Box(Modifier.height(400.dp))
        }
    }
}

expect fun getPlatformName(): String

expect val fontSize: Int