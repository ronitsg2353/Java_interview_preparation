package selenium_code;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class File_Handling {
    public static void main(String[] args) throws FileNotFoundException {

        File file=new File("filepath");
        FileInputStream inputStream=new FileInputStream(file);
        workbook=new HSSFWorkbook(inputStream);
         sheet=workbook.getSheet("sheetname");
         cell=sheet.getRow(rowNumber).getCell(cellNumber);

    }
}
