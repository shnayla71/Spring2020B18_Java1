package day21_MultiDimential;

public class ScrumTeam {
    public static void main(String[] args) {
     String[] DevTeam={"zeynep","haider","jpovid","muhtar"};
     String[] Testers={"rahman","aishan","osman","ali"};
     String[] PO={"BARZY","DONALD"};
     String[] TestersTeam={"ilham","zarina","asiman"};
     String[][] ScrumTeam={DevTeam,Testers,PO};
                      //    0        1
      ScrumTeam[1]=TestersTeam;
        ScrumTeam[0][3] = "jean";
      System.out.println(ScrumTeam[0][3]);

      String info=ScrumTeam[1][2];
      System.out.println(info);


      for(String eachDev:ScrumTeam[0]){
          System.out.println(eachDev);
      }





    }
}
