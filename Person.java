package Ques1;

public class Person implements Book,IssuedOn {
        String Name;
        @Override
        public String bookName(String bn) {
            return bn;
        }
        @Override
        public String authorName(String an) {
            return an;
        }

        @Override
        public String issue_on(String In) {
            return In;
        }

        @Override
        public String issue_till(String It) {
            return It;
        }
    }
