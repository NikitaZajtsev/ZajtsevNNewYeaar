package zajtsev.example.com

import android.content.Intent
import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.provider.MediaStore
import android.util.EventLogTags
import android.view.Gravity
import android.view.animation.AnimationUtils
import android.widget.ImageView
import android.widget.LinearLayout
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_description.*
import kotlinx.android.synthetic.main.activity_images.*
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        buttonPhoto.setOnClickListener {
            val intentImage = Intent(this, ImagesActivity::class.java)
            startActivity(intentImage)

        }
        buttonBiog.setOnClickListener {
            val intentAbout = Intent(this, DescriptionActivity::class.java)
            startActivity(intentAbout)
        }
        buttonTrap.setOnClickListener {
            val toast = Toast.makeText(applicationContext, R.string.textTrap, Toast.LENGTH_LONG)
            toast.setGravity(Gravity.CENTER_VERTICAL, 0, 0)
            val toastContainer = toast.view as LinearLayout
            val trapImage = ImageView(this)
            trapImage.setImageResource(R.drawable.trap_image)
            toastContainer.addView(trapImage, 0)
            toastContainer.setBackgroundColor(Color.TRANSPARENT)
            toast.show()
        }


        val animation = AnimationUtils.loadAnimation(this, zajtsev.example.com.R.anim.animation_ded2)
        imageViewSani2.startAnimation(animation)

    }

}