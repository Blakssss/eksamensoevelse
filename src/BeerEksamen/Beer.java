package BeerEksamen;

public class Beer {
    String name;
    int alcoholPercentage;
    int price;

    Beer(String name, int alcoholPercentage, int price){
        this.name=name;
        this.alcoholPercentage=alcoholPercentage;
        this.price=price;
    }

    public void setAlcoholPercentage(int alcoholPercentage) throws Exception {
        if(alcoholPercentage > 100 || alcoholPercentage < 0){
            throw new Exception();
        }
        this.alcoholPercentage=alcoholPercentage;
    }
    public void setPrice(int price) throws Exception {
        if(price < 0){
            throw new Exception();
        }
        this.price=price;
    }
    public static void main(String[] args){
        Beer beer1 = new Beer("Tuborg",10,20);
        Beer beer2 = new Beer("Carlsberg",11,10);
        Beer[] beers = new Beer[2];
        beers[0] = beer1;
        beers[1] = beer2;
        int samletPris = 0;

        for(int i = 0; i < beers.length; i++){
            samletPris = samletPris + beers[i].price;
            samletPris = samletPris/beers.length;
        }
        System.out.println(samletPris);

    }
}
