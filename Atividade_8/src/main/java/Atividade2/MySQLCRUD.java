package Atividade2;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class MySQLCRUD {

    // ✅ CRUD PARA EQUALIZADOR
    public static void criarEqualizador(Equalizador eq) {
        String sql = "INSERT INTO equalizador (cheiro, solta, instrucao) VALUES (?, ?, ?)";
        try (Connection conn = MySQLConnection.getConnection();
             PreparedStatement pstmt = conn.prepareStatement(sql)) {
            pstmt.setString(1, eq.getCheiro());
            pstmt.setString(2, eq.getSolta());
            pstmt.setString(3, eq.getInstrucao());
            pstmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public static List<Equalizador> lerEqualizadores() {
        List<Equalizador> equalizadores = new ArrayList<>();
        String sql = "SELECT * FROM equalizador ORDER BY data_criacao DESC";
        try (Connection conn = MySQLConnection.getConnection();
             Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery(sql)) {
            while (rs.next()) {
                Equalizador eq = new Equalizador(
                        rs.getInt("id"),
                        rs.getString("cheiro"),
                        rs.getString("solta"),
                        rs.getString("instrucao")
                );
                equalizadores.add(eq);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return equalizadores;
    }

    public static void atualizarEqualizador(Equalizador eq) {
        String sql = "UPDATE equalizador SET cheiro = ?, solta = ?, instrucao = ? WHERE id = ?";
        try (Connection conn = MySQLConnection.getConnection();
             PreparedStatement pstmt = conn.prepareStatement(sql)) {
            pstmt.setString(1, eq.getCheiro());
            pstmt.setString(2, eq.getSolta());
            pstmt.setString(3, eq.getInstrucao());
            pstmt.setInt(4, eq.getId());
            pstmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public static void deletarEqualizador(int id) {
        String sql = "DELETE FROM equalizador WHERE id = ?";
        try (Connection conn = MySQLConnection.getConnection();
             PreparedStatement pstmt = conn.prepareStatement(sql)) {
            pstmt.setInt(1, id);
            pstmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    // ✅ CRUD PARA MANUAL DE INSTRUÇÃO
    public static void criarManual(ManualdeInstrucao manual) {
        String sql = "INSERT INTO manual_instrucao (sonhos, gostos, pensamentos) VALUES (?, ?, ?)";
        try (Connection conn = MySQLConnection.getConnection();
             PreparedStatement pstmt = conn.prepareStatement(sql)) {
            pstmt.setString(1, manual.getSonhos());
            pstmt.setString(2, manual.getGostos());
            pstmt.setString(3, manual.getPensamentos());
            pstmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public static List<ManualdeInstrucao> lerManuais() {
        List<ManualdeInstrucao> manuais = new ArrayList<>();
        String sql = "SELECT * FROM manual_instrucao ORDER BY data_criacao DESC";
        try (Connection conn = MySQLConnection.getConnection();
             Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery(sql)) {
            while (rs.next()) {
                ManualdeInstrucao manual = new ManualdeInstrucao(
                        rs.getInt("id"),
                        rs.getString("sonhos"),
                        rs.getString("gostos"),
                        rs.getString("pensamentos")
                );
                manuais.add(manual);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return manuais;
    }

    // CRUD PARA RITMO
    public static void criarRitmo(Ritmo ritmo) {
        String sql = "INSERT INTO ritmo (balanco, ensaiado, embalo) VALUES (?, ?, ?)";
        try (Connection conn = MySQLConnection.getConnection();
             PreparedStatement pstmt = conn.prepareStatement(sql)) {
            pstmt.setString(1, ritmo.getBalanco());
            pstmt.setString(2, ritmo.getEnsaiado());
            pstmt.setString(3, ritmo.getEmbalo());
            pstmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public static List<Ritmo> lerRitmos() {
        List<Ritmo> ritmos = new ArrayList<>();
        String sql = "SELECT * FROM ritmo ORDER BY data_criacao DESC";
        try (Connection conn = MySQLConnection.getConnection();
             Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery(sql)) {
            while (rs.next()) {
                Ritmo ritmo = new Ritmo(
                        rs.getInt("id"),
                        rs.getString("balanco"),
                        rs.getString("ensaiado"),
                        rs.getString("embalo")
                );
                ritmos.add(ritmo);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return ritmos;
    }
}