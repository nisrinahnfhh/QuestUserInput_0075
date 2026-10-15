package com.example.pertemuan5

@Composable
fun FormDataDiri(modifier: Modifier) {

    // Variabel untuk menyimpan nilai masukan dari keyboard
    var textNama by remember { mutableStateOf("") }
    var textAlamat by remember { mutableStateOf("") }
    var textJK by remember { mutableStateOf("") }
    val gender: List<String> = listOf("Laki-laki", "Perempuan")

    var nama by remember { mutableStateOf("") }
    var alamat by remember { mutableStateOf("") }
    var jenis by remember { mutableStateOf("") }
}