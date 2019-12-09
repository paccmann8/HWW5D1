package com.example.hww5d1.view.view

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.DividerItemDecoration
import androidx.recyclerview.widget.DividerItemDecoration.VERTICAL
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.room.Room
import com.example.hww5d1.R
import com.example.hww5d1.view.database.HotelDatabase
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity(), InputFragment.FragmentListener {

    lateinit var HotelDB: HotelDatabase

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)





        HotelDB = Room.databaseBuilder(
            this,
            HotelDatabase::class.java,
            "Hotel.db"
        )
            .allowMainThreadQueries()
            .build()

        val room = PriceFragment()
        supportFragmentManager.beginTransaction()
            .replace(R.id.room_layout, room)
            .addToBackStack(room.tag)
            .commit()

        insert_guest.setOnClickListener {
            val fragment = InputFragment()
            supportFragmentManager.beginTransaction()
                .replace(R.id.main_framelayout, fragment)
                .addToBackStack(fragment.tag)
                .commit()
        }

    }




    override fun updateResults() {
        ///  setUpAdapter()
    }
}