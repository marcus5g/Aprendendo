package Carrinho;

public class Produto {
    private Long codigo;
    private String descricao;
 
    public Produto(Long codigo, String descricao) {
    }
    
     public Long getCodigo() {
    	return codigo;
    }

    public String getDescricao() {
    	return descricao;
    }
   
	@Override
	public String toString() {
		return "Produto [descricao=" + descricao + "]";
	}
    
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((codigo == null) ? 0 : codigo.hashCode());
		return result;
	}
		
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Produto other = (Produto) obj;
		if (codigo == null) {
			if (other.codigo != null)
				return false;
		} else if (!codigo.equals(other.codigo))
			return false;
		return true;
	}
}