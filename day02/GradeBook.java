package day02;

class GradeBook {
    int id;
    String name;
    int korean;
    int english;
    int math;
    
    void setId(int id) {
        this.id=id;
    }
    
    int getId() {
        return id;
    }
    
    void setString(String name) {
        this.name=name;
    }
    
    String getName() {
        return name;
    }
    
    void setKorean(int korean) {
        this.korean=korean;
    }
    
    int getKorean() {
        return korean;
    }
    
    void setEnglish(int english) {
        this.english=english;
    }
    
    int getEnglish() {
        return english;
    }
    
    void setMath(int math) {
        this.math=math;
    }
    
    int getMath() {
        return math;
    }
}
