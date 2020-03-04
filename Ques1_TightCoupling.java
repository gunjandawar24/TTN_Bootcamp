////Ques1 Write a program to demonstrate Tightly Coupled code.
//
//package com.tothenew.bootcamp.Springframework;
//
//public class Ques1_TightCoupling {
//    public static void main(String[] args) {
//        SmartWorker sw=new SmartWorker();
//        LazyWorker lw=new LazyWorker();
//        Manager mn=new Manager(sw,lw);
//        mn.mangeWork();
//
//    }
//}
//class Manager{
//    LazyWorker lw;
//    SmartWorker sw;
//
//    Manager(SmartWorker sw,LazyWorker lw)
//    {
//        this.sw=sw;
//        this.lw=lw;
//    }
//    public void mangeWork()
//    {
//        sw.Work();
//        lw.Work();
//    }
//}
//
//class LazyWorker{
//    public void Work(){
//        System.out.println("Lazyworker is working..");
//    }
//}
//
//class SmartWorker{
//    public void Work(){
//        System.out.println("Smart Worker is working..");
//    }
//
//}