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
import javax.swing.JOptionPane;
import model.clientes;
import model.login;
import model.produtos;
import model.transportadora;
import model.fichao;
import model.preco;

/**
 *
 * @author User
 */
public class PesquisaDAO {

    private Connection con = null;
    ResultSet rs = null;
    PreparedStatement pstmt = null;

    public PesquisaDAO() {
        con = connectionFactory.getConnection();
    }

    public boolean PesquisarTelaClientes(clientes objpes) throws SQLException {
        int cod = objpes.getId_clientes();

        pstmt = con.prepareStatement("SELECT * FROM clientes where id_clientes=?");
        pstmt.setInt(1, cod);

        rs = pstmt.executeQuery();

        if (rs.next()) {

            objpes.setPes_razaoS(rs.getString("pes_razaoS"));
            objpes.setPes_apelido(rs.getString("pes_apelido"));
            objpes.setPes_clienteM(rs.getString("pes_clienteM"));
            objpes.setPes_iE(rs.getString("pes_iE"));
            objpes.setPes_cnpj(rs.getString("pes_cnpj"));
            objpes.setPes_status(rs.getInt("pes_status"));
            objpes.setPes_tipoConsu(rs.getString("pes_tipoConsu"));
            objpes.setPes_ramo(rs.getString("pes_ramo"));
            objpes.setPes_codSuframa(rs.getString("pes_codSuframa"));
            objpes.setPes_codPais(rs.getString("pes_codPais"));
            objpes.setPes_venciDupli(rs.getString("pes_venciDupli"));

            objpes.setPes_telCel(rs.getString("pes_telCel"));
            objpes.setPes_telFixo(rs.getString("pes_telFixo"));
            objpes.setPes_telW(rs.getString("pes_telW"));

            objpes.setPes_mailCon(rs.getString("pes_mailCon"));
            objpes.setPes_mailXml(rs.getString("pes_mailXml"));
            objpes.setPes_endWeb(rs.getString("pes_endWeb"));

            objpes.setPes_vende(rs.getString("pes_vende"));
            objpes.setPes_atende(rs.getString("pes_atende"));
            objpes.setPes_prosp(rs.getString("pes_prosp"));
            objpes.setPes_disc(rs.getString("pes_disc"));
            objpes.setPes_chapa(rs.getString("pes_chapa"));
            objpes.setPes_bobi(rs.getString("pes_bobi"));

            objpes.setPes_cepF(rs.getString("pes_cepF"));
            objpes.setPes_telF(rs.getString("pes_telF"));
            objpes.setPes_codIbgeF(rs.getString("pes_codIbgeF"));
            objpes.setPes_ufF(rs.getString("pes_ufF"));
            objpes.setPes_cidadeF(rs.getString("pes_cidadeF"));
            objpes.setPes_ruaF(rs.getString("pes_ruaF"));
            objpes.setPes_complF(rs.getString("pes_complF"));
            objpes.setPes_bairroF(rs.getString("pes_bairroF"));
            objpes.setPes_numF(rs.getString("pes_numF"));
            //
            objpes.setPes_cepE(rs.getString("pes_cepE"));
            objpes.setPes_telE(rs.getString("pes_telE"));
            objpes.setPes_codIbgeE(rs.getString("pes_codIbgeE"));
            objpes.setPes_ufE(rs.getString("pes_ufE"));
            objpes.setPes_cidadeE(rs.getString("pes_cidadeE"));
            objpes.setPes_ruaE(rs.getString("pes_ruaE"));
            objpes.setPes_complE(rs.getString("pes_complE"));
            objpes.setPes_bairroE(rs.getString("pes_bairroE"));
            objpes.setPes_numE(rs.getString("pes_numE"));
            //
            objpes.setPes_cepC(rs.getString("pes_cepC"));
            objpes.setPes_telC(rs.getString("pes_telC"));
            objpes.setPes_codIbgeC(rs.getString("pes_codIbgeC"));
            objpes.setPes_ufC(rs.getString("pes_ufC"));
            objpes.setPes_cidadeC(rs.getString("pes_cidadeC"));
            objpes.setPes_ruaC(rs.getString("pes_ruaC"));
            objpes.setPes_complC(rs.getString("pes_complC"));
            objpes.setPes_bairroC(rs.getString("pes_bairroC"));
            objpes.setPes_numC(rs.getString("pes_numC"));
            //
            objpes.setPes_codTransp1(rs.getString("pes_codTransp1"));
            objpes.setPes_Transp1(rs.getString("pes_Transp1"));
            objpes.setPes_codTransp2(rs.getString("pes_codTransp2"));
            objpes.setPes_Transp2(rs.getString("pes_Transp2"));
            objpes.setPes_codTransp3(rs.getString("pes_codTransp3"));
            objpes.setPes_Transp3(rs.getString("pes_Transp3"));
            //
            objpes.setPes_dtcadastro(rs.getDate("pes_dtcadastro"));

        }

        return true;

    } //fim pesquisar tela Clientes

