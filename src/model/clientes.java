package model;

import java.util.Date;

/**
 *
 * @author User
 */
public class clientes {
    
    
    private clientes Clientes;

    private int id_clientes;
    private String pes_razaoS;
    private String pes_apelido;
    private String pes_clienteM;
    private String pes_iE;
    private String pes_cnpj;
    private int pes_status;
    private String pes_tipoConsu;
    private String pes_ramo;
    private String pes_codSuframa;
    private String pes_codPais;
    private String pes_venciDupli;
    private String pes_telFixo;
    private String pes_telCel;
    private String pes_telW;
    private String pes_mailCon;
    private String pes_mailXml;
    private String pes_endWeb;
    
    private String pes_vende;
    private String pes_atende;
    private String pes_prosp;
    private String pes_disc;
    private String pes_chapa;
    private String pes_bobi;
    
    private String pes_cepF;
    private String pes_telF;
    private String pes_codIbgeF;
    private String pes_ufF;
    private String pes_cidadeF;
    private String pes_ruaF;
    private String pes_complF;
    private String pes_bairroF;
    private String pes_numF;
    
    private String pes_cepE;
    private String pes_telE;
    private String pes_codIbgeE;
    private String pes_ufE;
    private String pes_cidadeE;
    private String pes_ruaE;
    private String pes_complE;
    private String pes_bairroE;
    private String pes_numE;
    
    private String pes_cepC;
    private String pes_telC;
    private String pes_codIbgeC;
    private String pes_ufC;
    private String pes_cidadeC;
    private String pes_ruaC;
    private String pes_complC;
    private String pes_bairroC;
    private String pes_numC;
    
    private String pes_codTransp1;
     private String pes_Transp1;
    private String pes_codTransp2;
     private String pes_Transp2;
    private String pes_codTransp3;
     private String pes_Transp3;

private Date pes_dtcadastro;

    public clientes() {
    }

    public clientes(clientes Clientes, int id_clientes, String pes_razaoS, String pes_apelido, String pes_clienteM, String pes_iE, String pes_cnpj, int pes_status, String pes_tipoConsu, String pes_ramo, String pes_codSuframa, String pes_codPais, String pes_venciDupli, String pes_telFixo, String pes_telCel, String pes_telW, String pes_mailCon, String pes_mailXml, String pes_endWeb, String pes_vende, String pes_atende, String pes_prosp, String pes_disc, String pes_chapa, String pes_bobi, String pes_cepF, String pes_telF, String pes_codIbgeF, String pes_ufF, String pes_cidadeF, String pes_ruaF, String pes_complF, String pes_bairroF, String pes_numF, String pes_cepE, String pes_telE, String pes_codIbgeE, String pes_ufE, String pes_cidadeE, String pes_ruaE, String pes_complE, String pes_bairroE, String pes_numE, String pes_cepC, String pes_telC, String pes_codIbgeC, String pes_ufC, String pes_cidadeC, String pes_ruaC, String pes_complC, String pes_bairroC, String pes_numC, String pes_codTransp1, String pes_Transp1, String pes_codTransp2, String pes_Transp2, String pes_codTransp3, String pes_Transp3, Date pes_dtcadastro) {
        this.Clientes = Clientes;
        this.id_clientes = id_clientes;
        this.pes_razaoS = pes_razaoS;
        this.pes_apelido = pes_apelido;
        this.pes_clienteM = pes_clienteM;
        this.pes_iE = pes_iE;
        this.pes_cnpj = pes_cnpj;
        this.pes_status = pes_status;
        this.pes_tipoConsu = pes_tipoConsu;
        this.pes_ramo = pes_ramo;
        this.pes_codSuframa = pes_codSuframa;
        this.pes_codPais = pes_codPais;
        this.pes_venciDupli = pes_venciDupli;
        this.pes_telFixo = pes_telFixo;
        this.pes_telCel = pes_telCel;
        this.pes_telW = pes_telW;
        this.pes_mailCon = pes_mailCon;
        this.pes_mailXml = pes_mailXml;
        this.pes_endWeb = pes_endWeb;
        this.pes_vende = pes_vende;
        this.pes_atende = pes_atende;
        this.pes_prosp = pes_prosp;
        this.pes_disc = pes_disc;
        this.pes_chapa = pes_chapa;
        this.pes_bobi = pes_bobi;
        this.pes_cepF = pes_cepF;
        this.pes_telF = pes_telF;
        this.pes_codIbgeF = pes_codIbgeF;
        this.pes_ufF = pes_ufF;
        this.pes_cidadeF = pes_cidadeF;
        this.pes_ruaF = pes_ruaF;
        this.pes_complF = pes_complF;
        this.pes_bairroF = pes_bairroF;
        this.pes_numF = pes_numF;
        this.pes_cepE = pes_cepE;
        this.pes_telE = pes_telE;
        this.pes_codIbgeE = pes_codIbgeE;
        this.pes_ufE = pes_ufE;
        this.pes_cidadeE = pes_cidadeE;
        this.pes_ruaE = pes_ruaE;
        this.pes_complE = pes_complE;
        this.pes_bairroE = pes_bairroE;
        this.pes_numE = pes_numE;
        this.pes_cepC = pes_cepC;
        this.pes_telC = pes_telC;
        this.pes_codIbgeC = pes_codIbgeC;
        this.pes_ufC = pes_ufC;
        this.pes_cidadeC = pes_cidadeC;
        this.pes_ruaC = pes_ruaC;
        this.pes_complC = pes_complC;
        this.pes_bairroC = pes_bairroC;
        this.pes_numC = pes_numC;
        this.pes_codTransp1 = pes_codTransp1;
        this.pes_Transp1 = pes_Transp1;
        this.pes_codTransp2 = pes_codTransp2;
        this.pes_Transp2 = pes_Transp2;
        this.pes_codTransp3 = pes_codTransp3;
        this.pes_Transp3 = pes_Transp3;
        this.pes_dtcadastro = pes_dtcadastro;
    }

