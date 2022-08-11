package POO;

public class CocheCRUDImpl implements CocheCRUD{
    @Override
    public void save(){

    }

    @Override
    public void findall() {

    }

    @Override
    public void delete() {

    }

    String save = "guardar datos";
    String findall = "listar datos";
    String delete = "eliminar datos";

    @Override
    public String toString() {
        return "CocheCRUDImpl{" +
                "save='" + save + '\'' +
                ", findall='" + findall + '\'' +
                ", delete='" + delete + '\'' +
                '}';
    }
}
