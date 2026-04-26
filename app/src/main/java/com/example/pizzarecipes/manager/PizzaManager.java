package com.example.pizzarecipes.manager;


import com.example.pizzarecipes.R;
import com.example.pizzarecipes.models.Pizza;
import com.example.pizzarecipes.repository.IRepository;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class PizzaManager implements IRepository<Pizza> {

    private static PizzaManager instance;
    private final List<Pizza> pizzaList = new ArrayList<>();

    private PizzaManager() {
        loadData();
    }

    public static PizzaManager getInstance() {
        if (instance == null) instance = new PizzaManager();
        return instance;
    }

    private void loadData() {
        add(new Pizza("BARBECUED CHICKEN PIZZA", 3, R.drawable.pizza1, "35 min",
                "- 2 boneless skinless chicken breast halves (6 ounces each)\n- 1/4 teaspoon pepper\n- 1 cup barbecue sauce, divided\n- 1 tube (13.8 ounces) refrigerated pizza crust\n- 2 teaspoons olive oil\n- 2 cups shredded Gouda cheese\n- 1 small red onion, halved and thinly sliced\n- 1/4 cup minced fresh cilantro",
                "So fast and so easy with refrigerated pizza crust, these saucy, smoky pizzas make quick fans with their hot-off-the-grill, rustic flavor. —Alicia Trevithick, Temecula, California",
                "STEP 1:\n\n  Sprinkle chicken with pepper; place on an oiled grill rack over medium heat. Grill until thermometer reads 165°, basting with 1/2 cup barbecue sauce. Cool slightly, cut into cubes.\n\nSTEP 2:\n\n  Press each dough portion into a 10x8-in. rectangle on foil; brush with oil. Invert onto grill rack. Grill until lightly browned, 1-2 minutes.\n\nSTEP 3:\n\n  Spread grilled sides with remaining barbecue sauce. Top with cheese, chicken and onion. Grill until cheese is melted, 2-3 minutes. Sprinkle with cilantro."));

        add(new Pizza("BRUSCHETTA PIZZA", 5,  R.drawable.pizza2, "35 min",
                "- 1/2 pound reduced-fat bulk pork sausage\n- 1 prebaked 12-inch pizza crust\n- 1 package (6 ounces) sliced turkey pepperoni\n- 2 cups shredded part-skim mozzarella cheese\n- 1-1/2 cups chopped plum tomatoes\n- 1/2 cup fresh basil leaves, thinly sliced\n- 1 tablespoon olive oil\n- 2 garlic cloves, minced",
                "Loaded with Italian flavor and plenty of fresh tomatoes, it's bound to become a family favorite. —Debra Kell, Owasso, Oklahoma",
                "STEP 1:\n\n  Cook sausage until no longer pink; drain. Place crust on baking sheet. Top with pepperoni, sausage and cheese. Bake at 450° for 10-12 minutes.\n\nSTEP 2:\n\n  Combine tomatoes, basil, oil, garlic, thyme, vinegar, salt and pepper. Spoon over pizza."));

        add(new Pizza("SPINACH PIZZA", 2,  R.drawable.pizza3, "25 min",
                "- 1 package (6-1/2 ounces) pizza crust mix\n- 1/2 cup Alfredo sauce\n- 2 medium tomatoes\n- 4 cups chopped fresh spinach\n- 2 cups shredded Italian cheese blend",
                "This tasty pizza is so easy to prepare. My family loves it! —Dawn Bartholomew, Raleigh, North Carolina",
                "STEP 1:\n\n  Prepare pizza dough; press onto greased 12-in. pan.\n\nSTEP 2:\n\n  Spread Alfredo sauce. Top with spinach, tomatoes and cheese.\n\nSTEP 3:\n\n  Bake at 450° for 10-15 minutes until cheese is melted and crust is golden."));

        add(new Pizza("DEEP-DISH SAUSAGE PIZZA", 8, R.drawable.pizza4, "45 min",
                "- 1 package active dry yeast\n- 2/3 cup warm water\n- 1-3/4 cups all-purpose flour\n- 1/4 cup vegetable oil\n- 1 teaspoon each dried oregano, basil and marjoram\n- 1/2 teaspoon garlic salt\n- 1/2 teaspoon onion salt",
                "My Grandma made the tastiest pizza on her farm. Now this is a frequent meal for my family. —Michele Madden, Washington Court House, Ohio",
                "STEP 1:\n\n  Dissolve yeast in water. Add flour, oil and seasonings; beat until smooth. Knead 6-8 minutes. Let rise 1 hour. Roll into 15-in. circle; transfer to greased skillet. Sprinkle with 1 cup mozzarella.\n\nSTEP 2:\n\n  Sauté onion and peppers. Layer over crust with Parmesan, sausage and tomatoes. Add mozzarella. Fold crust edge. Bake at 400° for 20 minutes. Add pepperoni and more mozzarella. Bake 10-15 minutes more."));

        add(new Pizza("HOMEMADE PIZZA", 4,  R.drawable.pizza5, "50 min",
                "- 1 package active dry yeast\n- 1 teaspoon sugar\n- 1-1/4 cups warm water\n- 1/4 cup canola oil\n- 1 teaspoon salt\n- 3-1/2 cups all-purpose flour\n- 1/2 pound ground beef\n- 1 small onion, chopped\n- 1 can (15 ounces) tomato sauce\n- 1 medium green pepper, diced\n- 2 cups shredded mozzarella cheese",
                "A hearty, zesty main dish with a crisp, golden crust. —Marianne Edwards, Lake Stevens, Washington",
                "STEP 1:\n\n  Dissolve yeast and sugar in water. Add oil and salt. Stir in flour. Knead 2-3 minutes. Let rise 45 minutes.\n\nSTEP 2:\n\n  Cook beef and onion; drain.\n\nSTEP 3:\n\n  Press dough into two 12-in. pans. Spread tomato sauce with oregano and basil. Top with beef, green pepper and cheese.\n\nSTEP 4:\n\n  Bake at 400° for 25-30 minutes."));

        add(new Pizza("PESTO CHICKEN PIZZA", 3, R.drawable.pizza6, "50 min",
                "- 2 teaspoons active dry yeast\n- 1 cup warm water\n- 2-3/4 cups bread flour\n- 1 tablespoon olive oil\n- 1 tablespoon sugar\n- 1/2 pound boneless skinless chicken breasts\n- 1 small onion, sliced\n- 1/2 each green, red and yellow peppers\n- 3 tablespoons prepared pesto\n- 1-1/2 cups shredded mozzarella cheese",
                "This is the only pizza I make now. We love it! —Heather Thompson, Woodland Hills, California",
                "STEP 1:\n\n  Dissolve yeast in warm water. Beat in 1 cup flour, oil, sugar and salt. Add remaining flour.\n\nSTEP 2:\n\n  Knead 6-8 minutes. Let rise 1 hour.\n\nSTEP 3:\n\n  Cook chicken, onion, peppers and mushrooms in oil until done.\n\nSTEP 4:\n\n  Roll dough into 15-in. circle. Spread with pesto. Top with chicken mixture and cheese.\n\nSTEP 5:\n\n  Bake at 400° for 18-20 minutes."));

        add(new Pizza("LOADED MEXICAN PIZZA", 3,  R.drawable.pizza7, "30 min",
                "- 1 can black beans, rinsed\n- 1 medium red onion, chopped\n- 1 small sweet yellow pepper\n- 3 teaspoons chili powder\n- 3 medium tomatoes, chopped\n- 1 jalapeno pepper\n- 1 prebaked 12-inch thin pizza crust\n- 2 cups chopped fresh spinach\n- 1/2 cup shredded cheddar cheese\n- 1/2 cup shredded pepper jack cheese",
                "My husband is a picky eater, but this healthy pizza has lots of flavor! —Mary Barker, Knoxville, Tennessee",
                "STEP 1:\n\n  Mash black beans with onion, yellow pepper, chili powder and cumin. Mix tomatoes, jalapeño and garlic separately.\n\nSTEP 2:\n\n  Spread bean mixture on crust. Top with tomato mixture and spinach. Sprinkle with cilantro, hot sauce and cheeses.\n\nSTEP 3:\n\n  Bake at 400° for 12-15 minutes."));

        add(new Pizza("BACON CHEESEBURGER PIZZA", 2, R.drawable.pizza8, "20 min",
                "- 1/2 pound ground beef\n- 1 small onion, chopped\n- 1 prebaked Italian bread shell crust\n- 1 can pizza sauce\n- 6 bacon strips, cooked and crumbled\n- 20 dill pickle slices\n- 2 cups shredded mozzarella cheese\n- 2 cups shredded cheddar cheese",
                "Kids of all ages love this pizza-cheeseburger mashup! —Cherie Ackerman, Lakeland, Minnesota",
                "STEP 1:\n\n  Cook beef and onion until no longer pink; drain.\n\nSTEP 2:\n\n  Place crust on pizza pan. Spread with pizza sauce. Top with beef, bacon, pickles and cheeses. Sprinkle with seasoning.\n\nSTEP 3:\n\n  Bake at 450° for 8-10 minutes."));

        add(new Pizza("PIZZA MARGHERITA", 1,  R.drawable.pizza9, "30 min",
                "- 3 teaspoons active dry yeast\n- 1 cup warm water\n- 2 tablespoons olive oil\n- 1 teaspoon sugar\n- 1 teaspoon salt\n- 3 cups bread flour",
                "A classic Pizza Margherita with red tomatoes, white mozzarella and fresh green basil. —Loretta Lawrence, Myrtle Beach, South Carolina",
                "STEP 1:\n\n  Dissolve yeast in warm water. Add oil, sugar, salt and 1 cup flour. Beat until smooth. Stir in remaining flour.\n\nSTEP 2:\n\n  Knead 6-8 minutes. Let rise 1 hour.\n\nSTEP 3:\n\n  Divide in half. Roll each into 13-in. circle on pizza pan. Rest 10 minutes.\n\nSTEP 4:\n\n  Spoon tomatoes over crusts. Add basil, cheese, oregano, salt and pepper. Drizzle with oil. Bake at 450° for 15-20 minutes."));

        add(new Pizza("PEPPERONI-SAUSAGE STUFFED PIZZA", 5,  R.drawable.pizza10, "45 min",
                "- 1 package active dry yeast\n- 1-1/4 cups warm water\n- 2 tablespoons olive oil\n- 1-1/2 teaspoons salt\n- 1 teaspoon sugar\n- 3-1/2 to 4 cups all-purpose flour",
                "For 30 years, friends have been telling me to open a pizzeria using this recipe! —Elizabeth Wolff, Carmel, Indiana",
                "STEP 1:\n\n  Dissolve yeast in warm water. Combine oil, salt, sugar, yeast mixture and 1 cup flour. Stir in remaining flour.\n\nSTEP 2:\n\n  Knead 6-8 minutes. Let rise 1 hour.\n\nSTEP 3:\n\n  Press 2/3 of dough into greased 13x9 pan. Top with mozzarella, cheddar, sausage, mushrooms and pepperoni.\n\nSTEP 4:\n\n  Roll remaining dough over filling. Crimp edges, prick top. Add more cheese. Bake at 425° for 10 minutes.\n\nSTEP 5:\n\n  Reduce to 375°. Spread pizza sauce over cheese. Bake 30-35 minutes more."));
    }

    @Override
    public Pizza add(Pizza item) {
        pizzaList.add(item);
        return item;
    }

    @Override
    public Pizza modify(Pizza item) {
        for (int i = 0; i < pizzaList.size(); i++) {
            if (pizzaList.get(i).getId() == item.getId()) {
                pizzaList.set(i, item);
                return item;
            }
        }
        return null;
    }

    @Override
    public boolean remove(long id) {
        return pizzaList.removeIf(p -> p.getId() == id);
    }

    @Override
    public Pizza getById(long id) {
        for (Pizza p : pizzaList)
            if (p.getId() == id) return p;
        return null;
    }

    @Override
    public List<Pizza> getAll() {
        return Collections.unmodifiableList(pizzaList);
    }
}