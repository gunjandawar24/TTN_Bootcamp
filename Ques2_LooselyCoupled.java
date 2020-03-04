//(2) Write a program to demonstrate Loosely Coupled code.

package com.tothenew.bootcamp.Springframework;

public class Ques2_LooselyCoupled {

        public static void main(String[]args){
            SmartWorker sw = new SmartWorker();
            Manager mn = new Manager(sw);
            mn.mangeWork();

            LazyWorker lw=new LazyWorker();
            Manager mn1=new Manager(lw);
            mn1.mangeWork();

            ExtraordinaryWorker ew=new ExtraordinaryWorker();
            Manager mn2=new Manager(ew);
            mn2.mangeWork();

        }
    }
    class Manager{
        private Worker worker;

        Manager(Worker worker)
        {
            this.worker=worker;
        }
        public void mangeWork()
        {
            worker.Work();
        }
    }
    interface Worker{
    void Work();
    }

    class LazyWorker implements Worker{
        @Override
        public void Work(){
            System.out.println("Lazyworker is working..");
        }
    }

    class SmartWorker implements Worker {
        @Override
        public void Work() {
            System.out.println("Smart Worker is working..");
        }
        }

        class ExtraordinaryWorker implements Worker {
            @Override
            public void Work() {
                System.out.println("ExtraOrdinary Worker is working..");
            }

        }


