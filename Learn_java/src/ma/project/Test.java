package ma.project;

import ma.project.mew.Developpeur;
import ma.project.mew.Manager;

public class Test {
    public static void main(String[] Args){
        Developpeur objDEV = new Developpeur(1,"aitlhcensertyuioprtyui","redouan","devlgmail.com","0605932840",1540.25,"Dev" );
        System.out.println(objDEV.toString());


        Manager objMAN = new Manager(1,"aitlhcen","amine","man@gmail.com","852147",26874.00,"Manager");
        System.out.println(objMAN.toString());

}}
