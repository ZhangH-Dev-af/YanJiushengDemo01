package package20220629;

public class schoolmathgame {
    private  String id;
    private  String gender;
    private  int age;
    private  int hypertension;
    private  String heart_disease;
    private  String ever_married;
    private  String work_type;
    private  String Residence_type;
    private  String avg_glucose_level;
    private  String BMI;
    private  String smoking_status;
    private  int stroke;

    public schoolmathgame(String id, String gender, int age, int hypertension, String heart_disease,
                          String ever_married, String work_type, String residence_type, String avg_glucose_level,
                          String BMI, String smoking_status, int stroke) {
        this.id = id;
        this.gender = gender;
        this.age = age;
        this.hypertension = hypertension;
        this.heart_disease = heart_disease;
        this.ever_married = ever_married;
        this.work_type = work_type;
        Residence_type = residence_type;
        this.avg_glucose_level = avg_glucose_level;
        this.BMI = BMI;
        this.smoking_status = smoking_status;
        this.stroke = stroke;
    }

    public schoolmathgame() {

    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getHypertension() {
        return hypertension;
    }

    public void setHypertension(int hypertension) {
        this.hypertension = hypertension;
    }

    public String getHeart_disease() {
        return heart_disease;
    }

    public void setHeart_disease(String heart_disease) {
        this.heart_disease = heart_disease;
    }

    public String getEver_married() {
        return ever_married;
    }

    public void setEver_married(String ever_married) {
        this.ever_married = ever_married;
    }

    public String getWork_type() {
        return work_type;
    }

    public void setWork_type(String work_type) {
        this.work_type = work_type;
    }

    public String getResidence_type() {
        return Residence_type;
    }

    public void setResidence_type(String residence_type) {
        Residence_type = residence_type;
    }

    public String getAvg_glucose_level() {
        return avg_glucose_level;
    }

    public void setAvg_glucose_level(String avg_glucose_level) {
        this.avg_glucose_level = avg_glucose_level;
    }

    public String getBMI() {
        return BMI;
    }

    public void setBMI(String BMI) {
        this.BMI = BMI;
    }

    public String getSmoking_status() {
        return smoking_status;
    }

    public void setSmoking_status(String smoking_status) {
        this.smoking_status = smoking_status;
    }

    public int getStroke() {
        return stroke;
    }

    public void setStroke(int stroke) {
        this.stroke = stroke;
    }

    @Override
    public String toString() {
        return "schoolmathgame{" +
                "id='" + id + '\'' +
                ", gender='" + gender + '\'' +
                ", age=" + age +
                ", hypertension=" + hypertension +
                ", heart_disease='" + heart_disease + '\'' +
                ", ever_married='" + ever_married + '\'' +
                ", work_type='" + work_type + '\'' +
                ", Residence_type='" + Residence_type + '\'' +
                ", avg_glucose_level='" + avg_glucose_level + '\'' +
                ", BMI='" + BMI + '\'' +
                ", smoking_status='" + smoking_status + '\'' +
                ", stroke=" + stroke +
                '}';
    }
}
