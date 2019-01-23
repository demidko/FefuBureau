package opd.dvfu;

public class Contact {
    public final RussianName fullName;
    public final String post, phone, email, place;

    @Override
    public boolean equals(final Object other) {
        return getClass() == other.getClass() && post == ((Contact)other).post;
    }

    public Contact(final RussianName name,
                   final String post,
                   final String phone,
                   final String email,
                   final String place) {
        this.post = post;
        this.fullName = name;
        this.phone = phone;
        this.email = email;
        this.place = place;
    }
}
