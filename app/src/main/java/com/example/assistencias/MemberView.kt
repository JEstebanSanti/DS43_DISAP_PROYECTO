package com.example.assistencias

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.navigation.fragment.navArgs
import com.squareup.picasso.Picasso

class MemberView : Fragment() {

    val args:MemberViewArgs by navArgs()
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val positionItem:Int = args.positionItemList
        val member = MemberProvider.memberList[positionItem]
        val imageMember = view.findViewById<ImageView>(R.id.Iv_view_member)
        val nameMember = view.findViewById<TextView>(R.id.Tv_view_member)
        nameMember.text = member.name
        Picasso.get().load(member.photo).into(imageMember)
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val rootView = inflater.inflate(R.layout.fragment_member_view, container, false)
        val imageMember = rootView.findViewById<ImageView>(R.id.Iv_view_member)
        val nameMember = rootView.findViewById<TextView>(R.id.Tv_view_member)
        return  rootView
    }
}