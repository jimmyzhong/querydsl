package com.mysema.query.domain;

import static org.junit.Assert.assertEquals;

import java.util.Map;

import javax.persistence.Entity;
import javax.persistence.MapKey;
import javax.persistence.OneToMany;

import org.junit.Test;

public class ManagedEmailTest {

    public interface ManagedEmail {

    }

    public enum EmailType { WORK, HOME }

    @Entity
    public static class ManagedEmailImpl implements ManagedEmail {

    }

    @Entity
    public static class ManagedEmails {

        @OneToMany(targetEntity = ManagedEmailImpl.class)
        @MapKey(name = "emailType")
        private Map<EmailType, ManagedEmail> emails;

    }

    @Test
    public void test() {
        assertEquals(EmailType.class, QManagedEmailTest_ManagedEmails.managedEmails.emails.getKeyType());
        assertEquals(ManagedEmailImpl.class, QManagedEmailTest_ManagedEmails.managedEmails.emails.getValueType());
    }

}
