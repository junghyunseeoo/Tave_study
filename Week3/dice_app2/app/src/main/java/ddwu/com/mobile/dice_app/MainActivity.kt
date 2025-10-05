package ddwu.com.mobile.dice_app

import android.os.Bundle
import android.util.Log
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.databinding.DataBindingUtil
import ddwu.com.mobile.dice_app.databinding.ActivityMainBinding
import kotlin.random.Random

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        ///setContentView(R.layout.activity_main)

        binding = DataBindingUtil.setContentView(this, R.layout.activity_main)
        //뷰 바인딩으로 하고싶다면
        // 1. View Binding 방식으로 바인딩 객체 초기화 (핵심 변경점)
        //    ActivityMainBinding.inflate()를 사용하여 레이아웃을 확장합니다.
        //binding = ActivityMainBinding.inflate(layoutInflater)

        // 2. 바인딩 객체의 루트 뷰를 화면에 설정합니다.
        //setContentView(binding.root)

        //binding 은 xml레이아웃과 코드를 연결하는 컨테이너 역할
        val diceImage1 = binding.dice1 //가독성을 위해 binding을 사용
        val diceImage2 = binding.dice2 //속성임.

        binding.startbtn.setOnClickListener {

            Toast.makeText(this, "주사위를 Go!", Toast.LENGTH_LONG).show()

            Log.d("MainActivity", Random.nextInt(1,6).toString())

            val number1 = Random.nextInt(1, 6)
            val number2 = Random.nextInt(1, 6)

            if (number1 == 1) {
                diceImage1.setImageResource(R.drawable.dice_1)
            } else if (number1 == 2) {
                diceImage1.setImageResource(R.drawable.dice_2)
            } else if (number1 == 3) {
                diceImage1.setImageResource(R.drawable.dice_3)
            } else if (number1 == 4) {
                diceImage1.setImageResource(R.drawable.dice_4)
            } else if (number1 == 5) {
                diceImage1.setImageResource(R.drawable.dice_5)
            } else {
                diceImage1.setImageResource(R.drawable.dice_6)
            }

            if (number2 == 1) {
                diceImage2.setImageResource(R.drawable.dice_1)
            } else if (number2 == 2) {
                diceImage2.setImageResource(R.drawable.dice_2)
            } else if (number2 == 3) {
                diceImage2.setImageResource(R.drawable.dice_3)
            } else if (number2 == 4) {
                diceImage2.setImageResource(R.drawable.dice_4)
            } else if (number2 == 5) {
                diceImage2.setImageResource(R.drawable.dice_5)
            } else {
                diceImage2.setImageResource(R.drawable.dice_6)
            }
        }
    }
}