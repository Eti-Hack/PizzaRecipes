package com.example.pizzarecipes.screens;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ListView;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import com.example.pizzarecipes.R;
import com.example.pizzarecipes.display.PizzaAdapter;
import com.example.pizzarecipes.manager.PizzaManager;
import com.example.pizzarecipes.models.Pizza;
import java.util.List;

public class PizzaListScreen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_pizza);

        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        List<Pizza> pizzas = PizzaManager.getInstance().getAll();
        ListView listView = findViewById(R.id.lvPizzas);
        listView.setAdapter(new PizzaAdapter(this, pizzas));

        listView.setOnItemClickListener((parent, view, position, id) -> {
            Intent intent = new Intent(this, PizzaDetailScreen.class);
            intent.putExtra("PIZZA_ID", id);
            startActivity(intent);
        });
    }
}