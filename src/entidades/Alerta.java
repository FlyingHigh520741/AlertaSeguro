package entidades;

import java.util.Date;

public class Alerta {
    private int id;
    private int idArea;
    private String tipoDesastre;
    private String mensagem;
    private Date dataHora;
    private String nivel;
    private String fonte;

    public Alerta() {
    }

    public Alerta(int id, int idArea, String tipoDesastre, String mensagem,
                   Date dataHora, String nivel, String fonte) {
        this.id = id;
        this.idArea = idArea;
        this.tipoDesastre = tipoDesastre;
        this.mensagem = mensagem;
        this.dataHora = dataHora;
        this.nivel = nivel;
        this.fonte = fonte;
    }

    // Getters e setters
    public int getId() { return id; }
    public void setId(int id) { this.id = id; }

    public int getIdArea() { return idArea; }
    public void setIdArea(int idArea) { this.idArea = idArea; }

    public String getTipoDesastre() { return tipoDesastre; }
    public void setTipoDesastre(String tipoDesastre) { this.tipoDesastre = tipoDesastre; }

    public String getMensagem() { return mensagem; }
    public void setMensagem(String mensagem) { this.mensagem = mensagem; }

    public Date getDataHora() { return dataHora; }
    public void setDataHora(Date dataHora) { this.dataHora = dataHora; }

    public String getNivel() { return nivel; }
    public void setNivel(String nivel) { this.nivel = nivel; }

    public String getFonte() { return fonte; }
    public void setFonte(String fonte) { this.fonte = fonte; }

    @Override
    public String toString() {
        return "Alerta{" +
                "id=" + id +
                ", idArea=" + idArea +
                ", tipoDesastre='" + tipoDesastre + '\'' +
                ", nivel='" + nivel + '\'' +
                ", dataHora=" + dataHora +
                ", mensagem='" + mensagem + '\'' +
                ", fonte='" + fonte + '\'' +
                '}';
    }
}
