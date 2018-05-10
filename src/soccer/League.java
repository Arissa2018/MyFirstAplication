package soccer;

public class League {
    public static void main(String[] args) {
        Player player1=new Player();
        player1.Player_name="Arti Mihai";
        Player player2=new Player();
        player2.Player_name="Asco Liam";
        Player player3=new Player();
        player3.Player_name="Anton Ion";
        Player player4=new Player();
        player4.Player_name="Alto Petru";
        Player player5=new Player();
        player5.Player_name="Alond Alond";
        Player player6=new Player();
        player6.Player_name="Atre Ion";

        Team team1=new Team();
        team1.Team_name="Ashii";
        team1.players=new Player[3];
        team1.players[0]=player4;
        team1.players[1]=player5;
        team1.players[2]=player6;

        Team team2=new Team();
        team2.Team_name="Asw";
        team2.players=new Player[3];
        team2.players[0]=player1;
        team2.players[1]=player2;
        team2.players[2]=player3;

        Goal goal1=new Goal();
        goal1.player=player3;
        goal1.team=team2;
        goal1.time=12.10;


        Goal goal2=new Goal();
        goal2.player=player6;
        goal2.team=team1;
        goal2.time=12.18;

        Goal goal3=new Goal();
        goal3.player=player1;
        goal3.team=team2;
        goal3.time=14.05;

        Goal[] scoredGoals={goal1,goal2,goal3};


        Game game=new Game();
        game.home_team=team1;
        game.away_team=team2;
        game.goals=scoredGoals;

        System.out.println(team1.Team_name+":");

        for (Player player:team1.players) {

            System.out.println(player.Player_name);}
        System.out.println(team2.Team_name+":");

        for (int i=0;i<team2.players.length;i++){
            System.out.println(team2.players[i].Player_name);
        }
        System.out.println("Goals:");

        for(Goal goals:game.goals){
            System.out.println("Goal scored after"+ goals.time+"mins by"+ goals.player.Player_name+"of the"+ goals.team.Team_name);


        }
    }
}
