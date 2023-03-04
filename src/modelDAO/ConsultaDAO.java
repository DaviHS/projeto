/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelDAO;

import connection.connectionFactory;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author User---                                                      
 */
public class ConsultaDAO {
    
    private static Connection con = null;
    public static ResultSet carregaTabelaClientes() throws SQLException
            
    {
        
        con = connectionFactory.getConnection();
        PreparedStatement pstmt = con.prepareStatement(
        
          "SELECT id_clientes,pes_razaoS,pes_apelido,pes_clienteM,pes_iE,pes_cnpj,pes_status,pes_dtcadastro FROM clientes");
        ResultSet rs = pstmt.executeQuery();
                return rs;
    } //fim metodo carregar tabela
    
    public static ResultSet carregaTelaClientes(String tipo,String arg) throws SQLException
            
    {
        String argumento=tipo+" "+"like '%"+arg+"%'"; 
        
        
        
        PreparedStatement pstmt = con.prepareStatement( 
                "SELECT id_clientes, pes_razaoS, pes_apelido, pes_clienteM, pes_iE, pes_cnpj, pes_status FROM clientes where " +argumento+ "");
        
        ResultSet rs = pstmt.executeQuery();
            return rs;
                  
    }
    
    //fim Consulta Clientes

    
    
    //Inicio Consulta Transportadora
    
    public static ResultSet carregaTabelaTransportadora() throws SQLException
            
    {
        con = connectionFactory.getConnection();
        PreparedStatement pstmt = con.prepareStatement(
        
        "SELECT id_transportadora,tra_razaoS,tra_cnpj,tra_cidade,tra_uf,tra_status FROM transportadora");
        ResultSet rs = pstmt.executeQuery();
                return rs;
    } //fim metodo carregar tabela
    
    public static ResultSet carregaTelaTransportadora(String tipo,String arg) throws SQLException
            
    {
        String argumento=tipo+" "+"like '%"+arg+"%'"; 
        
        PreparedStatement pstmt = con.prepareStatement( 
                "SELECT id_transportadora,tra_razaoS,tra_cnpj,tra_cidade,tra_uf,tra_status FROM transportadora where " +argumento+ "");
        
        ResultSet rs = pstmt.executeQuery();
            return rs;
                      
    } //FIM Consulta Transportadora
    
    
    //Inicio Consulta PRODUTOS
    public static ResultSet carregaTabelaProdutos() throws SQLException {
        con = connectionFactory.getConnection();
        PreparedStatement pstmt = con.prepareStatement(
        
        "SELECT id_produtos,pro_descri,pro_grupo,pro_linha,pro_material,pro_dureza FROM produtos");
        ResultSet rs = pstmt.executeQuery();
                return rs;
    } //fim metodo carregar tabela
    
    public static ResultSet carregaTelaProdutos(String tipo,String arg) throws SQLException
            
    {
        String argumento=tipo+" "+"like '%"+arg+"%'"; 
        
       PreparedStatement pstmt = con.prepareStatement(  
                "SELECT id_produtos, pro_descri, pro_grupo, pro_linha, pro_material, pro_dureza FROM produtos where " +argumento+ "");
        
        ResultSet rs = pstmt.executeQuery();
            return rs;
                     
         
    } // FIM Consulta PRODUTOS
    
    //FICHAO
    
