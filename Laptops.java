public class Laptops {
    private String name;
    private String cpu;
    private String graphic;
    private String ram;
    private String ssd;
    private String diagonal;
    private String screenRefreshRate;
    private String batteryLife;
    private String weight;
    private String price;

    public Laptops(String name, String cpu, String graphic,
                   String ram, String ssd, String diagonal, String screenRefreshRate,
                   String batteryLife, String weight, String price){

        this.name = name;
        this.cpu = cpu;
        this.graphic = graphic;
        this.ram = ram;
        this.ssd = ssd;
        this.diagonal = diagonal;
        this.screenRefreshRate = screenRefreshRate;
        this.batteryLife = batteryLife;
        this.weight = weight;
        this.price = price;
    }

    public String getName(){

        return  name;

        }
    public String getCpu(){
        return cpu;
        }
    public String getGraphic(){

        return graphic;

        }
    public String getRam(){

        return ram;

        }
    public String getSsd(){

        return ssd;

        }
    public String getDiagonal(){

        return diagonal;

        }
    public String getScreenRefreshRate(){

        return screenRefreshRate;

        }
    public String getBatteryLife(){

        return batteryLife;

        }
    public String getWeight(){

        return weight;

        }
    public String getPrice(){

        return price;

        }

    @Override
    public String toString(){
        return "Название: " + name + "\n"
                + "Процессор: " + cpu + "\n"
                + "Графика: " + graphic + "\n"
                + "ОЗУ: " + ram + "\n"
                + "SSD: " + ssd + "\n"
                + "Диагональ экрана: " + diagonal + "\n"
                + "Частота обновления экрана: " + screenRefreshRate + "\n"
                + "Срок автономной работы: " + batteryLife + "\n"
                + "Вес: " + weight + "\n"
                + "Стоимость: " + price + "\n";
    }
}
