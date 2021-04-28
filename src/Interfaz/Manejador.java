package Interfaz;

import java.io.File;
import java.io.FileInputStream;
import java.sql.*;
import javax.swing.JOptionPane;

public class Manejador {

    Connection con = null;
    private PreparedStatement sentencia;
    private ResultSet resultado;

    public Manejador() throws Exception {

        Class.forName("org.apache.derby.jdbc.ClientDriver");
        con = DriverManager.getConnection("jdbc:derby:.\\Registro");

    }

    public boolean RegistrarVaca(String IdVacaArete, String Sexo, String Raza, String FechaNac, String carac, String color, float pesoNac, float pesoDest, String FechaBaja,
            String causa, String obsv, String imagen1, String imagen2) throws SQLException {

        File archivofoto1 = new File(imagen1);
        File archivofoto2 = new File(imagen2);
        try {
            FileInputStream convertir_imagen = new FileInputStream(archivofoto1);
            FileInputStream convertir_imagen2 = new FileInputStream(archivofoto2);

            String qry = "INSERT INTO Vaca(IDVACAARETE,SEXO, RAZA, FECHANAC, CARACTERISTICAS, COLOR, PESO_NACER, PESO_DEST, FECHA_BAJA, CAUSA_BAJA, OBSERVACIONES, FOTOU, FOTOD) VALUES(?,?,?,?,?,?,?,?,?,?,?,?,?)";

            sentencia = (PreparedStatement) con.prepareStatement(qry);
            sentencia.setString(1, IdVacaArete);
            sentencia.setString(2, Sexo);
            sentencia.setString(3, Raza);
            sentencia.setString(4, FechaNac);
            sentencia.setString(5, carac);
            sentencia.setString(6, color);
            sentencia.setFloat(7, pesoNac);
            sentencia.setFloat(8, pesoDest);
            sentencia.setString(9, FechaBaja);
            sentencia.setString(10, causa);
            sentencia.setString(11, obsv);
            sentencia.setBlob(12, convertir_imagen, archivofoto1.length());
            sentencia.setBlob(13, convertir_imagen2, archivofoto2.length());

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }

        if (sentencia.executeUpdate() > 0) {
            return true;
        } else {
            return false;
        }
    }

    public String valida(String idAreteVaca) throws Exception {
        String id = "SELECT IDVACAARETE FROM Vaca WHERE IDVACAARETE = '" + idAreteVaca + "'";

        sentencia = (PreparedStatement) con.prepareStatement(id);
        resultado = sentencia.executeQuery();
        if (resultado.next()) {
            return resultado.getString("IDVACAARETE");
        } else {
            return " ";
        }
    }

    public String validaMadre(String idAreteVaca) throws Exception {
        String id = "SELECT IDVACAARETE FROM Vaca WHERE IDVACAARETE = '" + idAreteVaca + "' AND SEXO = 'Hembra'";

        sentencia = (PreparedStatement) con.prepareStatement(id);
        resultado = sentencia.executeQuery();
        if (resultado.next()) {
            return resultado.getString("IDVACAARETE");
        } else {
            return " ";
        }
    }

    public String validaGenealidad(String arete) throws SQLException {
        String id = "SELECT FKVACAARETE FROM MADRE WHERE FKVACAARETE = '" + arete + "'";

        sentencia = (PreparedStatement) con.prepareStatement(id);
        resultado = sentencia.executeQuery();
        if (resultado.next()) {
            return resultado.getString("FKVACAARETE");
        } else {
            return " ";
        }
    }

    public String validaCria(String arete) throws Exception {
        String id = "SELECT ARETE FROM BECERRO WHERE ARETE = '" + arete + "'";

        sentencia = (PreparedStatement) con.prepareStatement(id);
        resultado = sentencia.executeQuery();
        if (resultado.next()) {
            return resultado.getString("ARETE");
        } else {
            return " ";
        }
    }

