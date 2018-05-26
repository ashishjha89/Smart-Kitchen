package smartkitchen.com.smartkitchen

import android.os.Bundle
import android.support.annotation.IdRes
import android.support.design.widget.BottomNavigationView
import android.support.v7.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    private val currentTab = "CurrentTab"

    private var currentTabValue: Int = R.id.navigation_home

    private val homeFragment = HomeFragment()
    private val profileFragment = ProfileFragment()
    private val exploreFragment = ExploreFragment()
    private val dishFragment = DishFragment()
    private val postRecipeFragment = PostRecipeFragment()

    private val mOnNavigationItemSelectedListener = BottomNavigationView.OnNavigationItemSelectedListener { item ->
        updateCurrentTab(item.itemId)
        showFragment()
        return@OnNavigationItemSelectedListener true
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        if (savedInstanceState != null) {
            currentTabValue = savedInstanceState.getInt(currentTab, R.id.navigation_home)
        }

        updateCurrentTab(currentTabValue)
        showFragment()

        navigation.setOnNavigationItemSelectedListener(mOnNavigationItemSelectedListener)
    }

    override fun onSaveInstanceState(outState: Bundle?) {
        outState?.putInt(currentTab, currentTabValue)
        super.onSaveInstanceState(outState)
    }

    private fun updateCurrentTab(@IdRes menuItem: Int) {
        if (currentTabValue != menuItem) {
            currentTabValue = menuItem
        }
    }

    private fun showFragment() {
        when (currentTabValue) {
            R.id.navigation_home -> {
                supportFragmentManager
                        .beginTransaction()
                        .replace(R.id.content_frame, homeFragment, HomeFragment.TAG)
                        .commit()
            }
            R.id.navigation_profile -> {
                supportFragmentManager
                        .beginTransaction()
                        .replace(R.id.content_frame, profileFragment, ProfileFragment.TAG)
                        .commit()
            }
            R.id.navigation_explore -> {
                supportFragmentManager
                        .beginTransaction()
                        .replace(R.id.content_frame, exploreFragment, ExploreFragment.TAG)
                        .commit()
            }
            R.id.navigation_dish -> {
                supportFragmentManager
                        .beginTransaction()
                        .replace(R.id.content_frame, dishFragment, DishFragment.TAG)
                        .commit()
            }
            R.id.navigation_place_recipe -> {
                supportFragmentManager
                        .beginTransaction()
                        .replace(R.id.content_frame, postRecipeFragment, PostRecipeFragment.TAG)
                        .commit()
            }
        }
    }

}
