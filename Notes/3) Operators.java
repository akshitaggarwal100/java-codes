class Operators {
    public static void main(String[] args) {
        int level = 1;

        level++; // this adds 1 and assigns to level
        // this changes the value of variable

        // level + 1 does not changes its value but returns level + 1
        // and returned val has to be used with assignment or relational operator

        if (level + 10 > 0) {
            System.out.println(level);
        }

        // level++ will return level and then add 1
        // ++level will add 1 and then return
        // in both cases the level's value will be changed

        boolean score = true;
        boolean time = false;

        // time && score if time is false score will not even be evaluated
        // & will evaluate both sides before test even if first one is false

        // time || score if time is true score will not be evaluated
        // | will evaluate both sides before test even if first one is true
    }
}