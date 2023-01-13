package space.italojar.androidboosttraining

import android.content.Context
import android.widget.ImageView
import com.bumptech.glide.Glide

class Utils {

    fun loadImage(context: Context, url: String, imageView: ImageView) {
        Glide.with(context).load(url).into(imageView)
    }
}