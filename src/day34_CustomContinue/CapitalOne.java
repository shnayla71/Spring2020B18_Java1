package day34_CustomContinue;

public class CapitalOne {
    public static void main(String[] args) {
        Tester tester1=new Tester();
        tester1.setTesterInfo("muhtar",234,"Manual tester",70000);

        ScrumTeam scrum=new ScrumTeam();
          scrum.hireTester(tester1);

        System.out.println(scrum.testersTeam.size());

        scrum.fireTester(234);
        System.out.println(scrum.testersTeam.size());

    }

}
