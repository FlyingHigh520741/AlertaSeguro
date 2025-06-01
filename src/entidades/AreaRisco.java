package entidades;

public class AreaRisco {
    private int id;
    private String nome;
    private String descricao;
    private String status;
    private String tipoDesastre;
    private String observacoes;
    private double latitude;
    private double longitude;
    private int raioMetros;

    public AreaRisco() {
    }

    public AreaRisco(int id, String nome, String descricao, String status, String tipoDesastre, String observacoes,
                      double latitude, double longitude, int raioMetros) {
        this.id = id;
        this.nome = nome;
        this.descricao = descricao;
        this.status = status;
        this.tipoDesastre = tipoDesastre;
        this.observacoes = observacoes;
        this.latitude = latitude;
        this.longitude = longitude;
        this.raioMetros = raioMetros;
    }

    public int getId() { return id; }
    public void setId(int id) { this.id = id; }

    public String getNome() { return nome; }
    public void setNome(String nome) { this.nome = nome; }

    public String getDescricao() { return descricao; }
    public void setDescricao(String descricao) { this.descricao = descricao; }

    public String getStatus() { return status; }
    public void setStatus(String status) { this.status = status; }

    public String getTipoDesastre() { return tipoDesastre; }
    public void setTipoDesastre(String tipoDesastre) { this.tipoDesastre = tipoDesastre; }

    public String getObservacoes() { return observacoes; }
    public void setObservacoes(String observacoes) { this.observacoes = observacoes; }

    public double getLatitude() { return latitude; }
    public void setLatitude(double latitude) { this.latitude = latitude; }

    public double getLongitude() { return longitude; }
    public void setLongitude(double longitude) { this.longitude = longitude; }

    public int getRaioMetros() { return raioMetros; }
    public void setRaioMetros(int raioMetros) { this.raioMetros = raioMetros; }

    @Override
    public String toString() {
        return "AreaRisco{" +
                "id=" + id +
                ", nome='" + nome + '\'' +
                ", tipoDesastre='" + tipoDesastre + '\'' +
                ", status='" + status + '\'' +
                ", latitude=" + latitude +
                ", longitude=" + longitude +
                ", raioMetros=" + raioMetros +
                ", descricao='" + descricao + '\'' +
                ", observacoes='" + observacoes + '\'' +
                '}';
    }
}