    public Evento2 validaEvento(String evento2) throws Exception {
        Evento2 evento = new Evento2();
        String id = "SELECT ID FROM Evento WHERE NOMBRE_EVENTO = '" + evento2 + "'";

        sentencia = (PreparedStatement) con.prepareStatement(id);
        resultado = sentencia.executeQuery();
        if (resultado.next()) {
            evento.setId(resultado.getInt("id"));
        }
        return evento;
    }

    public Vaca buscar(String arete) throws Exception {
        Vaca vaca = new Vaca();

        String qry = "SELECT * FROM Vaca WHERE IDVACAARETE = '" + arete + "'";

        sentencia = (PreparedStatement) con.prepareStatement(qry);
        resultado = sentencia.executeQuery();
        if (resultado.next()) {
            vaca.setIdVacaArete(resultado.getString("IdVacaArete"));
            vaca.setSexo(resultado.getString("Sexo"));
            vaca.setRaza(resultado.getString("Raza"));
            vaca.setCaracteristicas(resultado.getString("Caracteristicas"));
            vaca.setFechaNac(resultado.getString("FechaNac"));
            vaca.setColor(resultado.getString("Color"));
            vaca.setPeso_Nacer(resultado.getFloat("Peso_Nacer"));
            vaca.setPeso_Dest(resultado.getFloat("Peso_Dest"));
            vaca.setFecha_Baja(resultado.getString("Fecha_Baja"));
            vaca.setCausa_Baja(resultado.getString("Causa_Baja"));
            vaca.setObservaciones(resultado.getString("Observaciones"));
        }
        return vaca;
    }

    public CriaSG buscarCria(String arete) throws SQLException {
        CriaSG cria = new CriaSG();

        String qry = "SELECT * FROM Becerro WHERE Arete = '" + arete + "'";

        sentencia = (PreparedStatement) con.prepareStatement(qry);
        resultado = sentencia.executeQuery();
        if (resultado.next()) {
            cria.setArete(resultado.getString("arete"));
            cria.setFkidvacaarete(resultado.getString("fkidvacaarete"));
            cria.setFecha_parto(resultado.getString("fecha_parto"));
            cria.setSexo(resultado.getString("sexo"));
            cria.setPeso_nacimiento(resultado.getFloat("peso_nacimiento"));

            cria.setObservaciones(resultado.getString("observaciones"));
            cria.setColor(resultado.getString("color"));
            cria.setEvaluacion(resultado.getInt("evaluacion"));
        }
        return cria;
    }

    public boolean RegistrarEvento(int id, String arete, String fechaEvt, String semental, String sementalArete, String diagnostico, int edad_gestion, String Fecha_parto, String trata, String obs, String enfermedad)
            throws SQLException {
        String qry = "INSERT INTO VACAEVENTO(FKIDVACAARETE, FKID, FECHA_EVENTO, SEMENTAL, DIAGNOSTICO, EDAD_GESTION, FECHA_PARTO, TRATAMIENTO, OBSERVACIONES,SEMENTAL_ARETE, ENFERMEDAD) "
                + "VALUES(?,?,?,?,?,?,?,?,?,?,?)";

        sentencia = (PreparedStatement) con.prepareStatement(qry);

        sentencia.setString(1, arete);
        sentencia.setInt(2, id);
        sentencia.setString(3, fechaEvt);
        sentencia.setString(4, semental);
        sentencia.setString(5, diagnostico);
        sentencia.setInt(6, edad_gestion);
        sentencia.setString(7, Fecha_parto);
        sentencia.setString(8, trata);
        sentencia.setString(9, obs);
        sentencia.setString(10, sementalArete);
        sentencia.setString(11, enfermedad);

        if (sentencia.executeUpdate() > 0) {
            return true;
        } else {
            return false;
        }
    }

    public boolean RegistrarIA(String arete, String nombre, String color, String raza) throws SQLException {
        String qry = "INSERT INTO IA(FKIDVACAARETE,NOMBRE,COLOR,RAZA) VALUES (?,?,?,?)";

        sentencia = (PreparedStatement) con.prepareStatement(qry);

        sentencia.setString(1, arete);
        sentencia.setString(2, nombre);
        sentencia.setString(3, color);
        sentencia.setString(4, raza);

        if (sentencia.executeUpdate() > 0) {
            return true;
        } else {
            return false;
        }
    }

