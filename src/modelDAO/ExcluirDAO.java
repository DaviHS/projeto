/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelDAO;

import connection.connectionFactory;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 *
 * @author User
 */
public class ExcluirDAO {

    private Connection con = null;

    public ExcluirDAO() {
        con = connectionFactory.getConnection();
    }

    public boolean ExcluirClientes(int cod) throws SQLException {
        int registros;
        try (PreparedStatement pstmt = con.prepareStatement("DELETE FROM clientes WHERE id_clientes = ?")) {
            pstmt.setInt(1, cod);
            registros = pstmt.executeUpdate();
        }

        connectionFactory.closeConnection(con);

        if (registros == 1) {
            return true;
        } else {
            return false;
        }

    }

    public boolean ExcluirTransportadora(int cod) throws SQLException {
        int registros;
        try (PreparedStatement pstmt = con.prepareStatement("DELETE FROM transportadora WHERE id_transportadora = ?")) {
            pstmt.setInt(1, cod);
            registros = pstmt.executeUpdate();
        }

        connectionFactory.closeConnection(con);

        if (registros == 1) {
            return true;
        } else {
            return false;
        }

    }

    public boolean ExcluirUsuario(int cod) throws SQLException {
        int registros;
        try (PreparedStatement pstmt = con.prepareStatement("DELETE FROM login WHERE id_login = ?")) {
            pstmt.setInt(1, cod);
            registros = pstmt.executeUpdate();
        }

        connectionFactory.closeConnection(con);

        if (registros == 1) {
            return true;
        } else {
            return false;
        }

    }

    public boolean ExcluirProdutos(int cod) throws SQLException {
        int registros;
        try (PreparedStatement pstmt = con.prepareStatement("DELETE FROM produtos WHERE id_produtos = ?")) {
            pstmt.setInt(1, cod);
            registros = pstmt.executeUpdate();
        }

        connectionFactory.closeConnection(con);

        if (registros == 1) {
            return true;
        } else {
            return false;
        }

    }

    public boolean ExcluirLinhaFichao(int cod) throws SQLException {
        int registros;
        try (PreparedStatement pstmt = con.prepareStatement("DELETE FROM fichao WHERE id_fichao = ?")) {
            pstmt.setInt(1, cod);
            registros = pstmt.executeUpdate();
        }

        connectionFactory.closeConnection(con);

        if (registros == 1) {
            return true;
        } else {
            return false;
        }

    }

    public boolean ExcluirFichaoCliente(int cod) throws SQLException {
        int registros;
        try (PreparedStatement pstmt = con.prepareStatement("DELETE FROM fichao WHERE id_cliente = ?")) {
            pstmt.setInt(1, cod);
            registros = pstmt.executeUpdate();
        }

        if (registros == 1) {
            return true;
        } else {
            return false;
        }

    }

    public boolean ExcluirPreco(int cod) throws SQLException {
        
        int registros;
        try (PreparedStatement pstmt = con.prepareStatement("DELETE FROM preco WHERE id_cliente = ?")) {
            pstmt.setInt(1, cod);
            registros = pstmt.executeUpdate();
        }

        if (registros == 1) {
            return true;
        } else {
            return false;
        }

    }
} //fim do código
