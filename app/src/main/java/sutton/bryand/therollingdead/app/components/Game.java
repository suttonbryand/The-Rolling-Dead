package sutton.bryand.therollingdead.app.components;

import java.util.ArrayList;

/**
 * Created by Bryan on 6/2/2014.
 */
public class Game {

    private ArrayList<Player> _players = new ArrayList<Player>();
    private int _currentPlayer = 0;
    private int _round = 0;

    public Player currentPlayer(){
        return _players.get(_currentPlayer);
    }

    public boolean nextTurn(){
        if(_currentPlayer >= _players.size() - 1){
            return false;
        }
        _currentPlayer++;
        return true;
    }

    public void newRound(){
        _currentPlayer = 0;
        _round++;
    }

    public void start(){
        _round = 0;
        newRound();
    }

    public void addPlayer(){
        _players.add(new Player());
    }
}
