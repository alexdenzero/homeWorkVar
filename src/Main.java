public class Main {
    public static void main(String[] args) {
        var dog = 8.0;
        System.out.println(dog);
        dog = dog + 4;
        System.out.println(dog);
        dog = dog - 3.5;
        System.out.println(dog);
        var cat = 3.6;
        System.out.println(cat);
        cat = cat + 4;
        System.out.println(cat);
        cat = cat - 1.6;
        System.out.println(cat);
        var paper = 763789;
        System.out.println(paper);
        paper = paper + 4;
        System.out.println(paper);
        paper = paper - 7639;
        System.out.println(paper);
        var friend = 19;
        System.out.println(friend);
        friend = friend + 2;
        System.out.println(friend);
        friend = friend / 7;
        System.out.println(friend);
        var frog = 3.5;
        System.out.println(frog);
        frog = frog * 10;
        System.out.println(frog);
        frog = frog / 3.5;
        System.out.println(frog);
        frog = frog + 4;
        System.out.println(frog);

        var boxerOne = 78.2;
        System.out.println("вес первого боксера " + boxerOne);
        var boxerTwo = 82.7;
        System.out.println("Вес второго боксера " + boxerTwo);
        var weightBoxers = boxerOne + boxerTwo;
        System.out.println("Вес обоих боксеров " + weightBoxers);
        var differenceWeight = boxerTwo - boxerOne;
        System.out.println("Разница в весе боксеров " + differenceWeight);
        var overloadWeight = (boxerTwo) % boxerOne;
        System.out.println("Остаток в весе боксеров " + overloadWeight);

        var time = 640;
        var workerTime = 8;
        workerTime = time / 8;
        System.out.println("Всего работников в компании - " + workerTime + " человек");
        var workersNow = workerTime + 94;
        System.out.println("Теперь рабочих - " + workersNow);
        var timeWorkers = 640 / workersNow;
        System.out.println("часов на рабочего " + timeWorkers);
        System.out.println("Если в компании работает " + workersNow + " человек, то всего "
                + timeWorkers + " часов работы может быть поделено между сотрудниками " );
    }
}