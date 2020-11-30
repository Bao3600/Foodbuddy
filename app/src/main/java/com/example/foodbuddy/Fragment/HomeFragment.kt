package com.example.foodbuddy.Fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.*
import com.example.foodbuddy.NavbarActivity
import com.example.foodbuddy.R

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

    private lateinit var editText: EditText
    private lateinit var button: Button
    private lateinit var listView: ListView
    private var list: ArrayList<String> = ArrayList()
    private lateinit var arrayAdapter: ArrayAdapter<String>

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        arguments?.let {
            param1 = it.getString(ARG_PARAM1)
            param2 = it.getString(ARG_PARAM2)
        }

        /*listView = view?.findViewById(R.id.listView)!!
        editText = view?.findViewById(R.id.editText)!!
        button = view?.findViewById(R.id.btnAdd)!!
        arrayAdapter = context?.let { ArrayAdapter(it, android.R.layout.simple_list_item_1, list) }!!
        button.setOnClickListener {
            list.add(editText.text.toString())
            editText.setText("")
            arrayAdapter.notifyDataSetChanged()
            listView.adapter = arrayAdapter
        }*/

        //val search = findViewById<SearchView>(R.id.searchView)
        /* val search = view?.findViewById<SearchView>(R.id.searchView)
         val listView = view?.findViewById<ListView>(R.id.listview)

         val names = arrayOf(
                 "Food",
                 "Cheese",
                 "Apple",
                 "Peach",
                 "Orange"
         )
         val adapter = activity?.let {
             ArrayAdapter <String> (
                     it,
                     android.R.layout.simple_list_item_1,
                     names) }

         if (listView != null) {
             listView.adapter = adapter
         }
         search?.setOnQueryTextListener(object : SearchView.OnQueryTextListener{
             override fun onQueryTextSubmit(query: String?): Boolean {
                 search.clearFocus()
                 if (names.contains(query)) {
                     adapter?.filter?.filter(query)
                 }
                 else{
                     Toast.makeText(activity,"Item noy found!",Toast.LENGTH_SHORT).show();
                 }
                 return false
             }
             override fun onQueryTextChange(newText: String?): Boolean {
                 adapter?.filter?.filter(newText)
                 return false
             }
         })*/
    }

    override fun onCreateView(
            inflater: LayoutInflater, container: ViewGroup?,
            savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_home, container, false)
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