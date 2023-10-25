package q2;

import java.util.ArrayList;

public class Agenda {
    private ArrayList<EntradaEmAgenda> compromissos;

    public Agenda() {
        compromissos = new ArrayList<>();
    }

    public void adicionarCompromisso(int hora, int dia, int mes, int ano, String assunto) {
        EntradaEmAgenda entrada = new EntradaEmAgenda(hora, dia, mes, ano, assunto);
        compromissos.add(entrada);
    }

    public void listarCompromissosNoDia(int dia, int mes, int ano) {
        for (EntradaEmAgenda entrada : compromissos) {
            if (entrada.ehNoDia(dia, mes, ano)) {
                System.out.println(entrada.toString());
            }
        }
    }
}
