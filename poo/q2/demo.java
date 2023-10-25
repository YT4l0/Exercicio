package q2;

public class demo {

    
        public static void main(String[] args) {
            Agenda minhaAgenda = new Agenda();
    
            minhaAgenda.adicionarCompromisso(9, 25, 10, 2023, "Reunião de trabalho");
            minhaAgenda.adicionarCompromisso(14, 25, 10, 2023, "Almoço com amigo");
            minhaAgenda.adicionarCompromisso(16, 26, 10, 2023, "Comprar mantimentos");
    
            System.out.println("Compromissos no dia 25/10/2023:");
            minhaAgenda.listarCompromissosNoDia(25, 10, 2023);
        }

    
}