    public boolean RegistrarCria(String ar_cria, String arete_madre, String FechaParto, String sexo, float peso_nac, String observaciones, String imagen1, String imagen2, String color, int evaluacion) throws SQLException {

        File archivofoto1 = new File(imagen1);
        File archivofoto2 = new File(imagen2);
        try {
            FileInputStream convertir_imagen = new FileInputStream(archivofoto1);
            FileInputStream convertir_imagen2 = new FileInputStream(archivofoto2);
            String qry = "INSERT INTO BECERRO(ARETE, FKIDVACAARETE, FECHA_PARTO, SEXO, PESO_NACIMIENTO, OBSERVACIONES, FOTOBU, FOTOBD, COLOR, EVALUACION) VALUES(?,?,?,?,?,?,?,?,?,?)";
            sentencia = (PreparedStatement) con.prepareStatement(qry);

            sentencia.setString(1, ar_cria);
            sentencia.setString(2, arete_madre);
            sentencia.setString(3, FechaParto);
            sentencia.setString(4, sexo);
            sentencia.setFloat(5, peso_nac);
            sentencia.setString(6, observaciones);
            sentencia.setBlob(7, convertir_imagen, archivofoto1.length());
            sentencia.setBlob(8, convertir_imagen2, archivofoto2.length());
            sentencia.setString(9, color);
            sentencia.setInt(10, evaluacion);

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }

        if (sentencia.executeUpdate() > 0) {
            return true;
        } else {
            return false;
        }
    }

    boolean Vacunacion(String arete, String fecha, String Tratamiento) throws SQLException {
        String qry = "INSERT INTO VACUNACION(FKARETE,FECHA_VACUNA,TRATAMIENTO) VALUES(?,?,?)";

        sentencia = (PreparedStatement) con.prepareStatement(qry);

        sentencia.setString(1, arete);
        sentencia.setString(2, fecha);
        sentencia.setString(3, Tratamiento);
        if (sentencia.executeUpdate() > 0) {
            return true;
        } else {
            return false;
        }
    }

    boolean Descorne(String arete, String fecha, String tipo, String Tratamiento) throws SQLException {
        String qry = "INSERT INTO DESCORNE(FKARETE,FECHA_DESCORNE,TIPO,TRATAMIENTO) VALUES(?,?,?,?)";

        sentencia = (PreparedStatement) con.prepareStatement(qry);

        sentencia.setString(1, arete);
        sentencia.setString(2, fecha);
        sentencia.setString(3, tipo);
        sentencia.setString(4, Tratamiento);

        if (sentencia.executeUpdate() > 0) {
            return true;
        } else {
            return false;
        }
    }

    boolean Desparasitacion(String arete, String fecha, String Tratamiento) throws SQLException {
        String qry = "INSERT INTO DESPARASITACION(FKARETE,FECHA_DESPARA,TRATAMIENTO) VALUES(?,?,?)";

        sentencia = (PreparedStatement) con.prepareStatement(qry);

        sentencia.setString(1, arete);
        sentencia.setString(2, fecha);
        sentencia.setString(3, Tratamiento);
        if (sentencia.executeUpdate() > 0) {
            return true;
        } else {
            return false;
        }
    }

    boolean Vitaminizacion(String arete, String fecha, String Tratamiento) throws SQLException {
        String qry = "INSERT INTO VITAMINIZACION(FKARETE,FECHA_VITAMIN,TRATAMIENTO) VALUES(?,?,?)";

        sentencia = (PreparedStatement) con.prepareStatement(qry);

        sentencia.setString(1, arete);
        sentencia.setString(2, fecha);
        sentencia.setString(3, Tratamiento);
        if (sentencia.executeUpdate() > 0) {
            return true;
        } else {
            return false;
        }
    }

