package ru.job4j.condition;

/**
 * @author Pavel Romanov (vooltmace.gmail.com)
 * @version $Id$
 * @since 0.1
 */
public class DummyBot {
    /**
     * �������� �� �������.
     * @param question ������ �� �������.
     * @return �����.
     */
    public String answer(String question) {
        String rsl = "��� ������ ���� � �����. ������� ������ ������.";
        if ("������, ���.".equals(question)) {
            // �������� ... �� ���������� ����� rsl = "����� �� �������".
            rsl = "������, �����.";
        } else if ("����.".equals(question)) { // �������� ... �� ��������, �������� �� ���� ���� ������ � �� ����� ��� �� ���� ��������.
            // �������� ... �� ���������� ����� rsl = "����� �� �������".
            rsl = "�� ������ �������.";
        }
        return rsl;
     }
}
