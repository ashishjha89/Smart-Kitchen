package smartkitchen.com.smartkitchen

import android.content.Intent
import android.support.v7.widget.RecyclerView
import android.view.View
import android.widget.ImageView
import android.widget.TextView
import kotlinx.android.synthetic.main.suggestion_item.view.*

class RecipeViewHolder(view: View) : RecyclerView.ViewHolder(view) {

    val recipeLabel: TextView = itemView.recipe_label
    val recipeIcon: ImageView = itemView.recipe_icon

    init {
        itemView.setOnClickListener { itemView.context.startActivity(Intent(itemView.context, RecipeDetailActivity::class.java)) }
    }
}