package ru.job4j.stream;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.hamcrest.core.Is.is;
import static org.hamcrest.MatcherAssert.assertThat;

public class ProfilesTest {
    Profiles profiles = new Profiles();
    Address address1 = new Address ("SPB", "Pushkina", 12, 21);
    Address address2 = new Address ("Msc", "Begovaya", 41, 22);
    Profile profile1 = new Profile(address1);
    Profile profile2 = new Profile(address2);

    @Test
    public void profileToAddress() {
        List<Profile> profilesList = new ArrayList<>();
        profilesList.add(profile1);
        profilesList.add(profile2);
        List<Address> res = profiles.collect(profilesList);
        List<Address> exp = new ArrayList<>();
        exp.add(address1);
        exp.add(address2);
        assertThat ( res, is ( exp ) );
    }
}
