package ddwu.com.mobile.twice

import android.os.Bundle
import android.widget.ImageView
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class InsideActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_inside)

        val getData = intent.getStringExtra("data")

        Toast.makeText(this, getData, Toast.LENGTH_LONG).show()

        val memberImage = findViewById<ImageView>(R.id.inside_image)
        if (getData == "1")
            memberImage.setImageResource(R.drawable.image1)

        if (getData == "2")
            memberImage.setImageResource(R.drawable.image2)

        if (getData == "3")
            memberImage.setImageResource(R.drawable.image3)

        if (getData == "4")
            memberImage.setImageResource(R.drawable.image4)

        if (getData == "5")
            memberImage.setImageResource(R.drawable.image5)

        if (getData == "6")
            memberImage.setImageResource(R.drawable.image6)

        if (getData == "7")
            memberImage.setImageResource(R.drawable.image7)

        if (getData == "8")
            memberImage.setImageResource(R.drawable.image8)

        if (getData == "9")
            memberImage.setImageResource(R.drawable.image9)


    }
}