/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

<<<<<<< HEAD

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import java.util.List;
=======
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;
>>>>>>> 4ee2bd019d08c4956d91e8d1f23a02adcdfc7757

/**
 *
 * @author Dell i7
 */
public class ClienteDao {
    Conexion cn = new Conexion();
    Connection con;
    PreparedStatement ps;
<<<<<<< HEAD
    ResultSet rs;
=======
>>>>>>> 4ee2bd019d08c4956d91e8d1f23a02adcdfc7757
    
    public boolean RegistrarCliente(Cliente cl) {
        String sql = "INSERT INTO clientes (dni, nombre, telefono, direccion, razon) VALUES (?,?,?,?,?)";
        try {
            con = cn.getConnection();
            ps = con.prepareStatement(sql);
            ps.setInt(1, cl.getDni());
            ps.setString(2, cl.getNombre());
            ps.setInt(3, cl.getTelefono());
            ps.setString(4, cl.getDireccion());
            ps.setString(5, cl.getRazon());
            ps.execute();
            return true;
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.toString());
            return false;
        } finally {
            try {
                con.close();
            } catch (SQLException e) {
                System.out.println(e.toString());
            }
        }
    }
<<<<<<< HEAD

    public List ListarCliente() {
        List<Cliente> ListCl = new ArrayList();
        String sql = "SELECT * FROM clientes";
        try { 
            con = cn.getConnection();
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            while(rs.next()) {
                Cliente cl = new Cliente();
                cl.setId(rs.getInt("Id"));
                cl.setDni(rs.getInt("Dni"));
                cl.setNombre(rs.getString("nombre"));
                cl.setTelefono(rs.getInt("telefono"));
                cl.setDireccion(rs.getString("direccion"));
                cl.setRazon(rs.getString("razon"));
                ListCl.add(cl);
            }
        } catch (SQLException e) {
            System.out.println(e.toString());
        }
        return ListCl;
    }
=======
>>>>>>> 4ee2bd019d08c4956d91e8d1f23a02adcdfc7757
}
