package com.example.assistencias.adapter

import android.view.View
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.assistencias.Member
import com.example.assistencias.R
import com.squareup.picasso.Picasso

class MemberViewHolder(view:View):RecyclerView.ViewHolder(view) {
    val imgMember = view.findViewById<ImageView>(R.id.ivMember)
    val memberName = view.findViewById<TextView>(R.id.tvMemberName)
    val memberLastName = view.findViewById<TextView>(R.id.tvMemberLastName)

    fun render(member: Member) {
        memberName.text = member.name
        memberLastName.text = member.lastName
        Picasso.get().load(member.photo).into(imgMember)
    }
}