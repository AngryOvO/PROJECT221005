public abstract class Calc { // �߻� Ŭ����
    protected int a, b;
    public void setValue(int a, int b) {
        this.a = a;
        this.b = b;
    }
    public abstract int calculate(); // �߻� �޼ҵ�. ���� Ŭ�������� ������ ����
}