class Solution {
    public static String whoLikesIt(String... names) {
      String message = "";
      
        switch(names.length){
            case 0: message = "no one likes this";break;
            case 1: message = names[0] + " likes this";break;
            case 2: message = names[0] + " and "+ names[1] + " like this";break;
            case 3: message = names[0] +", " +names[1] + " and "+ names[2] + " like this";break;
            default : int leftNames = names.length - 2 ;
            message = names[0]+ ", " + names[1] + " and "+ leftNames + " others like this";break;
        }
      
        return message;
    }
}
