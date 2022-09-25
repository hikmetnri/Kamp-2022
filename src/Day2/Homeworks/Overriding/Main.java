package Day2.Homeworks.Overriding;


import Day2.Homeworks.InheritanceDemo.TarimKrediManager;

public class Main {
    public static void main(String[] args) {
        BaseCrediManager baseCrediManager []=new BaseCrediManager[]{new TeachingCrediManager(), new FarmCrediManager(),new OgerenciCrediManager()};

    for (BaseCrediManager crediManager: baseCrediManager){
        System.out.println(crediManager.hesapla(100));
    }

    }
}
