package com.info.n25175_info.entity;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

@Getter
@Setter
@ToString
public class N25175User {
    private Integer uId;

    private Integer uAid;

    private String uName;

    private String uProvince;

    private String uCity;

    private String uPicture;

    private Integer uMarried;

    private Integer uSex;

    @DateTimeFormat(pattern = "yyyy-MM-dd")
    @JsonFormat(pattern = "yyyy-MM-dd",timezone = "GMT+8")
    private Date uBorn;

    private Integer uAge;

    private String uIdentity;

    private Integer uHeight;

    private Integer uEthnic;

    private Integer uPolity;

    private Integer uSubscript;

    private Integer uPost;

    private Integer uTreatment;

    @DateTimeFormat(pattern = "yyyy-MM-dd")
    @JsonFormat(pattern = "yyyy-MM-dd",timezone = "GMT+8")
    private Date uWork;

    @DateTimeFormat(pattern = "yyyy-MM-dd")
    @JsonFormat(pattern = "yyyy-MM-dd",timezone = "GMT+8")
    private Date uBecome;

    @DateTimeFormat(pattern = "yyyy-MM-dd")
    @JsonFormat(pattern = "yyyy-MM-dd",timezone = "GMT+8")
    private Date uOut;

    private String uAddress;

    private String uPhone;

    private String uWx;

    private String uQq;

    private Integer uFirst;

    @DateTimeFormat(pattern = "yyyy-MM-dd")
    @JsonFormat(pattern = "yyyy-MM-dd",timezone = "GMT+8")
    private Date uFirstStart;

    @DateTimeFormat(pattern = "yyyy-MM-dd")
    @JsonFormat(pattern = "yyyy-MM-dd",timezone = "GMT+8")
    private Date uFirstEnd;

    private String uFirstSchool;

    private String uFirstMajor;

    private Integer uPeak;

    @DateTimeFormat(pattern = "yyyy-MM-dd")
    @JsonFormat(pattern = "yyyy-MM-dd",timezone = "GMT+8")
    private Date uPeakStart;

    @DateTimeFormat(pattern = "yyyy-MM-dd")
    @JsonFormat(pattern = "yyyy-MM-dd",timezone = "GMT+8")
    private Date uPeakEnd;

    private String uPeakSchool;

    private String uPeakMajor;

    private String uOldAddress;

    private String uContent;

    private String uFile;

    private Integer uNumber1;

    private Integer uNumber2;

    @DateTimeFormat(pattern = "yyyy-MM-dd")
    @JsonFormat(pattern = "yyyy-MM-dd",timezone = "GMT+8")
    private Date uDate1;

    @DateTimeFormat(pattern = "yyyy-MM-dd")
    @JsonFormat(pattern = "yyyy-MM-dd",timezone = "GMT+8")
    private Date uDate2;

    private String uString1;

    private String uString2;

    private String uTextarea1;

    private String uTextarea2;

    private String uWorkYear;

    private String uEmail;

    private String uTel;

    private String uPostcode;

    private String uSubsidy;

    private String uPrize;

    private String uExpectPlace;

    private String uExpectJob;

    private String uExpectTrade;

    private String uCometime;

    private String uJobType;

    private String uSelfAppraisal;

    private String uWorkExperience;

    private String uProjectExperience;

    private String uSchoolExperience;

    private String uSchoolHonor;

    private String uSchoolDuty;

    private String uSkill;

    private String uLanguage;

    private String uCredential;

    private String uTrainExperience;

    public Integer getuId() {
        return uId;
    }

    public void setuId(Integer uId) {
        this.uId = uId;
    }

    public Integer getuAid() {
        return uAid;
    }

    public void setuAid(Integer uAid) {
        this.uAid = uAid;
    }

    public String getuName() {
        return uName;
    }

    public void setuName(String uName) {
        this.uName = uName;
    }

    public String getuProvince() {
        return uProvince;
    }

    public void setuProvince(String uProvince) {
        this.uProvince = uProvince;
    }

    public String getuCity() {
        return uCity;
    }

    public void setuCity(String uCity) {
        this.uCity = uCity;
    }

    public String getuPicture() {
        return uPicture;
    }

    public void setuPicture(String uPicture) {
        this.uPicture = uPicture;
    }

    public Integer getuMarried() {
        return uMarried;
    }

    public void setuMarried(Integer uMarried) {
        this.uMarried = uMarried;
    }

    public Integer getuSex() {
        return uSex;
    }

    public void setuSex(Integer uSex) {
        this.uSex = uSex;
    }

    public Date getuBorn() {
        return uBorn;
    }

