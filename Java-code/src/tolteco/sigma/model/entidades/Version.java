/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tolteco.sigma.model.entidades;

import java.util.Date;

/**
 * Contém informações sobre
 * uma release (Data, major,
 * minor, etc).
 * @author Juliano Felipe
 */
public class Version {
    private static final int MAXTRAILING = 3;
    
    private int majorVersion;
    private int majorName;
    private Date majorDate;
    private String majorNotes;
    private int minorVersion;
    private Date minorDate;
    private String minorNotes;

    public Version(int majorVersion, int majorName, Date majorDate, String majorNotes, int minorVersion, Date minorDate, String minorNotes) {
        this.majorVersion = majorVersion;
        this.majorName = majorName;
        this.majorDate = majorDate;
        this.majorNotes = majorNotes;
        this.minorVersion = minorVersion;
        this.minorDate = minorDate;
        this.minorNotes = minorNotes;
    }

    @Override
    public String toString() {
        return "Version{" + "majorVersion=" + majorVersion + ", majorName=" +
                majorName + ", majorDate=" + majorDate + ", majorNotes=" + 
                majorNotes + ", minorVersion=" + minorVersion + ", minorDate=" +
                minorDate + ", minorNotes=" + minorNotes + '}';
    }
    
    /**
     * Retorna a representação curta de
     * uma String, que é dada como:
     * major.minor (MajorName).
     * <p>
     * "Trailing zeros" são adicionados
     * baseados na constante 
     * {@link tolteco.sigma.model.entidades.Version#MAXTRAILING}.
     * Ex.: 1.001 (SANTIAGO), sendo o MAXTRAILING igual à 3.
     * @return 
     */
    public String shortString(){
        return Integer.toString(majorVersion) + "." + 
            String.format("%0" + MAXTRAILING + "d", minorVersion) + 
            " (" + majorName + ')';
    }
}