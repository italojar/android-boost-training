package space.italojar.androidboosttraining

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import space.italojar.androidboosttraining.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.rvMovies.layoutManager = GridLayoutManager(this, 2)
        binding.rvMovies.adapter = MoviesAdapter(
            listOf(
                Movie("Movie 1", "https://loremflickr.com/320/240?lock=1"),
                Movie("Movie 2", "https://loremflickr.com/320/240?lock=2"),
                Movie("Movie 3", "https://loremflickr.com/320/240?lock=3"),
                Movie("Movie 4", "https://loremflickr.com/320/240?lock=4"),
                Movie("Movie 5", "https://loremflickr.com/320/240?lock=5"),
                Movie("Movie 6", "https://loremflickr.com/320/240?lock=6"),
            )
        ) { movie -> Toast.makeText(this, movie.title, Toast.LENGTH_SHORT).show() }
    }
}