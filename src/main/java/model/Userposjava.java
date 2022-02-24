package model;

public class Userposjava {

    private Long id;
    private String Nome;
    private String email;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return Nome;
    }

    public void setNome(String nome) {
        Nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "Userposjava{" +
                "id=" + id +
                ", Nome='" + Nome + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}
