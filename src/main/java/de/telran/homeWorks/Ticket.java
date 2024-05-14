package de.telran.homeWorks;


//1. Вы пришли в больницу и Вам в регистратуре выдали талончик, в котором указана Ваша ФИО, номер талона, и имя врача.
//Вы подходите к кабинету, и там Вам сообщают, что обслуживание ведеться строго по номеру талона.
//Из кабинета выходит медсестра и просит все присутствующих выстроиться по номеру талона в порядке
//его возрастания.
//Создать множество, которое будет обслуживать класс Ticket.
//Подумайте какой тип Set - а вы могли бы использовать для этой задачи.
//Сымитируйте построение очереди в коридоре больницы.
public class Ticket implements Comparable<Ticket> {
    private String name;
    private int number;
    private String doctor;

  public Ticket( String name, int number, String doctor){
      this.name = name;
      this.number = number;
      this.doctor = doctor;
  }

    public int getNumber() {
        return number;
    }

    public String getName() {
        return name;
    }

    public String getDoctor() {
        return doctor;
    }

    @Override
    public int compareTo(Ticket o) {
        if (this.number > o.number) {
            return 1;
        }
        if (this.number < o.number) {
            return -1;
        }
        //if (this.number == o.number) {
        return 0;
    }
}

