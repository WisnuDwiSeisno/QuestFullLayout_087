package com.example.project4

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Check
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Preview(showBackground = true)
@Composable
fun PlayActivity(modifier: Modifier = Modifier){
    Column(
        modifier = modifier.fillMaxSize()) {
        SectionHeader()
        Spacer(modifier = Modifier.padding(8.dp))
        Text(text = "Kepada Yth :", Modifier.padding(start = 8.dp))
        Text(text = "Jodi", Modifier.padding(start = 8.dp))
        MainSection(judulParam = "Nama", isipParam = "Wisnu Dwi Seisno")
        MainSection(judulParam = "Kelas", isipParam = "Kelas B")
        MainSection(judulParam = "NIM", isipParam = "20220140087")
        MainSection(judulParam = "Keterangan", isipParam = "Manusia TerGanteng yang ada di UMY")
    }
}

@Composable
fun SectionHeader(){
    Column {
        Box(modifier = Modifier
            .fillMaxWidth()
            .background(color = Color.DarkGray)) {
            Row(
                modifier = Modifier.padding(15.dp)
            ) {
                Box(contentAlignment = Alignment.BottomEnd) {
                    Image(painter = painterResource(id = R.drawable.umy),
                        contentDescription = null,
                        Modifier.size(90.dp))
                    Icon(Icons.Filled.Check,
                        contentDescription = null,
                        Modifier
                            .padding(end = 1.dp)
                            .size(25.dp),
                        tint = Color.Red )
                }
                Column (Modifier.padding(15.dp)) {
                    Text(text = "Teknologi Informasi", color = Color.White)
                    Spacer(Modifier.padding(3.dp))
                    Text(text = "Universitas Gamping Mengidul", color = Color.White)
                }
            }
        }
    }
}

@Composable
fun MainSection(judulParam:String, isipParam:String){
    Column {
        Row(Modifier.fillMaxWidth().padding(8.dp),
            horizontalArrangement = Arrangement.SpaceBetween) {
            Text(text = judulParam, Modifier.weight(0.8f))
            Text(text = ":", Modifier.weight(0.2f))
            Text(text = isipParam, Modifier.weight(2f))
        }
    }
}