package com.example.usuario.milistview;


import android.content.Context;
import android.graphics.Color;
import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Adapter;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import com.example.usuario.milistview.Adapter.AnimalsAdapter;
import com.example.usuario.milistview.ClassesPOJO.Item;

import java.util.ArrayList;
import java.util.List;


public class MainActivity extends AppCompatActivity {

    Toolbar toolbar;
    ListView listView;
    AnimalsAdapter adapterAnimals;
    List<Item> items;
    MediaPlayer player;
    Context context=this;
    String animal;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        toolbar=findViewById(R.id.toolbar);

        toolbar.setTitle("Animales");
        toolbar.setTitleTextColor(Color.parseColor("#ffffff"));

        setSupportActionBar(toolbar);
        listView=findViewById(R.id.Mylistview);

        items= new ArrayList<>();
        items.add(new Item(R.drawable.dog,"Perro","Dog"));
        items.add(new Item(R.drawable.cat,"Gato","Cat"));
        items.add(new Item(R.drawable.mouse,"Ratonsito","Mouse"));
        items.add(new Item(R.drawable.tiger,"Tigre","Tiger"));
        items.add(new Item(R.drawable.lion,"Leon","Lion"));
        items.add(new Item(R.drawable.pig,"Cochinito","Pig"));
        items.add(new Item(R.drawable.bear,"Oso","Bear"));
        items.add(new Item(R.drawable.cocodrile,"Cocodrilo","Cocodrile"));
        items.add(new Item(R.drawable.horse,"Caballo","Horse"));
        items.add(new Item(R.drawable.monkey,"Changuito","Monkey"));


        adapterAnimals= new AnimalsAdapter(this,R.layout.listview_design,items);
        listView.setAdapter(adapterAnimals);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long l) {
                animal=items.get(position).getTextoIngles();
                switch (animal)
                {
                        case "Dog":
                          setSound(R.raw.dog);

                        break;

                    case "Mouse":
                        setSound(R.raw.mouse);

                        break;
                    case "Cat":
                        setSound(R.raw.cat);
                        break;

                    case "Tiger":
                        setSound(R.raw.tiger);

                        break;

                    case "Lion":
                        setSound(R.raw.lion);

                        break;

                    case "Bear":
                        setSound(R.raw.bear);

                        break;
                    case "Pig":
                        setSound(R.raw.pig);

                        break;
                    case "Cocodrile":
                        setSound(R.raw.cocodrile);

                        break;

                    case "Horse":
                        setSound(R.raw.horse);
                        break;

                    case "Monkey":
                        setSound(R.raw.monkey);

                        break;

                        default:
                            Toast.makeText(getApplicationContext(),"sounnd no found",Toast.LENGTH_SHORT).show();

                            break;
                }

            }
        });

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {

        getMenuInflater().inflate(R.menu.menu,menu);

        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        switch (item.getItemId())
        {
            case R.id.opcion1:
                Toast.makeText(this,"opcion1",Toast.LENGTH_SHORT).
                        show();
                break;

            case R.id.opcion2:
                Toast.makeText(this,"opcion2",Toast.LENGTH_SHORT).
                        show();
                break;

            case R.id.opcion3:
                Toast.makeText(this,"opcion3",Toast.LENGTH_SHORT).
                        show();
                break;

            case R.id.search:
                Toast.makeText(this,"buscar",Toast.LENGTH_SHORT).
                        show();

                break;

                case R.id.favoritos:
                    Toast.makeText(this,"favorito",Toast.LENGTH_SHORT).
                            show();
                break;
        }
        return super.onOptionsItemSelected(item);
    }

    public void setSound(int resource)
    {
         player=MediaPlayer.create(context, resource);
         player.start();
    }
}
