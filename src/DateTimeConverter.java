import java.time.LocalDateTime;
import java.time.YearMonth;
import java.time.format.DateTimeFormatter;

public class DateTimeConverter {
    public static void main(String[] args) {
        String input = "2021-03"; // 传入的 yyyy-MM 格式的日期

        // 解析传入的年月字符串
        DateTimeFormatter inputFormatter = DateTimeFormatter.ofPattern("yyyy-MM");
        YearMonth yearMonth = YearMonth.parse(input, inputFormatter);

        // 获取该月的第一天
        LocalDateTime startOfDay = yearMonth.atDay(1).atStartOfDay();

        // 获取该月的最后一天并设置到23:59:59
        LocalDateTime endOfDay = yearMonth.atEndOfMonth().atTime(23, 59, 59);

        // 定义输出格式
        DateTimeFormatter outputFormatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");

        // 格式化输出
        String startOfDayFormatted = startOfDay.format(outputFormatter);
        String endOfDayFormatted = endOfDay.format(outputFormatter);

        // 输出结果
        System.out.println("Start of the month: " + startOfDayFormatted);
        System.out.println("End of the month: " + endOfDayFormatted);
    }
}
