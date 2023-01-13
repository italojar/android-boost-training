package space.italojar.androidboosttraining

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import space.italojar.androidboosttraining.databinding.ViewMovieItemBinding

class MoviesAdapter(
    private val movies: List<Movie>,
    private val movieClickedListener: (movie: Movie) -> Unit
): RecyclerView.Adapter<MoviesAdapter.ViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val layoutInflater: LayoutInflater = LayoutInflater.from(parent.context)
        val view = layoutInflater.inflate(R.layout.view_movie_item, parent, false)
        //val binding = ViewMovieItemBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        //return ViewHolder(binding)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val movie = movies[position]
        holder.bind(movie)
        holder.itemView.setOnClickListener { movieClickedListener(movie) }
    }

    override fun getItemCount(): Int = movies.size

    /*inner class ViewHolder(binding: ViewMovieItemBinding): RecyclerView.ViewHolder(binding) {
    }*/

    inner class ViewHolder(view: View): RecyclerView.ViewHolder(view) {
        val binding = ViewMovieItemBinding.bind(view)
        fun bind(movie: Movie) {
            binding.tvTitle.text = movie.title
            Utils().loadImage(binding.root.context, movie.cover, binding.cover)
        }
    }
}