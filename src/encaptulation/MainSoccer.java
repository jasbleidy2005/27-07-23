package encaptulation;

public class MainSoccer {
    public static void main(String[] args) {
        SoccerPlayer soccerPlayer = new SoccerPlayer();
        soccerPlayer.setName("Dario");
        soccerPlayer.setGoals_Scored(7);
        soccerPlayer.setNumber_Shirt(12);
        System.out.println(soccerPlayer.getName());
        System.out.println(soccerPlayer.getGoals_Scored());
        System.out.println(soccerPlayer.getNumber_Shirt());
    }
}
