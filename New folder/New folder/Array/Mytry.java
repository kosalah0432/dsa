public class Mytry{

    private static int maxSize=50;
    int[] studentNumber;
    String[] studentName;
    int count;

    public Mytry(){
        studentNumber=new int[maxSize];
        studentName=new String[maxSize];
        count=0;
    }

    public void insertDetails(int regNo,String name){
        if(count<maxSize){
            studentNumber[count]=regNo;
            studentName[count]=name;
            count++;
            System.out.println("inserted successfully!!");
        }
        else{
            System.out.println("database full");
        }
    }

    public void check(int regNo){
        for(int i=0;i<count;i++){
            if(studentNumber[i]==regNo){
                System.out.println("Student found");
                return;
            }
        }
        System.out.println("not found!");
    }
    public void delete(int regno){
        for(int i=0;i<count;i++){
            if(studentNumber[i]==regno){
                studentName[i]=studentName[count-1];
                studentNumber[i]=studentNumber[count-1];
                count--;
                return;
            }
        }
    }
    public static void main(String[] args) {
        Mytry m=new Mytry();

        m.insertDetails(111, "Zorro");
        System.out.println(m.studentNumber[0] +" " +m.studentName[0]);
    }
}
