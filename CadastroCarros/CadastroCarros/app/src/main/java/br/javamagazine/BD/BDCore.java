package br.javamagazine.BD;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class BDCore extends SQLiteOpenHelper {

    private static final String NOME_BD = "Cadastro";
    private static final int VERSAO_BD = 1;

    public BDCore(Context context) {
        super(context, NOME_BD, null, VERSAO_BD);
    }

    @Override
    public void onCreate(SQLiteDatabase bd) {
        bd.execSQL(ScriptDLL.getCreateTable());
    }

    @Override
    public void onUpgrade(SQLiteDatabase bd, int oldVersion, int newVersion) {
        bd.execSQL("drop table Cadastro");
        onCreate(bd);
    }
}