    public void setuBorn(Date uBorn) {
        this.uBorn = uBorn;
    }

    public Integer getuAge() {
        return uAge;
    }

    public void setuAge(Integer uAge) {
        this.uAge = uAge;
    }

    public String getuIdentity() {
        return uIdentity;
    }

    public void setuIdentity(String uIdentity) {
        this.uIdentity = uIdentity;
    }

    public Integer getuHeight() {
        return uHeight;
    }

    public void setuHeight(Integer uHeight) {
        this.uHeight = uHeight;
    }

    public Integer getuEthnic() {
        return uEthnic;
    }

    public void setuEthnic(Integer uEthnic) {
        this.uEthnic = uEthnic;
    }

    public Integer getuPolity() {
        return uPolity;
    }

    public void setuPolity(Integer uPolity) {
        this.uPolity = uPolity;
    }

    public Integer getuSubscript() {
        return uSubscript;
    }

    public void setuSubscript(Integer uSubscript) {
        this.uSubscript = uSubscript;
    }

    public Integer getuPost() {
        return uPost;
    }

    public void setuPost(Integer uPost) {
        this.uPost = uPost;
    }

    public Integer getuTreatment() {
        return uTreatment;
    }

    public void setuTreatment(Integer uTreatment) {
        this.uTreatment = uTreatment;
    }

    public Date getuWork() {
        return uWork;
    }

    public void setuWork(Date uWork) {
        this.uWork = uWork;
    }

    public Date getuBecome() {
        return uBecome;
    }

    public void setuBecome(Date uBecome) {
        this.uBecome = uBecome;
    }

    public Date getuOut() {
        return uOut;
    }

    public void setuOut(Date uOut) {
        this.uOut = uOut;
    }

    public String getuAddress() {
        return uAddress;
    }

    public void setuAddress(String uAddress) {
        this.uAddress = uAddress;
    }

    public String getuPhone() {
        return uPhone;
    }

    public void setuPhone(String uPhone) {
        this.uPhone = uPhone;
    }

    public String getuWx() {
        return uWx;
    }

    public void setuWx(String uWx) {
        this.uWx = uWx;
    }

    public String getuQq() {
        return uQq;
    }

    public void setuQq(String uQq) {
        this.uQq = uQq;
    }

    public Integer getuFirst() {
        return uFirst;
    }

    public void setuFirst(Integer uFirst) {
        this.uFirst = uFirst;
    }

    public Date getuFirstStart() {
        return uFirstStart;
    }

    public void setuFirstStart(Date uFirstStart) {
        this.uFirstStart = uFirstStart;
    }

    public Date getuFirstEnd() {
        return uFirstEnd;
    }

    public void setuFirstEnd(Date uFirstEnd) {
        this.uFirstEnd = uFirstEnd;
    }

    public String getuFirstSchool() {
        return uFirstSchool;
    }

    public void setuFirstSchool(String uFirstSchool) {
        this.uFirstSchool = uFirstSchool;
    }

    public String getuFirstMajor() {
        return uFirstMajor;
    }

    public void setuFirstMajor(String uFirstMajor) {
        this.uFirstMajor = uFirstMajor;
    }

    public Integer getuPeak() {
        return uPeak;
    }

    public void setuPeak(Integer uPeak) {
        this.uPeak = uPeak;
    }

    public Date getuPeakStart() {
        return uPeakStart;
    }

    public void setuPeakStart(Date uPeakStart) {
        this.uPeakStart = uPeakStart;
    }

    public Date getuPeakEnd() {
        return uPeakEnd;
    }

    public void setuPeakEnd(Date uPeakEnd) {
        this.uPeakEnd = uPeakEnd;
    }

    public String getuPeakSchool() {
        return uPeakSchool;
    }

    public void setuPeakSchool(String uPeakSchool) {
        this.uPeakSchool = uPeakSchool;
    }

    public String getuPeakMajor() {
        return uPeakMajor;
    }

    public void setuPeakMajor(String uPeakMajor) {
        this.uPeakMajor = uPeakMajor;
    }

    public String getuOldAddress() {
        return uOldAddress;
    }

    public void setuOldAddress(String uOldAddress) {
        this.uOldAddress = uOldAddress;
    }

    public String getuContent() {
        return uContent;
    }

    public void setuContent(String uContent) {
        this.uContent = uContent;
    }

    public String getuFile() {
        return uFile;
    }

    public void setuFile(String uFile) {
        this.uFile = uFile;
    }

    public Integer getuNumber1() {
        return uNumber1;
    }

    public void setuNumber1(Integer uNumber1) {
        this.uNumber1 = uNumber1;
    }