    boolean Destete(String arete, String fecha, float peso, String tipo) throws SQLException {
        String qry = "INSERT INTO DESTETE(FKARETE,FECHA_DESTETE,PESO_DESTETE,TIPO_DESTETE) VALUES(?,?,?,?)";

        sentencia = (PreparedStatement) con.prepareStatement(qry);

        sentencia.setString(1, arete);
        sentencia.setString(2, fecha);
        sentencia.setFloat(3, peso);
        sentencia.setString(4, tipo);

        if (sentencia.executeUpdate() > 0) {
            return true;
        } else {
            return false;
        }
    }

    boolean RegistrarPadre(String arete, String RazaPadre, String NombrePadre, String AretePadre) throws SQLException {
        String qry = "INSERT INTO PADRE(ARETEPADRE,NOMBRE_PADRE,RAZA_PADRE,FKVACAARETE) VALUES(?,?,?,?)";

        sentencia = (PreparedStatement) con.prepareStatement(qry);

        sentencia.setString(1, AretePadre);
        sentencia.setString(2, NombrePadre);
        sentencia.setString(3, RazaPadre);
        sentencia.setString(4, arete);

        if (sentencia.executeUpdate() > 0) {
            return true;
        } else {
            return false;
        }
    }

    boolean RegistrarMadre(String arete, String RazaMadre, String NombreMadre, String AreteMadre) throws SQLException {
        String qry = "INSERT INTO MADRE(ARETEMADRE,NOMBRE_MADRE,RAZA_MADRE,FKVACAARETE) VALUES(?,?,?,?)";

        sentencia = (PreparedStatement) con.prepareStatement(qry);

        sentencia.setString(1, AreteMadre);
        sentencia.setString(2, NombreMadre);
        sentencia.setString(3, RazaMadre);
        sentencia.setString(4, arete);
        if (sentencia.executeUpdate() > 0) {
            return true;
        } else {
            return false;
        }

    }

    boolean RegistrarPadreP(String RazaPadreP, String NombrePadreP, String AretePadreP, String arete) throws SQLException {
        String qry = "INSERT INTO PADREP(ARETEPADREP,NOMBRE_PADRE,RAZA_PADRE,FKVACAARETE) VALUES(?,?,?,?)";

        sentencia = (PreparedStatement) con.prepareStatement(qry);

        sentencia.setString(1, AretePadreP);
        sentencia.setString(2, NombrePadreP);
        sentencia.setString(3, RazaPadreP);
        sentencia.setString(4, arete);
        if (sentencia.executeUpdate() > 0) {
            return true;
        } else {
            return false;
        }
    }

    boolean RegistrarMadreP(String RazaMadreP, String NombreMadreP, String AreteMadreP, String arete) throws SQLException {
        String qry = "INSERT INTO MADREP(ARETEMADREP,NOMBRE_MADRE,RAZA_MADRE,FKVACAARETE) VALUES(?,?,?,?)";

        sentencia = (PreparedStatement) con.prepareStatement(qry);

        sentencia.setString(1, AreteMadreP);
        sentencia.setString(2, NombreMadreP);
        sentencia.setString(3, RazaMadreP);
        sentencia.setString(4, arete);
        if (sentencia.executeUpdate() > 0) {
            return true;
        } else {
            return false;
        }
    }

    boolean RegistrarPadreM(String RazaPadreM, String NombrePadreM, String AretePadreM, String arete, String AretePadre) throws SQLException {
        String qry = "INSERT INTO PADREM(ARETEPADREM,NOMBRE_PADRE,RAZA_PADRE,FKVACAARETE) VALUES(?,?,?,?)";

        sentencia = (PreparedStatement) con.prepareStatement(qry);

        sentencia.setString(1, AretePadreM);
        sentencia.setString(2, NombrePadreM);
        sentencia.setString(3, RazaPadreM);
        sentencia.setString(4, arete);
        if (sentencia.executeUpdate() > 0) {
            return true;
        } else {
            return false;
        }
    }