    public clientes getClientes() {
        return Clientes;
    }

    public void setClientes(clientes Clientes) {
        this.Clientes = Clientes;
    }

    public int getId_clientes() {
        return id_clientes;
    }

    public void setId_clientes(int id_clientes) {
        this.id_clientes = id_clientes;
    }

    public String getPes_razaoS() {
        return pes_razaoS;
    }

    public void setPes_razaoS(String pes_razaoS) {
        this.pes_razaoS = pes_razaoS;
    }

    public String getPes_apelido() {
        return pes_apelido;
    }

    public void setPes_apelido(String pes_apelido) {
        this.pes_apelido = pes_apelido;
    }

    public String getPes_clienteM() {
        return pes_clienteM;
    }

    public void setPes_clienteM(String pes_clienteM) {
        this.pes_clienteM = pes_clienteM;
    }

    public String getPes_iE() {
        return pes_iE;
    }

    public void setPes_iE(String pes_iE) {
        this.pes_iE = pes_iE;
    }

    public String getPes_cnpj() {
        return pes_cnpj;
    }

    public void setPes_cnpj(String pes_cnpj) {
        this.pes_cnpj = pes_cnpj;
    }

    public int getPes_status() {
        return pes_status;
    }

    public void setPes_status(int pes_status) {
        this.pes_status = pes_status;
    }

    public String getPes_tipoConsu() {
        return pes_tipoConsu;
    }

    public void setPes_tipoConsu(String pes_tipoConsu) {
        this.pes_tipoConsu = pes_tipoConsu;
    }

    public String getPes_ramo() {
        return pes_ramo;
    }

    public void setPes_ramo(String pes_ramo) {
        this.pes_ramo = pes_ramo;
    }

    public String getPes_codSuframa() {
        return pes_codSuframa;
    }

    public void setPes_codSuframa(String pes_codSuframa) {
        this.pes_codSuframa = pes_codSuframa;
    }

    public String getPes_codPais() {
        return pes_codPais;
    }

    public void setPes_codPais(String pes_codPais) {
        this.pes_codPais = pes_codPais;
    }

    public String getPes_venciDupli() {
        return pes_venciDupli;
    }

    public void setPes_venciDupli(String pes_venciDupli) {
        this.pes_venciDupli = pes_venciDupli;
    }

