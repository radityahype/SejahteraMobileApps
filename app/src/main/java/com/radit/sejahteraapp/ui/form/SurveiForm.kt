package com.radit.sejahteraapp.ui.form

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.ArrayAdapter
import com.google.android.material.bottomnavigation.BottomNavigationView
import com.radit.sejahteraapp.R
import com.radit.sejahteraapp.databinding.ActivityLoginBinding
import com.radit.sejahteraapp.databinding.ActivitySurveiFormBinding
import com.radit.sejahteraapp.ui.home.HomeActivity
import com.radit.sejahteraapp.ui.profile.ProfileActivity

class SurveiForm : AppCompatActivity() {

    private lateinit var binding: ActivitySurveiFormBinding
    private lateinit var nav: BottomNavigationView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySurveiFormBinding.inflate(layoutInflater)
        setContentView(binding.root)

        setupDropdown()
        setupAction()

    }

    private fun setupDropdown() {
        val listOfKelamin = listOf("Laki-laki", "Perempuan")
        val listOfPekerjaan = listOf("Petani", "Nelayan", "Pekerja Lepas",
            "Tidak/Belum Bekerja", "Pegawai Swasta", "Pensiunan",
            "Wiraswasta", "Pedagang", "PNS/TNI/Polri", "Pejabat Negara")
        val listOfStatusPekerjaan = listOf("Berusaha Sendiri", "Buruh/Karyawan/Pegawai", "Pekerja Bebas",
            "Berusaha dibantu Buruh Tetap/Dibayar", "Berusaha dibantu Buruh Tidak Tetap/Buruh Tidak Dibayar","Pekerja Keluarga/Tidak Dibayar")
        val listOfStatusPendidikan = listOf("Tidak Tamat SD/Sederajat","Tamat SD/Sederajat", "Tamat SLTP/Sederajat", "Tamat SLTA/Sederajat", "Tidak/Belum Sekolah", "Masih SLTA/Sederajat", "Tamat PT/Akademik", "Masih SLTP/Sederajat", "Masih SD/Sederajat", "Masih PT/Akademi")
        val listOfStatusPerkawinan = listOf("Kawin", "Cerai Mati", "Cerai Hidup", "Belum Kawin")
        val listOfTempatTinggal = listOf("Milik Sendiri", "Bebas Sewa/Menumpang", "Kontrak/Sewa", "Dinas", "Lainnya")
        val listOfJenisAtap = listOf("Beton", "Asbes/Seng", "Genteng", "Kayu/Sirap", "Jerami/Ijuk/Rumbia/Daun-daunan", "Lainnya")
        val listOfKualitasAtap = listOf("Jelek/Kualitas Rendah", "Bagus/Kualitas Tinggi")
        val listOfJenisTembok = listOf("Tembok", "Kayu/Papan", "Bambu", "Seng", "Lainnya")
        val listOfKualitasTembok = listOf("Jelek/Kualitas Rendah", "Bagus/Kualitas Tinggi")
        val listOfJenisLantai = listOf("Semen", "Kayu/Papan", "Keramik/Granit/Marmer/Ubin/Tegel/Teraso", "Tanah", "Bambu", "Lainnya")
        val listOfKualitasLantai = listOf("Jelek/Kualitas Rendah", "Bagus/Kualitas Tinggi")
        val listOfSumberListrik = listOf("Listrik PLN Meteran", "Listrik PLN Non Meteran", "Bukan Listrik")
        val listOfDayaListrik = listOf(">900 watt", "=< 900 watt")
        val listOfBahanBakar = listOf("Listrik/Gas", "Minyak Tanah", "Arang/Kayu", "Lainnya")
        val listOfAir = listOf("Air Kemasan/Isi Ulang", "Sumur Terlindung", "Ledeng/PAM", "Air Permukaan (Sungai, Danau, dll)", "Sumur Tidak Terlindung", "Air Hujan", "Sumur Bor", "Lainnya")
        val listOfBab = listOf("Milik Sendiri", "Umum/Bersama", "Lainnya")
        val listOfStunting = listOf("Bukan Target Sasaran", "Tidak Beresiko Stunting", "Beresiko Stunting")
        val listOfSimpanan = listOf("Ya", "Tidak")

        val adapterKelamin = ArrayAdapter(this, R.layout.list_item, listOfKelamin)
        val adapterPekerjaan = ArrayAdapter(this, R.layout.list_item, listOfPekerjaan)
        val adapterStatusPekerjaan = ArrayAdapter(this, R.layout.list_item, listOfStatusPekerjaan)
        val adapterStatusPendidikan = ArrayAdapter(this, R.layout.list_item, listOfStatusPendidikan)
        val adapterStatusKawin = ArrayAdapter(this, R.layout.list_item, listOfStatusPerkawinan)
        val adapterStatusTempatTinggal = ArrayAdapter(this, R.layout.list_item, listOfTempatTinggal)
        val adapterJenisAtap = ArrayAdapter(this, R.layout.list_item, listOfJenisAtap)
        val adapterKualitasAtap = ArrayAdapter(this, R.layout.list_item, listOfKualitasAtap)
        val adapterJenisTembok = ArrayAdapter(this, R.layout.list_item, listOfJenisTembok)
        val adapterKualitasTembok = ArrayAdapter(this, R.layout.list_item, listOfKualitasTembok)
        val adapterJenisLantai = ArrayAdapter(this, R.layout.list_item, listOfJenisLantai)
        val adapterKualitasLantai = ArrayAdapter(this, R.layout.list_item, listOfKualitasLantai)
        val adapterSumberListrik = ArrayAdapter(this, R.layout.list_item, listOfSumberListrik)
        val adapterDayaListrik = ArrayAdapter(this, R.layout.list_item, listOfDayaListrik)
        val adapterBahanBakar = ArrayAdapter(this, R.layout.list_item, listOfBahanBakar)
        val adapterAir = ArrayAdapter(this, R.layout.list_item, listOfAir)
        val adapterBab = ArrayAdapter(this, R.layout.list_item, listOfBab)
        val adapterStunting = ArrayAdapter(this, R.layout.list_item, listOfStunting)
        val adapterSimpanan = ArrayAdapter(this, R.layout.list_item, listOfSimpanan)


        binding.dropdownKelamin.setAdapter(adapterKelamin)
        binding.dropdownPekerjaan.setAdapter(adapterPekerjaan)
        binding.dropdownStatusPekerjaan.setAdapter(adapterStatusPekerjaan)
        binding.dropdownStatusPendidikan.setAdapter(adapterStatusPendidikan)
        binding.dropdownStatusKawin.setAdapter(adapterStatusKawin)
        binding.dropdownTempatTinggal.setAdapter(adapterStatusTempatTinggal)
        binding.dropdownSimpanan.setAdapter(adapterSimpanan)
        binding.dropdownJenisAtap.setAdapter(adapterJenisAtap)
        binding.dropdownKualitasAtap.setAdapter(adapterKualitasAtap)
        binding.dropdownJenisTembok.setAdapter(adapterJenisTembok)
        binding.dropdownKualitasTembok.setAdapter(adapterKualitasTembok)
        binding.dropdownJenisLantai.setAdapter(adapterJenisLantai)
        binding.dropdownKualitasLantai.setAdapter(adapterKualitasLantai)
        binding.dropdownDayaListrik.setAdapter(adapterDayaListrik)
        binding.dropdownSumberPenerangan.setAdapter(adapterSumberListrik)
        binding.dropdownBahanBakar.setAdapter(adapterBahanBakar)
        binding.dropdownSumberAir.setAdapter(adapterAir)
        binding.dropdownFasilitasBab.setAdapter(adapterBab)
        binding.dropdownResikoStunting.setAdapter(adapterStunting)
    }

    private fun setupAction() {
        Log.i("setupAction", "Masukkk")
        nav = binding.bottomNav
        binding.bottomNav.setOnItemReselectedListener { menuItem ->
            when (menuItem.itemId) {
                R.id.home -> {
                    Log.i("setupAction", "Home")
                    val intent = Intent(this, HomeActivity::class.java)
                    startActivity(intent)
                }

                R.id.add -> {
                    Log.i("setupAction", "Add")
                    val intent = Intent(this, SurveiForm::class.java)
                    startActivity(intent)
                }

                R.id.profile -> {
                    Log.i("setupAction", "Profile")
                    val intent = Intent(this, ProfileActivity::class.java)
                    startActivity(intent)
                }
            }

        }
    }
}