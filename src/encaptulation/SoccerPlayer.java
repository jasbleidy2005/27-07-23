package encaptulation;

public class SoccerPlayer {
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNumber_Shirt() {
        return number_Shirt;
    }

    public void setNumber_Shirt(int number_Shirt) {
        this.number_Shirt = number_Shirt;
    }

    public int getGoals_Scored() {
        return goals_Scored;
    }

    public void setGoals_Scored(int goals_Scored) {
        this.goals_Scored = goals_Scored;
    }

    private String name;
    private int number_Shirt;
    private int goals_Scored;
}
