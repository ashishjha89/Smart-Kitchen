package smartkitchen.com.smartkitchen

class RecipeRepo {
    private val chickenBiryani = RecipeModel(name = "Chicken Biryani", imageId = R.drawable.chicken_biryani)
    private val saagPaneerRecipe = RecipeModel(name = "Saag Paneer", imageId = R.drawable.saag_paneer_recipe)
    private val bakedEggModel = RecipeModel(name = "Baked Egges With Lentils", imageId = R.drawable.baked_eggs_with_lentils)
    private val butterBeanSpinach = RecipeModel(name = "Butter Bean Spinach", imageId = R.drawable.butter_bean_spinach)
    private val healthyBeenSalad = RecipeModel(name = "Healthy Been Salad", imageId = R.drawable.healthy_been_salad)
    private val fiestaChickenRecipe = RecipeModel(name = "Fiesta Chicken Recipe", imageId = R.drawable.fiesta_chicken_recipe)
    private val indianCauliflowerRecipe = RecipeModel(name = "Indian Cauliflower Recipe", imageId = R.drawable.indian_cauliflower_recipe)
    private val japaneseFriedRice = RecipeModel(name = "Japanese Fried Rice", imageId = R.drawable.japanese_fried_rice)
    private val kasenYakiSoba = RecipeModel(name = "Kasen Yaki Soba", imageId = R.drawable.kasen_yaki_soba)
    private val lemonDillChicken = RecipeModel(name = "Lemon Dill Chicken", imageId = R.drawable.lemon_dill_chicken)
    private val misoSoup = RecipeModel(name = "Miso Soup", imageId = R.drawable.miso_soup)
    private val poachedChickenWithBrothVermicelliNoodles = RecipeModel(name = "Poached Chicken With Broth Noodles", imageId = R.drawable.poached_chicken_with_broth_vermicelli_noodles)
    private val quickMongolianBeef = RecipeModel(name = "Quick Mongolian Beef", imageId = R.drawable.quick_mongolian_beef)
    private val roastedPumpkinAppleSoup = RecipeModel(name = "Roasted Pumpkin Apple Soup", imageId = R.drawable.roasted_pumpkin_apple_soup)
    private val sakePoachedChickenWithSobaNoodles = RecipeModel(name = "Sake Poached Chicken With Soba Noodles", imageId = R.drawable.sake_poached_chicken_with_soba_noodles)
    private val sauteedChickenBreastsCreamySauce = RecipeModel(name = "Sauteed Chicken Breasts", imageId = R.drawable.sauteed_chicken_breasts_creamy_sauce)
    private val zucchiniNoodlesAvocadoPeso = RecipeModel(name = "Zucchini Noodles Avocado", imageId = R.drawable.zucchini_noodles_avocado_peso)

    val recommendationList = arrayListOf(bakedEggModel, sauteedChickenBreastsCreamySauce, sakePoachedChickenWithSobaNoodles, chickenBiryani, lemonDillChicken)
    val healthyList = arrayListOf(healthyBeenSalad, misoSoup, saagPaneerRecipe, zucchiniNoodlesAvocadoPeso)
    val favoritesList = arrayListOf(kasenYakiSoba, fiestaChickenRecipe, japaneseFriedRice, kasenYakiSoba)
    val familyList = arrayListOf(zucchiniNoodlesAvocadoPeso, butterBeanSpinach, indianCauliflowerRecipe, saagPaneerRecipe)
    val specialList = arrayListOf(quickMongolianBeef, roastedPumpkinAppleSoup, poachedChickenWithBrothVermicelliNoodles, japaneseFriedRice)

    val chefList = arrayListOf(bakedEggModel, sauteedChickenBreastsCreamySauce, sakePoachedChickenWithSobaNoodles, chickenBiryani)
    val globalList = arrayListOf(kasenYakiSoba, fiestaChickenRecipe, japaneseFriedRice, zucchiniNoodlesAvocadoPeso, quickMongolianBeef)
}