package com.example.interview.tavant.EXm2;

public class Score {
    private String studentId;
    private Integer score;
    private String subject;

    public Score(String studentId, int score, String subject){
        this.studentId = studentId;
        this.score = score;
        this.subject = subject;
    }

    public String getStudentId(){
        return studentId;
    }

    public Integer getScore(){
        return score;
    }

    public String getSubject(){
        return subject;
    }

    @Override
    public String toString(){
        return studentId+":"+score;
    }
}