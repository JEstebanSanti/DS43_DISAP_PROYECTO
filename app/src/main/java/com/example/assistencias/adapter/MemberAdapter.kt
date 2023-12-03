package com.example.assistencias.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.assistencias.Member
import com.example.assistencias.R

class MemberAdapter(
    private val memberList:List<Member>,
    private val onClickListener: (Int)->Unit,

    ): RecyclerView.Adapter<MemberViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MemberViewHolder {
        val layoutInflater = LayoutInflater.from(parent.context)
        return MemberViewHolder(layoutInflater.inflate(R.layout.item_member, parent, false))
    }

    override fun getItemCount(): Int {
        return  memberList.size
    }

    override fun onBindViewHolder(holder: MemberViewHolder, position: Int) {
        val item = memberList[position]
        holder.render(item, onClickListener)
    }

}