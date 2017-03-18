package cc.test;

import cc.tinker.entity.JzCaseInfoEntity;

/**
 * Created by Tinker on 2017/3/9.
 */
public class Test {

    public static void main(String[] args){

//        JzCaseInfoEntity jzCaseEntity= new JzCaseInfoEntity();
//
//        try {
//            Method method = jzCaseEntity.getClass().getMethod("setSlJzrs", Integer.class);
//            method.invoke(jzCaseEntity,12);
//            System.out.println(jzCaseEntity.getReserver21());
//        } catch (NoSuchMethodException e) {
//            e.printStackTrace();
//        } catch (IllegalAccessException e) {
//            e.printStackTrace();
//        } catch (InvocationTargetException e) {
//            e.printStackTrace();
//        }

//        String s = "SlSlsj";
//        String sb = s.replaceFirst(s.substring(0,1),s.substring(0,1).toLowerCase());
//        System.out.println(sb);


        JzCaseInfoEntity jzCaseInfoEntity = new JzCaseInfoEntity();
        test(jzCaseInfoEntity.getClass());



//        String in = "SL_JJFS_CN";
//        StringBuffer stringbf = new StringBuffer();
//        Matcher m = Pattern.compile("([a-z]|\\_[a-z])([a-z]*)",Pattern.CASE_INSENSITIVE).matcher(in);
//        while (m.find()) {
//            m.appendReplacement(stringbf,m.group(1).toUpperCase() + m.group(2).toLowerCase());
//        }
//        System.out.println(m.appendTail(stringbf).toString());







    }

    public static  <T> void test(T t){
//        t.getClass().getDeclaredField()
        if(t instanceof JzCaseInfoEntity){
            System.out.println("true");

        }
    }


}