    //Pesquisar tela da Transportadora
    public boolean PesquisarTelaTransportadora(transportadora objtra) throws SQLException {
        int cod = objtra.getId_transportadora();

        pstmt = con.prepareStatement("SELECT * FROM transportadora where id_transportadora=?");
        pstmt.setInt(1, cod);

        rs = pstmt.executeQuery();

        if (rs.next()) {

            objtra.setTra_cnpj(rs.getString("tra_cnpj"));
            objtra.setTra_razaoS(rs.getString("tra_razaoS"));
            objtra.setTra_apelido(rs.getString("tra_apelido"));
            objtra.setTra_iE(rs.getString("tra_iE"));
            objtra.setTra_pessoa(rs.getString("tra_pessoa"));

            objtra.setTra_status(rs.getInt("tra_status"));
            objtra.setTra_plat(rs.getString("tra_plat"));
            objtra.setTra_empi(rs.getString("tra_empi"));

            objtra.setTra_cep(rs.getString("tra_cep"));
            objtra.setTra_codIbge(rs.getString("tra_codIbge"));
            objtra.setTra_uf(rs.getString("tra_uf"));
            objtra.setTra_cidade(rs.getString("tra_cidade"));
            objtra.setTra_rua(rs.getString("tra_rua"));
            objtra.setTra_compl(rs.getString("tra_compl"));
            objtra.setTra_bairro(rs.getString("tra_bairro"));
            objtra.setTra_num(rs.getString("tra_num"));

            objtra.setTra_telCel(rs.getString("tra_telCel"));
            objtra.setTra_telFixo(rs.getString("tra_telFixo"));
            objtra.setTra_mailCon(rs.getString("tra_mailCon"));
            objtra.setTra_endWeb(rs.getString("tra_endWeb"));

            objtra.setTra_veiCon(rs.getString("tra_veiCon"));
            objtra.setTra_rntrc(rs.getString("tra_rntrc"));
            objtra.setTra_veiTel(rs.getString("tra_veiTel"));
            objtra.setTra_veiChapa(rs.getString("tra_veiChapa"));

        }

        return true;

    } //fim pesquisar tela Transportadora

    //inicio pesquisa usuarios
    public ResultSet PesquisarUsuario(login objlog) {

        try {

            pstmt = con.prepareStatement("SELECT * FROM login WHERE usuario = ? and senha = ?");

            pstmt.setString(1, objlog.getUsuario());
            pstmt.setString(2, objlog.getSenha());

            rs = pstmt.executeQuery();

            return rs;

        } catch (SQLException error) {

            JOptionPane.showMessageDialog(null, "Login: " + error);

            return null;
        }

    }
    //FIM TELA PESQUISA USUARIOS

