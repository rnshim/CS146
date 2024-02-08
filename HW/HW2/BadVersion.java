public class BadVersion {
    public static int bad_version(int n){
        int index = n/2+1;
        if (isBadVersion(index)){
            while (isBadVersion(index-1)){
                index--;
            }
            return index;
        }
        else {
            while (!isBadVersion(index)){
                index++;
            }
            return index;
        }
    }
    public static boolean isBadVersion(int version){
        if (version>=5){
            return true;
        }
        return false;
    }
    public static void main(String[] args){
        System.out.println(bad_version(3));
        System.out.println(bad_version(11));
    }
}