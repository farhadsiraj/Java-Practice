public class MathOperations {
    public static void main(String[] args) {
        int bagOfSweets1 = 5;
        int bagOfSweets2 = 10;

        long starsInMilkyWay = 2500000000L;
        long starsInAndromeda = 1000000000000L;

        double testScore = 6.7;
        double bonusMarks = 2.5;

        // Java performs operations left to right so to make sure math operations are
        // done correctly wrap them in parenthesis.
        System.out.println("Fred and George collected " + (bagOfSweets1 + bagOfSweets2) + " sweets");
        System.out.println("There are " + (starsInAndromeda + starsInMilkyWay)
                + " stars in the Milky Way and Andromeda galaxies.");
        System.out.println("With bonus marks, Ron scored " + (testScore + bonusMarks)
                + "/ 10 on his potions test. Snape wasn't too thrilled.");

        System.out.println("Subtraction");
        System.out.println(bagOfSweets2 - bagOfSweets1);
        System.out.println(starsInAndromeda - starsInMilkyWay);
        System.out.println(testScore - bonusMarks);

        System.out.println("Multiplication");
        System.out.println(bagOfSweets2 * bagOfSweets1);

        // This will not work because it is out of range for long. Java will just return
        // a random number instead.
        // System.out.println(starsInAndromeda * starsInMilkyWay);

        System.out.println(testScore * bonusMarks);

        System.out.println("Division");
        System.out.println(bagOfSweets2 / bagOfSweets1);
        System.out.println(starsInAndromeda / starsInMilkyWay);
        System.out.println(testScore / bonusMarks);

        System.out.println("Modulus");
        System.out.println(10 % 2);
        System.out.println(5 % 2);

        System.out.println("Increment");
        int counter = 0;
        counter++;
        counter++;
        counter++;
        System.out.println(counter);

        System.out.println("Decrement");
        counter = 0;
        counter--;
        counter--;
        counter--;
        System.out.println(counter);

    }
}

// Fred and George collected <result> sweets
// There are <result> stars in the Milky Way and Andromeda galaxies.
// With bonus marks, Ron scored <result>/10 on his potions test. Snape wasn't
// too thrilled

// Fred has <result> more sweets than George
// The Andromeda Galaxy has <result> more stars than the Milky Way
// Snape ended up removing marks. Ron actually scored <result> on his potions
// test

// Fred and George used a special spell to multiply their sweets to: <result>
// Snape made an error on his excel, accidentally multiplying Ron's score to:
// <result>/10

// Originally, Fred had <result> times more sweets than George
// Andromeda has <result> times more stars
// Snape caught the error. Furious, he divided Ron's score to: <result>