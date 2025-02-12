package ru.ezhak.university;

public final class Teacher extends Human {
    private final int teacherIDNumber;
    private final String post;

    public Teacher(String name, int teacherIDNumber, String post) {
        super(name);
        this.teacherIDNumber = teacherIDNumber;
        this.post = post;
    }

    @Override
    public boolean checkUser() {
        String tmpName = this.name == null ? "" : this.name;
        String tmpPost = this.post == null ? "" : this.post;
        return (!tmpName.isBlank() && teacherIDNumber > 0 && !tmpPost.isBlank());
    }

    public int getTeacherIDNumber() {
        return teacherIDNumber;
    }

    public String getPost() {
        return post;
    }
}
