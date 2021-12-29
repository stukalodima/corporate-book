package com.itk.cb.entity;

import com.haulmont.chile.core.annotations.NamePattern;
import com.haulmont.cuba.core.entity.StandardEntity;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.Date;

@Table(name = "CB_DOCUMENTS")
@Entity(name = "cb_Documents")
@NamePattern("%s от %s|name,onDate")
public class Documents extends StandardEntity {
    private static final long serialVersionUID = 3059795937781557872L;

    @Column(name = "SHORT_NAME", nullable = false)
    @NotNull
    private String shortName;

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "ON_DATE", nullable = false)
    @NotNull
    private Date onDate;

    @Lob
    @Column(name = "NAME")
    private String name;

    @Lob
    @Column(name = "TERMINU")
    private String terminu;

    @Lob
    @Column(name = "TEXT")
    private String text;

    @Lob
    @Column(name = "CELI_DOCUMENTA")
    private String celiDocumenta;

    @Lob
    @Column(name = "OBLAST_DEJSTVIYA")
    private String oblastDejstviya;

    @Lob
    @Column(name = "SFERA_PRIMENENIYA")
    private String sferaPrimeneniya;

    @Lob
    @Column(name = "VLADELEC_DOCUMENTA")
    private String vladelecDocumenta;

    @Lob
    @Column(name = "RAZRAB_DOCUMENTA")
    private String razrabDocumenta;

    @Lob
    @Column(name = "VNESHNIE_NORMU")
    private String vneshnieNormu;

    @Lob
    @Column(name = "PORYADOK_RESHENIYA")
    private String poryadokResheniya;

    @Lob
    @Column(name = "KONTROL_ZA_ISPOLNENIEM")
    private String kontrolZaIspolneniem;

    @Lob
    @Column(name = "OTVETSTVINNOST")
    private String otvetstvinnost;

    @Lob
    @Column(name = "DOSTYP")
    private String dostyp;

    @Column(name = "SODERJANIE_POLITIKI")
    private String soderjaniePolitiki;

    @Lob
    @Column(name = "PRINCUP1")
    private String princup1;

    @Lob
    @Column(name = "PRINCUP2")
    private String princup2;

    @Column(name = "PRINCUP3")
    @Lob
    private String princup3;

    @Column(name = "PRINCUP4")
    @Lob
    private String princup4;

    @Lob
    @Column(name = "PRINCUP5")
    private String princup5;

    @Lob
    @Column(name = "PRINCUP6")
    private String princup6;

    @Lob
    @Column(name = "SISTEMU")
    private String sistemu;

    @Lob
    @Column(name = "ZAKLUSHENIE")
    private String zaklushenie;

    @Lob
    @Column(name = "PRILOJENIYA")
    private String prilojeniya;

    @Lob
    @Column(name = "STATUS")
    private String status;

    @Lob
    @Column(name = "ISTORIYA")
    private String istoriya;

    @Lob
    @Column(name = "SVYAZ")
    private String svyaz;

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public Date getOnDate() {
        return onDate;
    }

    public void setOnDate(Date onDate) {
        this.onDate = onDate;
    }

    public String getShortName() {
        return shortName;
    }

    public void setShortName(String shortName) {
        this.shortName = shortName;
    }

    public String getSvyaz() {
        return svyaz;
    }

    public void setSvyaz(String svyaz) {
        this.svyaz = svyaz;
    }

    public String getIstoriya() {
        return istoriya;
    }

    public void setIstoriya(String istoriya) {
        this.istoriya = istoriya;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getPrilojeniya() {
        return prilojeniya;
    }

    public void setPrilojeniya(String prilojeniya) {
        this.prilojeniya = prilojeniya;
    }

    public String getZaklushenie() {
        return zaklushenie;
    }

    public void setZaklushenie(String zaklushenie) {
        this.zaklushenie = zaklushenie;
    }

    public String getSistemu() {
        return sistemu;
    }

    public void setSistemu(String sistemu) {
        this.sistemu = sistemu;
    }

    public String getPrincup6() {
        return princup6;
    }

    public void setPrincup6(String princup6) {
        this.princup6 = princup6;
    }

    public String getPrincup5() {
        return princup5;
    }

    public void setPrincup5(String princup5) {
        this.princup5 = princup5;
    }

    public String getPrincup4() {
        return princup4;
    }

    public void setPrincup4(String princup4) {
        this.princup4 = princup4;
    }

    public String getPrincup3() {
        return princup3;
    }

    public void setPrincup3(String princup3) {
        this.princup3 = princup3;
    }

    public String getPrincup2() {
        return princup2;
    }

    public void setPrincup2(String princup2) {
        this.princup2 = princup2;
    }

    public String getPrincup1() {
        return princup1;
    }

    public void setPrincup1(String princup1) {
        this.princup1 = princup1;
    }

    public String getSoderjaniePolitiki() {
        return soderjaniePolitiki;
    }

    public void setSoderjaniePolitiki(String soderjaniePolitiki) {
        this.soderjaniePolitiki = soderjaniePolitiki;
    }

    public String getDostyp() {
        return dostyp;
    }

    public void setDostyp(String dostyp) {
        this.dostyp = dostyp;
    }

    public String getOtvetstvinnost() {
        return otvetstvinnost;
    }

    public void setOtvetstvinnost(String otvetstvinnost) {
        this.otvetstvinnost = otvetstvinnost;
    }

    public String getKontrolZaIspolneniem() {
        return kontrolZaIspolneniem;
    }

    public void setKontrolZaIspolneniem(String kontrolZaIspolneniem) {
        this.kontrolZaIspolneniem = kontrolZaIspolneniem;
    }

    public String getPoryadokResheniya() {
        return poryadokResheniya;
    }

    public void setPoryadokResheniya(String poryadokResheniya) {
        this.poryadokResheniya = poryadokResheniya;
    }

    public String getVneshnieNormu() {
        return vneshnieNormu;
    }

    public void setVneshnieNormu(String vneshnieNormu) {
        this.vneshnieNormu = vneshnieNormu;
    }

    public String getRazrabDocumenta() {
        return razrabDocumenta;
    }

    public void setRazrabDocumenta(String razrabDocumenta) {
        this.razrabDocumenta = razrabDocumenta;
    }

    public String getVladelecDocumenta() {
        return vladelecDocumenta;
    }

    public void setVladelecDocumenta(String vladelecDocumenta) {
        this.vladelecDocumenta = vladelecDocumenta;
    }

    public String getSferaPrimeneniya() {
        return sferaPrimeneniya;
    }

    public void setSferaPrimeneniya(String sferaPrimeneniya) {
        this.sferaPrimeneniya = sferaPrimeneniya;
    }

    public String getOblastDejstviya() {
        return oblastDejstviya;
    }

    public void setOblastDejstviya(String oblastDejstviya) {
        this.oblastDejstviya = oblastDejstviya;
    }

    public String getCeliDocumenta() {
        return celiDocumenta;
    }

    public void setCeliDocumenta(String celiDocumenta) {
        this.celiDocumenta = celiDocumenta;
    }

    public String getTerminu() {
        return terminu;
    }

    public void setTerminu(String terminu) {
        this.terminu = terminu;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}