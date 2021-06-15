package Exercise2.com.vti.entity;

public class Position {
    int id;
    PositionName name;

    enum PositionName {
        Dev, Test, Scrum, Master, PM
    }
}
