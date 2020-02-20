package Ques9;

public class Ques9_chair extends Ques9_furniture{
        String type;
        boolean fire;
        boolean stress;

        public String getType() {
            return type;
        }

        public Ques9_chair(String t, boolean f, boolean s)
        {
            this.type=t;
            this.fire=f;
            this.stress=s;
        }
        public boolean isFire() {
            return fire;
        }

        public boolean isStress() {
            return stress;
        }
        @Override
        public boolean checkStress()
        {
            return stress;
        }

        @Override
        public boolean checkfire() {
            return fire;
        }
    }

