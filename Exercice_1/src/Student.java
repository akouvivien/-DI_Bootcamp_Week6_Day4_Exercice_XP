
public class Student {

   public String name ;
   public  int roll_no ;

    public Student() {
        super();
    }

    public Student(String name, int roll_no) {
        super();
        this.name = name;
        this.roll_no = roll_no;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getRoll_no() {
        return this.roll_no;
    }

    public void setRoll_no(int roll_no) {
        this.roll_no = roll_no;
    }
    @Override
    public String toString() {
        return " name "+this.name+" roll_no "+this.roll_no;
                    
    }
   
}