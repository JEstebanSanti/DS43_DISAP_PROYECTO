package com.example.assistencias

import android.content.Context
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.EditText
import android.widget.LinearLayout
import android.widget.Toast
import androidx.navigation.fragment.findNavController
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.assistencias.adapter.MemberAdapter
import com.google.android.material.bottomsheet.BottomSheetDialog
import com.google.android.material.bottomsheet.BottomSheetDialogFragment
import com.google.android.material.floatingactionbutton.FloatingActionButton


// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"

/**
 * A simple [Fragment] subclass.
 * Use the [HomeFragment.newInstance] factory method to
 * create an instance of this fragment.
 */
class HomeFragment : Fragment() {
    // TODO: Rename and change types of parameters
    private var param1: String? = null
    private var param2: String? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        arguments?.let {
            param1 = it.getString(ARG_PARAM1)
            param2 = it.getString(ARG_PARAM2)
        }
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val contex = requireContext()
        val rootView = inflater.inflate(R.layout.fragment_home, container, false)
        val fab_btn = rootView.findViewById<FloatingActionButton>(R.id.fab_add_member)
        fab_btn.setOnClickListener(){
            val bsdViewAdd = BottomSheetDialog(rootView.context)
            val parentView: View = layoutInflater.inflate(R.layout.bsd_add_member, null)
            bsdViewAdd.setContentView(parentView)
            bsdViewAdd.show()
            val btnConfirm = parentView.findViewById<Button>(R.id.bsd_btn_confim)
            val bsdName = parentView.findViewById<EditText>(R.id.bsd_member_name)
            val bsdLastName = parentView.findViewById<EditText>(R.id.bsd_member_last_name)
            val bsdPhone = parentView.findViewById<EditText>(R.id.bsd_member_phone)
            btnConfirm.setOnClickListener() {

            }

        }
        initReciclerView(rootView, contex)
        return  rootView

    }
    fun saludo(contx: Context){
        Toast.makeText(contx, "GOAL -!-!- "+requireContext(), Toast.LENGTH_SHORT)
    }
    fun initReciclerView( rootView: View, contx: Context){
        val recyclerView = rootView.findViewById<RecyclerView>(R.id.recycleMembers)
        recyclerView.layoutManager = LinearLayoutManager(contx)
        recyclerView.adapter = MemberAdapter(MemberProvider.memberList)

    }
    companion object {
        /**
         * Use this factory method to create a new instance of
         * this fragment using the provided parameters.
         *
         * @param param1 Parameter 1.
         * @param param2 Parameter 2.
         * @return A new instance of fragment HomeFragment.
         */
        // TODO: Rename and change types and number of parameters
        @JvmStatic
        fun newInstance(param1: String, param2: String) =
            HomeFragment().apply {
                arguments = Bundle().apply {
                    putString(ARG_PARAM1, param1)
                    putString(ARG_PARAM2, param2)
                }
            }
    }
}


