package webapp;

public class todo {

    String todo;
    String user;
    int id;

    public String getTodo()
    {
        return todo;
    }
    public String getUser(){
        return user;
    }
    public void setUser(String user){
        this.user = user;
    }
    public void setTodo(String todo)
    {
        this.todo = todo;
    }

    public int getID()
    {
        return id;
    }
    public void setID(int id) { this.id = id; }
}

