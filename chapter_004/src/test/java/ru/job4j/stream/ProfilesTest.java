package ru.job4j.stream;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.hamcrest.core.Is.is;
import static org.hamcrest.MatcherAssert.assertThat;

public class ProfilesTest {
    Profiles profiles = new Profiles();
    Address address1 = new Address ("SPB", "Pushkina", 12, 21);
    Address address2 = new Address ("Ufa", "Begovaya", 41, 22);
    Address address3 = new Address ("Msc", "Lenina", 20, 15);
    Address address4 = new Address ("RoD", "Oktyabrya", 83, 80);

    Profile profile1 = new Profile(address1);
    Profile profile2 = new Profile(address2);
    Profile profile3 = new Profile(address2);
    Profile profile4 = new Profile(address3);
    Profile profile5 = new Profile(address4);

    @Test
    public void profileToAddressWithSortAndDist() {
        List<Profile> profilesList = new ArrayList<>();
        profilesList.add(profile1);
        profilesList.add(profile2);
        profilesList.add(profile3);
        profilesList.add(profile4);
        profilesList.add(profile5);
        List<Address> res = profiles.collect(profilesList);
        List<Address> exp = new ArrayList<>();
        exp.add(address3);
        exp.add(address4);
        exp.add(address1);
        exp.add(address2);
        assertThat ( res, is ( exp ) );
    }
}
