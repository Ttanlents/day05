package day04;

public class PrintArrutils {
    // T E V
    public static String printArray(Object[] objects){
        int count=0;
        StringBuilder sb=new StringBuilder();
        sb.append("[");
        for (Object ob:objects){
            count++;
            if (count==objects.length-1){
                sb.append(ob+"]");
                break;
            }
            sb.append(ob+",");
        }
        return sb.toString();
    }
}
