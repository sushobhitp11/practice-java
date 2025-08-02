package com.java.collection;

public class EqualHashCode {

    int id;
    String name;
    int salary;

    public EqualHashCode(int id, String name,int salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }
        @Override
        public int hashCode(){
             String s = this.id + this.name + this.salary;
             return s.hashCode();
        }
        @Override
        public boolean equals(Object obj){

            if(obj == null){
                return false;
            }
            if(!(obj instanceof EqualHashCode)){
                return false;
            }
        EqualHashCode e =(EqualHashCode) obj;

            String str = this.id + this.name +this.salary;
            String str1 = e.id + e.name + e.salary;

            return str.equals(str1);
        }
        @Override
        public String toString(){
            String s = this.id + " " + this.name + " " + this.salary;
            return s;
    }
}