    public Integer getuNumber2() {
        return uNumber2;
    }

    public void setuNumber2(Integer uNumber2) {
        this.uNumber2 = uNumber2;
    }

    public Date getuDate1() {
        return uDate1;
    }

    public void setuDate1(Date uDate1) {
        this.uDate1 = uDate1;
    }

    public Date getuDate2() {
        return uDate2;
    }

    public void setuDate2(Date uDate2) {
        this.uDate2 = uDate2;
    }

    public String getuString1() {
        return uString1;
    }

    public void setuString1(String uString1) {
        this.uString1 = uString1;
    }

    public String getuString2() {
        return uString2;
    }

    public void setuString2(String uString2) {
        this.uString2 = uString2;
    }

    public String getuTextarea1() {
        return uTextarea1;
    }

    public void setuTextarea1(String uTextarea1) {
        this.uTextarea1 = uTextarea1;
    }

    public String getuTextarea2() {
        return uTextarea2;
    }

    public void setuTextarea2(String uTextarea2) {
        this.uTextarea2 = uTextarea2;
    }

    public String getuWorkYear() {
        return uWorkYear;
    }

    public void setuWorkYear(String uWorkYear) {
        this.uWorkYear = uWorkYear;
    }

    public String getuEmail() {
        return uEmail;
    }

    public void setuEmail(String uEmail) {
        this.uEmail = uEmail;
    }

    public String getuTel() {
        return uTel;
    }

    public void setuTel(String uTel) {
        this.uTel = uTel;
    }

    public String getuPostcode() {
        return uPostcode;
    }

    public void setuPostcode(String uPostcode) {
        this.uPostcode = uPostcode;
    }

    public String getuSubsidy() {
        return uSubsidy;
    }

    public void setuSubsidy(String uSubsidy) {
        this.uSubsidy = uSubsidy;
    }

    public String getuPrize() {
        return uPrize;
    }

    public void setuPrize(String uPrize) {
        this.uPrize = uPrize;
    }

    public String getuExpectPlace() {
        return uExpectPlace;
    }

    public void setuExpectPlace(String uExpectPlace) {
        this.uExpectPlace = uExpectPlace;
    }

    public String getuExpectJob() {
        return uExpectJob;
    }

    public void setuExpectJob(String uExpectJob) {
        this.uExpectJob = uExpectJob;
    }

    public String getuExpectTrade() {
        return uExpectTrade;
    }

    public void setuExpectTrade(String uExpectTrade) {
        this.uExpectTrade = uExpectTrade;
    }

    public String getuCometime() {
        return uCometime;
    }

    public void setuCometime(String uCometime) {
        this.uCometime = uCometime;
    }

    public String getuJobType() {
        return uJobType;
    }

    public void setuJobType(String uJobType) {
        this.uJobType = uJobType;
    }

    public String getuSelfAppraisal() {
        return uSelfAppraisal;
    }

    public void setuSelfAppraisal(String uSelfAppraisal) {
        this.uSelfAppraisal = uSelfAppraisal;
    }

    public String getuWorkExperience() {
        return uWorkExperience;
    }

    public void setuWorkExperience(String uWorkExperience) {
        this.uWorkExperience = uWorkExperience;
    }

    public String getuProjectExperience() {
        return uProjectExperience;
    }

    public void setuProjectExperience(String uProjectExperience) {
        this.uProjectExperience = uProjectExperience;
    }

    public String getuSchoolExperience() {
        return uSchoolExperience;
    }

    public void setuSchoolExperience(String uSchoolExperience) {
        this.uSchoolExperience = uSchoolExperience;
    }

    public String getuSchoolHonor() {
        return uSchoolHonor;
    }

    public void setuSchoolHonor(String uSchoolHonor) {
        this.uSchoolHonor = uSchoolHonor;
    }

    public String getuSchoolDuty() {
        return uSchoolDuty;
    }

    public void setuSchoolDuty(String uSchoolDuty) {
        this.uSchoolDuty = uSchoolDuty;
    }

    public String getuSkill() {
        return uSkill;
    }

    public void setuSkill(String uSkill) {
        this.uSkill = uSkill;
    }

    public String getuLanguage() {
        return uLanguage;
    }

    public void setuLanguage(String uLanguage) {
        this.uLanguage = uLanguage;
    }

    public String getuCredential() {
        return uCredential;
    }

    public void setuCredential(String uCredential) {
        this.uCredential = uCredential;
    }

    public String getuTrainExperience() {
        return uTrainExperience;
    }

    public void setuTrainExperience(String uTrainExperience) {
        this.uTrainExperience = uTrainExperience;
    }
}