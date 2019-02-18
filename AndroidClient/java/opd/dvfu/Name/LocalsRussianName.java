package opd.dvfu.NameLocals;

import android.support.annotation.NonNull;

import opd.dvfu.Name;

public class RussianName extends Name {
    public final String name, surname, patronymic;

    @Override
    public String minView() {
        if (name.length() + surname.length() + 1 <= getMinViewLength()) {
            return  name + ' ' + surname;
        }
        if(name.length() <= getMinViewLength()) {
            return name;
        }
        return name.substring(0, getMinViewLength());
    }

    @Override
    public String maxView() {
        return name + ' ' + patronymic + ' ' + surname;
    }

    public RussianName(@NonNull final String name, final String surname, final String patronymic)
    {
        this.name = name;
        this.surname = surname;
        this.patronymic = patronymic;
    }
}
