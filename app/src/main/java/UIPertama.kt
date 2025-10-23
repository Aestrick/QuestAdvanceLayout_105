@Composable
fun ActivitasPertama(modifier: Modifier){
    Column(modifier = Modifier
        .padding(top=100.dp)
        .fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(text = stringResource(id = R.string.prodi),
            fontSize = 35.sp,
            fontWeight = FontWeight.Bold)
        Text(text = stringResource(id = R.string.univ),
            fontSize = 22.sp)
        Spacer(modifier = Modifier.height(height = 25.dp))
        Card(modifier = Modifier
            .fillMaxWidth(fraction = 1f)
            .padding(all = 12.dp),
            colors = CardDefaults.cardColors(
                containerColor = Color.DarkGray
            )
        ) {
            Row() {
                val gambar = painterResource(id = R.drawable.logo_umy)
                Image(
                    painter = gambar,
                    contentDescription = null,
                    modifier = Modifier
                        .size(100.dp)
                        .padding(all = 5.dp)