import ru.netology.hw8.services.VacationService;

public class Main {
    public static void main(String[] args) {

        VacationService vacationService = new VacationService();

        // Пример 1
        int income1 = 13_000;
        int expenses1 = 3_000;
        int threshold1 = 10_000;

        int result1 = vacationService.calculateVacationMonths(income1, expenses1, threshold1);
        System.out.println("Отдых в следующем году (Пример 1): " + result1 + " месяц(ев)");

        // Пример 2
        int income2 = 111_111;
        int expenses2 = 60_000;
        int threshold2 = 100_000;

        int result2 = vacationService.calculateVacationMonths(income2, expenses2, threshold2);
        System.out.println("Отдых в следующем году (Пример 2): " + result2 + " месяц(ев)");
    }
}
