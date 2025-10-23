package com.example.praktikum3 // Pastikan package ini sesuai

// Import dari kode yang Anda berikan
import android.widget.Space
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Card
import androidx.compose.material3.CardColors
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
// Import R dari project Anda
import com.example.praktikum3.R

@Composable
fun ActivitasPertama(modifier: Modifier){
    Column (modifier = Modifier
        .padding(top = 100.dp)
        .fillMaxSize()
        .padding(bottom = 16.dp),
        horizontalAlignment = Alignment.CenterHorizontally
    ){
        Text(
            text = stringResource(R.string.prodi),
            fontSize = 32.sp,
            fontWeight = FontWeight.Bold
        )

        Spacer(modifier = Modifier.height(height = 8.dp))

        Text(text = stringResource(id = R.string.univ),
            fontSize = 22.sp,
            textAlign = TextAlign.Center
        )

        Spacer(modifier = Modifier.height(height = 30.dp))

        // --- CARD 1 (ABU-ABU / BAWAAN ANDA) ---
        Card (
            modifier = Modifier
                .fillMaxWidth(fraction = 1f)
                .padding(all = 12.dp),
            colors = CardDefaults.cardColors(
                containerColor = Color.DarkGray
            )
        ){
            Row (){
                val gambar = painterResource(id = R.drawable.bakwan)
                Image(
                    painter = gambar,
                    contentDescription = null,
                    modifier = Modifier
                        .size(size = 100.dp)
                        .padding(all = 5.dp)
                )
                Spacer(modifier = Modifier.width(width = 30.dp))

                Column (){
                    Text(text = stringResource(id = R.string.nama),
                        fontSize = 30.sp,
                        fontFamily = FontFamily.Cursive,
                        color = Color.White,
                        modifier = Modifier.padding(top = 15.dp)
                    )
                    Text(text = stringResource(id = R.string.alamat),
                        fontSize = 16.sp,
                        color = Color.White
                    )
                }
            }
        }

        // --- CARD 2 (BIRU) BARU ---
        Card (
            modifier = Modifier
                .fillMaxWidth(fraction = 1f)
                .padding(all = 12.dp),
            colors = CardDefaults.cardColors(
                containerColor = Color(0xFF0D47A1) // Biru tua
            )
        ){
            Row (
                modifier = Modifier.padding(all = 8.dp),
                verticalAlignment = Alignment.CenterVertically
            ){
                val gambarLogo = painterResource(id = R.drawable.bakwan)
                Image(
                    painter = gambarLogo,
                    contentDescription = null,
                    modifier = Modifier
                        .size(size = 100.dp)
                        .padding(all = 5.dp)
                )
                Spacer(modifier = Modifier.width(width = 16.dp))

                Column (){
                    // --- STYLE NAMA DISAMAKAN SEPERTI CARD 1 ---
                    Text(text = stringResource(id = R.string.nama),
                        fontSize = 30.sp,
                        fontFamily = FontFamily.Cursive,
                        color = Color.White,
                        modifier = Modifier.padding(top = 15.dp)
                    )
                    Text(text = stringResource(id = R.string.nim),
                        fontSize = 16.sp,
                        color = Color.White
                    )
                    Text(text = stringResource(id = R.string.alamat),
                        fontSize = 16.sp,
                        color = Color.White
                    )
                }
            }
        }

        // --- CARD 3 (MERAH) BARU ---
        Card (
            modifier = Modifier
                .fillMaxWidth(fraction = 1f)
                .padding(all = 12.dp),
            colors = CardDefaults.cardColors(
                containerColor = Color(0xFFB71C1C) // Merah tua
            )
        ){
            Row (
                modifier = Modifier.padding(all = 8.dp),
                verticalAlignment = Alignment.CenterVertically
            ){
                val gambarLogo = painterResource(id = R.drawable.bakwan)
                Image(
                    painter = gambarLogo,
                    contentDescription = null,
                    modifier = Modifier
                        .size(size = 100.dp)
                        .padding(all = 5.dp)
                )
                Spacer(modifier = Modifier.width(width = 16.dp))

                Column (){
                    // --- STYLE NAMA DISAMAKAN SEPERTI CARD 1 ---
                    Text(text = stringResource(id = R.string.nama),
                        fontSize = 30.sp,
                        fontFamily = FontFamily.Cursive,
                        color = Color.White,
                        modifier = Modifier.padding(top = 15.dp)
                    )
                    Text(text = stringResource(id = R.string.nim),
                        fontSize = 16.sp,
                        color = Color.White
                    )
                    Text(text = stringResource(id = R.string.alamat),
                        fontSize = 16.sp,
                        color = Color.White
                    )
                }
            }
        }

        // Spacer untuk mendorong copyright ke bawah
        Spacer(Modifier.weight(1f))

        Text(
            text = stringResource(id = R.string.copy),
            fontSize = 14.sp
        )
    }
}