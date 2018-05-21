package smartkitchen.com.smartkitchen

import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.ViewGroup

class RecipeAdapter(private val recipeModelList: ArrayList<RecipeModel>) : RecyclerView.Adapter<RecipeViewHolder>() {

    override fun getItemCount() = recipeModelList.size

    override fun onBindViewHolder(holder: RecipeViewHolder, position: Int) {
        holder.recipeLabel.text = recipeModelList[position].name
        holder.recipeIcon.setImageResource(recipeModelList[position].imageId)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int) =
            RecipeViewHolder(LayoutInflater.from(parent.context).inflate(R.layout.suggestion_item, parent, false))
}