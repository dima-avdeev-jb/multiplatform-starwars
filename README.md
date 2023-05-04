### Compose Multiplafrom StarWars like text

![screenshot-desktop.png](screenshot-desktop.png)


```Kotlin
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
        Image(painter, null)
        Text(
            text,
            Modifier.fillMaxWidth(0.5f),
            fontSize = 30.sp,
            color = Color.Yellow,
            textAlign = TextAlign.Center
        )
        Box(Modifier.height(400.dp))
    }
}
```



![screenshot-ios.png](screenshot-ios.png)


![screenshot-android.png](screenshot-android.png)

