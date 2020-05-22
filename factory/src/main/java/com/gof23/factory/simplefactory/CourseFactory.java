package com.gof23.factory.simplefactory;

/**
 *  工厂类
 */
public class CourseFactory {

    /**
     *  简单工厂模式封装了创建的对象的细节,只需要用户传入正确的参数,工厂便会创建对应的对象
     * @param name
     * @return
     */
    // 根据传递的参数进行判断创建对应的对象,此方法若传入非法参数,则会报错
//    ICourse create(String name){
//        if(name != null && name.equals("java")){
//            return new JavaCourse();
//        }else{
//            return null;
//        }
//    }


    /**
     *  参数为全类名,若是输错就报错
     * @param className
     * @return
     */
   /* public ICourse create(String className){
        try {
            return (ICourse)Class.forName(className).newInstance();
        } catch (Exception e) {
            e.printStackTrace();
        }

        return null;
    }*/


    public ICourse create(Class clazz) {
        if(clazz != null){

            try {
                return (ICourse) clazz.newInstance();
            } catch (InstantiationException e) {
                e.printStackTrace();
            } catch (IllegalAccessException e) {
                e.printStackTrace();
            }
        }
        return null;
    }


}
