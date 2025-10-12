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

class Ndream_Fragment : Fragment() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_ndream_, container, false)

        val items = mutableListOf<String>()
        items.add("hot souce")
        items.add("버퍼링")
        items.add("Hello Future")
        items.add("Beatbox")

        val rv = view.findViewById<RecyclerView>(R.id.ndream_list)
        val rvAdapter = RVAdapter(items)

        rv.adapter = rvAdapter
        rv.layoutManager = LinearLayoutManager(context)

        val n127 = view.findViewById<ImageView>(R.id.n127)
        n127.setOnClickListener {
            findNavController().navigate(R.id.action_ndream_Fragment_to_n127_Fragment)
        }

        val nwish = view.findViewById<ImageView>(R.id.nwish)
        nwish.setOnClickListener {
            findNavController().navigate(R.id.action_ndream_Fragment_to_nwish_Fragment)
        }

        return view
    }

}