        public static ResultSet carregaTabelaFicha() throws SQLException {
        con = connectionFactory.getConnection();
        PreparedStatement pstmt = con.prepareStatement(
        
        "SELECT  "
                        + " pes_vende, pes_atende, pes_prosp,"          
                        + " pes_Transp1, pes_Transp2, pes_Transp3,"                   
                        + " pes_frete,"      
                        + " pes_quemFatu1, pes_quemFatu2, pes_quemFatu3,"                   
                        + " pes_contaOr,"                  
                        + " pes_tipo, pes_porcen, pes_preco, pes_descri,"                       
                        + " pes_fusao,"
                        + " pes_pra, pes_zo, pes_de, pes_pa, pes_ga, pes_men, pes_to,"                       
                        + " pes_formaPagto, pes_banco,"
                        + " pes_pec, pes_ped,"                        
                        + " pes_mesmoEm, pes_maiorVal, pes_menorChequ, pes_prazoMChe, pes_pesarAguar,"
                        + " pes_credi, pes_chePorPro, pes_chePor3,"
                        + " pes_restri,"
                        + " pes_matFinal, pes_matPrima,"
                        + " pes_chapaComMin, pes_chapaComMax, pes_chapaEspesMin, pes_chapaEspesMax, pes_chapaLargMin, pes_chapaLargMax,"
                        + " pes_bobiEspesMin, pes_bobiEspesMax, pes_bobiLargMin, pes_bobiLargMax,"
                        + " pes_discDiamMin, pes_discDiamMax, pes_discEspesMin, pes_discEspesMax,"
                        + " pes_porF0F1Min, pes_porF0F1Max, pes_porKgMin, pes_porKgMax," 
                        + " pes_altePreco, pes_tipoSaida," 
                        + " pes_fluxoA, pes_fluxoB, pes_fluxoC, pes_fluxoD, pes_fluxoE, pes_fluxoF,"
                        + " pes_descriKNfe, pes_observacao1, pes_observacao2, pes_observacao3, id_cliente, id_fichao "
                        + "FROM fichao");
        ResultSet rs = pstmt.executeQuery();
                return rs;
    } //fim metodo carregar tabela
   
     //Inicio Consulta PRODUTOS
    public static ResultSet carregaTelaFichao(String tipo,String arg) throws SQLException {
        String argumento=tipo+" "+"like '%"+arg+"%'"; 
        
        PreparedStatement pstmt = con.prepareStatement( 
        
        "SELECT "
                        + " pes_vende, pes_atende, pes_prosp,"
                        + " pes_Transp1, pes_Transp2, pes_Transp3,"                 
                        + " pes_frete," 
                        + " pes_quemFatu1, pes_quemFatu2, pes_quemFatu3,"
                        + " pes_contaOr,"
                        + " pes_tipo, pes_porcen, pes_preco, pes_descri,"
                        + " pes_fusao,"
                        + " pes_pra, pes_zo, pes_de, pes_pa, pes_ga, pes_men, pes_to,"
                        + " pes_formaPagto, pes_banco,"
                        + " pes_pec, pes_ped,"
                        + " pes_mesmoEm, pes_maiorVal, pes_menorChequ, pes_prazoMChe, pes_pesarAguar,"
                        + " pes_credi, pes_chePorPro, pes_chePor3,"
                        + " pes_restri,"
                        + " pes_matFinal, pes_matPrima,"
                        + " pes_chapaComMin, pes_chapaComMax, pes_chapaEspesMin, pes_chapaEspesMax, pes_chapaLargMin, pes_chapaLargMax,"
                        + " pes_bobiEspesMin, pes_bobiEspesMax, pes_bobiLargMin, pes_bobiLargMax,"
                        + " pes_discDiamMin, pes_discDiamMax, pes_discEspesMin, pes_discEspesMax,"
                        + " pes_porF0F1Min, pes_porF0F1Max, pes_porKgMin, pes_porKgMax,"
                        + " pes_altePreco, pes_tipoSaida," 
                        + " pes_fluxoA, pes_fluxoB, pes_fluxoC, pes_fluxoD, pes_fluxoE, pes_fluxoF,"
                        + " pes_descriKNfe, pes_observacao1, pes_observacao2, pes_observacao3, id_cliente, id_fichao "
                        + " FROM fichao where " +argumento+ "");
        
        ResultSet rs = pstmt.executeQuery();
                return rs;
    } //fim metodo carregar tabela

    
    //ALTERAÇÂO DE PRECO
    
            public static ResultSet carregaTabelaPreco() throws SQLException {
        con = connectionFactory.getConnection();
        PreparedStatement pstmt = con.prepareStatement(
        
        "SELECT pre_data, pre_valor"              
                        + " FROM preco ");
        ResultSet rs = pstmt.executeQuery();
                return rs;
    } //fim metodo carregar tabela PRECO
    
        public static ResultSet carregaTelaPreco(String tipo,String arg) throws SQLException {
        String argumento=tipo+" "+"like '%"+arg+"%'"; 
        
        PreparedStatement pstmt = con.prepareStatement( 
        
        "SELECT pre_data, pre_valor"
                        + " FROM preco where " +argumento+ "");
        
        ResultSet rs = pstmt.executeQuery();
                return rs;
    } //fim metodo carregar tabela preco
        
} // fim consultadao
