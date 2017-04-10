package whatsapp.cursoandroid.com.whatsapp.adapter;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

import whatsapp.cursoandroid.com.whatsapp.R;
import whatsapp.cursoandroid.com.whatsapp.model.Contato;

/**
 * Created by Leonardo on 31/03/2017.
 */

public class ContatoAdapter extends ArrayAdapter<Contato>{

    private ArrayList<Contato> contatos;
    private Context context;
    public ContatoAdapter(Context c, ArrayList<Contato> objects) {
        super(c, 0, objects);

        this.contatos = objects;
        this.context = c;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        View view = null;

        //Verificar lista de contatos
        if(contatos != null){
            //inicializar  objeto para montagem  da viwn
            LayoutInflater inflater = (LayoutInflater) context.getSystemService(context.LAYOUT_INFLATER_SERVICE);
            //montar view apartir do xml
            view = inflater.inflate(R.layout.lista_contato, parent, false);
            //Recuperar elemento de exibição
            TextView nomecontato = (TextView) view.findViewById(R.id.tv_nome);
            TextView emailcontato = (TextView) view.findViewById(R.id.tv_email);

            Contato contato = contatos.get(position);
            nomecontato.setText(contato.getNome());
            emailcontato.setText(contato.getEmail());

        }

        return view;
    }
}
