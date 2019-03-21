package br.javamagazine.BD;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;

import java.util.ArrayList;
import java.util.List;

import br.javamagazine.cadastro.Carro;

public class BD {

    private SQLiteDatabase bd;

    public BD(Context context){
        BDCore auxBd = new BDCore(context);
        bd = auxBd.getWritableDatabase();
    }

    public void inserir(Carro carro){

        ContentValues valores = new ContentValues();

        valores.put("nome", carro.getNome());
        valores.put("placa", carro.getPlaca());
        valores.put("ano", carro.getAno());
        valores.put("imagem", carro.getImagem());

        bd.insert("Cadastro", null, valores);
    }

    public void atualizar(Carro carro){

        ContentValues valores = new ContentValues();

        valores.put("nome", carro.getNome());
        valores.put("placa", carro.getPlaca());
        valores.put("ano", carro.getAno());
        valores.put("imagem", carro.getImagem());

        bd.update("Cadastro", valores, "_id = ?", new String[]{""+carro.getId()});
    }

    public void deletar(Carro carro){
        bd.delete("Cadastro", "_id = " + carro.getId(),null);
    }

    public List<Carro> buscar(){
        List<Carro> list = new ArrayList<Carro>();
        String [] colunas = new String[]{"_id","nome","placa","ano","imagem"};
        Cursor cursor = bd.query("Cadastro", colunas, null, null,null,null, "nome ASC");

        if(cursor.getCount() > 0){
            cursor.moveToFirst();
            do{
                Carro c = new Carro();
                c.setId(cursor.getLong(0));
                c.setNome(cursor.getString(1));
                c.setPlaca(cursor.getString(2));
                c.setAno(cursor.getInt(3));
                c.setImagem(cursor.getBlob(4));

                list.add(c);
            }while (cursor.moveToNext());
        }

        return (list);
    }
}
