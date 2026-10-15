package com.example.pertemuan5

import androidx.compose.foundation.selection.selectable
import androidx.compose.material3.Divider
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.RadioButton
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.dimensionResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.style.LineHeightStyle

@Composable
fun FormDataDiri(modifier: Modifier) {

    // Variabel untuk menyimpan nilai masukan dari keyboard
    var textNama by remember { mutableStateOf(value = "") }
    var textAlamat by remember { mutableStateOf(value ="") }
    var textJK by remember { mutableStateOf(value ="") }
    val gender: List<String> = listOf("Laki-laki", "Perempuan")

    var nama by remember { mutableStateOf(value ="") }
    var alamat by remember { mutableStateOf(value ="") }
    var jenis by remember { mutableStateOf(value ="") }
    Column( modifier = Modifier.padding(top = 50.dp),
        verticalArrangement = Arrangement.Top,
        horizontalAlignment = Alignment.CenterHorizontally) {
        OutlinedTextField(
            value = textNama,
            singleLine = true,
            shape = MaterialTheme.shapes.large,
            modifier = Modifier.width(250.dp),
            label = { Text(text = "Nama Lengkap")},
            onValueChange = {
                textNama = it
            }

        )

        Row {
            gender.forEacg { item ->
                Row(
                    modifier = Modifier.selectable(
                    selected = textJK == item,
                    onClick = { textJK = item }
                ), verticalAligment = Alignment.CenterVertically) {
                    RadioButton(
                        selected = textJK == item,
                        onClick = {
                            textJK = item
                        })
                    Text(item)
                }
            }

        }

        OutlinedTextField(
            value = textAlamat,
            value = textNams,
            singleLine = true,
            shape = MaterialTheme.shapes.large,
            modifier = Modifier.width(250.dp),
            label = {Text(text = "Nama Lengkap")},
            onValueChannge = {
                textNama = it
            }
        )

        Divider(
            mofifier = Modifier.padding(bottom =
                dimensionResource(id = R.dimen.padding_medium), top = dimensionResource(
                    id = R.dimen.padding_medium
                )),
            thickness = dimensionResource(1dp),
            color = Color.DaerkGray
        )
        Button(
            modifier = Modifier.f1l MaxWidth(fraction = 1f),
            // the button is enabled when the user makes a selection
            enabled = textALamat. isNotEmpty(),
            onClick = {
                nama = textNama
                jenis = textJK
                alamat = textAlamat
            }

        )}
    Text(stringResource("Submit"))




    }
}