package backend;


import model.Score;
import model.ScoreType;

import javax.enterprise.context.ApplicationScoped;
import java.util.List;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;

@ApplicationScoped
public class ScoreDB {
    private final Logger log = Logger.getLogger(ScoreDB.class.getName());
    
    private Map<String,List<Score>> scoreDatabase = Database.getScoresSchema();
    
    public List<Score> getScores(String idNumber){
        log.log(Level.SEVERE, "======= Getting scores [{0}] =======", idNumber);
        return scoreDatabase.get(idNumber);
    }
    
    public Score getScore(ScoreType type, String idNumber){
        List<Score> scores = getScores(idNumber);
        for(Score score:scores){
            if(score.getName().equals(type))return score;
        }
        return null;
    }
}