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

class Nwish_Fragment : Fragment() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_nwish_, container, false)

        val items = mutableListOf<String>()
        items.add("Wish")
        items.add("Steady")
        items.add("PopPop")
        items.add("Color")
        items.add("Surf")
        items.add("1000")
        items.add("Nasa")
        items.add("Videohood")
        items.add("Songbird")
        items.add("Miracle")
        items.add("3분까진 필요 없어")
        items.add("Wishful Winter")



        val rv = view.findViewById<RecyclerView>(R.id.nwish_list)
        val rvAdapter = RVAdapter(items)

        rv.adapter = rvAdapter
        rv.layoutManager = LinearLayoutManager(context)

        val ndream = view.findViewById<ImageView>(R.id.ndream)
        ndream.setOnClickListener {
            findNavController().navigate(R.id.action_nwish_Fragment_to_ndream_Fragment)
        }

        val n127 = view.findViewById<ImageView>(R.id.n127)
        n127.setOnClickListener {
            findNavController().navigate(R.id.action_nwish_Fragment_to_n127_Fragment)
        }

        return view
    }

}