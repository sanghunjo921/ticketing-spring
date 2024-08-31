package com.example.ticketing_demo.user.model;


// primitive type int vs reference type (wrapper class) Integer 이건 null을 넣을 수 있음 또한 object method를 쓸 수 있음. 모든 클래스는 오브젝트를 상속받음 오브젝트안에는 toString, toEqaul, hashcode, etc.
// java는 출력하면 reference -> toStrig은 이걸 string으로, toequal은 오브젝트 비교,
// Long type (id를 주는경우 많음) 숫자를 다루는 타입 중 int. long은 고정으로 4바이트, 인티져는 컴퓨터의 비트를 쫓아감 -> 32비트(4바이트) 근데 64비트에선 8바이트를 가짐
public class User {
    private Integer id;
    private String name;
    private Level level;

    public User(Integer id, String name, Level level) {
        this.level = level;
        this.name = name;
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Level getLevel() {
        return level;
    }

    public void setLevel(Level level) {
        this.level = level;
    }
}
