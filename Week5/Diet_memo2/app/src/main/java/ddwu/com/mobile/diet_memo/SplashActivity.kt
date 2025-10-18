package ddwu.com.mobile.diet_memo

import android.content.Intent
import android.os.Bundle
import android.os.Handler
import android.util.Log
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.google.firebase.Firebase
import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.auth.auth


class SplashActivity : AppCompatActivity() {
    private lateinit var auth: FirebaseAuth

    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)

        auth = Firebase.auth

        try {
            // 현재 로그인된 사용자가 있는 경우
            Log.d("SPLASH", auth.currentUser!!.uid)
            Toast.makeText(this, "원래 비회원 로그인이 되어있는 사람입니다!", Toast.LENGTH_LONG).show()

            // ✅ 수정: Handler(mainLooper)를 사용하여 안정적인 딜레이 실행
            android.os.Handler(mainLooper).postDelayed({
                startActivity(Intent(this, MainActivity::class.java))
                finish()
            }, 3000)

        } catch (e : Exception) {
            // 로그인된 사용자가 없는 경우 (처음 실행 또는 로그아웃 상태)
            Log.d("SPLASH", "회원가입 시켜줘야함 (익명 로그인 시도)")

            auth.signInAnonymously()
                .addOnCompleteListener(this) { task ->
                    if (task.isSuccessful) {
                        // 익명 로그인 성공
                        Toast.makeText(this, "비회원 로그인 성공", Toast.LENGTH_LONG).show()

                        // ✅ 수정: Handler(mainLooper)를 사용하여 안정적인 딜레이 실행
                        android.os.Handler(mainLooper).postDelayed({
                            startActivity(Intent(this, MainActivity::class.java))
                            finish()
                        }, 3000)
                    } else {
                        // 익명 로그인 실패
                        Toast.makeText(this, "비회원 로그인 실패", Toast.LENGTH_LONG).show()

                        // 🚨 실패 시 Activity에 멈추는 것을 방지하기 위해 Activity 종료
                        finish()
                    }
                }

        }
    }
}