package lesson11.blackjack;

import java.util.ArrayList;

public class BlackJack implements IBlackJack{
    private Koloda koloda = new Koloda();
    private ArrayList<IPlayer> players = new ArrayList<>();

    @Override
    public void addPlayer(IPlayer player) {
        players.add(player);
    }

    @Override
    public void dealTwoCards() {
        for(IPlayer player: players){
            player.addCardToHand(koloda.getRandomCard());
            player.addCardToHand(koloda.getRandomCard());
        }
    }

    @Override
    public void dealAllCards() {
        for(IPlayer player: players){
            while (player.needMoreCards()){ // полиморфизм
                player.addCardToHand(koloda.getRandomCard());
            }
        }
    }

    @Override
    public void printWinner() {
        // 21     21     34    19    18  // 21   21
        // 19     22     34    19    18  // 19   19
        // 19     20     34    19    18  // 20
        // 23     25     34    22    24  // крупье  !!!

        // устанавливаем флан НЕ В ИГРЕ, всем у кого перебор
        for(IPlayer player: players){
            if(player.countValuesHand() > 21){
                player.setInGame(false);
            }
        }

        // если у всех перебор, выиграл крупье
        if(countPlayersInGame() == 0){
            for(IPlayer player: players){
                if(player instanceof Dealer){
                    System.out.println("----- ПОБЕДИТЕЛЬ " + player.getName());
                    player.openHand();
                }
            }
        }

        // узнаем какое число выигрышное

        // 23   34   18   19   20
        int winnerValue = 0;
        for(IPlayer player: players){
            if(player.isInGame() && player.countValuesHand() > winnerValue){
                winnerValue = player.countValuesHand();
            }
        }

        // печатаем победителей
        for(IPlayer player: players){
            if(player.isInGame() && player.countValuesHand() == winnerValue){
                System.out.println("----- ПОБЕДИТЕЛЬ " + player.getName());
                player.openHand();
            }
        }


    }

    public int countPlayersInGame(){
        int count = 0;
        for(IPlayer player: players){
            if(player.isInGame()){
                count++;
            }
        }
        return count;
    }
}
