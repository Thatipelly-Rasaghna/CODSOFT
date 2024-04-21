import java.util.*;
class Gradecalculator{
    public static void main(String[] args) {
       int sub1,sub2,sub3,sub4,totalmarks, totalsub=4;
       double averagepercent;
       String grade;
       Scanner r=new Scanner(System.in);
      System.out.println("enter subject 1 marks");
      sub1=r.nextInt();
      System.out.println("enter subject 2 marks");
      sub2=r.nextInt();
      System.out.println("enter subject 3 marks");
      sub3=r.nextInt();
      System.out.println("enter subject 4 marks");
      sub4=r.nextInt();
      totalmarks=sub1+sub2+sub3+sub4;
      averagepercent=(totalmarks/(totalsub*100.0)*100);
      if(averagepercent>=90){
          grade="A";
      }else if(averagepercent>=80){
          grade="B";
      }else if(averagepercent>=70){
          grade="c";
      }else if(averagepercent>=60){
          grade="D";
      }else{
        grade="fail";
      }
      System.out.println("Dispaying total marks,average percentage,grade");
    System.out.println("TOTAL MARKS:"+totalmarks);
    System.out.println("AVERAGE PERCENTAGE:"+averagepercent);
    System.out.println("GRADE:"+grade);
    }
}