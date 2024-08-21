package apnacollegeclass.com;

public class gettersAndSetters {
  static class MyEmployee {
        private int id;
        private String name;

        public String getName() {
            return name;
        }
        public void setName(String n) {
            name = n;
        }
        public void setId(int i) {
            id = i;
        }
        public int getId() {
            return id;
        }
    }

    public static void main(String[] args) {
        MyEmployee krish = new MyEmployee();
        krish.setName("krishnendu mandal");
        System.out.println(krish.getName());

    }
}
