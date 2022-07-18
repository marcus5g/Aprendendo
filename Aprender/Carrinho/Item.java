package Carrinho;

import java.math.BigDecimal;

public class Item {
    private Produto produto;
    private BigDecimal valorUnitario;
    private BigDecimal valor;
    private int quantidade;

    public Item(Produto produto, BigDecimal valorUnitario, int quantidade) {
    }
    
    public Produto getProduto() {
    	return produto;
    }

    public BigDecimal getValorUnitario() {
    	return valorUnitario;
    }
    
    public BigDecimal getValor() {
		return valor;
	}
        
	public void setValor(BigDecimal valor) {
		this.valor = valor;
	}

    public int getQuantidade() {
    	return quantidade;
    }

    public BigDecimal getValorTotal() {
    	return valorUnitario.multiply(new BigDecimal(quantidade));
    }

	@Override
	public String toString() {
		return "Item [produto=" + produto + ", valorUnitario=" + valorUnitario + ", valor=" + valor + ", quantidade=" + quantidade + "]";
	}
}