    //INICIO PESQUISA DE PRODUTOS
    public boolean PesquisarTelaProdutos(produtos objpro) throws SQLException {
        int cod = objpro.getId_produtos();

        pstmt = con.prepareStatement("SELECT * FROM produtos where id_produtos=?");
        pstmt.setInt(1, cod);

        rs = pstmt.executeQuery();

        if (rs.next()) {

            objpro.setPro_grupo(rs.getString("pro_grupo"));
            objpro.setPro_linha(rs.getString("pro_linha"));
            objpro.setPro_ncm(rs.getString("pro_ncm"));

            objpro.setPro_material(rs.getString("pro_material"));
            objpro.setPro_dureza(rs.getString("pro_dureza"));

            objpro.setPro_descri(rs.getString("pro_descri"));

            objpro.setPro_embC(rs.getString("pro_embC"));
            objpro.setPro_contendoC(rs.getString("pro_contendoC"));
            objpro.setPro_unidadeC(rs.getString("pro_unidadeC"));

            objpro.setPro_modelo(rs.getString("pro_modelo"));
            objpro.setPro_codContabil(rs.getString("pro_codContabil"));

            objpro.setPro_embV(rs.getString("pro_embV"));
            objpro.setPro_contendoV(rs.getString("pro_contendoV"));
            objpro.setPro_unidadeV(rs.getString("pro_unidadeV"));

            objpro.setPro_largura(rs.getString("pro_largura"));
            objpro.setPro_compri(rs.getString("pro_compri"));
            objpro.setPro_diame(rs.getString("pro_diame"));
            objpro.setPro_espes(rs.getString("pro_espes"));

            objpro.setPro_medConsu(rs.getString("pro_medConsu"));
            objpro.setPro_rendiPlaca(rs.getString("pro_rendiPlaca"));

            objpro.setPro_pesLiqui(rs.getString("pro_pesLiqui"));
            objpro.setPro_pesBruto(rs.getString("pro_pesBruto"));

            objpro.setPro_maxEsto(rs.getString("pro_maxEsto"));
            objpro.setPro_medEsto(rs.getString("pro_medEsto"));
            objpro.setPro_minEsto(rs.getString("pro_minEsto"));

            objpro.setPro_praca(rs.getString("pro_praca"));
            objpro.setPro_praca2(rs.getString("pro_praca2"));

            objpro.setPro_kgBobi(rs.getString("pro_kgBobi"));
            objpro.setPro_dificuldade(rs.getInt("pro_dificuldade"));

            objpro.setPro_fundi(rs.getString("pro_fundi"));
            objpro.setPro_slitter(rs.getString("pro_slitter"));
            objpro.setPro_prensa(rs.getString("pro_prensa"));
            objpro.setPro_apaga09(rs.getInt("pro_apaga09"));

            objpro.setPro_raa(rs.getInt("pro_raa"));
            objpro.setPro_estoMin(rs.getInt("pro_estoMin"));
            objpro.setPro_calha(rs.getInt("pro_calha"));
            objpro.setPro_produtivo(rs.getInt("pro_produtivo"));
            objpro.setPro_inativo(rs.getInt("pro_inativo"));

        }

        return true;

    } //fim PESQUISA PRODUTOS

