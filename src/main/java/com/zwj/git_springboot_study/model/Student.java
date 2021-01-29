package com.zwj.git_springboot_study.model;

import org.apache.ibatis.annotations.Param;

import java.util.LinkedList;
import java.util.List;

/**
 * @Author:zengwenjie
 * @Date:2021/1/27 21:37
 */
public class Student {
    private Integer Id;
    private String name;
    private String classname;
    private String dormitory;


    public List<Book> getBooks() {
        return books;
    }

    public void setBooks(List<Book> books) {
        this.books = books;
    }

    private List<Book> books = new LinkedList<>();
    private Book book;

    public Student() {
    }

    public Integer getId() {
        return Id;
    }

    public void setId(Integer id) {
        Id = id;
    }

    public Student(Integer id, String name, String classname, String dormitory, Book book) {
        Id = id;
        this.name = name;
        this.classname = classname;
        this.dormitory = dormitory;
        this.book = book;
    }

    @Override
    public String toString() {
        return "Student{" +
                "Id=" + Id +
                ", name='" + name + '\'' +
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




    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
