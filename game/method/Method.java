package game.method;

import java.util.List;
import java.util.Scanner;

import game.character.Player;
import game.town.*;

public class Method {
	
	public void gemPowerCheck(Player maxwell) {

		if (maxwell.getGemPower() < 0) {
			maxwell.setGemPower(0);

		} else if (maxwell.getGemPower() > maxwell.getGemPowerThreshold()) {
			System.out.println("Your gem increased to mutch power, you can't travel anymore. ");
			//metodo para quebrar o codigo
		}
	}

	public void Travel(Player maxwell) {

		if (maxwell.getCoin() >= 1) {
			TownModel ctown = maxwell.getCurrentTown();
			System.out.println("Você está na cidade " + maxwell.getCurrentTown());
            System.out.println("Dinheiro disponível: " + dinheiro);

            // Verificar se existem cidades vizinhas para viajar
            List<Aresta> ligacoes = cidadeAtual.ligacoes;
			System.out.println("Where do you want to go?");

            for (int i = 0; i < (ctown..size(); i++) {
                Aresta aresta = ligacoes.get(i);
                System.out.println((i + 1) + ". Cidade " + aresta.destino.nome + " (Custo: " + aresta.custo + ")");
            }

            // Obter a escolha do jogador
            Scanner scanner = new Scanner(System.in);
            int escolha = scanner.nextInt();

            // Local de conversa com o mercador
            if (escolha < 1 || escolha > ligacoes.size()) {
                System.out.println("Escolha inválida");
                continue;
				
	
			}
			else {
				System.out.println("You have no coins, you can't continue your journey. ");
			//metodo para quebrar o codigo		
			}
        }
	}

}
