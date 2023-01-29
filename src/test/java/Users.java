public class Users {
 private int id;
 private String name;

 public Users() {
 }

 public int getId() {
  return id;
 }

 public void setId(int id) {
  this.id = id;
 }

 public String getName() {
  return name;
 }

 @Override
 public String toString() {
  return "Users{" +
          "id=" + id +
          ", name='" + name + '\'' +
          '}';
 }

 public void setName(String name) {
  this.name = name;

 }
}
