package services;

import knowledgebase.Knowledge;

public class SoftwareDeveloper {

    private Knowledge knowledge;

    public SoftwareDeveloper(Knowledge knowledge) {
        this.knowledge = knowledge;
    }

    public String develop(String requirements) {
        System.out.println(requirements);
        System.out.println("Ну и требования...");

        knowledge.obtain(requirements);

        return "Вот такой вот софт";
    }
    public static void main(String[] args) {
        Knowledge knowledge = new Knowledge();
        SoftwareDeveloper developer = new SoftwareDeveloper(knowledge);

        String software = developer.develop("Хочу, чтобы было так и вот так");

        System.out.println(software);
    }
}