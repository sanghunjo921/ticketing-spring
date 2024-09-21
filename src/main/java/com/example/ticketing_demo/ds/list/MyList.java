package com.example.ticketing_demo.ds.list;

public class MyList<T> {
    private Object[] data;
    private int currentIdx;

    private void deepCopy() {
        int size = currentIdx * 2;
        Object[] temp = new Object[size];

        for (int i = 0; i < currentIdx; i++) {
            temp[i] = data[i];
        }

        data = temp;
        temp = null; //안해줘도됨 로컬 variable이기에 scope 끝날때 garbage collector가 지움
    }

    public MyList() {
        data = new Object[3];
        currentIdx = 0;
    }

    void add(T element) {
        if (currentIdx == data.length) {
            deepCopy();
        }
        data[currentIdx++] = element;
    }

    @Override
    public String toString() {
        // 필요없는 copy가 내부적으로 엄청 일어남
//        String s = "[";
//        for (int i = 0; i < currentIdx; i++) {
//            s += data[i];
//            if (i != currentIdx -1 ) {
//                s += ", ";
//            }
//        }
//        s += "]";
        // stringbuilder는 메모리를 새로 만들지 않고 뒤에 붙일 수 있게 해줌
        StringBuilder sb = new StringBuilder("[");
        for (int i = 0; i < currentIdx; i++) {
            sb.append(data[i]);
            if (i != currentIdx - 1) {
                sb.append(", ");
            }
        }
        sb.append("]");
        return sb.toString();
    }

    void delete(int idx) {

    }
}


// java.util.list
// array 2 1 3 5 넣으면 3을 지웠을때 그 상태로 끝남 그자리에 4를 넣어도 됨. 사이즈를 생성할때 정해지기에 늘리기 위해선 지우고
// 기존 값들을 카피해야 하는 작업
// 타입스크립트나 파이썬은 내부적으로 짜여져 있어서 신경안씀. java나 c++같은 좀 더 로우레벨 랭귀지는
// java 제공해주는 리스트는 그렇게 못하기에 직접 생성해야함
//