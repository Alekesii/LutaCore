package fr.lutamc.lutacore.utils;

public enum ERank implements IRank {
    ADMIN("§4§lAdministrateur","§4§lADMIN", 9),
    MAN("§4§lManager","§6§lMAN",8),
    RESP("§4§lResponsable","§5§lRESP",7),
    MODM("§4§lModérateur","§9§lMOD", 6),
    MODF("§4§lModératrice","§9§lMOD", 6),
    STAFF("§4§lSTAFF","§a§lSTAFF", 5),
    AMI("§4§lAMI","§d§lAMIS", 4),
    VIPP("§4§lVIP+","§3§lVIP+", 3),
    VIP("§4§lVIP","§e§lVIP", 2),
    MEMBER("§7Joueur","§7Joueur", 1);
    private final String name;
    private final String allias;
    private final Integer power;
    ERank(String name, String allias, int power) {
        this.name = name;
        this.power = power;
        this.allias= allias;
    }


    @Override
    public String getName(ERank rank) {
        return rank.name;
    }

    @Override
    public  String getAllias(ERank rank) {
        return rank.allias;
    }
}
