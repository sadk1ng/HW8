import ru.netology.hw8.services.VacationService;

public class Main {
    public static void main(String[] args) {

        VacationService vacationService = new VacationService();

        // Example 1
        int result1 = vacationService.calculateVacationMonths(10_000, 3_000, 20_000);
        System.out.println("Ответ для первого примера: " + result1);

        // Example 2
        int result2 = vacationService.calculateVacationMonths(10_0000, 60_000, 150_000);
        System.out.println("Ответ для второго примера: " + result2);
    }
}
