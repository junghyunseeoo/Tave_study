package ddwu.com.mobile.bts

import android.content.Intent
import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import android.widget.ImageView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // 1. 화면이 클릭되었다는 것을 알아야 합니다.
        val image1 = findViewById<ImageView>(R.id.image_1)

        image1.setOnClickListener {

            Toast.makeText(this, "1번 클릭 완료", Toast.LENGTH_LONG).show()

            // 2. 화면이 클릭되면, 다음 화면으로 넘어가서, 사진을 크게 보여줌!
            val intent = Intent(this, Bts1Activity::class.java)
            startActivity(intent)
        }

        // 7개 image들의 이름을 다 붙이고, 각각 클릭 식, 다른 액티비티로 이동!
        val image2 = findViewById<ImageView>(R.id.image_2)
        val image3 = findViewById<ImageView>(R.id.image_3)
        val image4 = findViewById<ImageView>(R.id.image_4)
        val image5 = findViewById<ImageView>(R.id.image_5)
        val image6 = findViewById<ImageView>(R.id.image_6)
        val image7 = findViewById<ImageView>(R.id.image_7)
        val image8 = findViewById<ImageView>(R.id.image_8)
        val image9 = findViewById<ImageView>(R.id.image_9)


        //인텐트는 한 액티비티에서 다른 액티비티로 화면을 전환하는 데 사용된다.
        image2.setOnClickListener {
            val intent = Intent(this, Bts2Activity::class.java)
            startActivity(intent)
        }
        image3.setOnClickListener {
            val intent = Intent(this, Bts3Activity::class.java)
            startActivity(intent)
        }
        image4.setOnClickListener {
            val intent = Intent(this, Bts4Activity::class.java)
            startActivity(intent)
        }
        image5.setOnClickListener {
            val intent = Intent(this, Bts5Activity::class.java)
            startActivity(intent)
        }
        image6.setOnClickListener {
            val intent = Intent(this, Bts6Activity::class.java)
            startActivity(intent)
        }
        image7.setOnClickListener {
            val intent = Intent(this, Bts7Activity::class.java)
            startActivity(intent)
        }
        image8.setOnClickListener {
            val intent = Intent(this, Bts8Activity::class.java)
            startActivity(intent)
        }
        image9.setOnClickListener {
            val intent = Intent(this, Bts9Activity::class.java)
            startActivity(intent)
        }

    }
}