    public String getPes_telFixo() {
        return pes_telFixo;
    }

    public void setPes_telFixo(String pes_telFixo) {
        this.pes_telFixo = pes_telFixo;
    }

    public String getPes_telCel() {
        return pes_telCel;
    }

    public void setPes_telCel(String pes_telCel) {
        this.pes_telCel = pes_telCel;
    }

    public String getPes_telW() {
        return pes_telW;
    }

    public void setPes_telW(String pes_telW) {
        this.pes_telW = pes_telW;
    }

    public String getPes_mailCon() {
        return pes_mailCon;
    }

    public void setPes_mailCon(String pes_mailCon) {
        this.pes_mailCon = pes_mailCon;
    }

    public String getPes_mailXml() {
        return pes_mailXml;
    }

    public void setPes_mailXml(String pes_mailXml) {
        this.pes_mailXml = pes_mailXml;
    }

    public String getPes_endWeb() {
        return pes_endWeb;
    }

    public void setPes_endWeb(String pes_endWeb) {
        this.pes_endWeb = pes_endWeb;
    }

    public String getPes_vende() {
        return pes_vende;
    }

    public void setPes_vende(String pes_vende) {
        this.pes_vende = pes_vende;
    }

    public String getPes_atende() {
        return pes_atende;
    }

    public void setPes_atende(String pes_atende) {
        this.pes_atende = pes_atende;
    }

    public String getPes_prosp() {
        return pes_prosp;
    }

    public void setPes_prosp(String pes_prosp) {
        this.pes_prosp = pes_prosp;
    }

    public String getPes_disc() {
        return pes_disc;
    }

    public void setPes_disc(String pes_disc) {
        this.pes_disc = pes_disc;
    }

    public String getPes_chapa() {
        return pes_chapa;
    }

    public void setPes_chapa(String pes_chapa) {
        this.pes_chapa = pes_chapa;
    }

    public String getPes_bobi() {
        return pes_bobi;
    }

    public void setPes_bobi(String pes_bobi) {
        this.pes_bobi = pes_bobi;
    }

    public String getPes_cepF() {
        return pes_cepF;
    }

    public void setPes_cepF(String pes_cepF) {
        this.pes_cepF = pes_cepF;
    }

    public String getPes_telF() {
        return pes_telF;
    }

    public void setPes_telF(String pes_telF) {
        this.pes_telF = pes_telF;
    }

    public String getPes_codIbgeF() {
        return pes_codIbgeF;
    }

    public void setPes_codIbgeF(String pes_codIbgeF) {
        this.pes_codIbgeF = pes_codIbgeF;
    }

    public String getPes_ufF() {
        return pes_ufF;
    }

    public void setPes_ufF(String pes_ufF) {
        this.pes_ufF = pes_ufF;
    }

    public String getPes_cidadeF() {
        return pes_cidadeF;
    }

    public void setPes_cidadeF(String pes_cidadeF) {
        this.pes_cidadeF = pes_cidadeF;
    }

    public String getPes_ruaF() {
        return pes_ruaF;
    }

    public void setPes_ruaF(String pes_ruaF) {
        this.pes_ruaF = pes_ruaF;
    }

    public String getPes_complF() {
        return pes_complF;
    }

    public void setPes_complF(String pes_complF) {
        this.pes_complF = pes_complF;
    }

    public String getPes_bairroF() {
        return pes_bairroF;
    }

    public void setPes_bairroF(String pes_bairroF) {
        this.pes_bairroF = pes_bairroF;
    }

    public String getPes_numF() {
        return pes_numF;
    }

    public void setPes_numF(String pes_numF) {
        this.pes_numF = pes_numF;
    }

    public String getPes_cepE() {
        return pes_cepE;
    }

    public void setPes_cepE(String pes_cepE) {
        this.pes_cepE = pes_cepE;
    }

    public String getPes_telE() {
        return pes_telE;
    }

    public void setPes_telE(String pes_telE) {
        this.pes_telE = pes_telE;
    }

    public String getPes_codIbgeE() {
        return pes_codIbgeE;
    }

    public void setPes_codIbgeE(String pes_codIbgeE) {
        this.pes_codIbgeE = pes_codIbgeE;
    }

