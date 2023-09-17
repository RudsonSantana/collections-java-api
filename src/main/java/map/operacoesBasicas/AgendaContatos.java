package main.java.map.operacoesBasicas;

import java.util.HashMap;
import java.util.Map;

public class AgendaContatos {
    private Map<String, Integer> agendaContatoMap;

    public AgendaContatos() {
        this.agendaContatoMap = new HashMap<>();
    }

    public void adicionarContato(String nome, Integer telefone) {
        agendaContatoMap.put(nome, telefone);
    }

    public void removerContato(String nome) {
        if (!agendaContatoMap.isEmpty()) {
            agendaContatoMap.remove(nome);
        }
    }

    public void exibirContatos() {
        System.out.println(agendaContatoMap);
    }

    public Integer pesquisarPorNome(String nome) {
        Integer numeroPorNome = null;
        if(!agendaContatoMap.isEmpty()) {
            numeroPorNome = agendaContatoMap.get(nome);
        }
        return numeroPorNome;
    }

    public static void main(String[] args) {
        AgendaContatos agendaContatos = new AgendaContatos();

        agendaContatos.adicionarContato("Rudson", 5678);
        agendaContatos.adicionarContato("Rudson", 1234);
        agendaContatos.adicionarContato("Rudson Sant", 111111);
        agendaContatos.adicionarContato("Raynara", 4235);
        agendaContatos.adicionarContato("Malu", 111111);
        agendaContatos.adicionarContato("Rudson", 55555);

        agendaContatos.exibirContatos();

//        agendaContatos.removerContato("Malu");
//        agendaContatos.exibirContatos();
    }
}
