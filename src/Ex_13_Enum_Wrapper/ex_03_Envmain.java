package Ex_13_Enum_Wrapper;

public class ex_03_Envmain {
    static void main(String[] args) {
        System.out.println(ex_03_Env.DEV.getBaseUrl());
        System.out.println(ex_03_Env.STAGING.getBaseUrl());
        System.out.println(ex_03_Env.PREPROD.getBaseUrl());
        System.out.println(ex_03_Env.PROD.getBaseUrl());

    }
}
