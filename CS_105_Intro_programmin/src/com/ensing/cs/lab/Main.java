package com.ensing.cs.lab;

public class Main {

    static int maxContA = 4;
    static int maxContB = 7;



    Integer contA = 0;
    Integer contB = 0;

    public static void main(String[] args) {

        Main m = new Main();


       /* contA = maxContA;
        System.out.println("contA = "+  contA);
        contB = contA;
        System.out.println("A - > B = "+  contB);
        contA = 0;
        System.out.println("contA = "+  contA);
        contA = maxContA;
        System.out.println("contA = "+  contA);

        contB += contA;
        System.out.println("A - > B = "+  contB);*/

        m.setContA(maxContA);
        m.aToB(m.getContA(),m.getContB());
        m.setContA(maxContA);
        m.aToB(m.getContA(),m.getContB());
        m.setContB(0);
        m.aToB(m.getContA(),m.getContB());
        m.setContA(maxContA);
        m.aToB(m.getContA(),m.getContB());

        System.out.println(m.getContA().toString());
        System.out.println(m.getContB().toString());

    }

    private void aToB(Integer contA, Integer contB){
        while(contB < maxContB){
            contA -= 1;
            contB += 1;
            if(contA == 0){
                break;
            }
        }
        this.setContA(contA);
        this.setContB(contB);
    }

    private void bToA(int contA, int contB){
        while(contB < maxContB){
            contA += 1;
            contB -= 1;
            if(contA == 0){
                break;
            }
        }
        this.setContA(contA);
        this.setContB(contB);
    }


    public Integer getContA() {
        return contA;
    }

    public void setContA(Integer contA) {
        this.contA = contA;
    }

    public Integer getContB() {
        return contB;
    }

    public void setContB(Integer contB) {
        this.contB = contB;
    }
}
