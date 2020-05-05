package day34_CustomContinue;

import java.util.ArrayList;

public class ScrumTeam {
    ArrayList<Tester> testersTeam=new ArrayList<>();

 public void hireTester(Tester tester){
     testersTeam.add(tester);
 }
 public void fireTester(long employeeid){
     testersTeam.removeIf(p->p.employeeId==employeeid);
 }
}
