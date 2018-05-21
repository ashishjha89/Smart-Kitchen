package smartkitchen.com.smartkitchen

import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.ViewGroup

class DishFragment : Fragment() {

    companion object {
        const val TAG = "DishFragment"
    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?) =
            inflater.inflate(R.layout.dish_fragment, container, false)!!


}