/*
which takes two parameters, in order:
● N: int = number of people in the town
● trust: int [] [] = the trust array, in the form provided above
... and returns the ID of the judge or -1 if no judge is found.
 */



public class Judge {
    /**
     * takes in the number of people in the town and an array,trust,
     * returns the ID of the judge
     * @param N
     * @param trust
     * @return ID
     */
    public int findJudge (int N, int [][] trust){
        int[] judge = new int[N+1];

        for(int i = 0; i< trust.length; i++) {
            judge[trust[i][0]] --;
            judge[trust[i][1]] ++;
        }

        for (int i = 0; i < judge.length; i++) {
            if (judge[i] == N - 1 ) {
                return i ;
            }
        }
        //if no judge is found
        return -1;
    }


    public static void main(String[] args) {
        Judge judge = new Judge();
       //test examples from Table 1 in Lab details
        int test1[][] = {{1,2}};
        int judge1 = judge.findJudge(2,test1);

        int test2[][] = {{1,3},{2,3}};
        int judge2 = judge.findJudge(3,test2);

        int test3[][] = {{1,2},{2,3},{3,1}};
        int judge3 = judge.findJudge(3,test3);

        int test4[][] = {{1,2},{2,3}};
        int judge4 = judge.findJudge(3,test4);

        int test5[][] = {{1,3},{1,4},{2,3},{2,4},{4,3}};
        int judge5 = judge.findJudge(4,test5);

        System.out.println(judge1);
        System.out.println(judge2);
        System.out.println(judge3);
        System.out.println(judge4);
        System.out.println(judge5);

    }
}
