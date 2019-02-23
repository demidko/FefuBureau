package opd.dvfu;

import android.support.annotation.NonNull;

import opd.dvfu.NameLocals.RussianName;

public final class NameFabric {

    static int i = 0;
    public static Name createFrom(@NonNull final String code) {
        ++i;
        return new RussianName("Иван" + i, "Иванович" + i, "Иванов" + i);
    }
}
