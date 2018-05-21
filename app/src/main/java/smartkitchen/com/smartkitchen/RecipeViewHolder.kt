package smartkitchen.com.smartkitchen

import android.support.v7.widget.RecyclerView
import android.view.View
import kotlinx.android.synthetic.main.suggestion_item.view.*

class RecipeViewHolder(view: View) : RecyclerView.ViewHolder(view) {

    val recipeLabel = itemView.recipe_label
    val recipeIcon = itemView.recipe_icon
}