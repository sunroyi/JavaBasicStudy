package sun.controller;

public class ProxyImpl implements ProxyInterface {
    @Override
    public void showTwoString(String str1, String str2) {
        System.out.println("Show Message " + str1 + "|" + str2);
    }

    @Override
    public void showName(String name) {
        System.out.println("Show Name:" + name);
    }

    @Override
    public void showNoArg() {
        System.out.println("No Arg");
    }
}
