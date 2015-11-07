package com.amanda.Logica;

/**
 *
 * @author Nathy Cumbicos
 */
import com.amanda.Datos.Datos;
import com.amanda.Datos.LimiteGastos;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


public class TablaLimiteGasto extends Tabla{

    public TablaLimiteGasto() {
        super();
    }

    @Override
    public DefaultTableModel mostrar(){   
        cadSQL = "SELECT * FROM LIMITEGASTO";
        String encabezado[] = {"IdLímite","Año","Alimentación","Educación","Salud","Vestido","Vivienda"};
        String registro[] =new String[7];
        DefaultTableModel ret = new DefaultTableModel(null,encabezado);
        
        try {
            ResultSet rs;
            Statement s = con.createStatement();
            rs=s.executeQuery(cadSQL);

            while(rs.next()){
                registro[0]=rs.getString("IdLimite");
                registro[1]=rs.getString("Anio");
                registro[2]=rs.getString("Alimentacion");
                registro[3]=rs.getString("Educacion");
                registro[4]=rs.getString("Salud");
                registro[5]=rs.getString("Vestido");
                registro[6]=rs.getString("Vivienda");
                totalregistros++;
                ret.addRow(registro);
            }
        } catch (Exception e) { 
            System.out.println(e);
            ret = null; 
        }
        return ret;
    }

    @Override
    public boolean insertar(Datos dts){
        boolean ret = true;
        LimiteGastos du = (LimiteGastos)dts;
        cadSQL = "INSERT INTO LIMITEGASTO (ANIO, ALIMENTACION, EDUCACION, SALUD, VESTIDO, VIVIENDA) VALUES (?, ?, ?, ?, ?, ?)";
        try{
            PreparedStatement ps = con.prepareStatement(cadSQL);
            ps.setInt(1, du.anio);
            ps.setDouble(2, du.alimentacion);
            ps.setDouble(3, du.educacion);
            ps.setDouble(4, du.salud);
            ps.setDouble(5, du.vestido);
            ps.setDouble(6, du.vivienda);
            if (ps.executeUpdate() == 0) ret = false;
        } catch(Exception e){
            ret = false;
        }
        return ret;
    }

    @Override
    public boolean editar(Datos dts){
        boolean ret = true;
        LimiteGastos du = (LimiteGastos)dts;
        cadSQL = "UPDATE LIMITEGASTO SET ANIO=?, ALIMENTACION = ?, EDUCACION = ?, SALUD = ?, VESTIDO = ?, VIVIENDA = ? WHERE IDLIMITE = ?";
        try{
            PreparedStatement ps = con.prepareStatement(cadSQL);
            ps.setInt(0, du.idLimite);
            ps.setInt(1, du.anio);
            ps.setDouble(2, du.alimentacion);
            ps.setDouble(3, du.educacion);
            ps.setDouble(4, du.salud);
            ps.setDouble(5, du.vestido);
            ps.setDouble(6, du.vivienda);
            if (ps.executeUpdate() == 0) ret = false;
        } catch(Exception e){
            ret = false;
        }
        return ret;
    }

    @Override
    public boolean eliminar(Datos dts){
        boolean ret = true;
        PreparedStatement stmt=null;
        LimiteGastos du = (LimiteGastos)dts;
        try{
            stmt = con.prepareStatement("SELECT IDLIMITE FROM FACTURA WHERE IDLIMITE=?");
            stmt.setInt(0, du.idLimite);
            ResultSet rs = stmt.executeQuery();
            if(!rs.next()){
                cadSQL = "DELETE FROM LIMITEGASTO WHERE ANIO = ?";
                PreparedStatement ps = con.prepareStatement(cadSQL);
                ps.setInt(1, du.anio);
                if (ps.executeUpdate() == 0) ret = false;
            }
            else{
                JOptionPane.showMessageDialog(null, "El año activo se encuentra asociado a facturas ingresadas");
            }
        } catch(Exception e){
            ret = false;
        }
        return ret;
    }
    
    public boolean obtenerDatosLogin(Datos dts){
        boolean ret = true;
        LimiteGastos du = (LimiteGastos)dts;
        cadSQL = "SELECT * FROM LIMITEGASTO WHERE ANIO = ?";
        try{
            PreparedStatement ps = con.prepareStatement(cadSQL);
            ps.setInt(1, du.anio);
            if (ps.executeUpdate() == 0) ret = false;
        } catch(Exception e){
            ret = false;
        }
        return ret;
    }

}