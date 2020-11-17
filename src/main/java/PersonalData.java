import java.util.List;

public class PersonalData {

    private String name;
    private String surnamename;
    private String profession;
    private List<String> education;
    private String summary;

    public PersonalData() {
    }

    public PersonalData(String name, String surnamename, String profession, List<String> education, String summary) {
        this.name = name;
        this.surnamename = surnamename;
        this.profession = profession;
        this.education = education;
        this.summary = summary;
    }

    public String getName() {
        return name;
    }

    public String getSurnamename() {
        return surnamename;
    }

    public String getProfession() {
        return profession;
    }

    public List<String> getEducation() {
        return education;
    }

    public String getSummary() {
        return summary;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSurnamename(String surnamename) {
        this.surnamename = surnamename;
    }

    public void setProfession(String profession) {
        this.profession = profession;
    }

    public void setEducation(List<String> education) {
        this.education = education;
    }

    public void setSummary(String summary) {
        this.summary = summary;
    }
}
