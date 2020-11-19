package zajtsev.example.com

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_images.*

class ImagesActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_images)
        buttonMain.setOnClickListener {
            val intentMainActivity = Intent (this,MainActivity::class.java)
            startActivity(intentMainActivity)
        }
    }
}