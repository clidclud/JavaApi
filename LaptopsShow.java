import java.util.*;

public class LaptopsShow {
    public static void filter(Set<Laptops> laptops) {
        Map<String, String> filter = new HashMap<>();
        filter.put("1", "Название");
        filter.put("2", "Процессор");
        filter.put("3", "Графика");
        filter.put("4", "ОЗУ");
        filter.put("5", "SSD");
        filter.put("6", "Диагональ экрана");
        filter.put("7", "Частота обновления экрана");
        filter.put("8", "Срок автономной работы");
        filter.put("9", "Вес");
        filter.put("10", "Стоимость");

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите цифру, соответствующую необходимому критерию поиска:");
        System.out.println("1 - Название\n"
                + "2 - Процессор\n"
                + "3 - Графика\n"
                + "4 - ОЗУ\n"
                + "5 - SSD\n"
                + "6 - Диагональ экрана\n"
                + "7 - Частота обновления экрана\n"
                + "8 - Срок автономной работы\n"
                + "9 - Вес\n"
                + "10 - Стоимость");
        String input = scanner.nextLine();
        if (filter.containsKey(input)) {
            String select = filter.get(input);
            System.out.println("Введите минимальные значения для указанных критериев:");
            String min = scanner.nextLine();
            Set<Laptops> filtered = new HashSet<>();
            switch (select) {
                case "Название":
                    for (Laptops laptop : laptops) {
                        if (laptop.getName().toLowerCase().contains(min.toLowerCase())) {
                            filtered.add(laptop);
                        }
                    }
                    break;
                case "Процессор":
                    for (Laptops laptop : laptops) {
                        if (laptop.getCpu().toLowerCase().contains(min.toLowerCase())) {
                            filtered.add(laptop);
                        }
                    }
                    break;
                case "Графика":
                    for (Laptops laptop : laptops) {
                        if (laptop.getGraphic().toLowerCase().contains(min.toLowerCase())) {
                            filtered.add(laptop);
                        }
                    }
                    break;
                case "ОЗУ":
                    for (Laptops laptop : laptops) {
                        if (laptop.getRam().toLowerCase().contains(min.toLowerCase())) {
                            filtered.add(laptop);
                        }
                    }
                    break;
                case "SSD":
                    for (Laptops laptop : laptops) {
                        if (laptop.getSsd().toLowerCase().contains(min.toLowerCase())) {
                            filtered.add(laptop);
                        }
                    }
                    break;
                case "Диагональ экрана":
                    for (Laptops laptop : laptops) {
                        if (laptop.getDiagonal().toLowerCase().contains(min.toLowerCase())) {
                            filtered.add(laptop);
                        }
                    }
                    break;
                case "Частота обновления экрана":
                    for (Laptops laptop : laptops) {
                        if (laptop.getScreenRefreshRate().toLowerCase().contains(min.toLowerCase())) {
                            filtered.add(laptop);
                        }
                    }
                    break;
                case "Срок автономной работы":
                    for (Laptops laptop : laptops) {
                        if (laptop.getBatteryLife().toLowerCase().contains(min.toLowerCase())) {
                            filtered.add(laptop);
                        }
                    }
                    break;
                case "Вес":
                    for (Laptops laptop : laptops) {
                        if (laptop.getWeight().toLowerCase().contains(min.toLowerCase())) {
                            filtered.add(laptop);
                        }
                    }
                    break;
                case "Стоимость":
                    for (Laptops laptop : laptops) {
                        if (laptop.getPrice().toLowerCase().contains(min.toLowerCase())) {
                            filtered.add(laptop);
                        }
                    }
                    break;
                default:
                    System.out.println("Результат поиска не найден. Повторите запрос.");
                    return;
            }
            if (filtered.isEmpty()) {
                System.out.println("Таких ноутбуков нет");
            } else {
                for (Laptops laptop : filtered) {
                    System.out.println(laptop);
                }
            }
        }
    }

