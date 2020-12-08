package com.rul.designpattern.prototype;

import java.io.*;

/**
 * 简历模板
 *
 * @author LuoRu
 */
public class Resume implements Cloneable, Serializable {
    private String name;
    private int age;
    private Image image;

    public Resume() {
        this.name = "你的名字";
        this.age = 22;
        this.image = new Image(2, "640X480");
    }

    /**
     * 浅克隆
     *
     * @return Resume
     */
    public Resume shallowClone() {
        Resume cloneResume = null;
        try {
            cloneResume = (Resume) super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
            System.out.println("Clone Failure");
        }
        return cloneResume;
    }

    /**
     * 深克隆
     *
     * @return Resume
     */
    public Resume deepClone() {
        Resume cloneResume = null;
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(byteArrayOutputStream);
            objectOutputStream.writeObject(this);

            ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(byteArrayOutputStream.toByteArray());
            ObjectInputStream objectInputStream = new ObjectInputStream(byteArrayInputStream);
            cloneResume = (Resume) objectInputStream.readObject();
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
        return cloneResume;
    }

    /**
     * 填写简历
     *
     * @param name  name
     * @param age   age
     * @param image image
     */
    public void fillIn(String name, int age, Image image) {
        this.name = name;
        this.age = age;
        this.image = image;
    }
}

/**
 * 照片类
 *
 * @author LuoRu
 */
class Image implements Serializable {
    int size;
    String pixel;

    public Image(int size, String pixel) {
        this.size = size;
        this.pixel = pixel;
    }
}
