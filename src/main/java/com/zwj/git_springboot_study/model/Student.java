package com.zwj.git_springboot_study.model;

/**
 * @Author:zengwenjie
 * @Date:2021/1/27 21:37
 */
public class Student {
    private String name;
    private String classname;
    private String dormitory;

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", classname='" + classname + '\'' +
                ", dormitory='" + dormitory + '\'' +
                ", book=" + book +
                '}';
    }

    public String getDormitory() {
        return dormitory;
    }

    public void setDormitory(String dormitory) {
        this.dormitory = dormitory;
    }

    public String getClassname() {
        return classname;
    }

    public void setClassname(String classname) {
        this.classname = classname;
    }

    public Student(String name) {
        this.name = name;
    }

    public Book getBook() {
        return book;
    }

    public void setBook(Book book) {
        this.book = book;
    }

    private Book book;

    public static class Book{
        private  String name;

        @Override
        public String toString() {
            return "Book{" +
                    "name='" + name + '\'' +
                    '}';
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public Book(String name) {
            this.name = name;
        }
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
