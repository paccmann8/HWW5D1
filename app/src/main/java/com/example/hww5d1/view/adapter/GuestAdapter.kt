package com.example.hww5d1.view.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.hww5d1.R
import com.example.hww5d1.view.database.HotelEntity
import kotlinx.android.synthetic.main.guest_item_layout.*



private val context: Context? = null

class GuestAdapter(private val roomsTaken: List<HotelEntity>) :
    RecyclerView.Adapter<GuestAdapter.GuestViewHolder>() {



    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): GuestViewHolder {


        val view = LayoutInflater.from(parent.context)
            .inflate(
                R.layout.guest_item_layout,
                parent,
                false
            )



        return GuestViewHolder(view)



    }

    override fun getItemCount(): Int {
        return roomsTaken.size
    }

    override fun onBindViewHolder(holder: GuestViewHolder, position: Int) {



        holder.apply {
            roomNumber.text = "${roomsTaken[position].roomNumber}"
            guestName.text = "${roomsTaken[position].guestName}"


        }



    }



    inner class GuestViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val roomNumber: TextView = itemView.findViewById(R.id.guest_room_textview)
        val guestName: TextView = itemView.findViewById(R.id.guest_name_textview)


    }
}