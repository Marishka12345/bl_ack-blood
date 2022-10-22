package com.example.homeapteka

import android.content.Context
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.Toast
import android.widget.Toast.makeText
import androidx.fragment.app.Fragment
import kotlinx.android.synthetic.main.activity_sostav.view.*
import kotlinx.android.synthetic.main.fragment_apteka.*


// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"

/**
 * A simple [Fragment] subclass.
 * Use the [Apteka.newInstance] factory method to
 * create an instance of this fragment.
 */
class Apteka : Fragment() {
    // TODO: Rename and change types of parameters
    private var param1: String? = null
    private var param2: String? = null
    var adapter: SostavAdapter? = null
    var adapter1:SostavAdapter? = null
    var sostavList = ArrayList<sostav>()


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
        var view:View =inflater.inflate(R.layout.fragment_apteka, container, false)
        // Inflate the layout for this fragment
        sostavList.add(sostav("Общие рекомендации"))
        sostavList.add(sostav("Состав аптечки"))
        sostavList.add(sostav("Для обработки ран"))
        sostavList.add(sostav("Лечебные средств"))
        sostavList.add(sostav("Дополнительные средства"))

  try {

      adapter = SostavAdapter(sostavList)

//         var adapter1 = SostavAdapter(sostavList)
      // getActivity()?.let { adapter = SostavAdapter(it, sostavList) }
      //gvSostav.adapter=adapter

      gvSostav.adapter = adapter
  }
   catch(ex:Exception)
   { println(ex.message)}
        return view
    }
 public  fun grid(){

 }
    companion object {
        /**
         * Use this factory method to create a new instance of
         * this fragment using the provided parameters.
         *
         * @param param1 Parameter 1.
         * @param param2 Parameter 2.
         * @return A new instance of fragment Apteka.
         */
        // TODO: Rename and change types and number of parameters
        @JvmStatic
        fun newInstance(param1: String, param2: String) =
            Apteka().apply {
                arguments = Bundle().apply {
                    putString(ARG_PARAM1, param1)
                    putString(ARG_PARAM2, param2)
                }
            }
        }
    }

public class SostavAdapter: BaseAdapter {
    var sostavList = ArrayList<sostav>()


    constructor( sostavList: ArrayList<sostav>): super() {

        this.sostavList = sostavList
    }

    override fun getCount(): Int {
        return sostavList.size
    }

    override fun getItem(p0: Int): Any {
        return sostavList[p0]
    }

    override fun getItemId(p0: Int): Long {
        return p0.toLong()
    }

    override fun getView(p0: Int, p1: View?, p2: ViewGroup?): View {
        val sostav = this.sostavList[p0]

        var inflater = LayoutInflater.from(p2?.context).inflate(R.layout.activity_sostav,null)
      //  var sostavView = inflater.inflate(R.layout.activity_sostav, null )
       // sostavView.sostav.setImageResource(sostav.image!!)

        inflater.tvName.text= sostav.name!!
        return inflater
    }
}
