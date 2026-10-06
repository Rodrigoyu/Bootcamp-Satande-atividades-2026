package atividade9.domain;

import java.util.Objects;

public class GenericDomein<T> {
    private T id;

    public GenericDomein() {
    }

    public GenericDomein(final T id) {
        this.id = id;
    }

    public T getId() {
        return id;
    }

    public void setId(final T id) {
        this.id = id;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        GenericDomein<?> that = (GenericDomein<?>) o;
        return Objects.equals(id, that.id);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(id);
    }

    @Override
    public String toString() {
        return "GenericDomein{" +
                "id=" + id +
                '}';
    }
}
