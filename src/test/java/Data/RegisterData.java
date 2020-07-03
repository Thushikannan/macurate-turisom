package Data;

import org.apache.log4j.Logger;
import org.testng.annotations.DataProvider;
import utils.ExcelUtil;

public class RegisterData extends ExcelUtil {
    private static final Logger LOGGER = Logger.getLogger(RegisterData.class);

    public RegisterData () {
        super("src\\main\\resources\\Excel\\ExcelSheet.xlsx");
    }
    @DataProvider(name = "RegisterPage")
    public Object[][] RegisterPage() {

        int rows = getRowCount("Register");
        int col = getColumnCount("Register");


        LOGGER.info("row = "+ rows + " columns = "+ col);
        Object[][] data = new Object[rows][col];
        for (int i = 1; i <= rows; i++) {
            for (int j = 0; j < col; j++) {
                data[i - 1][j] = getData("Register", i, j);
            }
        }
        return data;
    }



}
