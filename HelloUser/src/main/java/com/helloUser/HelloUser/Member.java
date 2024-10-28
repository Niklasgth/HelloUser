package com.helloUser.HelloUser;

public class Member {

String name;
int age;
boolean isPaying;
int id;


Member(String name, int age, boolean isPaying, int id){
this.name = name;
this.age = age;
this.isPaying = isPaying;
this.id =id;
}


public String getName() {
    return name;
}


public void setName(String name) {
    this.name = name;
}


public int getAge() {
    return age;
}


public void setAge(int age) {
    this.age = age;
}


public boolean isPaying() {
    return isPaying;
}


public void setPaying(boolean isPaying) {
    this.isPaying = isPaying;
}


}
