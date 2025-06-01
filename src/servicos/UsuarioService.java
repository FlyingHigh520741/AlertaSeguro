package servicos;

import entidades.AreaRisco;
import entidades.Usuario;
import java.util.ArrayList;
import java.util.List;

public class UsuarioService {
    private List<Usuario> listaUsuarios = new ArrayList<>();
    private int proximoId = 1;

    public void cadastrar(Usuario usuario) {
        usuario.setId(proximoId++);
        listaUsuarios.add(usuario);
        System.out.println("Usuário cadastrado com sucesso! ID: " + usuario.getId());
    }

    public List<Usuario> listar() {
        return listaUsuarios;
    }

    public Usuario buscarPorId(int id) {
        for (Usuario u : listaUsuarios) {
            if (u.getId() == id) return u;
        }
        return null;
    }

    public void atualizarCampo(int id, int opcao, String novoValor) {
        Usuario usuario = buscarPorId(id);
        if (usuario != null) {
            switch (opcao) {
                case 1 -> usuario.setCpf(novoValor);
                case 2 -> usuario.setNome(novoValor);
                case 3 -> usuario.setTelefone(novoValor);
                case 4 -> usuario.setEmail(novoValor);
                case 5 -> usuario.setTipo(novoValor);
                case 6 -> usuario.setLogradouro(novoValor);
                case 7 -> usuario.setNumero(novoValor);
                case 8 -> usuario.setBairro(novoValor);
                case 9 -> usuario.setCidade(novoValor);
                case 10 -> usuario.setEstado(novoValor);
                case 11 -> usuario.setCep(novoValor);
                case 12 -> usuario.setLatitude(Double.parseDouble(novoValor));
                case 13 -> usuario.setLongitude(Double.parseDouble(novoValor));
            }
            System.out.println("Dado atualizado com sucesso!");
        } else {
            System.out.println("Usuário não encontrado!");
        }
    }

    public void excluir(int id) {
        listaUsuarios.removeIf(u -> u.getId() == id);
        System.out.println("Usuário excluído!");
    }

    // 🌟 Novo método para determinar o tipo do usuário baseado na localização
    public String determinarTipoUsuario(double latitude, double longitude, List<AreaRisco> areas) {
        for (AreaRisco area : areas) {
            double distancia = calcularDistancia(latitude, longitude, area.getLatitude(), area.getLongitude());
            if (distancia <= area.getRaioMetros()) {
                return "Dentro da área de risco";
            }
        }
        return "Fora da área de risco";
    }

    private double calcularDistancia(double lat1, double lon1, double lat2, double lon2) {
        // Fórmula simplificada para a distância em metros (não é exata como Haversine, mas serve para o protótipo!)
        return Math.sqrt(Math.pow(lat1 - lat2, 2) + Math.pow(lon1 - lon2, 2)) * 111139;
    }
}
