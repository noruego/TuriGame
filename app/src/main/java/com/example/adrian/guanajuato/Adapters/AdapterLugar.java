package com.example.adrian.guanajuato.Adapters;

/**
 * Created by adrian on 1/04/18.
 */
import android.content.Context;
import android.support.v7.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.example.adrian.guanajuato.Entidades.Lugar;
import com.example.adrian.guanajuato.R;
import com.squareup.picasso.Picasso;

import java.util.ArrayList;
import java.util.List;

    public class AdapterLugar extends RecyclerView.Adapter<AdapterLugar.LugarHolder> {

        Context context;
        List<Lugar> productList = new ArrayList<>();

        public AdapterLugar(Context context, List<Lugar> productList){
            this.context = context;
            this.productList = productList;
        }

        @Override
        public LugarHolder onCreateViewHolder(ViewGroup parent, int viewType) {
            View view = LayoutInflater.from(context).inflate(R.layout.item_ciudad, parent, false);
            LugarHolder lugarHolder = new LugarHolder(view);
            return lugarHolder;
        }

        @Override
        public void onBindViewHolder(LugarHolder holder, int position) {
            Lugar lugar = productList.get(position);
            holder.tvDescripcion.setText(lugar.getDescripcion());
            holder.tvUbicacion.setText(lugar.getUbicacion());
            holder.tvlugar.setText(lugar.getLugar());
            holder.tvciudad.setText(lugar.getId_ciudad());
            //Glide.with(context).load(lugar.getImage().toString()).si.into(holder.ivImage);
            Picasso.with(context).load(lugar.getImage()).centerCrop().resize(550,300).into(holder.ivImage);

        }

        @Override
        public int getItemCount() {
            return productList.size();
        }

        class LugarHolder extends RecyclerView.ViewHolder{

            TextView tvDescripcion, tvlugar,tvUbicacion,tvciudad;
            ImageView ivImage;
            public LugarHolder(View itemView) {
                super(itemView);
                tvDescripcion     = itemView.findViewById(R.id.tvDescripcion);
                tvlugar           = itemView.findViewById(R.id.tvlugar);
                tvUbicacion = itemView.findViewById(R.id.tvUbicacion);
                ivImage           = itemView.findViewById(R.id.foto);
                tvciudad          =itemView.findViewById(R.id.tvCiudad);
            }
        }

    }