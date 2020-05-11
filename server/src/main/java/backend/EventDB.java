package backend;


import model.Event;

import javax.enterprise.context.ApplicationScoped;
import java.util.List;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;

@ApplicationScoped
public class EventDB {
    private final Logger log = Logger.getLogger(EventDB.class.getName());
    
    private Map<String,List<Event>> eventDatabase = Database.getEventsSchema();
    
    public List<Event> getEvents(String id){
        log.log(Level.SEVERE, "======= Getting events [{0}] =======", id);
        return eventDatabase.get(id);
    }
}