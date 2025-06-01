package entidades;

public class Rota {
    private int id;
    private String origem;
    private String destino;
    private double distanciaKm;
    private String status;
    private String tipo;
    private int tempoEstimadoMin;
    private int idAreaAfetada;
    private String observacoes;

    public Rota() {
    }

    public Rota(int id, String origem, String destino, double distanciaKm, String status,
                 String tipo, int tempoEstimadoMin, int idAreaAfetada, String observacoes) {
        this.id = id;
        this.origem = origem;
        this.destino = destino;
        this.distanciaKm = distanciaKm;
        this.status = status;
        this.tipo = tipo;
        this.tempoEstimadoMin = tempoEstimadoMin;
        this.idAreaAfetada = idAreaAfetada;
        this.observacoes = observacoes;
    }

    // Getters e setters
    public int getId() { return id; }
    public void setId(int id) { this.id = id; }

    public String getOrigem() { return origem; }
    public void setOrigem(String origem) { this.origem = origem; }

    public String getDestino() { return destino; }
    public void setDestino(String destino) { this.destino = destino; }

    public double getDistanciaKm() { return distanciaKm; }
    public void setDistanciaKm(double distanciaKm) { this.distanciaKm = distanciaKm; }

    public String getStatus() { return status; }
    public void setStatus(String status) { this.status = status; }

    public String getTipo() { return tipo; }
    public void setTipo(String tipo) { this.tipo = tipo; }

    public int getTempoEstimadoMin() { return tempoEstimadoMin; }
    public void setTempoEstimadoMin(int tempoEstimadoMin) { this.tempoEstimadoMin = tempoEstimadoMin; }

    public int getIdAreaAfetada() { return idAreaAfetada; }
    public void setIdAreaAfetada(int idAreaAfetada) { this.idAreaAfetada = idAreaAfetada; }

    public String getObservacoes() { return observacoes; }
    public void setObservacoes(String observacoes) { this.observacoes = observacoes; }

    @Override
    public String toString() {
        return "Rota{" +
                "id=" + id +
                ", origem='" + origem + '\'' +
                ", destino='" + destino + '\'' +
                ", status='" + status + '\'' +
                ", tipo='" + tipo + '\'' +
                ", distanciaKm=" + distanciaKm +
                ", tempoEstimadoMin=" + tempoEstimadoMin +
                ", idAreaAfetada=" + idAreaAfetada +
                ", observacoes='" + observacoes + '\'' +
                '}';
    }
}
