package model;

import javax.json.bind.annotation.JsonbDateFormat;
import java.math.BigDecimal;
import java.time.LocalDateTime;

public class Event {
    
    private String scoreId;
    private Action action;
    private BigDecimal value;
    private LocalDateTime dateTime;
    @JsonbDateFormat("dd MMM yyyy 'at' HH:MM")
    private LocalDateTime when;
    
    public String getScoreId() {
        return scoreId;
    }

    public void setScoreId(String scoreId) {
        this.scoreId = scoreId;
    }

    public Action getAction() {
        return action;
    }

    public void setAction(Action action) {
        this.action = action;
    }

    public BigDecimal getValue() {
        return value;
    }

    public void setValue(BigDecimal value) {
        this.value = value;
    }

    public LocalDateTime getDateTime() {
        return dateTime;
    }

    public void setDateTime(LocalDateTime dateTime) {
        this.dateTime = dateTime;
    }

    public LocalDateTime getWhen() {
        return when;
    }

    public void setWhen(LocalDateTime when) {
        this.when = when;
    }
}
