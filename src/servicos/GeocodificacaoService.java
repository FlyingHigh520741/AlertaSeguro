package servicos;

public class GeocodificacaoService {

    // Método simulado que retorna latitude e longitude fictícias
    public double[] obterCoordenadas(String logradouro, String numero, String bairro,
                                     String cidade, String estado, String cep) {
        // 🚀 Aqui você pode usar dados fictícios ou um "mock"
        // Exemplo: sempre retornando coordenadas de São Paulo, SP
        double latitude = -23.55052;
        double longitude = -46.633308;
        return new double[]{latitude, longitude};
    }
}
