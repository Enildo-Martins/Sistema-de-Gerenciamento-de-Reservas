import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {
        List<Clients> clientes = new ArrayList<>();
        List<Locations> locations = new ArrayList<>();
        List<Reservas_conflitos> reservas_conflitos = new ArrayList<>();

        criarELerClients(clientes);
        System.out.println();
        criarELerLocations(locations);
        System.out.println();
        criarELerReservas(reservas_conflitos);
        System.out.println("\nReservas:");
        exibirRelatorioReservas(clientes, reservas_conflitos);
    }

    public static void criarELerClients(List<Clients> clientes) throws IOException {
        try (BufferedReader br = new BufferedReader(new FileReader("E:\\Arquivos\\Desktop\\Projeto CSV\\CSV\\clients.csv"))) {
            String linha;
            boolean primeiraLinha = true;

            while ((linha = br.readLine()) != null) {
                if (primeiraLinha) {
                    primeiraLinha = false;
                    continue;
                }

                String[] dados = linha.split(",(?=([^\"]*\"[^\"]*\")*[^\"]*$)");

                int id_client = Integer.parseInt(dados[0].trim());
                String nome = dados[1].trim();
                String endereco = dados[2].trim();
                int idade = Integer.parseInt(dados[3].trim());
                String sexo = dados[4].trim();
                String preferenciaDeEstadia = dados[5].trim();

                Clients cliente = new Clients(id_client, nome, endereco, idade, sexo, preferenciaDeEstadia);
                clientes.add(cliente);
            }
        }

       /* for (Clients cliente : clientes) {
            System.out.println("ID: " + cliente.getId_client());
            System.out.println("Nome: " + cliente.getNome());
            System.out.println("Endereço: " + cliente.getEndereco());
            System.out.println("Idade: " + cliente.getIdade());
            System.out.println("Sexo: " + cliente.getSexo());
            System.out.println("Preferência de Estadia: " + cliente.getPreferenciaDeEstadia());
            System.out.println("---------------------------------");
        }*/
    }


    public static void criarELerLocations(List<Locations> locations) throws IOException {
        try (BufferedReader br = new BufferedReader(new FileReader("E:\\Arquivos\\Desktop\\Projeto CSV\\CSV\\locations.csv"))) {
            String linha;
            boolean primeiraLinha = true;

            while ((linha = br.readLine()) != null) {
                if (primeiraLinha) {
                    primeiraLinha = false;
                    continue;
                }

                String[] dados = linha.split(",(?=([^\"]*\"[^\"]*\")*[^\"]*$)");

                int id_location = Integer.parseInt(dados[0].trim());
                String tipoDeLocal = dados[1].trim();
                String pontosDeReferencia = dados[2].trim();
                int quantidadeDeQuartos = Integer.parseInt(dados[3].trim());
                int quantidadeDeBanheiros = Integer.parseInt(dados[4].trim());
                String bairro = dados[5].trim();
                String rua = dados[6].trim();
                int quadra = Integer.parseInt(dados[7].trim());
                int lote = Integer.parseInt(dados[8].trim());
                int numero = Integer.parseInt(dados[9].trim());
                int quantidadeMaximaDeHospedes = Integer.parseInt(dados[10].trim());
                int quantidadeDeCamas = Integer.parseInt(dados[11].trim());
                int quantidadeDeRecomendacoes = Integer.parseInt(dados[12].trim());

                Locations location = new Locations(id_location, tipoDeLocal, pontosDeReferencia, quantidadeDeQuartos,
                        quantidadeDeBanheiros, bairro, rua, quadra, lote, numero, quantidadeMaximaDeHospedes,
                        quantidadeDeCamas, quantidadeDeRecomendacoes);

                locations.add(location);
            }
        }

        /*for (Locations location : locations) {
            System.out.println("ID: " + location.getId_location());
            System.out.println("Tipo de Local: " + location.getTipoDeLocal());
            System.out.println("Pontos de Referência: " + location.getPontosDeReferencia());
            System.out.println("Quantidade de Quartos: " + location.getQuantidadeDeQuartos());
            System.out.println("Quantidade de Banheiros: " + location.getQuantidadeDeBanheiros());
            System.out.println("Bairro: " + location.getBairro());
            System.out.println("Rua: " + location.getRua());
            System.out.println("Quadra: " + location.getQuadra());
            System.out.println("Lote: " + location.getLote());
            System.out.println("Número: " + location.getNumero());
            System.out.println("Quantidade Máxima de Hóspedes: " + location.getQuantidadeMaximaDeHospedes());
            System.out.println("Quantidade de Camas: " + location.getQuantidadeDeCamas());
            System.out.println("Quantidade de Recomendações: " + location.getQuantidadeDeRecomendacoes());
            System.out.println("---------------------------------");
        }*/
    }


    public static void criarELerReservas(List<Reservas_conflitos> reservas_conflitos) throws IOException {
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");  // Ajuste o formato de data conforme necessário
        SimpleDateFormat outputFormat = new SimpleDateFormat("yyyy-MM-dd");

        try (BufferedReader br = new BufferedReader(new FileReader("E:\\Arquivos\\Desktop\\Projeto CSV\\CSV\\reservas_conflitos.csv"))) {
            String linha;
            boolean primeiraLinha = true;

            while ((linha = br.readLine()) != null) {
                if (primeiraLinha) {
                    primeiraLinha = false;
                    continue;
                }

                String[] dados = linha.split(",(?=([^\"]*\"[^\"]*\")*[^\"]*$)");

                int id_reserva = Integer.parseInt(dados[0].trim());
                int id_client = Integer.parseInt(dados[1].trim());
                int id_location = Integer.parseInt(dados[2].trim());
                Date data_check_in = null;
                Date data_check_out = null;

                try {
                    data_check_in = dateFormat.parse(dados[3].trim());
                    data_check_out = dateFormat.parse(dados[4].trim());
                } catch (ParseException e) {
                    e.printStackTrace();
                }

                Reservas_conflitos reserva_conflito = new Reservas_conflitos(id_reserva, id_client, id_location, data_check_in, data_check_out);

                reservas_conflitos.add(reserva_conflito);
            }
        }

        /*for (Reservas_conflitos reserva_conflito : reservas_conflitos) {
            System.out.println("ID da Reserva: " + reserva_conflito.getId_reserva());
            System.out.println("ID do Cliente: " + reserva_conflito.getId_client());
            System.out.println("ID do Local: " + reserva_conflito.getId_location());
            System.out.println("Data de Check-in: " + outputFormat.format(reserva_conflito.getData_check_in()));
            System.out.println("Data de Check-out: " + outputFormat.format(reserva_conflito.getData_check_out()));
            System.out.println("---------------------------------");
        } */
    }

    public static void exibirRelatorioReservas(List<Clients> clientes, List<Reservas_conflitos> reservas_conflitos) {
        SimpleDateFormat outputFormat = new SimpleDateFormat("yyyy-MM-dd");

        // Lista para acompanhar as reservas que já foram processadas
        List<Reservas_conflitos> reservasProcessadas = new ArrayList<>();

        for (Reservas_conflitos reserva : reservas_conflitos) {
            Clients cliente = clientes.stream()
                    .filter(c -> c.getId_client() == reserva.getId_client())
                    .findFirst()
                    .orElse(null);

            String status = "Reservado";
            String motivo = "";

            // Verifica se há conflito de reservas com as que já foram processadas
            for (Reservas_conflitos reservaProcessada : reservasProcessadas) {
                if (reserva.getId_location() == reservaProcessada.getId_location()) {
                    if ((reserva.getData_check_in().before(reservaProcessada.getData_check_out()) && reserva.getData_check_in().after(reservaProcessada.getData_check_in())) ||
                            (reserva.getData_check_out().after(reservaProcessada.getData_check_in()) && reserva.getData_check_out().before(reservaProcessada.getData_check_out())) ||
                            reserva.getData_check_in().equals(reservaProcessada.getData_check_in()) ||
                            reserva.getData_check_out().equals(reservaProcessada.getData_check_out())) {

                        status = "Não Reservado";
                        motivo = "Conflito de reserva com ID: " + reservaProcessada.getId_reserva();
                        break;
                    }
                }
            }

            // Adiciona a reserva atual na lista de reservas processadas
            reservasProcessadas.add(reserva);

            System.out.println("Nome do Cliente: " + (cliente != null ? cliente.getNome() : "Cliente não encontrado"));
            System.out.println("ID da Reserva: " + reserva.getId_reserva());
            System.out.println("Data de Check-in: " + outputFormat.format(reserva.getData_check_in()));
            System.out.println("Data de Check-out: " + outputFormat.format(reserva.getData_check_out()));
            System.out.println("Status da Reserva: " + status);
            if (!motivo.isEmpty()) {
                System.out.println("Motivo: " + motivo);
            }
            System.out.println("---------------------------------");
        }
    }

}