    boolean RegistrarMadreM(String RazaMadreM, String NombreMadreM, String AreteMadreM, String arete, String AretePadre) throws SQLException {
        String qry = "INSERT INTO MADREM(ARETEMADREM,NOMBRE_MADRE,RAZA_MADRE,FKVACAARETE) VALUES(?,?,?,?)";

        sentencia = (PreparedStatement) con.prepareStatement(qry);

        sentencia.setString(1, AreteMadreM);
        sentencia.setString(2, NombreMadreM);
        sentencia.setString(3, RazaMadreM);
        sentencia.setString(4, arete);
        if (sentencia.executeUpdate() > 0) {
            return true;
        } else {
            return false;
        }
    }

    public Genealogia buscarGl(String arete) throws SQLException {
        Genealogia gl = new Genealogia();
        String qry = "SELECT ARETEMADRE,RAZA_MADRE,NOMBRE_MADRE,ARETEPADRE,RAZA_PADRE,NOMBRE_PADRE FROM MADRE INNER JOIN PADRE ON MADRE.FKVACAARETE=PADRE.FKVACAARETE WHERE MADRE.FKVACAARETE='"+arete+"'";
        sentencia = (PreparedStatement) con.prepareStatement(qry);
        resultado = sentencia.executeQuery();
        if (resultado.next()) {
            gl.setAretePadre(resultado.getString("AretePadre"));
            gl.setRazaPadre(resultado.getString("Raza_Padre"));
            gl.setNombrePadre(resultado.getString("Nombre_Padre"));
            gl.setAreteMadre(resultado.getString("AreteMadre"));
            gl.setRazaMadre(resultado.getString("Raza_Madre"));
            gl.setNombreMadre(resultado.getString("Nombre_Madre"));
        }
        return gl;
    }

    public Genealogia2 buscarGl2(String arete) throws SQLException {
        Genealogia2 gl2 = new Genealogia2();
        String qry = "SELECT ARETEMADREP,NOMBRE_MADRE,RAZA_MADRE,ARETEPADREP,NOMBRE_PADRE,RAZA_PADRE FROM MADREP INNER JOIN PADREP ON MADREP.FKVACAARETE=PADREP.FKVACAARETE WHERE MADREP.FKVACAARETE='"+arete+"'";
        sentencia = (PreparedStatement) con.prepareStatement(qry);
        resultado = sentencia.executeQuery();
        if (resultado.next()) {
            gl2.setAretePadreP(resultado.getString("AretePadreP"));
            gl2.setRazaPadre(resultado.getString("Raza_Padre"));
            gl2.setNombrePadre(resultado.getString("Nombre_Padre"));
            gl2.setAreteMadreP(resultado.getString("AreteMadreP"));
            gl2.setRazaMadre(resultado.getString("Raza_Madre"));
            gl2.setNombreMadre(resultado.getString("Nombre_Madre"));
        }
        return gl2;
    }

    public Genealogia3 buscarGl3(String arete) throws SQLException {
        Genealogia3 gl3 = new Genealogia3();
        String qry = "SELECT ARETEMADREM,RAZA_MADRE,NOMBRE_MADRE,ARETEPADREM,RAZA_PADRE,NOMBRE_PADRE FROM MADREM INNER JOIN PADREM ON MADREM.FKVACAARETE=PADREM.FKVACAARETE WHERE MADREM.FKVACAARETE='"+arete+"'";
        sentencia = (PreparedStatement) con.prepareStatement(qry);
        resultado = sentencia.executeQuery();

        if (resultado.next()) {
            gl3.setAretePadreM(resultado.getString("AretePadreM"));
            gl3.setRazaPadre(resultado.getString("Raza_Padre"));
            gl3.setNombrePadre(resultado.getString("Nombre_Padre"));
            gl3.setAreteMadreM(resultado.getString("AreteMadreM"));
            gl3.setRazaMadre(resultado.getString("Raza_Madre"));
            gl3.setNombreMadre(resultado.getString("Nombre_Madre"));
        }
        return gl3;
    }

}
