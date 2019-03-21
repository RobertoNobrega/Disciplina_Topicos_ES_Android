package br.javamagazine.BD;

public class ScriptDLL {

    public static String getCreateTable() {

        StringBuilder sql = new StringBuilder();

        sql.append("CREATE TABLE Cadastro (");
        sql.append("   id     INTEGER      PRIMARY KEY AUTOINCREMENT,");
        sql.append("   nome   VARCHAR (50),");
        sql.append("   placa  VARCHAR (50),");
        sql.append("   ano    INTEGER,");
        sql.append("   imagem BLOB );");

        return sql.toString();

    }
}