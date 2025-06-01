package entidades;

public class PostoEvacuacao {
    private int id;
    private String nome;
    private String logradouro;
    private String numero;
    private String bairro;
    private String cidade;
    private String estado;
    private String cep;
    private int capacidade;
    private String status;
    private double latitude;
    private double longitude;
    private String telefone;
    private String observacoes;
    private int idArea;

    public PostoEvacuacao() {
    }

    public PostoEvacuacao(int id, String nome, String logradouro, String numero, String bairro,
                           String cidade, String estado, String cep, int capacidade, String status,
                           double latitude, double longitude, String telefone, String observacoes, int idArea) {
        this.id = id;
        this.nome = nome;
        this.logradouro = logradouro;
        this.numero = numero;
        this.bairro = bairro;
        this.cidade = cidade;
        this.estado = estado;
        this.cep = cep;
        this.capacidade = capacidade;
        this.status = status;
        this.latitude = latitude;
        this.longitude = longitude;
        this.telefone = telefone;
        this.observacoes = observacoes;
        this.idArea = idArea;
    }

    // Getters e setters (padrão)
    public int getId() { return id; }
    public void setId(int id) { this.id = id; }

    public String getNome() { return nome; }
    public void setNome(String nome) { this.nome = nome; }

    public String getLogradouro() { return logradouro; }
    public void setLogradouro(String logradouro) { this.logradouro = logradouro; }

    public String getNumero() { return numero; }
    public void setNumero(String numero) { this.numero = numero; }

    public String getBairro() { return bairro; }
    public void setBairro(String bairro) { this.bairro = bairro; }

    public String getCidade() { return cidade; }
    public void setCidade(String cidade) { this.cidade = cidade; }

    public String getEstado() { return estado; }
    public void setEstado(String estado) { this.estado = estado; }

    public String getCep() { return cep; }
    public void setCep(String cep) { this.cep = cep; }

    public int getCapacidade() { return capacidade; }
    public void setCapacidade(int capacidade) { this.capacidade = capacidade; }

    public String getStatus() { return status; }
    public void setStatus(String status) { this.status = status; }

    public double getLatitude() { return latitude; }
    public void setLatitude(double latitude) { this.latitude = latitude; }

    public double getLongitude() { return longitude; }
    public void setLongitude(double longitude) { this.longitude = longitude; }

    public String getTelefone() { return telefone; }
    public void setTelefone(String telefone) { this.telefone = telefone; }

    public String getObservacoes() { return observacoes; }
    public void setObservacoes(String observacoes) { this.observacoes = observacoes; }

    public int getIdArea() { return idArea; }
    public void setIdArea(int idArea) { this.idArea = idArea; }

    @Override
    public String toString() {
        return "PostoEvacuacao{" +
                "id=" + id +
                ", nome='" + nome + '\'' +
                ", capacidade=" + capacidade +
                ", status='" + status + '\'' +
                ", cidade='" + cidade + '\'' +
                ", estado='" + estado + '\'' +
                ", cep='" + cep + '\'' +
                ", logradouro='" + logradouro + '\'' +
                ", numero='" + numero + '\'' +
                ", bairro='" + bairro + '\'' +
                ", latitude=" + latitude +
                ", longitude=" + longitude +
                ", telefone='" + telefone + '\'' +
                ", observacoes='" + observacoes + '\'' +    
                ", idArea=" + idArea +
                '}';
    }
}
