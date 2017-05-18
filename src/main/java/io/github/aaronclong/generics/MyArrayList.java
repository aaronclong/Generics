package io.github.aaronclong.generics;

import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Spliterator;
import java.util.function.UnaryOperator;

/**
 * Created by aaronlong on 5/18/17.
 */
public class MyArrayList<E> implements List<E> {

  private Object[] array;

  public MyArrayList() {
    array = new Object[20];
  }

  public boolean add(E e) {
    return false;
  }

  public void add(int index, E element) {}

  public boolean addAll(Collection<? extends E> c) {
    return false;
  }

  public boolean addAll(int index, Collection<? extends E> c) {
    return false;
  }

  public void clear() {}

  public boolean contains(Object o) {
    return false;
  }

  public boolean containsAll(Collection<?> c) {
    return false;
  }

  public boolean equals(Object o) {
    return false;
  }

  public E get(int index) {
    return (E) array[0];
  }

  public int hashCode() {
    return -1;
  }

  public int indexOf(Object o) {
    return -1;
  }

  public boolean isEmpty() {
    return true;
  }

  public Iterator<E> iterator() {
    return null;
  }

  public int lastIndexOf(Object o) {
    return -1;
  }

  public ListIterator<E> listIterator() {
    return null;
  }

  public ListIterator<E> listIterator(int index) {
    return null;
  }

  public E remove(int index) {
    return (E) array[0];
  }

  public boolean remove(Object o) {
    return false;
  }

  public boolean removeAll(Collection<?> c) {
    return false;
  }

  public void replaceAll(UnaryOperator<E> operator) {}

  public boolean retainAll(Collection<?> c) {
    return false;
  }

  public E set(int index, E element) {
    return element;
  }

  public int size() {
    return 0;
  }

  public void sort(Comparator<? super E> c) {}

  public Spliterator<E> spliterator() {
    return null;
  }

  public List<E> subList(int fromIndex, int toIndex) {
    return null;
  }

  public Object[] toArray() {
    return new Object[1];
  }

  public <T> T[] toArray(T[] a) {
    return null;
  }

}
