// абстрактный класс
abstract class Storage {
    // сохранить данные (абстрактный метод)
    public abstract void store(String data);

    // чтение данных (абстрактный метод)
    public abstract String read();
}

// класс, реализующий абстрактный
class CD extends Storage {
    private String data = "";

    public CD() {
    }

    @Override // реализация
    public void store(String data) {
        this.data += data;
        System.out.println("Data stored on CD");
    }

    @Override // реализация
    public String read() {
        return this.data;
    }
}

// класс, реализующий абстрактный
class SDCard extends Storage {
    private String data = "";

    public SDCard() {
    }

    @Override // реализация
    public void store(String data) {
        this.data += data;
        System.out.println("Data stored on SDCard");
    }

    @Override // реализация
    public String read() {
        return this.data;
    }
}

public class AbstractExample {
    public static void main(String[] args) {
        // создание объекта CD
        CD cd = new CD();
        cd.store("Some data to CD");
        System.out.println(cd.read());
        // создание объекта SDCard
        SDCard sd = new SDCard();
        sd.store("Some data to SDCard");
        System.out.println(sd.read());
        // попытка создать объект класса Storage
        // требует реализации абстрактных методов
        Storage storage = new Storage() {
            private String data = "";

            @Override
            public void store(String data) {
                this.data += data;
                System.out.println("Data stored on storage");
            }

            @Override
            public String read() {
                return this.data;
            }
        };
        storage.store("Some data to storage");
        System.out.println(storage.read());
    }
}

abstract class Gift {
    public abstract void buy();

    public abstract void give(String person);
}

class Postcard extends Gift {
    private String person = "";
    private String wish = "";

    @Override
    public void buy() {
        System.out.println("Postcard is bought");
    }

    @Override
    public void give(String person) {
        this.person = person;
    }

    public void writeWish(String wish) {
        this.wish = wish;
    }

    public String getWish() {
        return this.wish;
    }

}