    public String getPes_ufE() {
        return pes_ufE;
    }

    public void setPes_ufE(String pes_ufE) {
        this.pes_ufE = pes_ufE;
    }

    public String getPes_cidadeE() {
        return pes_cidadeE;
    }

    public void setPes_cidadeE(String pes_cidadeE) {
        this.pes_cidadeE = pes_cidadeE;
    }

    public String getPes_ruaE() {
        return pes_ruaE;
    }

    public void setPes_ruaE(String pes_ruaE) {
        this.pes_ruaE = pes_ruaE;
    }

    public String getPes_complE() {
        return pes_complE;
    }

    public void setPes_complE(String pes_complE) {
        this.pes_complE = pes_complE;
    }

    public String getPes_bairroE() {
        return pes_bairroE;
    }

    public void setPes_bairroE(String pes_bairroE) {
        this.pes_bairroE = pes_bairroE;
    }

    public String getPes_numE() {
        return pes_numE;
    }

    public void setPes_numE(String pes_numE) {
        this.pes_numE = pes_numE;
    }

    public String getPes_cepC() {
        return pes_cepC;
    }

    public void setPes_cepC(String pes_cepC) {
        this.pes_cepC = pes_cepC;
    }

    public String getPes_telC() {
        return pes_telC;
    }

    public void setPes_telC(String pes_telC) {
        this.pes_telC = pes_telC;
    }

    public String getPes_codIbgeC() {
        return pes_codIbgeC;
    }

    public void setPes_codIbgeC(String pes_codIbgeC) {
        this.pes_codIbgeC = pes_codIbgeC;
    }

    public String getPes_ufC() {
        return pes_ufC;
    }

    public void setPes_ufC(String pes_ufC) {
        this.pes_ufC = pes_ufC;
    }

    public String getPes_cidadeC() {
        return pes_cidadeC;
    }

    public void setPes_cidadeC(String pes_cidadeC) {
        this.pes_cidadeC = pes_cidadeC;
    }

    public String getPes_ruaC() {
        return pes_ruaC;
    }

    public void setPes_ruaC(String pes_ruaC) {
        this.pes_ruaC = pes_ruaC;
    }

    public String getPes_complC() {
        return pes_complC;
    }

    public void setPes_complC(String pes_complC) {
        this.pes_complC = pes_complC;
    }

    public String getPes_bairroC() {
        return pes_bairroC;
    }

    public void setPes_bairroC(String pes_bairroC) {
        this.pes_bairroC = pes_bairroC;
    }

    public String getPes_numC() {
        return pes_numC;
    }

    public void setPes_numC(String pes_numC) {
        this.pes_numC = pes_numC;
    }

    public String getPes_codTransp1() {
        return pes_codTransp1;
    }

    public void setPes_codTransp1(String pes_codTransp1) {
        this.pes_codTransp1 = pes_codTransp1;
    }

    public String getPes_Transp1() {
        return pes_Transp1;
    }

    public void setPes_Transp1(String pes_Transp1) {
        this.pes_Transp1 = pes_Transp1;
    }

    public String getPes_codTransp2() {
        return pes_codTransp2;
    }

    public void setPes_codTransp2(String pes_codTransp2) {
        this.pes_codTransp2 = pes_codTransp2;
    }

    public String getPes_Transp2() {
        return pes_Transp2;
    }

    public void setPes_Transp2(String pes_Transp2) {
        this.pes_Transp2 = pes_Transp2;
    }

    public String getPes_codTransp3() {
        return pes_codTransp3;
    }

    public void setPes_codTransp3(String pes_codTransp3) {
        this.pes_codTransp3 = pes_codTransp3;
    }

    public String getPes_Transp3() {
        return pes_Transp3;
    }

    public void setPes_Transp3(String pes_Transp3) {
        this.pes_Transp3 = pes_Transp3;
    }

    public Date getPes_dtcadastro() {
        return pes_dtcadastro;
    }

    public void setPes_dtcadastro(Date pes_dtcadastro) {
        this.pes_dtcadastro = pes_dtcadastro;
    }

        


} //fim classe clientes