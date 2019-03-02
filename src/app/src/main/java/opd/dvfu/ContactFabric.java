package opd.dvfu;

import android.support.annotation.NonNull;

public final class ContactFabric {
    public static Contact createFrom(@NonNull final String code) {
        return new Contact(NameFabric.createFrom(code), "ГенДиректор", null, null, null);
    }
}