    public static void main(String[] args) {

        System.out.println("Уважаемые дамы и господа! Представляем вам широкий выбор ноутбуков!\n" +
                "У нас представлен ассортимент производителей таких как: Apple, Acer, Lenovo, Dell, HP и др.\n" +
                "Ноутбуки на базе процессоров Intel, AMD и Apple.\n" +
                "С оперативной памятью от 8гб до 32гб.\n" +
                "С твердотельным накопителем от 256гб до 2тб.\n" +
                "Чтобы продолжить нажмите Enter.");
        Scanner scanner = new Scanner(System.in);
        String privet = scanner.nextLine();

        Laptops laptop1 = new Laptops("Apple MacBook Air", "Apple M1", "Apple M1",
                "16 Гб", "2 Тб", "Retina 13,3″ 2560×1600", "60 Гц",
                "До 18 часов", "1,29 кг", "От 95 000 ₽");

        Laptops laptop2 = new Laptops("Acer ConceptD 7 Pro", "Intel Core i7 9750H",
                "NVIDIA Quadro RTX 3000 6 Гб (дискретная), Intel UHD Graphics 630 (встроенная)",
                "32 Гб", "1 Тб", "15,6″ IPS, 4K", "60 Гц",
                "8 часов", "2,1 кг", "От 250 000 ₽");

        Laptops laptop3 = new Laptops("Lenovo ThinkPad X1 Fold Gen 2", "Intel Core i7 vPro Quad Core",
                "Intel Iris Xe Graphics", "32 Гб", "1 Тб",
                "16,3″ OLED 2560x2024 в разложенном виде, 12″ в сложенном виде", "120 Гц",
                "11 часов", "1,28 кг", "От 150 000 ₽");

        Laptops laptop4 = new Laptops("Dell XPS 13 2-in-1", "Intel Core i7-1165G7",
                "Intel Iris Xe (Tiger Lake GT2)", "32 Гб", "1 Тб",
                "13,4″ IPS Full HD 3840x2400", "60 Гц",
                "9 часов", "1,27 кг", "От 170 000 ₽");

        Laptops laptop5 = new Laptops("HP Envy x360 13", "AMD Ryzen 5 3500U",
                "AMD Radeon Vega 8", "8 Гб", "256 Гб",
                "13,3″ FHD IPS LED 1920x1080", "60 Гц",
                "13 часов", "1,3 кг", "От 60 000 ₽");

        Laptops laptop6 = new Laptops("Acer Swift 5", "Intel Core i5 7200U",
                "Intel HD Graphics 620", "8 Гб", "512 Гб",
                "14″ IPS, 1920х1080", "60 Гц",
                "13 часов", "1,3 кг", "От 80 000 ₽");

        Laptops laptop7 = new Laptops("Asus ZenBook Pro 15", "Intel Core i9-8950HK",
                "Nvidia GeForce GTX 1650Ti (дискретная), Intel UHD Graphics 630 (встроенная)",
                "16 Гб", "1 Тб", "15,6″ NanoEdge с разрешением 4K (3840х2160)",
                "120 Гц", "6 часов", "2 кг", "От 205 000 ₽");

        Laptops laptop8 = new Laptops("HP EliteBook x360 1030 G3", "Intel Core i5 8250U",
                "Intel UHD Graphics 620", "8 Гб", "256 Гб", "13″ 1080p или 4K",
                "75 Гц", "10 часов", "1,25 кг", "От 120 000 ₽");

        Laptops laptop9 = new Laptops("Huawei MateBook D 15", "Intel Core i5-1135G7",
                "Intel Iris Xe Graphics", "16 Гб", "512 Гб", "15,6″ IPS, Full HD",
                "60 Гц", "10 часов", "1,53 кг", "От 55 000 ₽");

        Laptops laptop10 = new Laptops("Honor MagicBook 14", "Intel Core i7-1165G7",
                "Intel Iris Xe Graphics", "8 или 16 Гб", "512 Гб", "14″ IPS, Full HD",
                "60 Гц", "8–10 часов", "1,37 кг", "От 75 000 ₽");

        HashSet<Laptops> hashSet = new HashSet<>(Arrays.asList(laptop1, laptop2, laptop3, laptop4,
                laptop5, laptop6, laptop7, laptop8, laptop9, laptop10));
                
        filter(hashSet);
    }
}
