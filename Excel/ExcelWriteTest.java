package Excel;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class ExcelWriteTest {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        System.out.print("이름 : ");
        String name = sc.next();
        System.out.print("나이 : ");
        int age = sc.nextInt();
        System.out.print("전화번호 : ");
        String tel = sc.next();

        //워크북 객체생성
        XSSFWorkbook workbook = new XSSFWorkbook();
        //workbook -> sheet 객체 생성
        Sheet sheet = workbook.createSheet("멤버 정보");
        //sheet -> Row 객체를 생성 index 0
        Row headRow = sheet.createRow(0);
        //Row -> Cell 생성 하면서 값도 넣어줍니다.
        headRow.createCell(0).setCellValue("이름");
        headRow.createCell(1).setCellValue("나이");
        headRow.createCell(2).setCellValue("전화번호");

        //sheet -> Row 객체를 생성 index 1
        Row r = sheet.createRow(1);
        //Row -> Cell 생성 하면서 값도 넣어줍니다.
        r.createCell(0).setCellValue(name);
        r.createCell(1).setCellValue(age);
        r.createCell(2).setCellValue(tel);

        //FileOutputStream 객체를 생성 -> File 객체를 생성자 매개변수로 대입
        //File 객체 생성시 생성자 매개변수 파일 명
        FileOutputStream outputStream = new FileOutputStream(new File("member.xlsx"));
        //workbook에 쓰여진 데이터를 File에 쓰기
        workbook.write(outputStream);
        //workbook 종료
        workbook.close();
        System.out.println("엑셀 완성 !!"); // 출력
    }
}
