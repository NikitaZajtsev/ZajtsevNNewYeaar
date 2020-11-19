package zajtsev.example.com

import android.R
import android.content.Intent
import android.os.Bundle
import android.view.animation.AnimationUtils
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_description.*


class DescriptionActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(zajtsev.example.com.R.layout.activity_description)
        buttonMaintwo.setOnClickListener {
            val intentBack = Intent (this,MainActivity::class.java)
            startActivity(intentBack)
        }
        val animation = AnimationUtils.loadAnimation(this, zajtsev.example.com.R.anim.animation_ded)
        imageViewSani.startAnimation(animation)
    }

}