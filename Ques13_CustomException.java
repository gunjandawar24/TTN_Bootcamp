//Q13. Create a custom exception that do not have any stack trace.
package Ques13;

    class Ques13_CustomException{

        static void validate(int age) throws InvalidAgeException{
            if(age<18)
                throw new InvalidAgeException(" Not valid");
            else
                System.out.println("Eligible to vote ");
        }

        public static void main(String args[]){
            try{
                validate(12);
            }
            catch(Exception e){
                System.out.println("Exception occured: "+e);
            }

        }
    }

