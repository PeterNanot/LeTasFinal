package peternanot.letas;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.ImageView;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class MainActivity extends AppCompatActivity {

    int i = 1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        ImageView backCard = (ImageView) findViewById(R.id.back_card);
        backCard.setImageResource(R.drawable.dos_de_carte);

        final ImageView imageContainer = (ImageView) findViewById(R.id.imageView);
        final ArrayList<Integer> list = new ArrayList<>();

        list.add(R.drawable.eight_of_clubs);
        list.add(R.drawable.eight_of_diamonds);
        list.add(R.drawable.eight_of_hearts);
        list.add(R.drawable.eight_of_spades);
        list.add(R.drawable.five_of_clubs);
        list.add(R.drawable.five_of_diamonds);
        list.add(R.drawable.five_of_hearts);
        list.add(R.drawable.five_of_spades);
        list.add(R.drawable.four_of_clubs);
        list.add(R.drawable.four_of_diamonds);
        list.add(R.drawable.four_of_hearts);
        list.add(R.drawable.four_of_spades);
        list.add(R.drawable.jack_of_clubs_fr);
        list.add(R.drawable.jack_of_diamonds_fr);
        list.add(R.drawable.jack_of_hearts_fr);
        list.add(R.drawable.jack_of_spades_fr);
        list.add(R.drawable.king_of_clubs_fr);
        list.add(R.drawable.king_of_diamonds_fr);
        list.add(R.drawable.king_of_hearts_fr);
        list.add(R.drawable.king_of_spades_fr);
        list.add(R.drawable.queen_of_clubs_fr);
        list.add(R.drawable.queen_of_diamonds_fr);
        list.add(R.drawable.queen_of_hearts_fr);
        list.add(R.drawable.queen_of_spades_fr);
        list.add(R.drawable.nine_of_clubs);
        list.add(R.drawable.nine_of_diamonds);
        list.add(R.drawable.nine_of_hearts);
        list.add(R.drawable.nine_of_spades);
        list.add(R.drawable.ten_of_clubs);
        list.add(R.drawable.ten_of_diamonds);
        list.add(R.drawable.ten_of_hearts);
        list.add(R.drawable.ten_of_spades);
        list.add(R.drawable.oneofclubsa);
        list.add(R.drawable.oneofdiamondsa);
        list.add(R.drawable.oneofheartsa);
        list.add(R.drawable.oneofspadesa);
        list.add(R.drawable.three_of_clubs);
        list.add(R.drawable.three_of_diamonds);
        list.add(R.drawable.three_of_hearts);
        list.add(R.drawable.three_of_spades);
        list.add(R.drawable.seven_of_clubs);
        list.add(R.drawable.seven_of_diamonds);
        list.add(R.drawable.seven_of_hearts);
        list.add(R.drawable.seven_of_spades);
        list.add(R.drawable.six_of_clubs);
        list.add(R.drawable.six_of_diamonds);
        list.add(R.drawable.six_of_hearts);
        list.add(R.drawable.six_of_spades);
        list.add(R.drawable.two_of_diamonds);
        list.add(R.drawable.two_of_hearts);
        list.add(R.drawable.two_of_spades);
        list.add(R.drawable.twoofclubs);

        Collections.shuffle(list);
        imageContainer.setImageResource(list.get(0));

        imageContainer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (i == list.size() + 1) {
                    i = 0;
                }
                imageContainer.setImageResource(list.get(i));
            }
        });





    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
