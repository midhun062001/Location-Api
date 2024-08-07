package com.locationapi.country.service;

import com.locationapi.country.entity.Country;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class ExcelConverter {

    public List<Country> excelToCountryList(MultipartFile file) throws IOException {


        List<Country> countryList = new ArrayList<>();

        try (XSSFWorkbook workBook = new XSSFWorkbook(file.getInputStream())) {

            XSSFSheet workSheet = workBook.getSheetAt(0);

            for (int i = 1; i <= workSheet.getPhysicalNumberOfRows(); i++) { // Start from 1 to skip header row

                XSSFRow row = workSheet.getRow(i);

                if (row != null) { // Ensure the row is not null
                    // Retrieve all required cells
                    XSSFCell cellCountryName = row.getCell(0);
                    XSSFCell cellCountryCode = row.getCell(1);
                    XSSFCell cellCapital = row.getCell(2);
                    XSSFCell cellCountryStd = row.getCell(3);

                    // Check if all required cells are non-null
                    if (cellCountryName != null && cellCountryCode != null &&
                            cellCapital != null && cellCountryStd != null) {

                        Country country = new Country();

                        country.setCountryName(cellCountryName.getStringCellValue());
                        country.setCountryCode(cellCountryCode.getStringCellValue());
                        country.setCapital(cellCapital.getStringCellValue());
                        country.setCountryStd(cellCountryStd.getStringCellValue().replace('=', ' ').trim());

                        countryList.add(country);
                    }
                }
            }
            return countryList;

        }
    }
}
