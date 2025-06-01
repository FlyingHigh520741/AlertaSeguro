package entidades;

public class Usuario {
    private int id;
    private String cpf;
    private String nome;
    private String telefone;
    private String email;
    private String tipo;
    private String logradouro;
    private String numero;
    private String bairro;
    private String cidade;
    private String estado;
    private String cep;
    private double latitude;
    private double longitude;

    // Construtor padrão
    public Usuario() {
    }

    // Construtor completo
    public Usuario(int id, String cpf, String nome, String telefone, String email, String tipo,
                    String logradouro, String numero, String bairro, String cidade, String estado, String cep,
                    double latitude, double longitude) {
        this.id = id;
        this.cpf = cpf;
        this.nome = nome;
        this.telefone = telefone;
        this.email = email;
        this.tipo = tipo;
        this.logradouro = logradouro;
        this.numero = numero;
        this.bairro = bairro;
        this.cidade = cidade;
        this.estado = estado;
        this.cep = cep;
        this.latitude = latitude;
        this.longitude = longitude;
    }

    // Getters e Setters 
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public String getTipo() {
        return tipo;
    }
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    public String getTelefone() {
        return telefone;
    }
    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }
    public String getLogradouro() {
        return logradouro;
    }
    public void setLogradouro(String logradouro) {
        this.logradouro = logradouro;
    }
    public String getNumero() {
        return numero;
    }
    public void setNumero(String numero) {
        this.numero = numero;
    }
    public String getBairro() {
        return bairro;
    }
    public void setBairro(String bairro) {
        this.bairro = bairro;
    }
    public String getCidade() {
        return cidade;
    }
    public void setCidade(String cidade) {
        this.cidade = cidade;
    }
    public String getEstado() {
        return estado;
    }
    public void setEstado(String estado) {
        this.estado = estado;
    }
    public String getCep() {
        return cep;
    }
    public void setCep(String cep) {
        this.cep = cep;
    }
    public double getLatitude() {
        return latitude;
    }
    public void setLatitude(double latitude) {
        this.latitude = latitude;
    }
    public double getLongitude() {
        return longitude;
    }
    public void setLongitude(double longitude) {
        this.longitude = longitude;
    }
    // Método toString para facilitar a visualização do objeto


    @Override
    public String toString() {
    return "Usuario{" +
            "id=" + id +
            ", nome='" + nome + '\'' +
            ", cpf='" + cpf + '\'' +
            ", telefone='" + telefone + '\'' +
            ", email='" + email + '\'' +
            ", tipo='" + tipo + '\'' +
            ", logradouro='" + logradouro + '\'' +
            ", numero='" + numero + '\'' +
            ", bairro='" + bairro + '\'' +
            ", cidade='" + cidade + '\'' +
            ", estado='" + estado + '\'' +
            ", cep='" + cep + '\'' +
            ", latitude=" + latitude +
            ", longitude=" + longitude +
            '}';
}
}
