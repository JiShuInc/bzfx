package com.cardinal.tech.bzfx.util;

import org.apache.commons.lang3.StringUtils;

import java.lang.reflect.*;
import java.util.*;

/**
 * 转换util
 *
 * @author zbw
 */
public class ReflectUtil {
    /**
     * 数据对象转换业务对象、适用于部分或者全部方法签名相同的两个对象
     *
     * @param o
     * @param clazz
     * @return
     */
    public static <T> T toBO(Object o, Class<T> clazz) {
        if (o == null) {
            return null;
        }

        List<Method> ms = new ArrayList<Method>();
        getAllParentMethod(clazz, ms);
        T t = null;
        try {
            t = clazz.getDeclaredConstructor().newInstance();
            Class<? extends Object> c = o.getClass();
            for (Method m : ms) {
                String mn = m.getName();
                if (mn.startsWith("set") && m.getModifiers() == Modifier.PUBLIC) {
                    try {
                        m.invoke(t, c.getMethod(mn.replaceFirst("set", "get")).invoke(o));
                    } catch (IllegalArgumentException | InvocationTargetException | NoSuchMethodException
                            | SecurityException e) {
                        // do nothing
                    }
                }
            }
        } catch (InstantiationException | IllegalAccessException | NoSuchMethodException | InvocationTargetException e) {
            e.printStackTrace();
        }
        return t;
    }

    /**
     * 获取所有父类方法
     *
     * @param clazz
     * @param ms
     * @return
     */
    public static List<Method> getAllParentMethod(Class<?> clazz, List<Method> ms) {
        ms.addAll(Arrays.asList(clazz.getDeclaredMethods()));
        Class<?> sc = clazz.getSuperclass();
        if (null != sc) {
            ms.addAll(Arrays.asList(sc.getDeclaredMethods()));
            getAllParentMethod(sc, ms);
        }
        return ms;
    }

    /**
     * 获取obj对象fieldName的Field
     *
     * @param obj
     * @param fieldName
     * @return
     */
    public static Field getFieldByFieldName(Object obj, String fieldName) {
        for (Class<?> superClass = obj.getClass(); superClass != Object.class; superClass = superClass
                .getSuperclass()) {
            try {
                return superClass.getDeclaredField(fieldName);
            } catch (NoSuchFieldException e) {
            }
        }
        return null;
    }

    /**
     * 获取obj对象fieldName的属性值
     *
     * @param obj
     * @param fieldName
     * @return
     * @throws SecurityException
     * @throws NoSuchFieldException
     * @throws IllegalArgumentException
     * @throws IllegalAccessException
     */
    public static Object getValueByFieldName(Object obj, String fieldName)
            throws SecurityException, NoSuchFieldException, IllegalArgumentException, IllegalAccessException {
        Field field = getFieldByFieldName(obj, fieldName);
        Object value = null;
        if (field != null) {
            if (field.canAccess(obj)) {
                value = field.get(obj);
            } else {
                field.setAccessible(true);
                value = field.get(obj);
                field.setAccessible(false);
            }
        }
        return value;
    }

    /**
     * 设置obj对象fieldName的属性值
     *
     * @param obj
     * @param fieldName
     * @param value
     * @throws SecurityException
     * @throws NoSuchFieldException
     * @throws IllegalArgumentException
     * @throws IllegalAccessException
     */
    public static void setValueByFieldName(Object obj, String fieldName, Object value)
            throws SecurityException, NoSuchFieldException, IllegalArgumentException, IllegalAccessException {
        Field field = obj.getClass().getDeclaredField(fieldName);
        if (field.canAccess(obj)) {
            field.set(obj, value);
        } else {
            field.setAccessible(true);
            field.set(obj, value);
            field.setAccessible(false);
        }
    }

    public static <T> Map<String, Object> getAllFieldMap(Object obj, Class<T> clazz) {
        if (obj == null) {
            return null;
        }
        T t = toBO(obj, clazz);
        Map<String, Object> params = new HashMap<String, Object>();
        Field[] fs = clazz.getDeclaredFields();
        for (Field f : fs) {
            Method m;
            try {
                m = clazz.getMethod("get" + getMethodName(f.getName()));
                params.put(f.getName(), m.invoke(t));
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return params;
    }

    /**
     * 获取所有String 类型属性的map
     *
     * @param obj
     * @param clazz
     * @param <T>
     * @return
     */
    public static <T> Map<String, String> getAllStringFieldMap(Object obj, Class<T> clazz) {
        T t = toBO(obj, clazz);
        Map<String, String> params = new HashMap<>();
        Field[] fs = clazz.getDeclaredFields();
        for (Field f : fs) {
            Method m;
            try {
                m = clazz.getMethod("get" + getMethodName(f.getName()));
                if (m.getReturnType().getSimpleName().equals(String.class.getSimpleName())) {
                    String value = (String) m.invoke(t);
                    params.put(f.getName(), StringUtils.isEmpty(value) ? " " : value);
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return params;
    }

    // 把一个字符串的第一个字母大写、效率是最高的、
    private static String getMethodName(String fieldName) throws Exception {
        byte[] items = fieldName.getBytes();
        items[0] = (byte) ((char) items[0] - 'a' + 'A');
        return new String(items);
    }

    /*
     * 获取泛型类Class对象，不是泛型类则返回null
     */
    public static Class<?> getActualTypeArgument(Class<?> clazz) {
        Class<?> entitiClass = null;
        Type genericSuperclass = clazz.getGenericSuperclass();
        if (genericSuperclass instanceof ParameterizedType) {
            Type[] actualTypeArguments = ((ParameterizedType) genericSuperclass)
                    .getActualTypeArguments();
            if (actualTypeArguments != null && actualTypeArguments.length > 0) {
                entitiClass = (Class<?>) actualTypeArguments[0];
            }
        }

        return entitiClass;
    }

}
