package opd.dvfu;

public class RussianName {
    public final String name, patronymic, surname;

    // Имя Отчество Фамилия (Иван Иванович Иванов)
    public RussianName(final String name, final String patronymic, final String surname) {
        this.name = name;
        this.patronymic = patronymic;
        this.surname = surname;
    }
}
