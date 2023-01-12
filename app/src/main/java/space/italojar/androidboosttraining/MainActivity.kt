package space.italojar.androidboosttraining

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
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
                Movie("Movie 1", "Url movie 1"),
                Movie("Movie 2", "Url movie 2"),
                Movie("Movie 3", "Url movie 3"),
                Movie("Movie 4", "Url movie 4"),
                Movie("Movie 5", "Url movie 5"),
                Movie("Movie 6", "Url movie 6"),
            )
        )
    }
}