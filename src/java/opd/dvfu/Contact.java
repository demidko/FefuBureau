package opd.dvfu;

import android.support.annotation.NonNull;

public class Contact {
    public final Name name;
    public final String post, phone, email, place;

    @Override
    public boolean equals(final Object other) {
        return getClass() == other.getClass() && post == ((Contact)other).post;
    }

    public Contact(@NonNull final Name name,
                   @NonNull final String post,
                   final String phone,
                   final String email,
                   final String place) {
        this.post = post;
        this.name = name;
        this.phone = phone;
        this.email = email;
        this.place = place;
    }
}
