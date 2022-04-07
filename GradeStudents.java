import java.util.*;

class GradeStudents {

    public static List<Integer> gradingStudents(List<Integer> grades) {//class method
    // Write your code here
        List<Integer> finalGrades=new ArrayList<Integer>();
        for(int i=0; i < grades.size(); i++){
            System.out.println("The value: "+grades.get(i));
            if(grades.get(i) < 38){//it is a fail and should not be rounded
                System.out.println(grades.get(i));
                finalGrades.add(grades.get(i));
            }
            else if(grades.get(i) >=38){//all numbers >=38 can be rounded
                int div=grades.get(i)/5;//the current multiple of 5
                int nextDiv=(div+1)*5;//the multiple in front of this one
                System.out.println("5 times: "+div);
                System.out.println("Next Div of 5: "+nextDiv);
                if(nextDiv-grades.get(i) < 3){
                    //round the current up to the next div
                    finalGrades.add(nextDiv);
                }
                else if(nextDiv-grades.get(i) >= 3){
                    //do not round up if diff is greater / equal to 3
                    finalGrades.add(grades.get(i));//instead add its current
                }
            }
        }
        return finalGrades;
    }

}
