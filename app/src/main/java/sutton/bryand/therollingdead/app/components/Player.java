package sutton.bryand.therollingdead.app.components;

/**
 * Created by Bryan on 6/2/2014.
 */
public class Player {

    private String _name = "Player";
    private int _currentScore = 0;
    private int _totalScore = 0;


    public boolean setName(String name){
        this._name = name;
        return true;
    }

    public int brain(){
        _currentScore++;
        return _currentScore;
    }

    public int setScore(){
        _totalScore += _currentScore;
        return _totalScore;
    }
}
