package menu;

import entidades.AreaRisco;
import entidades.Usuario;
import servicos.UsuarioService;
import util.Util;
import servicos.GeocodificacaoService;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MenuPrincipal {
    public static void main(String[] args) {
        UsuarioService usuarioService = new UsuarioService();
        Scanner scanner = new Scanner(System.in);
        int opcao;

        // Criação de áreas de risco fictícias para simulação
        List<AreaRisco> listaAreas = new ArrayList<>();
        listaAreas.add(new AreaRisco(1, "Enchente SP", "Área de enchente no centro de SP",
                "ativo", "enchente", "Atenção: área de risco real",
                -23.55052, -46.633308, 1000));

        listaAreas.add(new AreaRisco(2, "Deslizamento Zona Norte", "Área com risco de deslizamento",
                "ativo", "deslizamento", "Monitoramento constante",
                -23.49712, -46.637817, 800));

        // Criação do serviço de geocodificação simulado
        GeocodificacaoService geocodificacao = new GeocodificacaoService();

        do {
            System.out.println("\n--- MENU PRINCIPAL ---");
            System.out.println("1. Cadastrar usuário");
            System.out.println("2. Listar usuários");
            System.out.println("3. Buscar usuário por ID");
            System.out.println("4. Atualizar usuário");
            System.out.println("5. Excluir usuário");
            System.out.println("0. Sair");
            System.out.print("Escolha uma opção: ");
            opcao = scanner.nextInt();
            scanner.nextLine();

            switch (opcao) {
                case 1:
                    Usuario novoUsuario = new Usuario();

                    String cpf;
                    do {
                        System.out.print("CPF (apenas números): ");
                        cpf = scanner.nextLine();
                        if (!Util.validarCpf(cpf))
                            System.out.println("CPF inválido!");
                    } while (!Util.validarCpf(cpf));
                    novoUsuario.setCpf(Util.formatarCpf(cpf));

                    System.out.print("Nome: ");
                    novoUsuario.setNome(scanner.nextLine());

                    String telefone;
                    do {
                        System.out.print("Telefone (apenas números): ");
                        telefone = scanner.nextLine();
                        if (!Util.validarTelefone(telefone))
                            System.out.println("Telefone inválido!");
                    } while (!Util.validarTelefone(telefone));
                    novoUsuario.setTelefone(Util.formatarTelefone(telefone));

                    String email;
                    do {
                        System.out.print("Email: ");
                        email = scanner.nextLine();
                        if (!Util.validarEmail(email))
                            System.out.println("Email inválido!");
                    } while (!Util.validarEmail(email));
                    novoUsuario.setEmail(email);

                    System.out.print("Logradouro: ");
                    novoUsuario.setLogradouro(scanner.nextLine());

                    System.out.print("Número: ");
                    novoUsuario.setNumero(scanner.nextLine());

                    System.out.print("Bairro: ");
                    novoUsuario.setBairro(scanner.nextLine());

                    System.out.print("Cidade: ");
                    novoUsuario.setCidade(scanner.nextLine());

                    System.out.print("Estado: ");
                    novoUsuario.setEstado(scanner.nextLine());

                    String cep;
                    do {
                        System.out.print("CEP (apenas números): ");
                        cep = scanner.nextLine();
                        if (!Util.validarCep(cep))
                            System.out.println("CEP inválido!");
                    } while (!Util.validarCep(cep));
                    novoUsuario.setCep(Util.formatarCep(cep));

                    // Obter lat/long automaticamente
                    double[] coordenadas = geocodificacao.obterCoordenadas(
                            novoUsuario.getLogradouro(),
                            novoUsuario.getNumero(),
                            novoUsuario.getBairro(),
                            novoUsuario.getCidade(),
                            novoUsuario.getEstado(),
                            novoUsuario.getCep());
                    novoUsuario.setLatitude(coordenadas[0]);
                    novoUsuario.setLongitude(coordenadas[1]);

                    // Determinar tipo de usuário automaticamente
                    String tipo = usuarioService.determinarTipoUsuario(
                            novoUsuario.getLatitude(),
                            novoUsuario.getLongitude(),
                            listaAreas);
                    novoUsuario.setTipo(tipo);

                    System.out.println("Latitude e longitude preenchidas automaticamente: " +
                            coordenadas[0] + ", " + coordenadas[1]);
                    System.out.println("Tipo de usuário atribuído automaticamente: " + tipo);

                    usuarioService.cadastrar(novoUsuario);
                    break;

                case 2:
                    List<Usuario> usuarios = usuarioService.listar();

                    if (usuarios.isEmpty()) {
                        System.out.println("\nNenhum usuário cadastrado.\n");
                    } else {
                        System.out.println("\n=== LISTA DE USUÁRIOS CADASTRADOS ===");
                        for (Usuario u : usuarios) {
                            System.out.println("--------------------------------------------------");
                            System.out.println("ID: " + u.getId());
                            System.out.println("Nome: " + u.getNome());
                            System.out.println("CPF: " + u.getCpf());
                            System.out.println("Email: " + u.getEmail());
                            System.out.println("Telefone: " + u.getTelefone());
                            System.out.println("Tipo: " + u.getTipo());
                            System.out.println(
                                    "Endereço: " + u.getLogradouro() + ", " + u.getNumero() + ", " + u.getBairro());
                            System.out.println("Cidade: " + u.getCidade() + " - " + u.getEstado());
                            System.out.println("CEP: " + u.getCep());
                            System.out.println("Latitude: " + u.getLatitude());
                            System.out.println("Longitude: " + u.getLongitude());
                            System.out.println("--------------------------------------------------\n");
                        }
                    }
                    break;

                case 3:
                    System.out.print("Digite o ID: ");
                    int idBusca = scanner.nextInt();
                    scanner.nextLine();

                    Usuario encontrado = usuarioService.buscarPorId(idBusca);
                    if (encontrado != null) {
                        System.out.println("\n=== USUÁRIO ENCONTRADO ===");
                        System.out.println("--------------------------------------------------");
                        System.out.println("ID: " + encontrado.getId());
                        System.out.println("Nome: " + encontrado.getNome());
                        System.out.println("CPF: " + encontrado.getCpf());
                        System.out.println("Email: " + encontrado.getEmail());
                        System.out.println("Telefone: " + encontrado.getTelefone());
                        System.out.println("Tipo: " + encontrado.getTipo());
                        System.out.println("Endereço: " + encontrado.getLogradouro() + ", " +
                                encontrado.getNumero() + ", " + encontrado.getBairro());
                        System.out.println("Cidade: " + encontrado.getCidade() + " - " + encontrado.getEstado());
                        System.out.println("CEP: " + encontrado.getCep());
                        System.out.println("Latitude: " + encontrado.getLatitude());
                        System.out.println("Longitude: " + encontrado.getLongitude());
                        System.out.println("--------------------------------------------------\n");
                    } else {
                        System.out.println("Usuário não encontrado.");
                    }
                    break;

                case 4:
                    System.out.print("Digite o ID: ");
                    int idAtualizar = scanner.nextInt();
                    scanner.nextLine();
                    Usuario usuario = usuarioService.buscarPorId(idAtualizar);

                    if (usuario != null) {
                        System.out.println("Selecione o dado a atualizar:");
                        System.out.println("1. CPF");
                        System.out.println("2. Nome");
                        System.out.println("3. Telefone");
                        System.out.println("4. Email");
                        System.out.println("5. Tipo");
                        System.out.println("6. Logradouro");
                        System.out.println("7. Número");
                        System.out.println("8. Bairro");
                        System.out.println("9. Cidade");
                        System.out.println("10. Estado");
                        System.out.println("11. CEP");
                        System.out.println("12. Latitude");
                        System.out.println("13. Longitude");
                        int campo = scanner.nextInt();
                        scanner.nextLine();

                        String novoValor;
                        if (campo == 1 || campo == 3 || campo == 11) {
                            do {
                                System.out.print("Novo valor (apenas números): ");
                                novoValor = scanner.nextLine();
                                boolean valido = switch (campo) {
                                    case 1 -> Util.validarCpf(novoValor);
                                    case 3 -> Util.validarTelefone(novoValor);
                                    case 11 -> Util.validarCep(novoValor);
                                    default -> true;
                                };
                                if (!valido)
                                    System.out.println("Formato inválido!");
                            } while (!(switch (campo) {
                                case 1 -> Util.validarCpf(novoValor);
                                case 3 -> Util.validarTelefone(novoValor);
                                case 11 -> Util.validarCep(novoValor);
                                default -> true;
                            }));

                            if (campo == 1)
                                novoValor = Util.formatarCpf(novoValor);
                            if (campo == 3)
                                novoValor = Util.formatarTelefone(novoValor);
                            if (campo == 11)
                                novoValor = Util.formatarCep(novoValor);
                        } else {
                            System.out.print("Novo valor: ");
                            novoValor = scanner.nextLine();
                        }

                        usuarioService.atualizarCampo(idAtualizar, campo, novoValor);
                    } else {
                        System.out.println("Usuário não encontrado!");
                    }
                    break;

                case 5:
                    System.out.print("Digite o ID: ");
                    int idExcluir = scanner.nextInt();
                    scanner.nextLine();
                    usuarioService.excluir(idExcluir);
                    break;

                case 0:
                    System.out.println("Saindo...");
                    break;

                default:
                    System.out.println("Opção inválida!");
            }

        } while (opcao != 0);

        scanner.close();
    }
}
