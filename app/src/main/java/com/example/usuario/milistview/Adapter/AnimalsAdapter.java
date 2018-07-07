package com.example.usuario.milistview.Adapter;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.usuario.milistview.ClassesPOJO.Item;
import com.example.usuario.milistview.Holder.HolderItem;
import com.example.usuario.milistview.R;

import java.util.List;

public class AnimalsAdapter extends ArrayAdapter<Item> {

    Context context;
    int layoutResource;
    List<Item> itemList;
    public AnimalsAdapter(Context context, int layoutResource, List<Item> itemList) {
        super(context, layoutResource, itemList);
        this.context=context;
        this.layoutResource=layoutResource;
        this.itemList=itemList;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {


        View view=convertView;
        HolderItem holderItem;

        if(view==null)
        {
            LayoutInflater inflater=LayoutInflater.from(context);
            view=inflater.inflate(layoutResource,null,false);
            holderItem= new HolderItem();

            holderItem.imagen=view.findViewById(R.id.imagen);
            holderItem.textoEspañol=view.findViewById(R.id.textoEspañol);
            holderItem.textoIngles=view.findViewById(R.id.textoIngles);
            view.setTag(holderItem);
        }
        else {
         holderItem=(HolderItem)view.getTag();
        }


       // ImageView imageView=view.findViewById(R.id.imagen);
        //TextView tvEspañol=view.findViewById(R.id.textoEspañol);
        //TextView tvIngles=view.findViewById(R.id.textoIngles);

        holderItem.imagen.setImageResource(itemList.get(position).getImagen());
        holderItem.textoEspañol.setText("Español: "+itemList.get(position).getTextoEspañol());
        holderItem.textoIngles.setText("Ingles: "+ itemList.get(position).getTextoIngles());



        return view;
    }
}
