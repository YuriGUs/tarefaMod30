/**
 * 
 */
package br.com.rpires.domain;

import anotacao.ColunaTabela;
import anotacao.Tabela;
import br.com.rpires.dao.Persistente;

@Tabela("TB_ESTOQUE")
public class Estoque implements Persistente {
    
    @ColunaTabela(dbName = "id", setJavaName = "setId")
    private Long id;
    
    @ColunaTabela(dbName = "id_produto_fk", setJavaName = "setIdProdutoFk")
    private Long idProdutoFk;
    
    @ColunaTabela(dbName = "quantidade", setJavaName = "setQuantidade")
    private Integer quantidade;
    
    @ColunaTabela(dbName = "localizacao", setJavaName = "setLocalizacao")
    private String localizacao;
    
    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public Long getIdProdutoFk() {
        return idProdutoFk;
    }
    public void setIdProdutoFk(Long idProdutoFk) {
        this.idProdutoFk = idProdutoFk;
    }
    public Integer getQuantidade() {
        return quantidade;
    }
    public void setQuantidade(Integer quantidade) {
        this.quantidade = quantidade;
    }
    public String getLocalizacao() {
        return localizacao;
    }
    public void setLocalizacao(String localizacao) {
        this.localizacao = localizacao;
    }
}
