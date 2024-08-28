public class Locations {
    private int id_location;
    private String tipoDeLocal;
    private String pontosDeReferencia;
    private int quantidadeDeQuartos;
    private int quantidadeDeBanheiros;
    private String bairro;
    private String rua;
    private int quadra;
    private int lote;
    private int numero;
    private int quantidadeMaximaDeHospedes;
    private int quantidadeDeCamas;
    private int quantidadeDeRecomendacoes;

    public Locations(int id_location, String tipoDeLocal, String pontosDeReferencia, int quantidadeDeQuartos, int quantidadeDeBanheiros, String bairro, String rua, int quadra, int lote, int numero, int quantidadeMaximaDeHospedes, int quantidadeDeCamas, int quantidadeDeRecomendacoes) {
        this.id_location = id_location;
        this.tipoDeLocal = tipoDeLocal;
        this.pontosDeReferencia = pontosDeReferencia;
        this.quantidadeDeQuartos = quantidadeDeQuartos;
        this.quantidadeDeBanheiros = quantidadeDeBanheiros;
        this.bairro = bairro;
        this.rua = rua;
        this.quadra = quadra;
        this.lote = lote;
        this.numero = numero;
        this.quantidadeMaximaDeHospedes = quantidadeMaximaDeHospedes;
        this.quantidadeDeCamas = quantidadeDeCamas;
        this.quantidadeDeRecomendacoes = quantidadeDeRecomendacoes;
    }

    public int getId_location() {
        return id_location;
    }

    public void setId_location(int id_location) {
        this.id_location = id_location;
    }

    public String getTipoDeLocal() {
        return tipoDeLocal;
    }

    public void setTipoDeLocal(String tipoDeLocal) {
        this.tipoDeLocal = tipoDeLocal;
    }

    public String getPontosDeReferencia() {
        return pontosDeReferencia;
    }

    public void setPontosDeReferencia(String pontosDeReferencia) {
        this.pontosDeReferencia = pontosDeReferencia;
    }

    public int getQuantidadeDeQuartos() {
        return quantidadeDeQuartos;
    }

    public void setQuantidadeDeQuartos(int quantidadeDeQuartos) {
        this.quantidadeDeQuartos = quantidadeDeQuartos;
    }

    public int getQuantidadeDeBanheiros() {
        return quantidadeDeBanheiros;
    }

    public void setQuantidadeDeBanheiros(int quantidadeDeBanheiros) {
        this.quantidadeDeBanheiros = quantidadeDeBanheiros;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public String getRua() {
        return rua;
    }

    public void setRua(String rua) {
        this.rua = rua;
    }

    public int getQuadra() {
        return quadra;
    }

    public void setQuadra(int quadra) {
        this.quadra = quadra;
    }

    public int getLote() {
        return lote;
    }

    public void setLote(int lote) {
        this.lote = lote;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public int getQuantidadeMaximaDeHospedes() {
        return quantidadeMaximaDeHospedes;
    }

    public void setQuantidadeMaximaDeHospedes(int quantidadeMaximaDeHospedes) {
        this.quantidadeMaximaDeHospedes = quantidadeMaximaDeHospedes;
    }

    public int getQuantidadeDeCamas() {
        return quantidadeDeCamas;
    }

    public void setQuantidadeDeCamas(int quantidadeDeCamas) {
        this.quantidadeDeCamas = quantidadeDeCamas;
    }

    public int getQuantidadeDeRecomendacoes() {
        return quantidadeDeRecomendacoes;
    }

    public void setQuantidadeDeRecomendacoes(int quantidadeDeRecomendacoes) {
        this.quantidadeDeRecomendacoes = quantidadeDeRecomendacoes;
    }
}