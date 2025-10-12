package ddwu.com.mobile.nct_list

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import androidx.navigation.fragment.findNavController
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class N127_Fragment : Fragment() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment

        val view = inflater.inflate(R.layout.fragment_n127_, container, false)

        val items = mutableListOf<String>()
        items.add("영웅")
        items.add("Sticker")
        items.add("Cherry Bomb")
        items.add("질주")

        val rv = view.findViewById<RecyclerView>(R.id.n127_list)
        val rvAdapter = RVAdapter(items)

        rv.adapter = rvAdapter
        rv.layoutManager = LinearLayoutManager(context)

        val ndream = view.findViewById<ImageView>(R.id.ndream)
        ndream.setOnClickListener {
            findNavController().navigate(R.id.action_n127_Fragment_to_ndream_Fragment)
        }

        val nwish = view.findViewById<ImageView>(R.id.nwish)
        nwish.setOnClickListener {
            findNavController().navigate(R.id.action_n127_Fragment_to_nwish_Fragment)
        }

        return view
    }

}