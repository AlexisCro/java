package org.example;
import java.lang.reflect.Constructor;
import java.util.List;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        try {
            Class<?> repoClass = Class.forName(args[0]);

            Constructor<?> constructor = repoClass.getConstructor();

            CapteurRepo capteurRepo = (CapteurRepo) constructor.newInstance();

            ServiceCapteur serviceCapteur = new ServiceCapteur(capteurRepo);

            System.out.println("Relevé " + args[0]);
            List<ReleveCapteur> releves = serviceCapteur.getReleves();
            for (ReleveCapteur releve : releves) {
                System.out.println(releve);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}