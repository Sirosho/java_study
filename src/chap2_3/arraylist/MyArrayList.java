package chap2_3.arraylist;

import java.util.Iterator;
import java.util.NoSuchElementException;

public class MyArrayList<T> implements Iterable<T> {

    // 상수
    private static final int DEFAULT_CAPACITY = 10;

    // 필드
    private Object[] values;
    private int size;

    // 생성자
    public MyArrayList() {
        this.values = new Object[DEFAULT_CAPACITY];
    }

    // 메서드
    public void push(T element) {
        // 배열이 꽉찼는지 확인하고, 꽉찻으면 사이즈를 늘림
        if (size == values.length) {
            ensureCapacity();
        }
        values[size++] = element;
    }

    // 배열의 크기를 늘리는 내부 메서드
    private void ensureCapacity() {
        int newCapacity = values.length * 2;
        Object[] temp = new Object[newCapacity];
        System.arraycopy(values, 0, temp, 0, size);
    }

    // 배열에 저장된 데이터 개수 알려주기
    int size() {
        return size;
    }

    // 배열의 특정 인덱스 데이터 참조

    public T get(int index) {
        // 인덱스 범위를 확인
        if (index >= size || index < 0) {
            System.out.println("오류 : " + index + "는 잘못된 인덱스입니다.");
            throw new IndexOutOfBoundsException("오류 : " + index + "는 잘못된 인덱스입니다.");
        }
        return (T) values[index];
    }

    // 배열의 특정 인덱스 데이터 삭제
    public T remove(int index) {
        Object deleted = values[index];
        if (index >= size || index < 0) {
            System.out.println("오류 : " + index + "는 잘못된 인덱스입니다.");
            throw new IndexOutOfBoundsException("오류 : " + index + "는 잘못된 인덱스입니다.");
        }
        for (int i = index; i < size; i++) {

            values[i] = values[i + 1];
        }
        size--;

        // 가려진 데이터를 실제로 지워줌
        values[size] = null;

        return (T) deleted;
    }

    public boolean contains(T element) {

        for (int i = 0; i < values.length; i++) {

            if (element instanceof String) {
                if (element.equals(values[i])) {
                    return true;
                }

        } else if (element instanceof Integer) {
            if (element == values[i]) return true;
        }
    }
        return false;
    }


    public int indexOf(T element) {
        int index = -1;
        for (int i = 0; i < values.length; i++) {
            if (element.equals(values[i]) && element != null) {
                index = i;

                return index;
            } else {
                System.out.println("존재하지 않는 요소입니다.");

            }

        }
        return index;

    }

    public void clear() {
        Object[] temp = new Object[10];
        System.arraycopy(temp, 0, values, 0, 10);
        size = 0;

    }


    @Override
    public String toString() {
        String formatted = "[ ";
        for (int i = 0; i < size; i++) {
            if (i == size - 1) {
                formatted += values[i] + " ";
            } else {
                formatted += (values[i] + ", ");
            }
        }
        formatted += "]";
        return formatted;
    }

    @Override
    public Iterator<T> iterator() {
        // 내부 클래스를 사용하여 Iterator 구현
        return new MyIterator();
    }

    // MyArrayList의 Iterator 구현을 위한 내부 클래스
    private class MyIterator implements Iterator<T> {
        // 현재 참조하고 있는 요소의 인덱스
        private int cursor;

        // 다음 요소가 있는지 확인
        @Override
        public boolean hasNext() {
            // 현재 커서 위치가 배열 크기보다 작으면 다음 요소가 있음
            return cursor < size;
        }

        // 다음 요소 반환
        @Override
        public T next() {
            // 다음 요소가 없으면 예외 발생
            if (!hasNext()) {
                throw new NoSuchElementException("더 이상 요소가 없습니다.");
            }
            // 현재 커서 위치의 요소를 반환하고 커서 위치 증가
            return get(cursor++);
        }
    }
}
