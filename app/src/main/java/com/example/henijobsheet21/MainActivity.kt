package com.example.henijobsheet21

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.henijobsheet21.Kelas

class MainActivity : AppCompatActivity() {
    val list = ArrayList<Kelas>()
    val listNama = arrayOf(
        "DWI FEBRI STYANINGRUM",
        "EVA ROHAS",
        "FELIM EDI PRABOWO",
        "FITRI RAHMAWATI",
        "HAMDAN AINUN NA'IM",
        "HENI WIJAYANTI",
        "IBNU RIF'AN",
        "JIHAN SALWA FITRIANI",
        "KOTIMATUS SA'ADAH",
        "LADA' ARDI SACHIO L",
        "LATIFAH IRSYADIAH",
    )

    val listNis = arrayOf(
        "2985",
        "2987",
        "2988",
        "2992",
        "2993",
        "2995",
        "2997",
        "3000",
        "3002",
        "3003",
        "3005",
    )

    lateinit var kelasView: RecyclerView
    lateinit var kelasAdapter: KelasAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        kelasView = findViewById(R.id.kelasView)
        kelasView.layoutManager = LinearLayoutManager(this)

        for (i in listNama.indices) {
            list.add(Kelas(listNama[i], listNis[i]))
        }

        kelasAdapter = KelasAdapter(list)
        kelasAdapter.notifyDataSetChanged()
        kelasView.adapter = kelasAdapter
    }
}