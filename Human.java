interface Human {
    String move();
    void sleep();
}

class James implements Human {
    public String move(){
        return "I can walk";
    }

    public void sleep () {
        System.out.println("I can also sleep");
    }
}




class SuperJames extends James {
   protected int age;

    public String move(){
        return "I can Fly";
    }

    public void setAge(int newAge){
        age = newAge;
    }

    public int getAge(){
        return age;
    }
}




class InterviewMIU {
    public static void main(String[] args) {
        James femalJames = new James();
        James maleJames = new James();
        SuperJames femaleSuperJames = new SuperJames();


        femalJames.move();

        System.out.println(femalJames.move());
        System.out.println(femaleSuperJames.move());
        System.out.println(femaleSuperJames.getAge());

        
    }
}