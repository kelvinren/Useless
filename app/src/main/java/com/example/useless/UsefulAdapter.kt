package com.example.useless

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class UsefulAdapter internal constructor(context: Context) : RecyclerView.Adapter<UsefulAdapter.UsefulViewHolder>() {

    val inflater: LayoutInflater = LayoutInflater.from(context)



    private val usefulRecords = emptyList<Useful>()

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): UsefulViewHolder {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
        val itemView = inflater.inflate(R.layout.recyclerview_item,parent, false)
        return UsefulViewHolder(itemView)
    }

    override fun getItemCount(): Int {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
        return usefulRecords.size
    }

    override fun onBindViewHolder(holder: UsefulViewHolder, position: Int) {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
        val usefulRec = usefulRecords.get(position)
        holder.textViewName.text = usefulRec.name
        holder.textViewAge.text = usefulRec.age.toString()

    }

    inner class UsefulViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val textViewName: TextView = itemView.findViewById(R.id.textViewName)
        val textViewAge: TextView = itemView.findViewById(R.id.textViewAge)
    }
}