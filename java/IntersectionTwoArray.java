import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class IntersectionTwoArray{
    public static int[] intersection(int[] nums1, int[] nums2) {
        Integer[] array1 =  Arrays.stream( nums1 ).boxed().toArray( Integer[]::new );
        Integer[] array2 =  Arrays.stream( nums2 ).boxed().toArray( Integer[]::new );
        List<Integer> a = new ArrayList<Integer>(Arrays.asList(array1));
        List<Integer> b = new ArrayList<Integer>(Arrays.asList(array2));
        Set<Integer> c = a.stream().filter(r -> b.contains(r) ).collect(Collectors.toSet());
        return c.stream().mapToInt(Integer::intValue).toArray();
        // return c.toArray();
    }

    public static <E> E[] intersection(E[] array1, E[] array2) {
        List<E> a = new ArrayList<E>(Arrays.asList(array1));
        List<E> b = new ArrayList<E>(Arrays.asList(array2));
        Set<E> c = a.stream().filter(r -> b.contains(r) ).collect(Collectors.toSet());
        return (E[])c.toArray();
    }

    public static void main(String[] args) {
        int[] nums1 = {4,9,5};
        int[] nums2 = IntStream.of(9,4,9,8,4).toArray();
        Integer[] array1 =  Arrays.stream( nums1 ).boxed().toArray( Integer[]::new );
        Integer[] array2 =  Arrays.stream( nums2 ).boxed().toArray( Integer[]::new );
        intersection(array1, array2);
        System.out.println(intersection(nums1, nums2));
        System.out.println(intersection(array1, array2));
    }
}