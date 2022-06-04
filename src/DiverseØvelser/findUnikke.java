package DiverseØvelser;

public class findUnikke {
    String[] ord = new String[8];

    public int find(){
        ord[0] = "what";
        ord[1] = "hello";
        ord[2] = "what";
        ord[3] = "bye";
        ord[4] = "what";
        ord[5] = "no";
        ord[6] = "tis";
        ord[7] = "what";
        int number = 1;
        for (int i = 1; i < ord.length; i++)
        {
            int j = 0;
            for (j = 0; j < i; j++)
                if(ord[i] == ord[j])
                    break;
                if(i == j)
                number++;

        }
        return number;
    }
    public static void main(String[] args){
        findUnikke findUnikke = new findUnikke();
        System.out.println(findUnikke.find());
    }
}
