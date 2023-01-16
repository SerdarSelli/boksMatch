public class Fighter {
    String name;
    int damage;
    int health;
    int weight;
    int dodge;

    Fighter(String name, int damage, int health, int weight, int dodge){
        this.name=name;
        this.damage= damage;
        this.health= health;
        this.weight=weight;
        this.dodge=dodge;
    }

    int hit (Fighter dusman){
        System.out.println("------------");
        System.out.println(this.name + " => " + dusman.name + " " +  this.damage + " hasar vurdu.");

        if(isDodge()){
            System.out.println("gelen hasarı savurdu! ");
            return dusman.health;
        }
        if (dusman.health-this.damage<0){
            return 0;
        }
        return dusman.health-this.damage;
    }
    boolean isDodge (){
        double RandomValue= Math.random()*100;
        return  this.dodge>=RandomValue;
    }
}
