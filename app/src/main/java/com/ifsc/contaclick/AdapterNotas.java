package com.ifsc.contaclick;

import android.content.Context;
import android.widget.ArrayAdapter;
import android.view.View;
import android.view.ViewGroup;
import android.content.Context;
import android.view.LayoutInflater;
import android.widget.TextView;


import androidx.annotation.NonNull;

public class AdapterNotas  extends ArrayAdapter<Nota> {

    int mresource;
    public AdapterNotas(@NonNull Context context, int resource) {
        super(context, resource);
    }

    @NonNull
    @Override
    public View getView(int position, @NonNull View convertView, @NonNull ViewGroup parent){
        LayoutInflater layoutInflater = LayoutInflater.from(getContext());
        convertView= layoutInflater.inflate(mresource, parent, false);

        TextView tvNome = convertView.findViewById(R.id.lblNome);
        Nota p = getItem(position);
        tvNome.setText(this.getItem(position).nome);

        TextView tvNota = convertView.findViewById(R.id.lblNota);
        tvNome.setText(this.getItem(position).nome);


        return convertView;
    }
}
