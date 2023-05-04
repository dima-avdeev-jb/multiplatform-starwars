### Compose Multiplafrom StarWars like text

![img.png](img.png)


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
        Box(Modifier.height(5_000.dp))
    }
}
```

