class Alphabet {

    public static void main(String[] args) {

        // กําหนด ตัวแปร String ชือ myAlphabet และใส่ค่าในตัวแปร

        String myAlphabet = "Welcome to java";
        // แสดงข้อความว่าง
        System.out.println("");

        // แสดงข้อความที่เก็บในตัวแปร myAlphabet
        System.out.println(myAlphabet);
        // แสดงความยาวของข้อความที่เก็บในตัวแปร myAlphabet
        System.out.println("String Length : " + myAlphabet.length());
        // แสดงตำแหน่งของตัวอักษร 'o' ตัวแรกที่พบในข้อความที่เก็บในตัวแปร myAlphabet
        System.out.println(myAlphabet.indexOf('o'));
        // แสดงตำแหน่งของคำว่า "java" ในข้อความที่เก็บในตัวแปร myAlphabet
        System.out.println(myAlphabet.indexOf("java"));
        // แสดงตำแหน่งของตัวอักษร 'a' ตัวสุดท้ายที่พบในข้อความที่เก็บในตัวแปร myAlphabet
        System.out.println(myAlphabet.lastIndexOf('a'));
        // แสดงข้อความย่อยที่เริ่มต้นจากตำแหน่งที่ 8 ถึง ตำแหน่งที่ 12
        System.out.println(myAlphabet.substring(8, 12));
        // แสดงตัวอักษรที่อยู่ในตำแหน่งที่ 12 ของข้อความที่เก็บในตัวแปร myAlphabet
        System.out.println(myAlphabet.charAt(12));
        // สลับตำแหน่งตัวอักษร 'e' เป็น 'a' ในข้อความที่เก็บในตัวแปร myAlphabet
        System.out.println(myAlphabet.replace('e', 'a'));
        System.out.println();

    }
}