    public boolean PesquisarTelaFichao(fichao objfic) throws SQLException {
        int cod = objfic.getId_fichao();

        pstmt = con.prepareStatement("SELECT * FROM fichao where id_fichao=?");
        pstmt.setInt(1, cod);

        rs = pstmt.executeQuery();

        if (rs.next()) {

            objfic.setId_cliente(rs.getInt("id_cliente"));

            objfic.setPes_quemFatu1(rs.getString("pes_vende"));
            objfic.setPes_quemFatu2(rs.getString("pes_atende"));
            objfic.setPes_quemFatu3(rs.getString("pes_prosp"));

            objfic.setPes_quemFatu1(rs.getString("pes_Transp1"));
            objfic.setPes_quemFatu2(rs.getString("pes_Transp2"));
            objfic.setPes_quemFatu3(rs.getString("pes_Transp3"));

            objfic.setPes_quemFatu1(rs.getString("pes_quemFatu1"));
            objfic.setPes_quemFatu2(rs.getString("pes_quemFatu2"));
            objfic.setPes_quemFatu3(rs.getString("pes_quemFatu3"));

            objfic.setPes_contaOr(rs.getString("pes_contaOr"));

            objfic.setPes_frete(rs.getString("pes_frete"));
            objfic.setPes_tipo(rs.getString("pes_tipo"));
            objfic.setPes_porcen(rs.getString("pes_porcen"));
            objfic.setPes_preco(rs.getString("pes_preco"));
            objfic.setPes_descri(rs.getString("pes_descri"));

            objfic.setPes_fusao(rs.getString("pes_fusao"));

            objfic.setPes_pra(rs.getString("pes_pra"));
            objfic.setPes_zo(rs.getString("pes_zo"));
            objfic.setPes_de(rs.getString("pes_de"));
            objfic.setPes_pa(rs.getString("pes_pa"));
            objfic.setPes_ga(rs.getString("pes_ga"));
            objfic.setPes_men(rs.getString("pes_men"));
            objfic.setPes_to(rs.getString("pes_to"));

            objfic.setPes_formaPagto(rs.getString("pes_formapagto"));
            objfic.setPes_banco(rs.getString("pes_banco"));

            objfic.setPes_pec(rs.getString("pes_pec"));
            objfic.setPes_ped(rs.getString("pes_ped"));

            objfic.setPes_mesmoEm(rs.getString("pes_mesmoEm"));
            objfic.setPes_maiorVal(rs.getString("pes_maiorVal"));
            objfic.setPes_menorChequ(rs.getString("pes_menorChequ"));
            objfic.setPes_prazoMChe(rs.getString("pes_prazoMChe"));
            objfic.setPes_pesarAguar(rs.getString("pes_pesarAguar"));

            objfic.setPes_credi(rs.getString("pes_credi"));
            objfic.setPes_chePorPro(rs.getString("pes_chePorPro"));
            objfic.setPes_chePor3(rs.getString("pes_chePor3"));

            objfic.setPes_restri(rs.getString("pes_restri"));

            objfic.setPes_matFinal(rs.getString("pes_matFinal"));
            objfic.setPes_matPrima(rs.getString("pes_matPrima"));

            objfic.setPes_chapaComMin(rs.getString("pes_chapaComMin"));
            objfic.setPes_chapaComMax(rs.getString("pes_chapaComMax"));
            objfic.setPes_chapaEspesMin(rs.getString("pes_chapaEspesMin"));
            objfic.setPes_chapaEspesMax(rs.getString("pes_chapaEspesMax"));
            objfic.setPes_chapaLargMin(rs.getString("pes_chapaLargMin"));
            objfic.setPes_chapaLargMax(rs.getString("pes_chapaLargMax"));

            objfic.setPes_bobiEspesMin(rs.getString("pes_bobiEspesMin"));
            objfic.setPes_bobiEspesMax(rs.getString("pes_bobiEspesMax"));
            objfic.setPes_bobiLargMin(rs.getString("pes_bobiLargMin"));
            objfic.setPes_bobiLargMax(rs.getString("pes_bobiLargMax"));

            objfic.setPes_discEspesMin(rs.getString("pes_discEspesMin"));
            objfic.setPes_discEspesMax(rs.getString("pes_discEspesMax"));
            objfic.setPes_discDiamMin(rs.getString("pes_discDiamMin"));
            objfic.setPes_discDiamMax(rs.getString("pes_discDiamMax"));

            objfic.setPes_porF0F1Min(rs.getString("pes_porF0F1Min"));
            objfic.setPes_porF0F1Max(rs.getString("pes_porF0F1Max"));
            objfic.setPes_porKgMin(rs.getString("pes_porKgMin"));
            objfic.setPes_porKgMax(rs.getString("pes_porKgMax"));

            objfic.setPes_altePreco(rs.getString("pes_altePreco"));
            objfic.setPes_tipoSaida(rs.getString("pes_tipoSaida"));

            objfic.setPes_fluxoA(rs.getString("pes_fluxoA"));
            objfic.setPes_fluxoB(rs.getString("pes_fluxoB"));
            objfic.setPes_fluxoC(rs.getString("pes_fluxoC"));
            objfic.setPes_fluxoD(rs.getString("pes_fluxoD"));
            objfic.setPes_fluxoE(rs.getString("pes_fluxoE"));
            objfic.setPes_fluxoF(rs.getString("pes_fluxoF"));

            objfic.setPes_descriKNfe(rs.getString("pes_descriKNfe"));
            objfic.setPes_observacao1(rs.getString("pes_observacao1"));
            objfic.setPes_observacao2(rs.getString("pes_observacao2"));
            objfic.setPes_observacao3(rs.getString("pes_observacao3"));

        }

        return true;

    } //fim PESQUISA PRODUTOS

    //inicio PESQUISA PRECO
    public ResultSet PesquisarPreco(preco objpre) {

        try {

            pstmt = con.prepareStatement("SELECT * FROM login WHERE id_preco = ?");

            objpre.setPre_data(rs.getDate("pre_data"));
            objpre.setPre_valor(rs.getString("pre_valor"));
            objpre.setId_Lfichao(rs.getInt("id_Lfichao"));

            rs = pstmt.executeQuery();

            return rs;

        } catch (SQLException error) {

            JOptionPane.showMessageDialog(null, "Login: " + error);

            return null;
        }

    }
    //FIM TELA PESQUISA PRECO   
}
